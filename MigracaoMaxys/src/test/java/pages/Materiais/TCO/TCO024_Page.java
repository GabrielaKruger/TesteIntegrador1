//package pages.Materiais.TCO;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import pages.BasePage;
//
//public class TCO024_Page extends BasePage {
//    WebDriver driver;
//
//    String inputDepartamentoXpath = "//*[@id='controle-cdDepartamento']/div/input";
//    String btnConsultaXpath = "//*[@id='controle-btnConsulta']/button/div";
//    String inputSolicitanteXpath = "";
//
//    // Globais
//    String inputXpathFim = "']/div/input";
//    String selectXpathFim = "']/div/select";
//    String descricaoFaker;
//    int primeiraLinhaEmBranco;
//
//    public TCO024_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    // Inicialização da primeiraLinhaEmBranco
//    public void setPrimeiraLinhaEmBranco() { primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);}
//
//    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
//    private void verificarOuSetarPrimeiraLinhaEmBranco() {
//        if (primeiraLinhaEmBranco != 0) {setPrimeiraLinhaEmBranco();}
//    }
//
//    public void informarDepartamentoFeatureTCO024(String departamento) {
//        //int codigoSimulatedInt = faker.random().nextInt(1, 7);
//        //String codigoSimulateDepartamento = Integer.toString(codigoSimulatedInt);
//
//        clicarElementoByXpathNVezes(inputDepartamentoXpath, 2);
//        preencherElementoByXpath(inputDepartamentoXpath, departamento);
//    }
//
//    public void realizarAConsultaFeatureTCO024() {
//        clicarElementoByXpathNVezes(btnConsultaXpath, 1);
//    }
//
//    public void informarSolicitanteFeatureTCO024(String solicitante) {
//        esperarMilissegundos(2000); // espera necessária
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridSolicitante = "//*[@id='solicdepartcompra-cdSolicitante-" + primeiraLinhaEmBranco + "']/div/input";
//                                                                                                                                                    //*[@id="solicdepartcompra-cdSolicitante-1"]/div/input
//        clicarElementoByXpathNVezes(linhaGridSolicitante,2);
//        preencherElementoByXpath(linhaGridSolicitante, solicitante);
//        pressionaTabActions();
//    }
//
//    public void selecionarOGridSolicitanteFeatureTCO024() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridSolicitante = "//*[@id='solicdepartcompra-cdSolicitante-" + primeiraLinhaEmBranco + "']/div/input";
//        clicarElementoByXpathNVezes(linhaGridSolicitante, 1);
//    }
//
//    public void selecionarOGridAutorizadorFeatureTCO024() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridAutorizador = "//*[@id='autorizdepartcompra-nmAutorizador-" + primeiraLinhaEmBranco + "']/div/input";
//
//        clicarElementoByXpathNVezes(linhaGridAutorizador, 1);
//    }
//
//    public void informarAutorizadorFeatureTCO024(String autorizador) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String linhaGridAutorizador = "//*[@id='autorizdepartcompra-nmAutorizador-" + primeiraLinhaEmBranco + "']/div/input";
//
//        clicarElementoByXpathNVezes(linhaGridAutorizador, 1);
//        preencherElementoByXpath(linhaGridAutorizador, autorizador);
//    }
//
//    public void informarAlcadaFeatureTCO024() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputAutorizadorXpath = "//*[@id='autorizdepartcompra-cdAlcada-" + primeiraLinhaEmBranco+ "']/div/input";
//
//        int codigoSimulatedInt = faker.random().nextInt(1, 16);
//        String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);
//
//        clicarElementoByXpathNVezes(inputAutorizadorXpath, 2);
//        preencherElementoByXpath(inputAutorizadorXpath, codigoSimulateAlcada);
//
//    }
//
//    public void informarTipoCargoFeatureTCO024() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputTipoCargoXpath = "//*[@id='autorizdepartcompra-cdCargo-" + primeiraLinhaEmBranco + "']/div/input";
//
//        int codigoSimulatedInt = faker.random().nextInt(1, 3);
//        String codigoSimulateTipoCargo = Integer.toString(codigoSimulatedInt);
//
//        clicarElementoByXpathNVezes(inputDepartamentoXpath, 2);
//        preencherElementoByXpath(inputDepartamentoXpath, codigoSimulateTipoCargo);
//    }
//
//    public void aprovadorDeNecessidadeFeatureTCO024(String acao) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String chkAprovadorXpath = "//*[@id='autorizdepartcompra-stAprovnecessidade-" + primeiraLinhaEmBranco + "']/div/button";
//
//        testMarcaDesmarcaCheckBox(acao, chkAprovadorXpath);
//    }
//
//    public void compradorFeatureTCO024(String acao) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String chkCompradorXpath = "//*[@id='autorizdepartcompra-stComprador-" + primeiraLinhaEmBranco + "']/div/button";
//
//        testMarcaDesmarcaCheckBox(acao, chkCompradorXpath);
//    }
//
//    public void localizaAutorizadorCadastradoFeatureTCO024(String autorizador) {
//        String varCodigoAutorizador = autorizador;
//        String xPathColunaTabelaInicio = "//*[@id='autorizdepartcompra-cdAutorizador-";
//        String xPathColunaTabelaFim = "']/div/input";
//        boolean encontrouRegistro = testConsultaRegistroGrid(varCodigoAutorizador, xPathColunaTabelaInicio, xPathColunaTabelaFim);
//    }
//}