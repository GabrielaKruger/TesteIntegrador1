//package steps.Originacao.TGR;
//
//import driver.driverManager.DriverManager;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.pt.*;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//import pages.LoginPage;
//import pages.Originacao.TGR.TGR010_Page;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class TGR010_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Originacao.TGR.TGR010_Page TGR010_Page;
//    private BasePage basePage;
//    private LoginPage loginPage;
//    private String tagMassa;
//    private String browser;
//    Scenario scenario;
//
//
//    @Before
//    public void before(Scenario scenario) {
//        this.scenario = scenario;
//    }
//
//    @Dado("inicialize a execução dos cenários do TGR010")
//    public void inicializeAExecuçãoDosCenáriosDoTGR010() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        TGR010_Page = new TGR010_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature TGR010")
//    public void acessarOProgramaFeatureTGR010(String programa) {
//        loginPage.loginNewMaxysNovo(programa);
//        basePage.esperarMilissegundos(1000); // espera necessária
//    }
//
//    @Então("clicar botão ToolBar {string} feature TGR010")
//    public void clicarBotãoToolBarFeatureTGR010(String botao) {
//        basePage.clicarBotaoToolBar(botao);
//    }
//
//    @E("apresentar a mensagem {string} no pop-up feature TGR010")
//    public void apresentarAMensagemNoPopUpFeatureTGR010(String mensagem) {
//        basePage.esperarMilissegundos(500); // espera necessária
//        basePage.validarMensagemByToastContainerDivDiv(mensagem);
//    }
//
//    @Quando("apresentar o modal H5 {string} feature TGR010")
//    public void apresentarOModalH5FeatureTGR010(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @E("apresentar a mensagem {string} feature TGR010")
//    public void apresentarAMensagemFeatureTGR010(String mensagem) {
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @Então("clicar botão {string} do modal feature TGR010")
//    public void clicarBotãoDoModalFeatureTGR010(String acao) {
//        basePage.clicarBotaoDoModal(acao);
//    }
//
//    @Quando("apresenta o modal H4 {string} feature TGR010")
//    public void apresentaOModalHFeatureTGR010(String title) {
//        basePage.validaModalByH4(title);
//    }
//
//    @E("apresenta o modal {string} feature TGR010")
//    public void apresentaOModalFeatureTGR010(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @Então("pressionar tecla {string} feature TGR010")
//    public void pressionarTeclaFeatureFCT(String tecla) {
//        basePage.esperarMilissegundos(1000); // espera necessária
//        basePage.pressionarTecla(tecla);
//    }
//
//    @Então("pressionar teclas shift + f6 para excluir TGR010")
//    public void pressionarTeclasShiftF6ParaExcluirTGR010() {
//        basePage.pressionarShiftF6();
//    }
//
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            if (scenario != null && scenario.isFailed()) {
//                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", "Screenshot");
//            }
//        }
//        BasePage.tearDownCloseQuit(driver);
//    }
//
//}
//
//
//
