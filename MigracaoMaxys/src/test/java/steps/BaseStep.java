package steps;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.CredenciaisLogin;
import utils.ExecutionUtils;
import utils.MassaTeste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class BaseStep {
    private WebDriver driver;
    static BasePage basePage;
    static String REMOTE_DRIVER = "http://192.168.181.181:4444/wd/hub";

    MassaTeste massaTeste;
    CredenciaisLogin credenciaisLogin;
    ExecutionUtils executionUtils;
    Scenario scenario;
    private String tagMassa;
    private String browser;


    @Before()
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("que o usuario esteja na tela inicial do sistema")
    public void queOUsuarioEstejaNaTelaDeinicial() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        basePage = new BasePage(driver);
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(scenario);
        basePage = new BasePage(driver);
        credenciaisLogin = new CredenciaisLogin();
    }

    @Dado("que seja carregada as massas de teste: {string}")
    public void CarregarMassasDeTeste(String pathJson) throws FileNotFoundException {
        massaTeste.lerJson(pathJson);
    }

}
