//package pages.Originacao.TGR;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//import utils.DataUtils;
//
//public class TGR025_Page extends BasePage {
//    WebDriver driver;
//
//    public TGR025_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    //Strings Solicitante/Autorizador
//    String inputEmpresaXpath = "//*[@id='solicitantecontrfrete-cdEmpresa-";
//    String inputUserXpath = "//*[@id='solicitantecontrfrete-cdUsuario-";
//    String inputTipoXpath = "//*[@id='solicitantecontrfrete-stSolicitante-";
//    String inputCodDaAlcadaXpath = "//*[@id='solicitantecontrfrete-cdAlcada-";
//    String inputDataVencXpath = "//*[@id='solicitantecontrfrete-dtVencimento-";
//
//
//    //Globais
//    int primeiraLinhaEmBranco;
//    String inputXpathFim = "']/div/input";
//    String inputXpatFimDatas = "']/div/div/input";
//
//
//    public void preencherEmpresaFeatureTGR025(String empresa) {
//        //esperarMilissegundos(10000); //espera necessária
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
//        esperarMilissegundos(500); // espera necessária
//        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
//        pressionaTabActions();
//    }
//
//
//    public void preencherUsuárioFeatureTGR025(String user) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridUserXpath = inputUserXpath+ primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridUserXpath,2);
//        esperarMilissegundos(500); // espera necessária
//        preencherElementoByXpath(linhaGridUserXpath, user);
//    }
//
//    public void preencherTipoSolicFeatueTGR025(String tipoSolicitante) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        // Ajustar para pegar do intervalo
//        //int codigoSimulatedInt = faker.random().nextInt(1, 16);
//        //String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);
//
//        String linhaGridTipoSolicXpath = inputTipoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridTipoSolicXpath,2);
//        esperarMilissegundos(500); // espera necessária
//        preencherElementoByXpath(linhaGridTipoSolicXpath, tipoSolicitante);
//    }
//
//    public void preencherCódDaAlçadaFeatureTGR025() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        int codigoSimulatedInt = faker.random().nextInt(1, 10);
//        String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);
//
//        String linhaGridCodAlcadaXpath = inputCodDaAlcadaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridCodAlcadaXpath,2);
//        esperarMilissegundos(500); // espera necessária
//        preencherElementoByXpath(linhaGridCodAlcadaXpath, codigoSimulateAlcada);
//    }
//
//    public void prencherDataDeVencimentoFeatureTGR025() {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//
//        String linhaGridDataVencXpath = inputDataVencXpath + primeiraLinhaEmBranco + inputXpatFimDatas;
//
//        clicarElementoByXpathNVezes(linhaGridDataVencXpath,2);
//        esperarMilissegundos(500); // espera necessária
//        preencherElementoByXpath(linhaGridDataVencXpath, DataUtils.DataAtual());
//    }
//
//}
