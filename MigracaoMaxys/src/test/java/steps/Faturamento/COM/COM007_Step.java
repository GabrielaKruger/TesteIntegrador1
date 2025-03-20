package steps.Faturamento.COM;

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
import pages.Faturamento.COM.COM007_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class COM007_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private COM007_Page COM007_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do COM007")
    public void inicializeAExecuçãoDosCenáriosDoCOM007() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        COM007_Page = new COM007_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature COM007")
    public void acessarOProgramaFeatureCOM007(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature COM007")
    public void clicarBotãoToolBarFeatureCOM007(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature COM007")
    public void apresentarAMensagemNoPopUpFeatureCOM007(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature COM007")
    public void apresentarOModalH5FeatureCOM007(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature COM007")
    public void apresentarAMensagemFeatureCOM007(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature COM007")
    public void clicarBotãoDoModalFeatureCOM007(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature COM007")
    public void apresentaOModalHFeatureCOM007(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature COM007")
    public void apresentaOModalFeatureCOM007(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature COM007")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir COM007")
    public void pressionarTeclasShiftF6ParaExcluirCOM007() {
        basePage.pressionarShiftF6();
    }

    @Quando("confirmar mensagem SQL de Consulta feature COM007")
    public void confirmarMensagemSQLDeConsultaFeatureCOM007() {
        COM007_Page.confirmarMensagemSQLDeConsultaFeatureCOM007();
    }


    @E("fechar janela de Solicitações em Aberto feature COM007")
    public void fecharJanelaDeSolicitaçõesEmAbertoFeatureCOM007() {
        COM007_Page.fecharJanelaDeSolicitaçõesEmAbertoFeatureCOM007();
    }

    @E("selecionar Negociação feature COM007")
    public void selecionarNegociaçãoFeatureCOM007() {
        COM007_Page.selecionarNegociaçãoFeatureCOM007();
    }

    @Então("não confirmar seleção de lote feature COM007")
    public void nãoConfirmarSeleçãoDeLoteFeatureCOM007() {
        COM007_Page.nãoConfirmarSeleçãoDeLoteFeatureCOM007();
    }

    @Quando("acessar page {string} feature COM007")
    public void acessarPageFeatureCOM007(String arg0) {
//        COM007_Page.acessarPageFeatureCOM();
    }

    @E("preencher Observação da Renegociação Cancelamento feature COM007")
    public void preencherObservaçãoDaRenegociaçãoCancelamentoFeatureCOM007() {

    }

    @E("aprovar feature COM007")
    public void aprovarFeatureCOM007() {

    }

    @Então("confirmar aprovação feaure COM007")
    public void confirmarAprovaçãoFeaureCOM007() {

    }

    @Então("confirmar seleção de lote feature COM007")
    public void confirmarSeleçãoDeLoteFeatureCOM007() {

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



