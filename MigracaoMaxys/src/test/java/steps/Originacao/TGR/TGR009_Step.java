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
import pages.Originacao.TGR.TGR009_Page;
import utils.DataBaseConnection;
import utils.MassaTeste;

import java.time.Duration;

public class TGR009_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.TGR.TGR009_Page TGR009_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TGR009")
    public void inicializeAExecuçãoDosCenáriosDoTGR009() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TGR009_Page = new TGR009_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TGR009")
    public void acessarOProgramaFeatureTGR009(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature TGR009")
    public void clicarBotãoToolBarFeatureTGR009(String botao) {
        basePage.esperarMilissegundos(2000); // espera necessária
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature TGR009")
    public void apresentarAMensagemNoPopUpFeatureTGR009(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
        basePage.esperarMilissegundos(500); // espera necessária
    }

    @Quando("apresentar o modal H5 {string} feature TGR009")
    public void apresentarOModalH5FeatureTGR009(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TGR009")
    public void apresentarAMensagemFeatureTGR009(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature TGR009")
    public void clicarBotãoDoModalFeatureTGR009(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature TGR009")
    public void apresentaOModalHFeatureTGR009(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature TGR009")
    public void apresentaOModalFeatureTGR009(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature TGR009")
    public void pressionarTeclaFeatureFCT(String tecla) {
        String primeiraLinhaGrid = "//*[@id='itemsimilar-cdItembal-0']/div/input";
        basePage.encontrarElementoByXpath(primeiraLinhaGrid);
        basePage.clicarElementoByXpath(primeiraLinhaGrid);
        basePage.pressionarTecla(tecla);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("pressionar teclas shift + f6 para excluir TGR009")
    public void pressionarTeclasShiftF6ParaExcluirTGR009() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Produto da balanca feature TGR009")
    public void preencherProdutoDaBalancaFeatureTGR009() {
        TGR009_Page.preencherProdutoDaBalancaFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "prodBalanca"));
    }

    @E("preencher Produto feature TGR009")
    public void preencherProdutoFeatureTGR009() {
        TGR009_Page.preencherProdutoFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto"));
    }

    @E("seleciona {string} para Somente Grãos feature TGR009")
    public void selecionaParaSomenteGrãosFeatureTGR009(String status) {

        switch (status.toLowerCase()) {
            case "não":
                TGR009_Page.selecionaParaSomenteGrãosFeatureTGR009(1);
                break;
            case "sim":
                TGR009_Page.selecionaParaSomenteGrãosFeatureTGR009(2);
                break;
            default:
                throw new IllegalArgumentException("Elemento não reconhecido: " + status);
        }
    }


    @Então("preencher Cultura feature TGR009")
    public void preencherCulturaFeatureTGR009() {
        TGR009_Page.preencherCulturaFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "cultura"));
    }

    @Quando("recarregar o programa feature TGR009")
    public void recarregarOProgramaFeatureTGR009() {
        basePage.recarregarPaginaComRefresh();
    }

    @Quando("selecionar o Produto Similar feature TGR009")
    public void selecionarOProdutoSimilarFeatureTGR009() {
        TGR009_Page.selecionarOProdutoSimilarFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "prodBalanca"), massaTeste.getMassaTestePorPathEChave(tagMassa, "produto"));
    }

    @E("clicar botão Tipo de Cálculo feature TGR009")
    public void clicarBotãoTipoDeCálculoFeatureTGR009() {
        TGR009_Page.clicarBotãoTipoDeCálculoFeatureTGR009();
    }

    @Então("preencher Tp Cálculo feature TGR009")
    public void preencherTpCálculoFeatureTGR009() {
        TGR009_Page.preencherTpCálculoFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "tpCalculo"));
    }

    @Quando("clicar botão Salvar Tipo Cálculo feature TGR009")
    public void clicarBotãoSalvarTipoCálculoFeatureTGR009() {
        TGR009_Page.clicarBotãoSalvarTipoCálculoFeatureTGR009();
    }

    @Quando("clicar botão Fechar feature TGR009")
    public void clicarBotãoFecharFeatureTGR009() {
        TGR009_Page.clicarBotãoFecharFeatureTGR009();
    }

    @Então("seleciona Tp Cálculo feature TGR009")
    public void selecionaTpCálculoFeatureTGR009() {
        TGR009_Page.selecionaTpCálculoFeatureTGR009(massaTeste.getMassaTestePorPathEChave(tagMassa, "tpCalculo"));
    }

    @E("excluir os registro cadastrados via Banco de Dados feature TGR009")
    public void excluirOsRegistroCadastradosViaBancoDeDadosFeatureTGR009() {
        String produtoBalanca = massaTeste.getMassaTestePorPathEChave(tagMassa, "prodBalanca");
        String produto = massaTeste.getMassaTestePorPathEChave(tagMassa, "produto");
        String query = String.format(
                "DELETE FROM ITEMSIMILAR WHERE CD_ITEMBAL = '%s' AND CD_ITEM = '%s'",
                produtoBalanca, produto
        );
        DataBaseConnection.executeQuery(query);
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
//        driver = null;
    }

}