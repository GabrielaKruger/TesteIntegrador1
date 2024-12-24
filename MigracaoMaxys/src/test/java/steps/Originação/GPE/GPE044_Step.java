//package steps.Originação.GPE;
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
//import pages.Financeiro.GPE044_Page;
//import pages.LoginPage;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class GPE044_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Financeiro.GPE044_Page GPE044_Page;
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
//    @Dado("inicialize a execução dos cenários do GPE044")
//    public void inicializeAExecuçãoDosCenáriosDoGPE044() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        GPE044_Page = new GPE044_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature GPE044")
//    public void acessarOProgramaFeatureGPE044(String programa) {
//        basePage.esperarMilissegundos(5000);// espera necessária
//        loginPage.loginNewMaxysNovo(programa);
//        basePage.esperarMilissegundos(5000);// espera necessária
//    }
//
//    @Quando("marcar checkbox Empresa feature GPE044")
//    public void marcarCheckboxEmpresaFeatureGPE044() {
//        GPE044_Page.marcarCheckboxEmpresaFeatureGPE044();
//    }
//
//    @E("preencher Observação feature GPE044")
//    public void preencherObservaçãoFeatureGPE044() {
//        GPE044_Page.preencherObservaçãoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "observacao"));
//    }
//
//    @E("clicar botão {string} feature GPE044")
//    public void clicarCréditoEmContaFeatureGPE044(String creditoemconta) {
//        GPE044_Page.clicarCréditoEmContaFeatureGPE044(creditoemconta);
//    }
//
//    @E("clicar botão Crédito em Conta {string} feature GPE044")
//    public void clicarFecharFeatureGPE044(String fechar) {
//        GPE044_Page.clicarFecharFeatureGPE044(fechar);
//    }
//
//    @Então("clicar botão ToolBar {string} feature GPE044")
//    public void clicarBotãoToolBarFeatureGPE044(String botao) {
//       basePage.esperarMilissegundos(2000); // espera necessária
//       basePage.clicarBotaoToolBar(botao);
//    }
//
//    @Quando("apresentar o modal H5 {string} feature GPE044")
//    public void apresentarOModalH5FeatureGPE044(String title) {
//            basePage.esperarMilissegundos(2000);//espera necessária
//            basePage.validaModalByH5(title);
//            basePage.esperarMilissegundos(2000);//espera necessária
//        }
//
//    @E("apresentar a mensagem {string} feature GPE044")
//    public void apresentarAMensagemFeatureGPE044(String mensagem) {
//        basePage.esperarMilissegundos(2000);//espera necessária
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @Então("clicar botão {string} do modal feature GPE044")
//    public void clicarBotãoDoModalFeatureGPE044(String acao) {
//        basePage.esperarMilissegundos(1000); //espera necessária
//        basePage.clicarBotaoDoModal(acao);
//        basePage.esperarMilissegundos(2000); //espera necessária
//    }
//
//    @Quando("apresenta o modal H4 {string} feature GPE044")
//    public void apresentaOModalHFeatureGPE044(String title) {
//        basePage.esperarMilissegundos(2000); //espera necessária
//        basePage.validaModalByH4(title);
//    }
//
//    @E("apresenta o modal {string} feature GPE044")
//    public void apresentaOModalFeatureGPE044(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//
//    @Então("pressionar tecla {string} feature GPE044")
//    public void pressionarTeclaFeatureFCT(String tecla) {
//        basePage.pressionarTecla(tecla);
//    }
//
//    @Então("pressionar teclas shift + f6 para excluir GPE044")
//    public void pressionarTeclasShiftF6ParaExcluirGPE044() {
//        basePage.pressionarShiftF6();
//    }
//
//    @Então("recusar processo feature GPE044")
//    public void recusarProcessoFeatureGPE044(String mensagem, String title, String acao, String botao) {
//        GPE044_Page.recusarProcessoFeatureGPE044(mensagem, title, acao, botao);
//    }
//
//    @E("preencher Usuário processo feature GPE044")
//    public void preencherUsuárioProcessoFeatureGPE044() {
//        GPE044_Page.preencherUsuárioProcessoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "usuarioProcesso"));
//    }
//
//    @Então("validar pop up feature FCT{int}")
//    public void validarPopUpFeatureFCT(int arg0) {
//    }
//}
//
