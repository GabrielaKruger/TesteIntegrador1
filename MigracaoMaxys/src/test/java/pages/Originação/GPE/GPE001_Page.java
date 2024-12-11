package pages.Originação.GPE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import java.time.Duration;

public class GPE001_Page extends BasePage {
    WebDriver driver;

    //Strings Page Dados
    String btnPagDadosXpath = "//*[@id='PAG_DADOS']/a/span";
    String inputCliforXpath = "//*[@id='contratograo-cdClifor']/div/input";
    String inputProdutoXpath = "//*[@id='contratograo-cdItem']/div/input";
    String selectFixoXpath = "//*[@id='contratograo-tpContrato']/div/select";
    String inputTbdescontoXpath = "//*[@id='contratograo-nrTabdescgrao']/div/input";
    String inputNegocioXpath = "//*[@id='contratograo-cdNegocio']/div/input";
    String inputDatavencimentoXpath = "//*[@id='contratograo-dtVencimento']/div/div/input";
    String inputAnosafraXpath = "//*[@id='contratograo-dtAnosafra']/div/input";
    String input3sacasXpath = "//*[@id='contratograo-cdTipocalculo']/div/select";
    String inputPesoevolumeXpath= "//*[@id='contratograo-psContratado']/div/input";
    String inputPrecounitarioXpath= "//*[@id='contratograo-prUnitcomicms']/div/input";
    String btnPagVencimentosICMSXpath= "//*[@id='FATURAMENTO']/a";
    String inputDiaXpath= "//*[@id='vencicmsgrao-nrDiafaturamento-0']/div/input";
    String inputCondicaopagamentoXpath= "//*[@id='vencicmsgrao-cdCondpagto-0']/div/input";
    String elementoProduto = "lovItem";
    String elementoTbdesconto = "lovTabdescgrao";
    String elementoNegocio = "lovNegocio";
    String inputClifor2Xpath = "//*[@id='favorecidoscontrpagto-cdClifor-0']/div/input";
    String inputValorpagamento = "//*[@id='favorecidoscontrpagto-vlPagamento-0']/div/input";
    String inputDatadopagamento= "//*[@id='favorecidoscontrpagto-dtPagamento']/div/div/input";
    String btnSetaXpath= "//*[@id='next-tab']/a";
    String btnFavorecidosImpressaoXpath = "//*[@id='PAG_FAVORECIDOSPAGTO']/a";



