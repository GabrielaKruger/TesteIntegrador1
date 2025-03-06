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


    //versão 5619v1
    @Quando("preencher CliforPJ page contratos de grao feature GPE001")
    public void preencherCliforPJFeatureGPE001() {
        GPE001_Page.preencherCliforFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforPJ"));
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


    //page5619v4

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

// versão 4933v1
    @Quando("preencher CliforPF page contratos de grao feature GPE001")
    public void preencherCliforPFPageContratosDeGraoFeatureGPE001() {
        GPE001_Page.preencherCliforFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforPF"));
    }

    @Quando("seleciona Tipo de Contrato2 feature GPE001")
    public void selecionaTipoDeContrato2FeatureGPE001() {
        GPE001_Page.selecionaTipoDeContratoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato2"));
    }

    @E("preencher Data de Vencimento2 feature GPE001")
    public void preencherDataDeVencimento2FeatureGPE001() {
        GPE001_Page.preencherDataDeVencimentoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataVencimento2"));
    }

    @E("preencher Ano safra2 feature GPE001")
    public void preencherAnoSafra2FeatureGPE001() {
        GPE001_Page.preencherAnoSafraFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "anoSafra2"));
    }

    @E("preencher PesoEVolume Contratado2 feature GPE001")
    public void preencherPesoEVolumeContratadoFeatureGPE001() {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoVolume2"));
    }

    @E("preencher Preço Unitário2 feature GPE001")
    public void preencherPreçoUnitário2FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario2"));
    }

    //versão 4933v2

    @E("preencher Preço Unitário3 feature GPE001")
    public void preencherPreçoUnitário3FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario3"));
    }

    @E("selecionar Faturamento {string} feature GPE001")
    public void selecionarFaturamentoFeatureGPE001(String mestra) {
        GPE001_Page.selecionarFaturamentoFeatureGPE001(mestra);
    }

    @E("preencher Preço Unitário4 feature GPE001")
    public void preencherPreçoUnitário4FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario4"));
    }


    //@5619v1
    @Quando("seleciona Tipo de Contrato3 feature GPE001")
    public void selecionaTipoDeContrato3FeatureGPE001() {
        GPE001_Page.selecionaTipoDeContratoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato3"));
    }

    @E("preencher Produto3 feature GPE001")
    public void preencherProduto3FeatureGPE001() {
        GPE001_Page.preencherProdutoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto3"));
    }

    @E("preencher Tabela de Desconto2 feature GPE001")
    public void preencherTabelaDeDesconto2FeatureGPE001() {
        GPE001_Page.preencherTabelaDeDescontoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tbDesconto2"));
    }

    @E("preencher PesoEVolume Contratado3 feature GPE001")
    public void preencherPesoVolumeContratado3FeatureGPE001() {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoVolume3"));
    }

    @E("preencher Preço Unitário5 feature GPE001")
    public void preencherPreçoUnitário5FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario5"));
    }

    //@4934v2
    @Quando("seleciona Tipo de Contrato4 feature GPE001")
    public void selecionaTipoDeContrato4FeatureGPE001() {
        GPE001_Page.selecionaTipoDeContratoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato4"));
    }

    @E("preencher Preço Unitário6 feature GPE001")
    public void preencherPreçoUnitário6FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario6"));
    }

    @E("seleciona Tipos de Cálculo2 feature GPE001")
    public void selecionaTiposDeCálculo2FeatureGPE001() {
        GPE001_Page.selecionaTiposDeCálculoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoCalculo2"));
    }

    //@4935v1
    @Quando("seleciona Tipo de Contrato5 feature GPE001")
    public void selecionaTipoDeContrato5FeatureGPE001() {
        GPE001_Page.selecionaTipoDeContratoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato5"));
    }

    @E("preencher Produto4 feature GPE001")
    public void preencherProduto4FeatureGPE001() {
        GPE001_Page.preencherProdutoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto4"));
    }

    @E("preencher Preço Unitário7 feature GPE001")
    public void preencherPreçoUnitário7FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario7"));
    }

    @Então("clicar botão {string} page Vencimento ICMS feature GPE001")
    public void clicarBotãoPageVencimentoICMSFeatureGPE001(String repetirVencimento) {
        GPE001_Page.clicarBotãoPageVencimentoICMSFeatureGPE001(repetirVencimento);
    }

    //@4936v1
    @E("preencher Preço Unitário8 feature GPE001")
    public void preencherPreçoUnitário8FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario8"));
    }

    //4936v2
    @E("preencher PesoEVolume Contratado4 feature GPE001")
    public void preencherPesoEVolumeContratado4FeatureGPE001() {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoVolume4"));
    }

    @E("preencher Preço Unitário9 feature GPE001")
    public void preencherPreçoUnitário9FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "preçoUnitario9"));
    }

    //4936v3
    @E("preencher Cliente page Frete feature GPE001")
    public void preencherClientePageFreteFeatureGPE001() {
        GPE001_Page.preencherClientePageFreteFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clienteFrete"));
    }

    @E("preencher Rota page Frete feature GPE001")
    public void preencherRotaPageFreteFeatureGPE001() {
        GPE001_Page.preencherRotaPageFreteFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "rotaFrete"));
    }

    @E("preencher Data de Início page Frete feature GPE001")
    public void preencherDataDeInícioPageFreteFeatureGPE001() {
        GPE001_Page.preencherDataDeInícioPageFreteFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtinicioFrete"));
    }

    @E("preencher Tipo de Cálculo page Frete feature GPE001")
    public void preencherTipoDeCálculoPageFreteFeatureGPE001() {
        GPE001_Page.preencherTipoDeCálculoPageFreteFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipocalculoFrete"));
    }

    @E("preencher Valor Unitário page Frete feature GPE001")
    public void preencherValorUnitárioPageFreteFeatureGPE001() {
        GPE001_Page.preencherValorUnitárioPageFreteFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorUnitarioFrete"));
    }

    @E("selecionar Filtro Frete {string} page Frete feature GPE001")
    public void selecionarFiltroFretePageFreteFeatureGPE001(String stFrete) {
        GPE001_Page.selecionarFiltroFretePageFreteFeatureGPE001(stFrete);
    }

    @Então("preencher Preço Unitário10 feature GPE001")
    public void preencherPreçoUnitário10FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoUnitario10"));
    }

     //4936v3
    @E("preencher Empresa page Bonificação feature GPE001")
    public void preencherEmpresaPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherEmpresaPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Qualidade page Bonificação feature GPE001")
    public void preencherQualidadePageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherQualidadePageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "qualidade"));
    }


    @E("preencher PesoEVolume Bonificado page Bonificação feature GPE001")
    public void preencherPesoEVolumeBonificadoPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherPesoEVolumeBonificadoPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolume"));
    }

    @E("preencher PesoEVolume Já Pago page Bonificação feature GPE001")
    public void preencherPesoEVolumeJáPagoPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherPesoEVolumeJáPagoPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolumePago"));
    }

    @E("preencher Data Limite page Bonificação feature GPE001")
    public void preencherDataLimitePageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherDataLimitePageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataLimite"));
    }

    @E("preencher %Bonif Comercial page Bonificação feature GPE001")
    public void preencherBonifComercialPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherBonifComercialPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "bonifComercial"));
    }

    @E("preencher %Bonif Familiar page Bonificação feature GPE001")
    public void preencherBonifFamiliarPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherBonifFamiliarPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "bonifFamiliar"));
    }

    @E("preencher Empresa2 page Bonificação feature GPE001")
    public void preencherEmpresa2PageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherEmpresa2PageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa2"));
    }

    @E("preencher Qualidade2 page Bonificação feature GPE001")
    public void preencherQualidade2PageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherQualidade2PageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "qualidade2"));
    }

    @E("preencher PesoEVolume2 Bonificado page Bonificação feature GPE001")
    public void preencherPesoEVolume2BonificadoPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherPesoEVolume2BonificadoPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolume"));
    }

    @E("preencher PesoEVolume2 Já Pago page Bonificação feature GPE001")
    public void preencherPesoEVolume2JáPagoPageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherPesoEVolume2JáPagoPageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolumePago"));

    }

    @E("preencher Data Limite2 page Bonificação feature GPE001")
    public void preencherDataLimite2PageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherDataLimite2PageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataLimite2"));
    }

    @E("preencher %Bonif Comercial2 page Bonificação feature GPE001")
    public void preencherBonifComercial2PageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherBonifComercial2PageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "bonifComercial2"));
    }

    @E("preencher %Bonif Familiar2 page Bonificação feature GPE001")
    public void preencherBonifFamiliar2PageBonificaçãoFeatureGPE001() {
        GPE001_Page.preencherBonifFamiliar2PageBonificaçãoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "bonifFamiliar2"));
    }

    @E("preencher PesoEVolume Contratado2 feature GPE001")
    public void preencherPesoEVolumeContratado2FeatureGPE001() {
        GPE001_Page.preencherPesoVolumeContratadoFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoVolume2"));
    }


    //@4936v5
    @E("preencher Serviço page Serviços feature GPE001")
    public void preencherServiçoPageServiçosFeatureGPE001() {
        GPE001_Page.preencherServiçoPageServiçosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "serviço"));
    }

    @E("preencher Tp.Serviço page Serviços feature GPE001")
    public void preencherTpServiçoPageServiçosFeatureGPE001() {
        GPE001_Page.preencherTpServiçoPageServiçosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "tpServiço"));
    }

    @E("preencher Dt.Início page Serviços feature GPE001")
    public void preencherDtInícioPageServiçosFeatureGPE001() {
        GPE001_Page.preencherDtInícioPageServiçosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtInicio"));
    }

    @E("preencher Dt.Fim page Serviços feature GPE001")
    public void preencherDtFimPageServiçosFeatureGPE001() {
        GPE001_Page.preencherDtFimPageServiçosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtFim"));
    }

    //@4937v1
    @E("selecionar Classificação {string} feature GPE001")
    public void selecionarClassificaçãoFeatureGPE001(String origem) {
        GPE001_Page.selecionarClassificaçãoFeatureGPE001(origem);
    }

    @E("preencher PesoeVolume page Vencimentos feature GPE001")
    public void preencherPesoeVolumePageVencimentosFeatureGPE001() {
        GPE001_Page.preencherPesoeVolumePageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolumeV"));
    }

    @E("preencher Condição de Pagamento page Vencimentos feature GPE001")
    public void preencherCondiçãoDePagamentoPageVencimentosFeatureGPE001() {
        GPE001_Page.preencherCondiçãoDePagamentoPageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "condPagamentoV"));
    }

    @E("preencher Forma de Pagamento page Vencimentos feature GPE001")
    public void preencherFormaDePagamentoPageVencimentosFeatureGPE001() {
        GPE001_Page.preencherFormaDePagamentoPageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaPagamento"));
    }

    @E("preencher PesoeVolume2 page Vencimentos feature GPE001")
    public void preencherPesoeVolume2PageVencimentosFeatureGPE001() {
        GPE001_Page.preencherPesoeVolume2PageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "pesoVolumeV"));

    }

    @E("preencher Condição de Pagamento2 page Vencimentos feature GPE001")
    public void preencherCondiçãoDePagamento2PageVencimentosFeatureGPE001() {
        GPE001_Page.preencherCondiçãoDePagamento2PageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "condPagamento2V"));
    }

    @E("preencher Forma de Pagamento2 page Vencimentos feature GPE001")
    public void preencherFormaDePagamento2PageVencimentosFeatureGPE001() {
        GPE001_Page.preencherFormaDePagamento2PageVencimentosFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaPagamento"));
    }

    //@5014v2
    @E("preencher Preço Unitário11 feature GPE001")
    public void preencherPreçoUnitário11FeatureGPE001() {
        GPE001_Page.preencherPreçoUnitárioFeatureGPE001(massaTeste.getMassaTestePorPathEChave(tagMassa, "precoUnitario11"));
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
