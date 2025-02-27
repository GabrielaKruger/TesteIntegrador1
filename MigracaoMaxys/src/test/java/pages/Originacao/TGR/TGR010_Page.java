//package pages.Originacao.TGR;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class TGR010_Page extends BasePage {
//    WebDriver driver;
//
//    public TGR010_Page(WebDriver driver) {
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
//    String btnAtivo = "//*[@id='autorizgrao-stAtivo-";
//
//    //Globais
//    int primeiraLinhaEmBranco;
//    String inputXpathFim = "']/div/input";
//    String btnXpathFim = "']/div/button";
//
//
//    public void preencherEmpresaFeatureTGR010(String empresa) {
//        esperarMilissegundos(500); // espera necessária
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputEmpresaXpath, inputXpathFim));
//
//        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
//        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
//        pressionaTabActions();
//    }
//
//    public void preencherTipoDeContratoFeatureTGR010(String tipoContrato) {
//        String linhaGridTipoContratoXpath = inputTipoContratoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridTipoContratoXpath,2);
//        preencherElementoByXpath(linhaGridTipoContratoXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//    public void preencherMóduloFeatueTGR010(String modulo) {
//        String linhaGridModuloXpath = inputModuloXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridModuloXpath,2);
//        preencherElementoByXpath(linhaGridModuloXpath, modulo);
//        pressionaTabActions();
//    }
//
//    public void preencherProgramaFeatureTGR010(String tipoContrato) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputProgramaXpath, inputXpathFim));
//
//        String linhaGridProgramaXpath = inputProgramaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridProgramaXpath,2);
//        preencherElementoByXpath(linhaGridProgramaXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//    public void preencherMotivoFeatureTGR010(String tipoContrato) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputMotivoXpath, inputXpathFim));
//
//        String linhaGridMotivoXpath = inputMotivoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridMotivoXpath,2);
//        preencherElementoByXpath(linhaGridMotivoXpath, tipoContrato);
//        pressionaTabActions();
//    }
//
//    public void deselecionarAtivoFeatureTGR010(String acao) {
//        String linhaGriAtivoXpath = btnAtivo + primeiraLinhaEmBranco + btnXpathFim;
//        testMarcaDesmarcaCheckBox(acao, linhaGriAtivoXpath);
//    }
//
//    public void selecionarAAutorizaçãoFeatureTGR010(String empresa) {
//        testConsultaRegistroGrid (empresa, inputEmpresaXpath, inputXpathFim);
//    }
//
//    public void removerProgramaFeatureTGR010() {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputProgramaXpath, inputXpathFim));
//
//        String linhaGridProgramaXpath = inputProgramaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridProgramaXpath,2);
//        limparCampoDeTextoPorXpath(linhaGridProgramaXpath);
//    }
//
//    public void removerTipoDeContratoFeatureTGR010() {
//        String linhaGridTipoContratoXpath = inputTipoContratoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridTipoContratoXpath,2);
//        limparCampoDeTextoPorXpath(linhaGridTipoContratoXpath);
//    }
//
//    public void removerEmpresaFeatureTGR010() {
//        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
//        limparCampoDeTextoPorXpath(linhaGridEmpresaXpath);
//
//    }
//}
//
