package steps.Originação.GPE;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originação.GPE.BAL017_Page;
import utils.MassaTeste;

import java.time.Duration;

public class BAL017_Step {


    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originação.GPE.BAL017_Page BAL017_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do BAL017")
    public void inicializeAExecuçãoDosCenáriosDoBAL017() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        BAL017_Page = new BAL017_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature BAL017")
    public void acessarOProgramaFeatureBAL017(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @Quando("preencher Empresa feature BAL017")
    public void preencherEmpresaFeatureBAL017() {
        BAL017_Page.preencherEmpresaFeatureBAL017(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }
}

