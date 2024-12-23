//package pages.Transporte.TTB;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class TTB163_Page extends BasePage {
//    WebDriver driver;
//
//    //Strings Page Pedidos/Contratos de Grão
//    //String selectEmpresaXpath = "//*[@id='processocaixa-cbProcesso-0']/div/button";
//    //String selectEmpresaXpath = "//*[@id='processocaixa-cbProcesso-0']/div/button";
//
//    int primeiraLinhaEmBranco;
//    String inputObservacaoXpath = "//*[@id='processocaixa-dsObservacao']/div/textarea";
//    String inputCreditoemcontaXpath = "//*[@id='processocaixa-btnCreditoemconta']/button/div";
//    String inputFecharXpath = "//*[@id='recebchequepag-btnFechar']/button/div";
//
//    public TTB163_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    public void selecionarEmpresafeatureFCT007(String acao) {
//        esperarMilissegundos(5000);//espera necessária
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String chkEmpresaXpath = "//*[@id='processocaixa-cbProcesso-" + primeiraLinhaEmBranco + "']/div/button";
//
//        testMarcaDesmarcaCheckBox(acao, chkEmpresaXpath);
//    }
//
//    public void preencherObservaçãoFeatureFCT007(String observacao) {
//        esperarMilissegundos(2000);//espera necessária
//        clicarElementoByXpathNVezes(inputObservacaoXpath, 2);
//        preencherElementoByXpath(inputObservacaoXpath, observacao);
//        esperarMilissegundos(2000);//espera necessária
//    }
//
//    public void clicarCréditoEmContaFeatureFCT007(String creditoemconta) {
//        esperarMilissegundos(2000);//espera necessária
//        clicarElementoByXpathNVezes(inputCreditoemcontaXpath, 1);
//        esperarMilissegundos(2000);//espera necessária
//    }
//
//    public void clicarFecharFeatureFCT007(String fechar) {
//        esperarMilissegundos(2000);//espera necessária
//        clicarElementoByXpathNVezes(inputCreditoemcontaXpath, 1);
//        esperarMilissegundos(2000);//espera necessária
//    }
//}
////
////    public void preencherCliforFeatureGPE001(String clifor) {
////        esperarMilissegundos(20000); // espera para ele terminar de carregar todos as pages
////        clicarElementoByXpathNVezes(inputCliforXpath, 2);
////        preencherElementoByXpath(inputCliforXpath, clifor);
////        pressionarENTERByXpath(inputCliforXpath);
////        pressionaTabActions();
////        esperarMilissegundos(1000); // espera necessária
////    }
////
////    public void acessarPageFeatureGPE001(String botao) {
////        esperarMilissegundos(2000); // espera necessária
////        selecionarPaginaNoMenu(botao);
////    }
////
////    public void selecionaTipoDeContratoFeatureGPE001(String opcao) {
////        esperarMilissegundos(2000); //espera necessária
////        esperarEncontrarEPreencherElementos(selectFixoXpath, opcao);
////        esperarMilissegundos(1000); //espera necessária
////    }
////
////    public void preencherProdutoFeatureGPE001(String produto) {
////          selecionarPeloF9FeatureGPE001(inputProdutoXpath, produto, elementoProduto);
////    }
////
////    public void preencherTabelaDeDescontoFeatureGPE001(String tbdesconto) {
////        selecionarPeloF9FeatureGPE001(inputTbdescontoXpath, tbdesconto, elementoTbdesconto);
////    }
////
////    public void preencherNegócioFeatureGPE001(String negocio) {
////        selecionarPeloF9FeatureGPE001(inputNegocioXpath, negocio, elementoNegocio);
////    }
////
////    public void preencherDataDeVencimentoFeatureGPE001(String dtvencimento) {
////        preencherCampoPorXpathFeatureGPE001(inputDatavencimentoXpath, dtvencimento);
////    }
////
////    public void preencherAnoSafraFeatureGPE001(String anosafra) {
////        preencherCampoPorXpathFeatureGPE001(inputAnosafraXpath, anosafra);
////    }
////
////    public void selecionaTiposDeCálculoFeatureGPE001(String opcao) {
////        preencherCampoPorXpathFeatureGPE001(input3sacasXpath, opcao);
////    }
////
////    public void preencherPesoVolumeContratadoFeatureGPE001(String pesoevolume) {
////        preencherCampoPorXpathFeatureGPE001(inputPesoevolumeXpath, pesoevolume);
////    }
////
////    public void preencherPreçoUnitárioFeatureGPE001(String precounitario) {
////        preencherCampoPorXpathFeatureGPE001(inputPrecounitarioXpath, precounitario);
////    }
////
////    public void preencherDiaFeatureGPE001(String dia) {
////        preencherCampoPorXpathFeatureGPE001(inputDiaXpath, dia);
////    }
////
////    public void preencherCondiçãoDePagamentoFeatureGPE001(String condicaopagamento) {
////        preencherCampoPorXpathFeatureGPE001(inputCondicaopagamentoXpath,  condicaopagamento);
////    }
////
////    public void preencherValorPagamentoFeatureGPE001(String valorpagamento) {
////        preencherCampoPorXpathFeatureGPE001(inputValorpagamento,  valorpagamento);
////    }
////
////    public void preencherClifor2FeatureGPE001(String clifor2) {
////        preencherCampoPorXpathFeatureGPE001(inputClifor2Xpath, clifor2);
////    }
////
////    public void preencherDataPagamentoFeatureGPE001(String dataDoPagamento) {
////        preencherCampoPorXpathFeatureGPE001(inputDatadopagamento, dataDoPagamento);
////    }
////
////    public void selecionaTipoPagamentoFeatureGPE001(String tipoPagamento) {
////        preencherCampoPorXpathFeatureGPE001(inputTipopagamentoXpath, tipoPagamento);
////    }
////
////    public void preencherProdutoNãoCadastradoFeatureGPE001(String produtoNaocadastrado) {
////        esperarMilissegundos(2000); //espera necessária
////        limparCampoDeTextoPorXpath(inputProdutoXpath);
////        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
////        preencherElementoByXpath(inputProdutoXpath, produtoNaocadastrado);
////        pressionarENTERByXpath(inputProdutoXpath);
////        pressionaTabActions();
////        esperarMilissegundos(2000); // espera necessária
////    }
////
////    public void selecionarOperaçãoFeatureGPE001(String exportacao) {
////        esperarMilissegundos(5000); //espera necessária
////        marcarRadioButon(selectExportacaoXpath);
////        esperarMilissegundos(3000); //espera necessária
////    }
////
////    public void preencherProdutoSemLovFeatureGPE001(String produto2) {
////        esperarMilissegundos(3000); //espera necessária
////        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
////        esperarMilissegundos(2000); //espera necessária
////        preencherElementoByXpath(inputProdutoXpath, produto2);
////        esperarMilissegundos(2000); //espera necessária
////        pressionarENTERByXpath(inputProdutoXpath);
////        pressionaTabActions();
////        esperarMilissegundos(2000); // espera necessária
////    }
////
////    public void preencherEmprOrigemPageContratosDeGraoFeatureGPE001(String empresaOrigem) {
////        esperarMilissegundos(20000);// espera para ele terminar de carregar todos as pages
////        limparCampoDeTextoPorXpath(inputEmpresaorigemXpath);
////        clicarElementoByXpathNVezes(inputEmpresaorigemXpath, 2);
////        preencherElementoByXpath(inputEmpresaorigemXpath, empresaOrigem);
////        pressionarENTERByXpath(inputEmpresaorigemXpath);
////        pressionaTabActions();
////        esperarMilissegundos(1000); // espera necessária
////    }
////
////    public void selecionarPeloF9FeatureGPE001(String elementoCampo, String valor, String elementoTabela){ //metodo auxiliar
////        esperarMilissegundos(2000); //espera necessária
////        selecionarPeloF9(elementoCampo, valor, elementoTabela);
////        esperarMilissegundos(1000); //espera necessária
////    }
////
////    public void preencherCampoPorXpathFeatureGPE001(String campoXpath, String valor) {
////        esperarMilissegundos(1000); // Espera necessária
////        clicarElementoByXpathNVezes(campoXpath, 2);
////        preencherElementoByXpath(campoXpath, valor);
////        pressionarENTERByXpath(campoXpath);
////        pressionaTabActions();
////        esperarMilissegundos(1000); // Espera necessária
////    }
////
//// }
////
////