    public GPE001_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCliforFeatureGPE001(String clifor) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputCliforXpath, 2);
        preencherElementoByXpath(inputCliforXpath, clifor);
        pressionarENTERByXpath(inputCliforXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void acessarPageFeatureGPE001() {
        esperarMilissegundos(2000);
        clicarElementoByXpathNVezes(btnSetaXpath, 15);
        clicarElementoByXpath(btnFavorecidosImpressaoXpath);
    }

    public void selecionaTipoDeContratoFeatureGPE001(String opcao) {
        esperarMilissegundos(2000); //espera necessária
        esperarEncontrarEPreencherElementos(selectFixoXpath, opcao);
        esperarMilissegundos(1000); //espera necessária
    }

    public void preencherProdutoFeatureGPE001(String produto) {
        esperarMilissegundos(2000); //espera necessária
        selecionarPeloF9(inputProdutoXpath, produto, elementoProduto);
        esperarMilissegundos(1000); //espera necessária
    }

       public void preencherTabelaDeDescontoFeatureGPE001(String tbdesconto) {
           esperarMilissegundos(2000); //espera necessária
           selecionarPeloF9(inputTbdescontoXpath, tbdesconto, elementoTbdesconto);
           esperarMilissegundos(1000); //espera necessária
    }

    public void preencherNegócioFeatureGPE001( String negocio) {
        esperarMilissegundos(2000); //espera necessária
        selecionarPeloF9(inputNegocioXpath, negocio, elementoNegocio);
        esperarMilissegundos(1000); //espera necessária
    }

    public void preencherDataDeVencimentoFeatureGPE001(String dtvencimento) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputDatavencimentoXpath, 2);
        preencherElementoByXpath(inputDatavencimentoXpath, dtvencimento);
        pressionarENTERByXpath(inputDatavencimentoXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherAnoSafraFeatureGPE001( String anosafra) {
        esperarMilissegundos(1000); //espera necessária
        encontrarElementoByXpath(inputAnosafraXpath);
        preencherElementoByXpath(inputAnosafraXpath, anosafra);
        pressionaTabActions();
        esperarMilissegundos(1000); //espera necessária
    }

    public void selecionaTiposDeCálculoFeatureGPE001(String opcao) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(input3sacasXpath, 2);
        preencherElementoByXpath(input3sacasXpath, opcao);
        pressionarENTERByXpath(input3sacasXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherPesoVolumeContratadoFeatureGPE001(String pesoevolume) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputPesoevolumeXpath, 2);
        preencherElementoByXpath(inputPesoevolumeXpath, pesoevolume);
        pressionarENTERByXpath(inputPesoevolumeXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherPreçoUnitárioFeatureGPE001(String precounitario) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputPrecounitarioXpath, 2);
        preencherElementoByXpath(inputPrecounitarioXpath, precounitario);
        pressionarENTERByXpath(inputPrecounitarioXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
        //esperarMilissegundos(1000);
        //encontrarElementoByXpath(inputPrecounitarioXpath);
        //preencherElementoByXpath(inputPrecounitarioXpath,precounitario);
        //pressionaTabActions();
    }

    //public void acessarPageFeatureGPE001() {
     //   clicarElementoByIdNVezes(btnPagVencimentosICMSXpath, 2);
    //}

    public void preencherDiaFeatureGPE001(String dia) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputDiaXpath, 2);
        preencherElementoByXpath(inputDiaXpath, dia);
        pressionarENTERByXpath(inputDiaXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherCondiçãoDePagamentoFeatureGPE001(String condicaopagamento) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputCondicaopagamentoXpath, 2);
        preencherElementoByXpath(inputCondicaopagamentoXpath, condicaopagamento);
        pressionarENTERByXpath(inputCondicaopagamentoXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherCliforPageFavorecidosFeatureGPE001(String clifor2) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputClifor2Xpath, 2);
        preencherElementoByXpath(inputClifor2Xpath, clifor2);
        pressionarENTERByXpath(inputClifor2Xpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherValorPagamentoFeatureGPE001(String valorpagamento) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputValorpagamento, 2);
        preencherElementoByXpath(inputValorpagamento, valorpagamento);
        pressionarENTERByXpath(inputValorpagamento);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherClifor2FeatureGPE001(String clifor2) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputCliforXpath, 2);
        preencherElementoByXpath(inputCliforXpath, clifor2);
        pressionarENTERByXpath(inputCliforXpath);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária
    }

    public void preencherDataPagamentoFeatureGPE001(String dataDoPagamento) {
        esperarMilissegundos(1000); //espera necessária
        clicarElementoByXpathNVezes(inputDatadopagamento, 2);
        preencherElementoByXpath(inputDatadopagamento, dataDoPagamento);
        pressionarENTERByXpath(inputDatadopagamento);
        pressionaTabActions();
        esperarMilissegundos(1000); // espera necessária

    }


