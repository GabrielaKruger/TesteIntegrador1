package steps.Materiais.TCO;

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
import pages.Materiais.TCO.TCO024_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TCO024_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Materiais.TCO.TCO024_Page TCO024_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TCO024")
    public void inicializeAExecuçãoDosCenáriosDoTCO024() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TCO024_Page = new TCO024_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature TCO024")
    public void acessarOProgramaFeatureTCO024(String programa) {
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(4000); // espera necessária
    }

    @Quando("clicar botão ToolBar {string} feature TCO024")
    public void clicarBotãoToolbarFeatureTCO024(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature TCO024")
    public void apresentarOModalH5FeatureTCO024(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TCO024")
    public void apresentarAMensagemFeatureTCO024(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("clicar botão {string} do modal feature TCO024")
    public void clicarBotãoDoModalFeatureTCO035(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("recarregar o programa feature TCO024")
    public void recarregarOProgramaFeatureTCO024() {
        basePage.recarregarPaginaComRefresh();
    }

    @Quando("apresenta o modal H4 {string} feature TCO024")
    public void apresentaOModalH4FeatureTCO035(String title) {
        basePage.validaModalByH4(title);
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
