package steps.Originação.GPE;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originação.GPE.GPE001_Page;
import utils.MassaTeste;

import java.time.Duration;

public class GPE001_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originação.GPE.GPE001_Page GPE001_Page;
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
        basePage.esperarMilissegundos(20000); // espera para ele terminar de carregar todos as pages
        GPE001_Page.preencherCliforFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor1"));
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
        basePage.esperarMilissegundos(15000); // espera necessária
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature GPE001")
    public void apresentarOModalH5FeatureGPE001(String title) {
        basePage.esperarMilissegundos(2000);
        basePage.validaModalByH5(title);
        basePage.esperarMilissegundos(2000);
    }

    @E("apresentar a mensagem parcial {string} feature GPE001")
    public void apresentarAMensagemParcialFeatureGPE001(String mensagem) {
        basePage.esperarMilissegundos(12000);
        //basePage.validaMensagemLabelByText(mensagem);
        basePage.validaMensagemLabelByContainsText(mensagem);
        basePage.esperarMilissegundos(10000);
    }

    @Então("clicar botão {string} do modal feature GPE001")
    public void clicarBotãoDoModalFeatureGPE001(String acao) {
        basePage.esperarMilissegundos(10000);
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(2000);
    }

    @E("preencher Dia feature GPE001")
    public void preencherDiaFeatureGPE001() {
        GPE001_Page.preencherDiaFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dia"));
    }

    @Então("preencher Condição de pagamento feature GPE001")
    public void preencherCondiçãoDePagamentoFeatureGPE001() {
        GPE001_Page.preencherCondiçãoDePagamentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("apresentar o modal H5{int} {string} feature GPE001")
    public void apresentarOModalHFeatureGPE(String title) {
        basePage.validaModalByH5(title);
    }

    //2 caso de teste

    @Quando("acessar page feature GPE001")
    public void acessarPageFeatureGPE001() {
        GPE001_Page.acessarPageFeatureGPE001();
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
        basePage.esperarMilissegundos(5000); // espera para ele terminar de carregar todos as pages
        GPE001_Page.preencherClifor2FeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor2"));
    }
}


//
//    @Quando("clicar botão ToolBar {string} feature TCO035")
//    public void clicarBotãoToolbarFeatureTCO035(String botao) {
//        basePage.clicarBotaoToolBar(botao);
//    }
//
//    @E("apresentar o modal H5 {string} feature TCO035")
//    public void apresentarOModalH5FeatureTCO035(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @E("apresentar a mensagem {string} feature TCO035")
//    public void apresentarAMensagemFeatureTCO035(String mensagem) {
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @E("clicar botão {string} do modal feature TCO035")
//    public void clicarBotãoDoModalFeatureTCO035(String acao) {
//        basePage.clicarBotaoDoModal(acao);
//    }
//
//    @Quando("recarregar o programa feature TCO035")
//    public void recarregarOProgramaFeatureTCO035() {
//        basePage.recarregarPaginaComRefresh();
//    }
//
//    @Quando("apresenta o modal H4 {string} feature TCO035")
//    public void apresentaOModalH4FeatureTCO035(String title) {
//        basePage.validaModalByH4(title);
//    }
//
//    @E("preencher Empresa feature TCO035")
//    public void preencherEmpresaFeatureTCO035() {
//        TCO035_Page.preencherEmpresaFeatureTCO035();
//    }
//
//    @E("preencher Autorizador feature TCO035")
//    public void preencherAutorizadorFeatureTCO035() {
//      TCO035_Page.preencherAutorizadorFeatureTCO035( massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
//    }
//
//    @E("preencher C.Custo feature TCO035")
//    public void preencherCCustoFeatureTCO035() {
//        TCO035_Page.preencherCCustoFeatureTCO035();
//    }
//
//    @Então("seleciona Status {string} feature TCO035")
//    public void selecionaStatusFeatureTCO035(String status) {
//        TCO035_Page.selecionaStatusFeatureTCO035 (status);
//    }
//
//    @E("informa Autorizador feature TCO035")
//    public void informaAutorizadorFeatureTCO035() {
//        TCO035_Page.informaAutorizadorFeatureTCO035( massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
//    }
//
//    @E("realizar consulta feature TCO035")
//    public void realizarConsultaFeatureTCO035() {
//        TCO035_Page.realizarConsultaFeatureTCO035();
//    }
//
//    @E("selecionar Autorizador feature TCO035")
//    public void selecionarAutorizadorFeatureTCO035() {
//        TCO035_Page.selecionarAutorizadorFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
//    }
//
//    @Quando("pressionar tecla {string} feature TCO035")
//    public void pressionarTeclaFeatureTCO035(String tecla) {
//        basePage.pressionarTecla(tecla);
//    }
//
//    @Quando("pressionar tecla shift + f6 feature TCO035")
//    public void pressionarTeclaShiftFFeatureTCO035() {
//        basePage.pressionarShiftF6();
//    }
//
//
//    @E("selecionar a Empresa Consulta feature TCO035")
//    public void selecionarAEmpresaConsultaFeatureTCO035() {
//        TCO035_Page.selecionarEmpresaConsultaFeatureTCO035();
//    }
//
//    @E("selecionar o Autorizador Consulta feature TCO035")
//    public void selecionarOAutorizadorConsultaFeatureTCO035() {
//        TCO035_Page.selecionarOAutorizadorConsultaFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
//    }
//
//    @E("selecionar o C.Custo Consulta feature TCO035")
//    public void selecionarOCCustoConsultaFeatureTCO035() {
//        TCO035_Page.selecionarOCCustoConsultaFeatureTCO035();
//    }
//
//    @E("selecionar a Empresa Grid feature TCO035")
//    public void selecionarAEmpresaGridFeatureTCO035() {
//        TCO035_Page.selecionarAEmpresaGridFeatureTCO035();
//    }
//
//    @E("selecionar o Autorizador Grid feature TCO035")
//    public void selecionarOAutorizadorGridFeatureTCO035() {
//        TCO035_Page.selecionarOAutorizadorGridFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
//    }
//
//    @E("selecionar o C.Custo Grid feature TCO035")
//    public void selecionarOCCustoGridFeatureTCO035() {
//        TCO035_Page.selecionarOCCustoGridFeatureTCO035();
//    }
//
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
//