//
//     //Filtros
//    String inputEmpresaXpath = "//*[@id='controlerestrito-cdEmpresa']/div/input";
//    String inputAutorizadorXpath = "//*[@id='controlerestrito-cdAutorizador']/div/input";
//    String inputCCustoXpath = "//*[@id='controlerestrito-cdCentrocusto']/div/input";
//    String btnConsultarXpath = "//*[@id='controle-btnConsulta']/button/div";
//
//    // Grid Autorizadores
//    String inputEmpresaGridXpathInicio = "//*[@id='carregaDados-cdEmpresa-";
//    String inputAutorizadorGridXpathInicio = "//*[@id='carregaDados-cdAutorizador-";
//    String inputCCustoGridXpathInicio = "//*[@id='carregaDados-cdCentrocusto-";
//    String selectStatusGridXpathInicio = "//*[@id='carregaDados-stRegistro-";
//
//
//    // Globais
//    String inputXpathFim = "']/div/input";
//    String selectXpathFim = "']/div/select";
//    int primeiraLinhaEmBranco;
//
//
//
//    // Inicialização da primeiraLinhaEmBranco
//    public void setPrimeiraLinhaEmBranco() { primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);}
//
//    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
//    private void verificarOuSetarPrimeiraLinhaEmBranco() {
//        if (primeiraLinhaEmBranco != 0) {setPrimeiraLinhaEmBranco();}
//    }
//
//    // Informa Autorizador para Consulta
//    public void informaAutorizadorFeatureTCO035(String autorizador) {
//        alterarParaIframeComElemento(inputAutorizadorXpath); // Alterna para o iframe correto
//        esperarEncontrarEPreencherElementos(inputAutorizadorXpath, autorizador); // Clica no elemento
//    }
//
//    // Realiza Consulta
//    public void realizarConsultaFeatureTCO035() {
//        clicarElementoByXpath(btnConsultarXpath);
//    }
//
//    // Informar Empresa no Grid Autorizador
//    public void preencherEmpresaFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputEmpresaGridXpath = inputEmpresaGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarEncontrarEPreencherElementos(inputEmpresaGridXpath, empresaAutorizador);
//    }
//
//    // Informar Autorizador no Gride Autorizador
//    public void preencherAutorizadorFeatureTCO035(String autorizador) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputAutorizadorGridXpath = inputAutorizadorGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        esperarEncontrarEPreencherElementos(inputAutorizadorGridXpath, autorizador);
//    }
//
//    // Informar Centro de Custo no Gride Autorizador
//    public void preencherCCustoFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputCentroCustoGridXpath = inputCCustoGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        esperarEncontrarEPreencherElementos(inputCentroCustoGridXpath, centroCustoAutorizador);
//    }
//
//    // Seleciona Status do Autorizador
//    public void selecionaStatusFeatureTCO035(String status) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String selectStatusGridXpath = selectStatusGridXpathInicio + primeiraLinhaEmBranco + selectXpathFim;
//
//        // Cria um objeto Web
//        WebElement dropdown = driver.findElement(By.xpath(selectStatusGridXpath));
//        // Clicar elemento
//        dropdown.click();
//        // Cria uma instância de Select
//        Select select = new Select(dropdown);
//
//        // Espera necessária
//        esperarMilissegundos(4000);
//
//        // Seleciona o Status reportado
//        if ("Ativo".equalsIgnoreCase(status)) {
//            select.selectByVisibleText("Ativo");
//        } else if ("Inativo".equalsIgnoreCase(status)) {
//            select.selectByVisibleText("Inativo");
//        }    }
//
//    public void selecionarAutorizadorFeatureTCO035(String autorizador) {
//        esperarMilissegundos(5000); // espera necessária
//        testConsultaRegistroGrid(autorizador, inputAutorizadorGridXpathInicio, inputXpathFim);
//    }
//
//    public void selecionarEmpresaConsultaFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//        String elementoTabelaEmpresa = "lovEmpresa1";
//
//        esperarClicarESelecionarF9(inputEmpresaXpath, empresaAutorizador, elementoTabelaEmpresa);
//    }
//
//    public void selecionarOAutorizadorConsultaFeatureTCO035(String autorizador) {
//        String elementoTabelaAutorizador = "lovSolres";
//        esperarClicarESelecionarF9(inputAutorizadorXpath, autorizador, elementoTabelaAutorizador);
//    }
//
//    public void selecionarOCCustoConsultaFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//        String elementoTabelaCCusto = "lovCentrocusto1";
//
//        esperarClicarESelecionarF9(inputCCustoXpath,centroCustoAutorizador, elementoTabelaCCusto);
//    }
//
//    public void selecionarAEmpresaGridFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//        String elementoTabelaEmpresa = "lovEmpresa";
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputEmpresaGridXpath = inputEmpresaGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarClicarESelecionarF9(inputEmpresaGridXpath,empresaAutorizador, elementoTabelaEmpresa);
//    }
//
//    public void selecionarOAutorizadorGridFeatureTCO035(String autorizador) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputAutorizadorGridXpath = inputAutorizadorGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        String elementoTabelaAutorizador = "lovSol";
//
//        esperarClicarESelecionarF9(inputAutorizadorGridXpath,autorizador, elementoTabelaAutorizador );
//    }
//
//    public void selecionarOCCustoGridFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//        String elementoTabelaCCusto = "lovCen";
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputCentroCustoGridXpath = inputCCustoGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarClicarESelecionarF9(inputCentroCustoGridXpath,centroCustoAutorizador, elementoTabelaCCusto);
//    }
}