package steps.Navegador.ANV;

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
import pages.Navegador.ANV.ANV054_Page;
import utils.MassaTeste;

import java.time.Duration;

public class ANV054_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Navegador.ANV.ANV054_Page ANV054_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do ANV054")
    public void inicializeAExecuçãoDosCenáriosDoANV054() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        ANV054_Page = new ANV054_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature ANV054")
    public void acessarOProgramaFeatureANV054(String programa) {
        basePage.esperarMilissegundos(5000);//espera necessária
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(5000);//espera necessária
    }

    @Quando("informar o campo empresa feature ANV054")
    public void informarOCampoEmpresaFeatureANV054() {
        ANV054_Page.informarOCampoEmpresaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("informar o programa feature ANV054")
    public void informarOProgramaFeatureANV054() {
        ANV054_Page.informarOProgramaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @Então("clicar botao consultar feature ANV054")
    public void clicarBotaoConsultarFeatureANV054() {
        ANV054_Page.clicarBotaoConsultarFeatureANV054();
    }

    @Quando("selecionar Grid feature ANV054")
    public void selecionarGridFeatureANV054() {
        ANV054_Page.selecionarGridFeatureANV054();

    }


//    @After
//    public void tearDown() {
//        if (driver != null) {
//            if (scenario != null && scenario.isFailed()) {
//                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", "Screenshot");
//            }
//        }
//        BasePage.tearDownCloseQuit(driver);
//    }
}
