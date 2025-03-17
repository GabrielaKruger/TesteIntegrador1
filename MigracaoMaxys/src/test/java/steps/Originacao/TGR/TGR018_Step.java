package steps.Originacao.TGR;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originacao.TGR.TGR018_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TGR018_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.TGR.TGR018_Page TGR018_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TGR018")
    public void inicializeAExecuçãoDosCenáriosDoTGR018() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TGR018_Page = new TGR018_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TGR018")
    public void acessarOProgramaFeatureTGR018(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature TGR018")
    public void clicarBotãoToolBarFeatureTGR018(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature TGR018")
    public void apresentarAMensagemNoPopUpFeatureTGR018(String mensagem) {
        basePage.esperarMilissegundos(3000); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature TGR018")
    public void apresentarOModalH5FeatureTGR018(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TGR018")
    public void apresentarAMensagemFeatureTGR018(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature TGR018")
    public void clicarBotãoDoModalFeatureTGR018(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature TGR018")
    public void apresentaOModalHFeatureTGR018(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature TGR018")
    public void apresentaOModalFeatureTGR018(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature TGR018")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir TGR018")
    public void pressionarTeclasShiftF6ParaExcluirTGR018() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Modalidade feature TGR018")
    public void preencherModalidadeFeatureTGR018() {
        TGR018_Page.preencherModalidadeFeatureTGR018(massaTeste.getMassaTestePorPathEChave(tagMassa, "modalidade"));
    }

    @Então("selecionar o Tipo Contrato feature TGR018")
    public void selecionarOTipoContratoFeatureTGR018() {
        TGR018_Page.selecionarOTipoContratoFeatureTGR018(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato"));
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



