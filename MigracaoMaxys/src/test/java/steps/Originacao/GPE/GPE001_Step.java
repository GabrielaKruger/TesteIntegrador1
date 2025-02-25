package steps.Originacao.GPE;

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
import pages.Originacao.GPE.GPE001_Page;
import utils.MassaTeste;

import java.time.Duration;

public class GPE001_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.GPE.GPE001_Page GPE001_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do GPE001")
    public void inicializeAExecuçãoDosCenáriosDoGPE001() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        GPE001_Page = new GPE001_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature GPE001")
    public void acessarOProgramaFeatureGPE001(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

    @Quando("preencher Clifor page contratos de grao feature GPE001")
    public void preencherCliforFeatureGPE001() {
        GPE001_Page.preencherCliforFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor1"));
    }
    @Quando("preencher Clifor {string} page contratos de grao feature GPE001")
    public void preencherCliforPageContratosDeGraoFeatureGPE001(String clifor) {
        GPE001_Page.preencherCliforPageFeatureGPE001(clifor);
    }

    @E("seleciona Tipo de Contrato feature GPE001")
    public void selecionaTipoDeContratoFeatureGPE001() {
        GPE001_Page.selecionaTipoDeContratoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato"));
    }

    @E("preencher Produto feature GPE001")
    public void preencherProdutoFeatureGPE001() {
        GPE001_Page.preencherProdutoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto"));
    }

    @E("preencher Tabela de Desconto feature GPE001")
    public void preencherTabelaDeDescontoFeatureGPE001() {
        GPE001_Page.preencherTabelaDeDescontoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tbDesconto"));
    }

    @E("preencher Negócio feature GPE001")
    public void preencherNegócioFeatureGPE001() {
        GPE001_Page.preencherNegócioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "negocio"));
    }

    @E("preencher Data de Vencimento feature GPE001")
    public void preencherDataDeVencimentoFeatureGPE001() {
        GPE001_Page.preencherDataDeVencimentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataVencimento"));
    }

    @E("preencher Ano safra feature GPE001")
    public void preencherAnoSafraFeatureGPE001() {
        GPE001_Page.preencherAnoSafraFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "anoSafra"));
    }

    @E("seleciona Tipos de Cálculo feature GPE001")
    public void selecionaTiposDeCálculoFeatureGPE001() {
        GPE001_Page.selecionaTiposDeCálculoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoCalculo"));
    }

    @E("preencher PesoEVolume Contratado feature GPE001")
    public void preencherPesoVolumeContratadoFeatureGPE001() {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoVolume"));
    }

    @Então("preencher Preço Unitário feature GPE001")
    public void preencherPreçoUnitárioFeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario"));
    }

    @Então("clicar botão ToolBar {string} feature GPE001")
    public void clicarBotãoToolBarFeatureGPE001(String botao) {
        basePage.esperarMilissegundos(5000); // espera necessária
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature GPE001")
    public void apresentarOModalH5FeatureGPE001(String title) {
        basePage.esperarMilissegundos(1000);//espera necessária
        basePage.validaModalByH5(title);
        basePage.esperarMilissegundos(1000);//espera necessária
    }

    @E("apresentar a mensagem parcial {string} feature GPE001")
    public void apresentarAMensagemParcialFeatureGPE001(String mensagem) {
        basePage.esperarMilissegundos(1000); //espera necessária
        //basePage.validaMensagemLabelByText(mensagem);
        basePage.validaMensagemLabelByContainsText(mensagem);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @Então("clicar botão {string} do modal feature GPE001")
    public void clicarBotãoDoModalFeatureGPE001(String acao) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @E("preencher Dia feature GPE001")
    public void preencherDiaFeatureGPE001() {
        GPE001_Page.preencherDiaFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dia"));
    }

    @Então("preencher Condição de pagamento feature GPE001")
    public void preencherCondiçãoDePagamentoFeatureGPE001() {
        GPE001_Page.preencherCondiçãoDePagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @Quando("acessar page {string} feature GPE001")
    public void acessarPageFeatureGPE001(String botao) {
        GPE001_Page.acessarPageFeatureGPE001(botao);
    }

    @Então("preencher Valor pagamento feature GPE001")
    public void preencherValorPagamentoFeatureGPE001() {
        GPE001_Page.preencherValorPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorPagamento"));
    }

    @E("preencher Data pagamento feature GPE001")
    public void preencherDataPagamentoFeatureGPE() {
        GPE001_Page.preencherDataPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataPagamento"));

    }

    @E("preencher Clifor2 page Favorecidos feature GPE001")
    public void preencherCliforFeatureGPE() {
        GPE001_Page.preencherClifor2FeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor2"));
    }

    @Então("seleciona Tipo pagamento feature GPE001")
    public void selecionaTipoPagamentoFeatureGPE001() {
        GPE001_Page.selecionaTipoPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoPagamento"));
    }

    @E("preencher Valor pagamento2 feature GPE001")
    public void preencherValorPagamento2FeatureGPE001() {
        GPE001_Page.preencherValorPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorPagamento2"));
    }

    @E("preencher Valor pagamento3 feature GPE001")
    public void preencherValorPagamento3FeatureGPE001() {
        GPE001_Page.preencherValorPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorPagamento3"));
    }

    @Quando("preencher Clifor3 page contratos de grao feature GPE001")
    public void preencherClifor3PageContratosDeGraoFeatureGPE001() {
        GPE001_Page.preencherCliforFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor3"));
    }

    @E("preencher Clifor4 page Favorecidos feature GPE001")
    public void preencherClifor4PageFavorecidosFeatureGPE001() {
        GPE001_Page.preencherClifor2FeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor3"));
    }

    @E("preencher Valor pagamento4 feature GPE001")
    public void preencherValorPagamento4FeatureGPE001() {
        GPE001_Page.preencherValorPagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorPagamento4"));
    }

    @Então("preencher Produto não cadastrado feature GPE001")
    public void preencherProdutoNãoCadastradoFeatureGPE001() {
        GPE001_Page.preencherProdutoNãoCadastradoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "produtoNaocadastrado"));
    }

    @Então("selecionar Operação {string} feature GPE001")
    public void selecionarOperaçãoFeatureGPE001(String exportacao) {
        GPE001_Page.selecionarOperaçãoFeatureGPE001(exportacao);
    }

    @E("preencher Produto sem lov feature GPE001")
    public void preencherProdutoSemLovFeatureGPE001() {
        GPE001_Page.preencherProdutoSemLovFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto2"));
    }

    @Quando("preencher Empr.Origem page contratos de grao feature GPE001")
    public void preencherEmprOrigemPageContratosDeGraoFeatureGPE001() {
        GPE001_Page.preencherEmprOrigemPageContratosDeGraoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresaOrigem"));
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
