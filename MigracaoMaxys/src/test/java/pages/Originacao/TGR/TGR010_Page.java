//package pages.Originacao.TGR;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//import com.github.javafaker.Faker;
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
//    String inputCodigoXpath = "//*[@id='itembalanca-cdItembal-";
//
//
//    String btnAtivo = "//*[@id='autorizgrao-stAtivo-";
//
//    //Globais
//    int primeiraLinhaEmBranco;
//    String descricaoFaker;
//    String inputXpathFim = "']/div/input";
//    String btnXpathFim = "']/div/button";
//
//
//    public void preencherCódigoFeatureTGR010(String codigo) {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputCodigoXpath, inputXpathFim));
//
//        String linhaGridCodigoXpath = inputCodigoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridCodigoXpath,2);
//        preencherElementoByXpath(linhaGridCodigoXpath, codigo);
//        pressionaTabActions();
//    }
//
//    public void preencherDescriçãoFeatureTGR010() {
//        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputCodigoXpath, inputXpathFim));
//
//        String linhaGridCodigoXpath = inputCodigoXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//    }
//
//}