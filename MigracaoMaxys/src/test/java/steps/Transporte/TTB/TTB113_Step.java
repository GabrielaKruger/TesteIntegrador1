package steps.Transporte.TTB;

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
import pages.Transporte.TTB.TTB113_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TTB113_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private TTB113_Page TTB113_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TTB113")
    public void inicializeAExecuçãoDosCenáriosDoTTB113() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TTB113_Page = new TTB113_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TTB113")
    public void acessarOProgramaFeatureTTB113(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature TTB113")
    public void clicarBotãoToolBarFeatureTTB113(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @Quando("apresentar o modal H5 {string} feature TTB113")
    public void apresentarOModalH5FeatureTTB113(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TTB113")
    public void apresentarAMensagemFeatureTTB113(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature TTB113")
    public void clicarBotaoDoModalFeatureTTB113(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature TTB113")
    public void apresentaOModalHFeatureTTB113(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature TTB113")
    public void apresentaOModalFeatureTTB113(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature TTB113")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir TTB113")
    public void pressionarTeclasShiftF6ParaExcluirTTB113() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Empresa feature TTB113")
    public void preencherEmpresaFeatureTTB113() {
        TTB113_Page.preencherEmpresaFeatureTTB113(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Usuário feature TTB113")
    public void preencherUsuárioFeatureTTB113() {
        TTB113_Page.preencherUsuárioFeatureTTB113(massaTeste.getMassaTestePorPathEChave(tagMassa, "user"));
    }

    @E("preencher Tipo Solic featue TTB113")
    public void preencherTipoSolicFeatueTTB113() {
        TTB113_Page.preencherTipoSolicFeatueTTB113(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoSolicitante"));
    }

    @E("preencher Cód. da Alçada feature TTB113")
    public void preencherCódDaAlçadaFeatureTTB113() {
        TTB113_Page.preencherCódDaAlçadaFeatureTTB113();
    }

    @Então("prencher Data de Vencimento feature TTB113")
    public void prencherDataDeVencimentoFeatureTTB113() {
        TTB113_Page.prencherDataDeVencimentoFeatureTTB113();
    }

    @E("marcar checkbox do clifor pagador feature TTB113")
    public void marcarCheckboxDoCliforPagadorFeatureTTB113() {
        TTB113_Page.marcarCheckboxDoCliforPagadorFeatureTTB113();

    }

    @Então("clicar botão Desbloqueia Selecionados feature TTB113")
    public void clicarBotaoDesbloqueiaSelecionadosFeatureTTB113() {
        TTB113_Page.clicarDesbloqueiaSelecionadosFeatureTTB113();
    }

    @Então("clicar botão {string} do modall feature TTB113")
    public void clicarBotaoDoModallFeatureTTB113(String acao) {
        TTB113_Page.clicarBotaoDoModal(acao);
    }


    //Segunda page começa aqui


    @Quando("acessar page {string} feature TTB113")
    public void acessarPageCliforPagadorCreditoFeatureTTB113 (String credito) {
        TTB113_Page.clicarBotaoTransicao();
        TTB113_Page.acessarPageCliforPagadorCreditoFeatureTTB113(credito);
    }

    @E("clicar opção vazia teste {string} feature TTB113")
    public void clicarOpcaoVaziaTesteFeatureTTB113(String statusOperacao) {
        TTB113_Page.selecionarOperacaoFeatureTTB113(statusOperacao);
    }

    @E("selecionar {string} no campo Status de liberação feature TTB113")
    public void selecionarCampoStatusDeLiberacaoFeatureTTB113(String statusLiberacao) {
        TTB113_Page.selecionarCampoStatusDeLiberacaoFeatureTTB113(statusLiberacao);
    }

    @E("clicar botão consultar feature TTB113")
    public void clicarBotaoConsultarFeatureTTB113() {
        TTB113_Page.clicarBotaoConsultar ();
    }

    @E("marcar checkbox do clifor feature TTB113")
    public void marcarCheckboxDoCliforFeatureTTB133() {
        TTB113_Page.marcarCheckboxCliforFeatureTTB113();
    }

    @E("preencher o motivo de recusa autorizacao feature TTB113")
    public void preencherOMotivoDeRecusaAutorizacaoFeatureTTB113() {
        TTB113_Page.preencherOMotivoDeRecusaAutorizacaoFeatureTTB113(massaTeste.getMassaTestePorPathEChave(tagMassa, "observacao"));
    }


    //Cenário triste











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



