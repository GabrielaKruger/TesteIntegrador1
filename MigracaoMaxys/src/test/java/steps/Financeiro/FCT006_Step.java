//package steps.Financeiro;//package steps.Financeiro;
//
//import driver.driverManager.DriverManager;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.E;
//import io.cucumber.java.pt.Então;
//import io.cucumber.java.pt.Quando;
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//import pages.Financeiro.FCT006_Page;
//import pages.LoginPage;
//import pages.Originação.GPE.GPE001_Page;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class FCT006_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Financeiro.FCT006_Page FCT006_Page;
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
//    @Dado("inicialize a execução dos cenários do FCT006")
//    public void inicializeAExecuçãoDosCenáriosDoFCT006() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        FCT006_Page = new FCT006_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature FCT006")
//    public void acessarOProgramaFeatureFCT006(String programa) {
//        loginPage.loginNewMaxysNovo(programa);
//    }
//
//    @Quando("apresenta o modal {string} feature FCT006")
//    public void apresentaOModalFeatureFCT006(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @E("clicar botão {string} do modal feature FCT006")
//    public void clicarBotãoDoModalFeatureFCT006(String acao) {
//        basePage.clicarBotaoDoModal(acao);
//    }
//
//    @Quando("apresenta o modal H4 {string} feature FCT006")
//    public void apresentaOModalH4FeatureFCT006(String title) {
//        basePage.validaModalByH4(title);
//    }
//
//    @E("apresentar a mensagem {string} feature FCT006")
//    public void apresentarAMensagemFeatureFCT006(String mensagem) {
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @E("pressionar tecla {string} feature FCT006")
//    public void pressionarTeclaFeatureFCT006(String tecla) {
//        basePage.pressionarTecla(tecla);
//    }
//
//    @E("Autoriza Processo por {string} feature FCT006")
//    public void autorizaProcessoFeatureFCT006(String tecla) {
//        basePage.pressionarTecla(tecla);
//    }
//
//    @E("pressionar teclas shift + f6 para excluir FCT006")
//    public void pressionarTeclasShiftF6ParaExcluirFCT006() {
//        basePage.pressionarShiftF6();
//    }
//
//    @Quando("informar Empresa feature FCT006")
//    public void informarEmpresaFeatureFCT006() {
//        FCT006_Page.informarEmpresaFeatureFCT006(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
//    }
//
//    @Então("realizar a consulta feature FCT006")
//    public void realizarAConsultaFeatureFCT006() {
//        FCT006_Page.realizarAConsultaFeatureFCT006();
//    }
//
//    @E("informa Data Pagamento feature FCT006")
//    public void informaDataPagamentoFeatureFCT006() {
//        FCT006_Page.informaDataPagamentoFeatureFCT006(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataPagamento"));
//    }
//
//    @Quando("selecionar o processo feature FCT006")
//    public void selecionarOProcessoFeatureFCT006() {
//        FCT006_Page.selecionarOProcessoFeatureFCT006();
//    }
//
//    @E("informar Observação feature FCT006")
//    public void informarObservaçãoFeatureFCT006() {
//        FCT006_Page.informarObservaçãoFeatureFCT006();
//    }
//
//    @Quando("clicar botão ToolBar {string} feature FCT006")
//    public void clicarBotãoToolbarFeatureFCT006(String botao) {
//        basePage.clicarBotaoToolBar(botao);
//    }
//
//    @Quando("Autoriza Processo feature FCT006")
//    public void autorizaProcessoFeatureFCT006() {
//        FCT006_Page.autorizaProcessoFeatureFCT006();
//    }
//
//    @Quando("Rescusa Processo feature FCT006")
//    public void rescusaProcessoFeatureFCT006() {
//        FCT006_Page.rescusaProcessoFeatureFCT006();
//    }
//
//    @Então("clicar botão {string} feature FCT006")
//    public void clicarBotãoFeatureFCT(String botao) {
//
//        switch (botao.toLowerCase()) {
//            case "dossie":
//            //    FCT006_Page.selecionaTipoFeatureEXP088(1);
//                break;
//            case "contas":
//            //    FCT006_Page.selecionaTipoFeatureEXP088(2);
//                break;
//            case "credito em conta ":
//            // FCT006_Page.selecionaTipoFeatureEXP088(2);
//                break;
//            case "credito":
//             //   FCT006_Page.selecionaTipoFeatureEXP088(3);
//                break;
//            case "perfil":
//             //   FCT006_Page.selecionaTipoFeatureEXP088(3);
//                break;
//            case "detalhes":
//            // FCT006_Page.selecionaTipoFeatureEXP088(3);
//                break;
//            default:
//                throw new IllegalArgumentException("Elemento não reconhecido: " + botao);
//        }
//    }
//
//}
