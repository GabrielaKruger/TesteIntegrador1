//package steps.Faturamento.COM;
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
//import pages.Faturamento.COM.COM004_Page;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class COM004_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Faturamento.COM.COM004_Page COM004_Page;
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
//    @Dado("inicialize a execução dos cenários do COM004")
//    public void inicializeAExecuçãoDosCenáriosDoCOM004() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        COM004_Page = new COM004_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature COM004")
//    public void acessarOProgramaFeatureCOM004(String programa) {
//        loginPage.loginNewMaxysNovo(programa);
//        basePage.esperarMilissegundos(1000); // espera necessária
//    }
//
//    @Então("clicar botão ToolBar {string} feature COM004")
//    public void clicarBotãoToolBarFeatureCOM004(String botao) {
//        basePage.clicarBotaoToolBar(botao);
//    }
//
//    @E("apresentar a mensagem {string} no pop-up feature COM004")
//    public void apresentarAMensagemNoPopUpFeatureCOM004(String mensagem) {
//        basePage.esperarMilissegundos(500); // espera necessária
//        basePage.validarMensagemByToastContainerDivDiv(mensagem);
//    }
//
//    @Quando("apresentar o modal H5 {string} feature COM004")
//    public void apresentarOModalH5FeatureCOM004(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @E("apresentar a mensagem {string} feature COM004")
//    public void apresentarAMensagemFeatureCOM004(String mensagem) {
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @Então("clicar botão {string} do modal feature COM004")
//    public void clicarBotãoDoModalFeatureCOM004(String acao) {
//        basePage.clicarBotaoDoModal(acao);
//    }
//
//    @Quando("apresenta o modal H4 {string} feature COM004")
//    public void apresentaOModalHFeatureCOM004(String title) {
//        basePage.validaModalByH4(title);
//    }
//
//    @E("apresenta o modal {string} feature COM004")
//    public void apresentaOModalFeatureCOM004(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @Então("pressionar tecla {string} feature COM004")
//    public void pressionarTeclaFeatureFCT(String tecla) {
//        basePage.esperarMilissegundos(1000); // espera necessária
//        basePage.pressionarTecla(tecla);
//    }
//
//    @Então("pressionar teclas shift + f6 para excluir COM004")
//    public void pressionarTeclasShiftF6ParaExcluirCOM004() {
//        basePage.pressionarShiftF6();
//    }
//
//    @E("preencher Empresa feature COM004")
//    public void preencherEmpresaFeatureCOM004() {
//        COM004_Page.preencherEmpresaFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
//    }
//
//    @E("preencher Tipo de Contrato feature COM004")
//    public void preencherTipoDeContratoFeatureCOM004() {
//        COM004_Page.preencherTipoDeContratoFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato"));
//    }
//
//    @E("preencher Módulo feature COM004")
//    public void preencherMóduloFeatueCOM004() {
//        COM004_Page.preencherMóduloFeatueCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "modulo"));
//    }
//
//    @Então("{string} Ativo feature COM004")
//    public void deselecionarAtivoFeatureCOM004(String acao) {
//        COM004_Page.deselecionarAtivoFeatureCOM004(acao);
//    }
//
//    @E("preencher Programa feature COM004")
//    public void preencherProgramaFeatureCOM004() {
//        COM004_Page.preencherProgramaFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
//    }
//
//    @E("preencher Motivo feature COM004")
//    public void preencherMotivoFeatureCOM004() {
//        COM004_Page.preencherMotivoFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "motivo"));
//    }
//
//    @Quando("selecionar a Autorização feature COM004")
//    public void selecionarAAutorizaçãoFeatureCOM004() {
//        COM004_Page.selecionarAAutorizaçãoFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
//    }
//
//    @Entao("remover Programa feature COM004")
//    public void removerProgramaFeatureCOM004() {
//        COM004_Page.removerProgramaFeatureCOM004();
//    }
//
//    @Então("remover Tipo de Contrato feature COM004")
//    public void removerTipoDeContratoFeatureCOM004() {
//        COM004_Page.removerTipoDeContratoFeatureCOM004();
//    }
//
//    @Entao("remover Empresa feature COM004")
//    public void removerEmpresaFeatureCOM004() {
//        COM004_Page.removerEmpresaFeatureCOM004();
//    }
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
