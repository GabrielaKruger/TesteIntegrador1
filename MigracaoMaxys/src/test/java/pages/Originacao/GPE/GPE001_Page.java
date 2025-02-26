package pages.Originacao.GPE;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class GPE001_Page extends BasePage {
    WebDriver driver;

    //Strings Page Pedidos/Contratos de Grão
    String inputCliforXpath = "//*[@id='contratograo-cdClifor']/div/input";
    String selectExportacaoXpath = "//*[@id='ngx-radio-5']";
    String selectMestraXpath = "//*[@id='ngx-radio-4']";

    //Strings Page Dados
    String inputProdutoXpath = "//*[@id='contratograo-cdItem']/div/input";
    String selectFixoXpath = "//*[@id='contratograo-tpContrato']/div/select";
    String inputTbdescontoXpath = "//*[@id='contratograo-nrTabdescgrao']/div/input";
    String inputNegocioXpath = "//*[@id='contratograo-cdNegocio']/div/input";
    String inputDataVencimentoXpath = "//*[@id='contratograo-dtVencimento']/div/div/input";
    String inputAnoSafraXpath = "//*[@id='contratograo-dtAnosafra']/div/input";
    String input3SacasXpath = "//*[@id='contratograo-cdTipocalculo']/div/select";
    String inputPesoeVolumeXpath = "//*[@id='contratograo-psContratado']/div/input";
    String inputPrecoUnitarioXpath = "//*[@id='contratograo-prUnitcomicms']/div/input";
    String inputDiaXpath = "//*[@id='vencicmsgrao-nrDiafaturamento-0']/div/input";
    String inputCondicaoPagamentoXpath = "//*[@id='vencicmsgrao-cdCondpagto-0']/div/input";
    String elementoProduto = "lovItem";
    String elementoTbdesconto = "lovTabdescgrao";
    String elementoNegocio = "lovNegocio";

    //Strings Page Favorecidos/Impressão
    String inputClifor2Xpath = "//*[@id='favorecidoscontrpagto-cdClifor-0']/div/input";
    String inputValorPagamento = "//*[@id='favorecidoscontrpagto-vlPagamento-0']/div/input";
    String inputDatadoPagamento = "//*[@id='favorecidoscontrpagto-dtPagamento']/div/div/input";
    String inputTipoPagamentoXpath = "//*[@id='favorecidoscontrpagto-tpPagamento']/div/select";
    String inputEmpresaOrigemXpath = "//*[@id='contratograo-cdEmprorigem']/div/input";


    public GPE001_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCliforFeatureGPE001(String clifor) {
        esperarMilissegundos(5000); // espera para ele terminar de carregar todos as pages
        clicarElementoByXpathNVezes(inputCliforXpath, 2);
        preencherElementoByXpath(inputCliforXpath, clifor);
        pressionarENTERByXpath(inputCliforXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherCliforPageFeatureGPE001(String clifor) {
        esperarMilissegundos(5000); // espera para ele terminar de carregar todos as pages
        clicarElementoByXpathNVezes(inputCliforXpath, 2);
        preencherElementoByXpath(inputCliforXpath, clifor);
        pressionarENTERByXpath(inputCliforXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void acessarPageFeatureGPE001(String botao) {
        esperarMilissegundos(2000); // espera necessária
        selecionarPaginaNoMenu(botao);
    }

    public void selecionaTipoDeContratoFeatureGPE001(String opcao) {
        esperarEncontrarEPreencherElementos(selectFixoXpath, opcao);
    }

    public void preencherProdutoFeatureGPE001(String produto) {
          selecionarPeloF9FeatureGPE001(inputProdutoXpath, produto, elementoProduto);
    }

    public void preencherTabelaDeDescontoFeatureGPE001(String tbdesconto) {
        selecionarPeloF9FeatureGPE001(inputTbdescontoXpath, tbdesconto, elementoTbdesconto);
    }

    public void preencherNegócioFeatureGPE001(String negocio) {
        selecionarPeloF9FeatureGPE001(inputNegocioXpath, negocio, elementoNegocio);
    }

    public void preencherDataDeVencimentoFeatureGPE001(String dtvencimento) {
        preencherCampoPorXpathFeatureGPE001(inputDataVencimentoXpath, dtvencimento);
    }

    public void preencherAnoSafraFeatureGPE001(String anosafra) {
        preencherCampoPorXpathFeatureGPE001(inputAnoSafraXpath, anosafra);
    }

    public void selecionaTiposDeCálculoFeatureGPE001(String opcao) {
        preencherCampoPorXpathFeatureGPE001(input3SacasXpath, opcao);
    }

    public void preencherPesoVolumeContratadoFeatureGPE001(String pesoevolume) {
        preencherCampoPorXpathFeatureGPE001(inputPesoeVolumeXpath, pesoevolume);
    }

    public void preencherPreçoUnitárioFeatureGPE001(String precounitario) {
        esperarMilissegundos(1000);
        preencherCampoPorXpathFeatureGPE001(inputPrecoUnitarioXpath, precounitario);
    }

    public void preencherDiaFeatureGPE001(String dia) {
        preencherCampoPorXpathFeatureGPE001(inputDiaXpath, dia);
    }

    public void preencherCondiçãoDePagamentoFeatureGPE001(String condicaopagamento) {
        preencherCampoPorXpathFeatureGPE001(inputCondicaoPagamentoXpath,  condicaopagamento);
    }

    public void preencherValorPagamentoFeatureGPE001(String valorpagamento) {
        preencherCampoPorXpathFeatureGPE001(inputValorPagamento,  valorpagamento);
    }

    public void preencherClifor2FeatureGPE001(String clifor2) {
        preencherCampoPorXpathFeatureGPE001(inputClifor2Xpath, clifor2);
    }

    public void preencherDataPagamentoFeatureGPE001(String dataDoPagamento) {
        preencherCampoPorXpathFeatureGPE001(inputDatadoPagamento, dataDoPagamento);
    }

    public void selecionaTipoPagamentoFeatureGPE001(String tipoPagamento) {
        preencherCampoPorXpathFeatureGPE001(inputTipoPagamentoXpath, tipoPagamento);
    }

    public void preencherProdutoNãoCadastradoFeatureGPE001(String produtoNaocadastrado) {
        esperarMilissegundos(1); //espera necessária
        limparCampoDeTextoPorXpath(inputProdutoXpath);
        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
        preencherElementoByXpath(inputProdutoXpath, produtoNaocadastrado);
        pressionarENTERByXpath(inputProdutoXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void selecionarOperaçãoFeatureGPE001(String exportacao) {
        marcarRadioButon(selectExportacaoXpath);
    }

    public void selecionarFaturamentoFeatureGPE001(String mestra) {marcarRadioButon(selectMestraXpath);
    }


    public void preencherProdutoSemLovFeatureGPE001(String produto2) {
        esperarMilissegundos(2000); //espera necessária
        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
        esperarMilissegundos(2000); //espera necessária
        preencherElementoByXpath(inputProdutoXpath, produto2);
        esperarMilissegundos(2000); //espera necessária
        pressionarENTERByXpath(inputProdutoXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherEmprOrigemPageContratosDeGraoFeatureGPE001(String empresaOrigem) {
        esperarMilissegundos(5000);// espera para ele terminar de carregar todos as pages
        limparCampoDeTextoPorXpath(inputEmpresaOrigemXpath);
        clicarElementoByXpathNVezes(inputEmpresaOrigemXpath, 2);
        preencherElementoByXpath(inputEmpresaOrigemXpath, empresaOrigem);
        pressionarENTERByXpath(inputEmpresaOrigemXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void selecionarPeloF9FeatureGPE001(String elementoCampo, String valor, String elementoTabela){ //metodo auxiliar
        selecionarPeloF9(elementoCampo, valor, elementoTabela);
    }

    public void preencherCampoPorXpathFeatureGPE001(String campoXpath, String valor) {
        clicarElementoByXpathNVezes(campoXpath, 2);
        preencherElementoByXpath(campoXpath, valor);
        pressionarENTERByXpath(campoXpath);
        pressionaTabActions();
    }


}


