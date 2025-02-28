//package steps.Faturamento.VFS;
//
//import driver.driverManager.DriverManager;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.E;
//import io.cucumber.java.pt.Quando;
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//import pages.Faturamento.VFS.VFS002_Page;
//import pages.LoginPage;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class VFS002_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Faturamento.VFS.VFS002_Page VFS002_Page;
//    private BasePage basePage;
//    private LoginPage loginPage;
//    private String tagMassa;
//    private String browser;
//    Scenario scenario;
//
//    @Before
//    public void before(Scenario scenario) {
//        this.scenario = scenario;
//    }
//
//    @Dado("inicialize a execução dos cenários do VFS002")
//    public void inicializeAExecuçãoDosCenáriosDoVFS002() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        VFS002_Page = new VFS002_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature VFS002")
//    public void acessarOProgramaFeatureVFS002(String programa) {
//        basePage.esperarMilissegundos(5000);// espera necessária
//        loginPage.loginNewMaxysNovo(programa);
//    }
//
//    @Quando("selecionado tipo de venda feature VFS002")
//    public void selecionadoTipoDeVendaFeatureVFS002() {
//        System.out.println("massaTeste está nulo? " + (massaTeste == null));
//        System.out.println("tagMassa está nulo? " + (tagMassa == null));
//
//        String tipoVenda = massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoVenda");
//        System.out.println("Valor recuperado de tipoVenda: " + tipoVenda);
//
//	       VFS002_Page.selecionadoTipoDeVendaFeatureVFS002(tipoVenda);
//    }
//
//    @E("apresenta o modal H4 {string} feature VFS002")
//    public void apresentaOModalH4FeatureVFS002(String title) {
//        basePage.esperarMilissegundos(3000);
//        basePage.validaModalByH5(title);
//    }
//
//
//    @E("clicar botão {string} do modal feature VFS002")
//    public void clicarBotaoDoModalFeatureVFS002(String acao) {
//        basePage.esperarMilissegundos(2000);
//        basePage.clicarBotaoDoModal(acao);
//        basePage.esperarMilissegundos(1000);
//    }
//
//    @E("seleciona a serie da nota fiscal feature VFS002")
//    public void selecionaASerieDaNotaFiscalFeatureVFS002() {
//        VFS002_Page.selecionaASerieDaNotaFiscalFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNotaFiscal"));
//    }
//
//    @E("informa data emissao da nota feature VFS002")
//    public void informaDataEmissaoDaNotaFeatureVFS002() {
//        VFS002_Page.informaDataEmissaoDaNotaFeatureVFS002();
//
//    }
//
//    @E("preenche o clifor da nota feature VFS002")
//    public void preencheOCliforDaNotaFeatureVFS002() {
//        VFS002_Page.preencheOCliforDaNotaFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNotaFiscal"));
//    }
//}
