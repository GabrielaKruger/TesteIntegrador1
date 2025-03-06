//package pages.Faturamento.COM;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class COM004_Page extends BasePage {
//    WebDriver driver;
//
//    public COM004_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    //Strings Aba - Pedidos Compra
//    String inputCliforXpath = "//*[@id='pedido-cdClifor";
//    String inputTpCompra = "//*[@id='pedido-cdTipocompra";
//
//    //Globais
//    int primeiraLinhaEmBranco;
//    String inputXpathFim = "']/div/input";
//    String btnXpathFim = "']/div/button";
//
//
//    public void preencherCliforFeatureCOM004() {
//        esperarMilissegundos(500); // espera necessária
////        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputEmpresaXpath, inputXpathFim));
////
////        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;
//
//        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
//        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
//        pressionaTabActions();
//    }
//
//}
//
