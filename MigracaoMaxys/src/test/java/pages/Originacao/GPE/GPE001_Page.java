package pages.Originacao.GPE;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class GPE001_Page extends BasePage {
    WebDriver driver;

    //Strings Page Pedidos/Contratos de Grão
    String inputCliforXpath = "//*[@id='contratograo-cdClifor']/div/input";
    String selectExportacaoXpath = "//*[@id='ngx-radio-5']";
    String selectMestraXpath = "//*[@id='ngx-radio-4']";
    String selectOrigemXpath= "//*[@id='ngx-radio-6']";
    String selectConfiguracoesXpath= "";

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


    //Strings Page Frete <F5>
    String inputClienteXpath= "//*[@id='fretegrao-cdClifor-0']/div/input";
    String inputRotaXpath= "//*[@id='fretegrao-cdRotafrete-0']/div/input";
    String inputdtInicioFreteXpath= "//*[@id='fretegrao-dtInivigor-0']/div/div/input";
    String inputTipoCalculoFreteXpath= "//*[@id='fretegrao-cdTipocalculofrete-0']/div/input";
    String inputValorUnitarioFreteXpath= "//*[@id='fretegrao-vlUnitfrete-0']/div/input";
    String inputFreteXpath= "//*[@id='fretegrao-dsSituacaofrete-0']/div/input";
    String selectFiltroFreteXpath= "//*[@id='fretegrao-tpFiltrofrete']/div/select";

    //Strings botão
    String btnRepetirVencimentoXpath = "//*[@id='vencicmsgrao-btnRepetir']/div/button/div";


    //Strings Page Bonificação
    String inputEmpresaXpath= "//*[@id='contratograobonif-cdEmprorigem-0']/div/input";
    String inputQualidadeXpath= "//*[@id='contratograobonif-cdTipoqualidade-0']/div/input";
    String inputPesoVolumeXpath= "//*[@id='contratograobonif-psComissao-0']/div/input";
    String inputPesoVolumePagoXpath= "//*[@id='contratograobonif-psBonificado-0']/div/input";
    String inputDataLimiteXpath= "//*[@id='contratograobonif-dtLimitefixacao-0']/div/div/input";
    String inputBonifXpath= "//*[@id='contratograobonif-pcBonifnormal-0']/div/input";
    String inputBonifFamiliarXpath= "//*[@id='contratograobonif-vlComissao-0']/div/input";
    String inputEmpresa2Xpath= "";
    String inputQualidade2Xpath= "";
    String inputPesoVolume2Xpath= "";
    String inputPesoVolumePago2Xpath= "";
    String inputDataLimite2Xpath= "";
    String inputBonifComercial2Xpath= "";
    String inputBonifFamiliar2Xpath= "";


    //Strings Page Serviços
    String inputServicoXpath= "//*[@id='contratoservicograo-cdServicograo-0']/div/input";
    String inputTpServicoXpath= "//*[@id='contratoservicograo-nrTabservicograo-0']/div/input";
    String inputDtInicioXpath= "//*[@id='contratoservicograo-dtInicio-0']/div/div/input";
    String inputDtFimXpath= "//*[@id='contratoservicograo-dtFim-0']/div/div/input";


    //Strings Page Vencimentos
    String inputPesoVolumeVpath= "";
    String inputcondPagamamentoVXpath= "";
    String inputFormaPagamentoXpath= "";
    String inputPesoVolume2VXpath= "";
    String inputcondPagamamento2VXpath= "";
    String inputFormaPagamento2Xpath= "";
    String inputDataCondicaoXpath= "";
    String inputDataCondicao2Xpath= "";







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

    public void clicarBotãoPageVencimentoICMSFeatureGPE001(String repetirVencimento) {
        clicarElementoByXpathNVezes(btnRepetirVencimentoXpath, 2);
    }

    public void preencherClientePageFreteFeatureGPE001(String clienteFrete) {
        preencherCampoPorXpathFeatureGPE001(inputClienteXpath, clienteFrete);
    }

    public void preencherRotaPageFreteFeatureGPE001(String rotaFrete) {
        preencherCampoPorXpathFeatureGPE001(inputRotaXpath, rotaFrete);
    }

    public void preencherDataDeInícioPageFreteFeatureGPE001(String dtinicioFrete) {
        preencherCampoPorXpathFeatureGPE001(inputdtInicioFreteXpath, dtinicioFrete);
    }

    public void preencherTipoDeCálculoPageFreteFeatureGPE001(String tipocalculoFrete) {
        preencherCampoPorXpathFeatureGPE001(inputTipoCalculoFreteXpath, tipocalculoFrete);
    }

    public void preencherValorUnitárioPageFreteFeatureGPE001(String valorUnitarioFrete) {
        preencherCampoPorXpathFeatureGPE001(inputValorUnitarioFreteXpath, valorUnitarioFrete);
    }

    public void selecionarFiltroFretePageFreteFeatureGPE001(String stFrete) {
        preencherCampoPorXpathFeatureGPE001(selectFiltroFreteXpath, stFrete);
    }

    public void preencherEmpresaPageBonificaçãoFeatureGPE001(String empresa) {
        preencherCampoPorXpathFeatureGPE001(inputEmpresaXpath, empresa);
    }

    public void preencherQualidadePageBonificaçãoFeatureGPE001(String qualidade) {
        preencherCampoPorXpathFeatureGPE001(inputQualidadeXpath, qualidade);
    }

    public void preencherPesoEVolumeBonificadoPageBonificaçãoFeatureGPE001(String pesoVolume) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolumeXpath, pesoVolume);
    }

    public void preencherPesoEVolumeJáPagoPageBonificaçãoFeatureGPE001(String pesoVolumePago) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolumePagoXpath, pesoVolumePago);
    }

    public void preencherDataLimitePageBonificaçãoFeatureGPE001(String dataLimite) {
        clicarElementoByXpathNVezes(inputDataLimiteXpath, 2);
    }

    public void preencherBonifComercialPageBonificaçãoFeatureGPE001(String bonifComercial) {
        preencherCampoPorXpathFeatureGPE001(inputBonifXpath, bonifComercial);
    }

    public void preencherBonifFamiliarPageBonificaçãoFeatureGPE001(String bonifFamiliar) {
        preencherCampoPorXpathFeatureGPE001(inputBonifFamiliarXpath, bonifFamiliar);
    }

    public void preencherEmpresa2PageBonificaçãoFeatureGPE001(String empresa2) {
        preencherCampoPorXpathFeatureGPE001(inputEmpresa2Xpath, empresa2);
    }

    public void preencherQualidade2PageBonificaçãoFeatureGPE001(String qualidade2) {
        preencherCampoPorXpathFeatureGPE001(inputQualidade2Xpath, qualidade2);
    }

    public void preencherPesoEVolume2BonificadoPageBonificaçãoFeatureGPE001(String pesoVolume2) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolume2Xpath, pesoVolume2);
    }

    public void preencherPesoEVolume2JáPagoPageBonificaçãoFeatureGPE001(String pesoVolumePago2) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolumePago2Xpath, pesoVolumePago2);
    }

    public void preencherDataLimite2PageBonificaçãoFeatureGPE001(String dataLimite2) {
        clicarElementoByXpathNVezes(inputDataLimite2Xpath, 2);
    }

    public void preencherBonifComercial2PageBonificaçãoFeatureGPE001(String bonifComercial2) {
        preencherCampoPorXpathFeatureGPE001(inputBonifComercial2Xpath, bonifComercial2);
    }

    public void preencherBonifFamiliar2PageBonificaçãoFeatureGPE001(String bonifFamiliar2) {
        preencherCampoPorXpathFeatureGPE001(inputBonifFamiliar2Xpath, bonifFamiliar2);
    }

    public void preencherServiçoPageServiçosFeatureGPE001(String serviço) {
        preencherCampoPorXpathFeatureGPE001(inputServicoXpath, serviço);
    }

    public void preencherTpServiçoPageServiçosFeatureGPE001(String tpServiço) {
        preencherCampoPorXpathFeatureGPE001(inputTpServicoXpath, tpServiço);
    }

    public void preencherDtInícioPageServiçosFeatureGPE001(String dtInicio) {
        preencherCampoPorXpathFeatureGPE001(inputDtInicioXpath, dtInicio);
    }

    public void preencherDtFimPageServiçosFeatureGPE001(String dtFim) {
        preencherCampoPorXpathFeatureGPE001(inputDtFimXpath, dtFim);
    }

    public void selecionarClassificaçãoFeatureGPE001(String origem) {
        esperarMilissegundos(2000);
        marcarRadioButon(selectOrigemXpath);
    }

    public void preencherPesoeVolumePageVencimentosFeatureGPE001(String pesoVolumeV) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolumeVpath, pesoVolumeV);
    }

    public void preencherCondiçãoDePagamentoPageVencimentosFeatureGPE001(String condPagamentoV) {
        preencherCampoPorXpathFeatureGPE001(inputcondPagamamentoVXpath, condPagamentoV);
    }

    public void preencherFormaDePagamentoPageVencimentosFeatureGPE001(String formaPagamento) {
        preencherCampoPorXpathFeatureGPE001(inputFormaPagamentoXpath, formaPagamento);
    }

    public void preencherPesoeVolume2PageVencimentosFeatureGPE001(String pesoVolume2V) {
        preencherCampoPorXpathFeatureGPE001(inputPesoVolume2VXpath, pesoVolume2V);
    }

    public void preencherCondiçãoDePagamento2PageVencimentosFeatureGPE001(String condPagamento2V) {
        preencherCampoPorXpathFeatureGPE001(inputcondPagamamento2VXpath, condPagamento2V);
    }

    public void preencherFormaDePagamento2PageVencimentosFeatureGPE001(String formaPagamento2) {
        preencherCampoPorXpathFeatureGPE001(inputFormaPagamento2Xpath, formaPagamento2);
    }

    public void preencherDataCondiçãoDePagamentoPageVencimentosFeatureGPE001(String dataCondicao) {
        preencherCampoPorXpathFeatureGPE001(inputDataCondicaoXpath, dataCondicao);
    }

    public void preencherData2CondiçãoDePagamentoPageVencimentosFeatureGPE001(String dataCondicao2) {
        preencherCampoPorXpathFeatureGPE001(inputDataCondicao2Xpath, dataCondicao2);
    }

    public void selecionarConfiguraçõesFeatureGPE001(String configuracoes) {
        marcarRadioButon(selectConfiguracoesXpath);
    }

    public void preencherCliforPageFavorecidosFeatureGPE001(String clifor1) {
        preencherCampoPorXpathFeatureGPE001(inputClifor2Xpath, clifor1);
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


