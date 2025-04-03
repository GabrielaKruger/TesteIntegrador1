package steps.Transporte.TAF;

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
import pages.Transporte.TTB.TTB163_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TAF001_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private TTB163_Page TTB163_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TTB163")
    public void inicializeAExecuçãoDosCenáriosDoTTB163() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TTB163_Page = new TTB163_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TTB163")
    public void acessarOProgramaFeatureTTB163(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }


    @After
    public void tearDown() {
        if (driver != null) {
            if (scenario != null && scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            }
        }
        BasePage.tearDownCloseQuit(driver);
    }
}



