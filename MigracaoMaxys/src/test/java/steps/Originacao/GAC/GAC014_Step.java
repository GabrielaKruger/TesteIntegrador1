package steps.Originacao.GAC;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originacao.GAC.GAC014_Page;
import utils.MassaTeste;

import java.time.Duration;

public class GAC014_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.GAC.GAC014_Page GAC014_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do GAC014")
    public void inicializeAExecuçãoDosCenáriosDoGAC014() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        GAC014_Page = new GAC014_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature GAC014")
    public void acessarOProgramaFeatureGAC014(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }


   // @After
   // public void tearDown() {
   //     if (driver != null) {
   //         if (scenario != null && scenario.isFailed()) {
   //             final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
   //             scenario.attach(screenshot, "image/png", "Screenshot");
   //         }
   //     }
   //     BasePage.tearDownCloseQuit(driver);
    //}

}
