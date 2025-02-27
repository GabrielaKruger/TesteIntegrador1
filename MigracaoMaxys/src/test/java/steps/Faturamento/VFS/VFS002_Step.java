package steps.Faturamento.VFS;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.Faturamento.VFS.VFS002_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class VFS002_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.VFS.VFS002_Page VFS002_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do VFS002")
    public void inicializeAExecuçãoDosCenáriosDoVFS002() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        VFS002_Page = new VFS002_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature VFS002")
    public void acessarOProgramaFeatureVFS002(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

}
