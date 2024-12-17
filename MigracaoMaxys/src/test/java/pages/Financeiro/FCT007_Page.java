//package pages.Financeiro;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class FCT007_Page extends BasePage {
//    WebDriver driver;
//
//    //Strings Page Pedidos/Contratos de Grão
//    String inputCliforXpath = "//*[@id='contratograo-cdClifor']/div/input";
//    String selectExportacaoXpath = "//*[@id='ngx-radio-5']";
//
//    //Strings Page Dados
//    String inputProdutoXpath = "//*[@id='contratograo-cdItem']/div/input";
//    String selectFixoXpath = "//*[@id='contratograo-tpContrato']/div/select";
//    String inputTbdescontoXpath = "//*[@id='contratograo-nrTabdescgrao']/div/input";
//    String inputNegocioXpath = "//*[@id='contratograo-cdNegocio']/div/input";
//    String inputDatavencimentoXpath = "//*[@id='contratograo-dtVencimento']/div/div/input";
//    String inputAnosafraXpath = "//*[@id='contratograo-dtAnosafra']/div/input";
//    String input3sacasXpath = "//*[@id='contratograo-cdTipocalculo']/div/select";
//    String inputPesoevolumeXpath = "//*[@id='contratograo-psContratado']/div/input";
//    String inputPrecounitarioXpath = "//*[@id='contratograo-prUnitcomicms']/div/input";
//    String inputDiaXpath = "//*[@id='vencicmsgrao-nrDiafaturamento-0']/div/input";
//    String inputCondicaopagamentoXpath = "//*[@id='vencicmsgrao-cdCondpagto-0']/div/input";
//    String elementoProduto = "lovItem";
//    String elementoTbdesconto = "lovTabdescgrao";
//    String elementoNegocio = "lovNegocio";
//
//    //Strings Page Favorecidos/Impressão
//    String inputClifor2Xpath = "//*[@id='favorecidoscontrpagto-cdClifor-0']/div/input";
//    String inputValorpagamento = "//*[@id='favorecidoscontrpagto-vlPagamento-0']/div/input";
//    String inputDatadopagamento = "//*[@id='favorecidoscontrpagto-dtPagamento']/div/div/input";
//    String inputTipopagamentoXpath = "//*[@id='favorecidoscontrpagto-tpPagamento']/div/select";
//    String inputEmpresaorigemXpath = "//*[@id='contratograo-cdEmprorigem']/div/input";
//
//
//    public FCT007_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    public void preencherCliforFeatureGPE001(String clifor) {
//        esperarMilissegundos(20000); // espera para ele terminar de carregar todos as pages
//        clicarElementoByXpathNVezes(inputCliforXpath, 2);
//        preencherElementoByXpath(inputCliforXpath, clifor);
//        pressionarENTERByXpath(inputCliforXpath);
//        pressionaTabActions();
//        esperarMilissegundos(1000); // espera necessária
//    }
//
//    public void acessarPageFeatureGPE001(String botao) {
//        esperarMilissegundos(2000); // espera necessária
//        selecionarPaginaNoMenu(botao);
//    }
//
//    public void selecionaTipoDeContratoFeatureGPE001(String opcao) {
//        esperarMilissegundos(2000); //espera necessária
//        esperarEncontrarEPreencherElementos(selectFixoXpath, opcao);
//        esperarMilissegundos(1000); //espera necessária
//    }
//
//    public void preencherProdutoFeatureGPE001(String produto) {
//          selecionarPeloF9FeatureGPE001(inputProdutoXpath, produto, elementoProduto);
//    }
//
//    public void preencherTabelaDeDescontoFeatureGPE001(String tbdesconto) {
//        selecionarPeloF9FeatureGPE001(inputTbdescontoXpath, tbdesconto, elementoTbdesconto);
//    }
//
//    public void preencherNegócioFeatureGPE001(String negocio) {
//        selecionarPeloF9FeatureGPE001(inputNegocioXpath, negocio, elementoNegocio);
//    }
//
//    public void preencherDataDeVencimentoFeatureGPE001(String dtvencimento) {
//        preencherCampoPorXpathFeatureGPE001(inputDatavencimentoXpath, dtvencimento);
//    }
//
//    public void preencherAnoSafraFeatureGPE001(String anosafra) {
//        preencherCampoPorXpathFeatureGPE001(inputAnosafraXpath, anosafra);
//    }
//
//    public void selecionaTiposDeCálculoFeatureGPE001(String opcao) {
//        preencherCampoPorXpathFeatureGPE001(input3sacasXpath, opcao);
//    }
//
//    public void preencherPesoVolumeContratadoFeatureGPE001(String pesoevolume) {
//        preencherCampoPorXpathFeatureGPE001(inputPesoevolumeXpath, pesoevolume);
//    }
//
//    public void preencherPreçoUnitárioFeatureGPE001(String precounitario) {
//        preencherCampoPorXpathFeatureGPE001(inputPrecounitarioXpath, precounitario);
//    }
//
//    public void preencherDiaFeatureGPE001(String dia) {
//        preencherCampoPorXpathFeatureGPE001(inputDiaXpath, dia);
//    }
//
//    public void preencherCondiçãoDePagamentoFeatureGPE001(String condicaopagamento) {
//        preencherCampoPorXpathFeatureGPE001(inputCondicaopagamentoXpath,  condicaopagamento);
//    }
//
//    public void preencherValorPagamentoFeatureGPE001(String valorpagamento) {
//        preencherCampoPorXpathFeatureGPE001(inputValorpagamento,  valorpagamento);
//    }
//
//    public void preencherClifor2FeatureGPE001(String clifor2) {
//        preencherCampoPorXpathFeatureGPE001(inputClifor2Xpath, clifor2);
//    }
//
//    public void preencherDataPagamentoFeatureGPE001(String dataDoPagamento) {
//        preencherCampoPorXpathFeatureGPE001(inputDatadopagamento, dataDoPagamento);
//    }
//
//    public void selecionaTipoPagamentoFeatureGPE001(String tipoPagamento) {
//        preencherCampoPorXpathFeatureGPE001(inputTipopagamentoXpath, tipoPagamento);
//    }
//
//    public void preencherProdutoNãoCadastradoFeatureGPE001(String produtoNaocadastrado) {
//        esperarMilissegundos(2000); //espera necessária
//        limparCampoDeTextoPorXpath(inputProdutoXpath);
//        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
//        preencherElementoByXpath(inputProdutoXpath, produtoNaocadastrado);
//        pressionarENTERByXpath(inputProdutoXpath);
//        pressionaTabActions();
//        esperarMilissegundos(2000); // espera necessária
//    }
//
//    public void selecionarOperaçãoFeatureGPE001(String exportacao) {
//        esperarMilissegundos(5000); //espera necessária
//        marcarRadioButon(selectExportacaoXpath);
//        esperarMilissegundos(3000); //espera necessária
//    }
//
//    public void preencherProdutoSemLovFeatureGPE001(String produto2) {
//        esperarMilissegundos(3000); //espera necessária
//        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
//        esperarMilissegundos(2000); //espera necessária
//        preencherElementoByXpath(inputProdutoXpath, produto2);
//        esperarMilissegundos(2000); //espera necessária
//        pressionarENTERByXpath(inputProdutoXpath);
//        pressionaTabActions();
//        esperarMilissegundos(2000); // espera necessária
//    }
//
//    public void preencherEmprOrigemPageContratosDeGraoFeatureGPE001(String empresaOrigem) {
//        esperarMilissegundos(20000);// espera para ele terminar de carregar todos as pages
//        limparCampoDeTextoPorXpath(inputEmpresaorigemXpath);
//        clicarElementoByXpathNVezes(inputEmpresaorigemXpath, 2);
//        preencherElementoByXpath(inputEmpresaorigemXpath, empresaOrigem);
//        pressionarENTERByXpath(inputEmpresaorigemXpath);
//        pressionaTabActions();
//        esperarMilissegundos(1000); // espera necessária
//    }
//
//    public void selecionarPeloF9FeatureGPE001(String elementoCampo, String valor, String elementoTabela){ //metodo auxiliar
//        esperarMilissegundos(2000); //espera necessária
//        selecionarPeloF9(elementoCampo, valor, elementoTabela);
//        esperarMilissegundos(1000); //espera necessária
//    }
//
//    public void preencherCampoPorXpathFeatureGPE001(String campoXpath, String valor) {
//        esperarMilissegundos(1000); // Espera necessária
//        clicarElementoByXpathNVezes(campoXpath, 2);
//        preencherElementoByXpath(campoXpath, valor);
//        pressionarENTERByXpath(campoXpath);
//        pressionaTabActions();
//        esperarMilissegundos(1000); // Espera necessária
//    }
//
// }
//
//
