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

import java.io.IOException;
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
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validaModalByH5(title);
    }

    @Então("clicar botão {string} do modal feature COM007")
    public void clicarBotãoDoModalFeatureCOM007(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    // Estrutura mudou, se houverem outras telas remover e alterar o clicarBotaoDoModal
    @Então("clicar botão novo {string} do modal feature COM007")
    public void clicarBotãoNovoDoModalFeatureCOM007(String acao) {
        COM007_Page.clicarBotãoNovoDoModalFeatureCOM007();
    }

    @E("apresentar a mensagem {string} feature COM007")
    public void apresentarAMensagemFeatureCOM007(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("apresentar a mensagem parcial {string} feature COM007")
    public void apresentarAMensagemParcialFeatureCOM007(String mensagem) {
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @Quando("apresentar o modal H4 {string} feature COM007")
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
        basePage.esperarMilissegundos(8000); // espera necesária
    }

    @Quando("verificar se o modal H4 {string} é apresentado e selecionar {string} feature COM007")
    public void verificarSeOModalHÉApresentadoFeatureCOM(String title) {
        String mensagem = "Selecionar todo o lote de compras número";
        basePage.validaModalByH4(title);
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @Quando("acessar page {string} feature COM007")
    public void acessarPageFeatureCOM007(String page) {
        COM007_Page.acessarPageFeatureCOM007(page);
    }

    @E("preencher Observação da Renegociação Cancelamento feature COM007")
    public void preencherObservaçãoDaRenegociaçãoCancelamentoFeatureCOM007() {
        COM007_Page.preencherObservaçãoDaRenegociaçãoCancelamentoFeatureCOM007();
    }

    @E("aprovar Negociacao feature COM007")
    public void aprovarNegociacaoFeatureCOM007() {
        COM007_Page.aprovarNegociacaoFeatureCOM007();
    }

    @Quando("dar duplo clique no primeiro Item feature COM007")
    public void darDuploCliqueNoPrimeiroItemFeatureCOM007() {
        COM007_Page.darDuploCliqueNoPrimeiroItemFeatureCOM007();
    }

    @E("verifica se a modal com a mensagem {string} foi apresentada feature COM007")
    public void verificaSeAModalComAMensagemFoiApresentadaFeatureCOM007(String mensagem) {
        COM007_Page.verificaSeAModalComAMensagemFoiApresentadaFeatureCOM007(mensagem);
    }

    @Então("fecha a modal feature COM007")
    public void fechaAModalFeatureCOM007() {
        COM007_Page.fechaAModalFeatureCOM007();
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



