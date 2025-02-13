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
//    String inputEmpresaXpath = "//*[@id='autorizgrao-cdEmpresa-";
//    String inputTipoContratoXpath = "//*[@id='autorizgrao-tpContrato-";
//    String inputModuloXpath = "//*[@id='autorizgrao-cdModulo-";
//    String inputProgramaXpath = "//*[@id='autorizgrao-cdPrograma-";
//    String inputMotivoXpath = "//*[@id='autorizgrao-cdMotivo-";
//
//    //Globais
//    int primeiraLinhaEmBranco;
//    String inputXpathFim = "']/div/input";
//    String inputXpatFimDatas = "']/div/div/input";
//    String xPathColunaTabelaInicio = "";
//    String xPathColunaTabelaFim = "";
//
//
//    public void preencherEmpresaFeatureTGR025(String empresa) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputEmpresaXpath, inputXpathFim));
//
//        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
//        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
//        pressionaTabActions();
//    }
//
//    public void preencherTipoDeContratoFeatureTGR025(String tipoContrato) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputTipoContratoXpath, inputXpathFim));
//
//        String linhaGridTipoContratoXpath = inputTipoContratoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridTipoContratoXpath,2);
//        preencherElementoByXpath(linhaGridTipoContratoXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//    public void preencherMóduloFeatueTGR025(String modulo) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputModuloXpath, inputXpathFim));
//
//        String linhaGridModuloXpath = inputModuloXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridModuloXpath,2);
//        preencherElementoByXpath(linhaGridModuloXpath, modulo);
//        pressionaTabActions();
//    }
//
//    public void preencherProgramaFeatureTGR025(String tipoContrato) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputProgramaXpath, inputXpathFim));
//
//        String linhaGridProgramaXpath = inputProgramaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridProgramaXpath,2);
//        preencherElementoByXpath(linhaGridProgramaXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//    public void preencherMotivoFeatureTGR025(String tipoContrato) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputMotivoXpath, inputXpathFim));
//
//        String linhaGridMotivoXpath = inputMotivoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridMotivoXpath,2);
//        preencherElementoByXpath(linhaGridMotivoXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//}
