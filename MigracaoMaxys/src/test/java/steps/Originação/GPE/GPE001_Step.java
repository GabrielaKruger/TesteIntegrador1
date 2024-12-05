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

    @Quando("preencher Clifor {string} feature GPE001")
    public void preencherCliforFeatureGPE001(String clifor) {
        basePage.esperarMilissegundos(18000); // espera para ele terminar de carregar todos as pages
        GPE001_Page.preencherCliforFeatureGPE001(clifor);
    }

    @Então("preencher Endereço {string} feature GPE001")
    public void preencherEndereçoFeatureGPE001(String endereco) {
        GPE001_Page.preencherEndereçoFeatureGPE001(endereco);
    }

    //@Quando("acessa page Dados feature GPE001")
    //public void acessaPageDadosFeatureGPE001() {
        //GPE001_Page.acessaPageDadosFeatureGPE001();
   // }

    @E("seleciona Tipo de Contrato {string} feature GPE001")
    public void selecionaTipoDeContratoFeatureGPE001(String opcao) {
       GPE001_Page.selecionaTipoDeContratoFeatureGPE001(opcao);
    }

    @E("preencher Produto {string} feature GPE001")
    public void preencherProdutoFeatureGPE001(String produto) {
       GPE001_Page.preencherProdutoFeatureGPE001(produto);
    }

    @E("preencher Tabela de Desconto {string} feature GPE001")
    public void preencherTabelaDeDescontoFeatureGPE001(String tbdesconto) {
        GPE001_Page.preencherTabelaDeDescontoFeatureGPE001(tbdesconto);
    }

    @E("preencher Negócio {string} feature GPE001")
    public void preencherNegócioFeatureGPE001(String negocio) {
        GPE001_Page.preencherNegócioFeatureGPE001(negocio);

    }

    @E("preencher Moeda {string} feature GPE001")
    public void preencherMoedaFeatureGPE001(String moeda) {
        GPE001_Page.preencherMoedaFeatureGPE001(moeda);
        
    }

    @E("preencher Data de Vencimento {string} feature GPE001")
    public void preencherDataDeVencimentoFeatureGPE001(String dtvencimento) {
        GPE001_Page.preencherDataDeVencimentoFeatureGPE001(dtvencimento);
        
    }

    @E("preencher Ano safra {string} feature GPE001")
    public void preencherAnoSafraFeatureGPE001(String anosafra) {
        GPE001_Page.preencherAnoSafraFeatureGPE001(anosafra);
        
    }

    @E("seleciona Tipos de Cálculo {string} feature GPE001")
    public void selecionaTiposDeCálculoFeatureGPE001(String opcao) {
        GPE001_Page.selecionaTiposDeCálculoFeatureGPE001(opcao);
        
    }

    @E("preencher PesoEVolume Contratado feature GPE001")
    public void preencherPesoVolumeContratadoFeatureGPE001(String pesoevolume) {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(pesoevolume);
    }

    @Então("preencher Preço Unitário feature GPE001")
    public void preencherPreçoUnitárioFeatureGPE001(String precounitario) {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(precounitario);
    }

    @Quando("clicar botão ToolBar {string} feature GPE001")
    public void clicarBotãoToolBarFeatureGPE001(String botao) {
       basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature GPE001")
    public void apresentarOModalH5FeatureGPE001(String title) {
       basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem parcial {string} feature GPE001")
    public void apresentarAMensagemParcialFeatureGPE001(String mensagem) {
       basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @Então("clicar botão {string} do modal feature GPE001")
    public void clicarBotãoDoModalFeatureGPE001(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("acessar page {string} feature GPE001")
    public void acessarPageFeatureGPE001() {
        GPE001_Page.acessarPageFeatureGPE001();
    }

    @E("preencher Dia feature GPE001")
    public void preencherDiaFeatureGPE001(String dia) {
        GPE001_Page.preencherDiaFeatureGPE001(dia);
    }

    @Então("preencher Condição de pagamento feature GPE001")
    public void preencherCondiçãoDePagamentoFeatureGPE001(String condicaopagamento) {
        GPE001_Page.preencherCondiçãoDePagamentoFeatureGPE001(condicaopagamento);
    }

    @E("apresentar o modal H5{int} {string} feature GPE001")
    public void apresentarOModalHFeatureGPE(String title) {
        basePage.validaModalByH5(title);
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
}
