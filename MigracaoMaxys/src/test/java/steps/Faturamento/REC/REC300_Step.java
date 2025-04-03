package steps.Faturamento.REC;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Faturamento.REC.REC300_Page;
import utils.MassaTeste;

import java.time.Duration;

public class REC300_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.REC.REC300_Page REC300_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do REC300")
    public void inicializeAExecuçãoDosCenáriosDoREC300() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        REC300_Page = new REC300_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature REC300")
    public void acessarOProgramaFeatureREC(String programa, String empresa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa, empresa);
    }
}


  //  @After
   // public void tearDown() {
   //     if (driver != null) {
   //         if (scenario != null && scenario.isFailed()) {
    //            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    //            scenario.attach(screenshot, "image/png", "Screenshot");
    //        }
    //    }
    //    BasePage.tearDownCloseQuit(driver);
    //}


//}

