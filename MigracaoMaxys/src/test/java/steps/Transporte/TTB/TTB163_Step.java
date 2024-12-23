//package steps.Transporte.TTB;
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
//import pages.Transporte.TTB.TTB163_Page;
//import pages.LoginPage;
//import utils.MassaTeste;
//
//import java.time.Duration;
//
//public class TTB163_Step {
//
//    private WebDriver driver;
//    private MassaTeste massaTeste;
//    private pages.Transporte.TTB.TTB163_Page TTB163_Page;
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
//    @Dado("inicialize a execução dos cenários do TTB163")
//    public void inicializeAExecuçãoDosCenáriosDoTTB163() {
//        massaTeste = new MassaTeste();
//        tagMassa = massaTeste.getPathByScenario(this.scenario);
//        browser = DriverManager.getBrowserByScenario(this.scenario);
//        this.driver = DriverManager.getBrowserManager(browser).getDriver();
//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        TTB163_Page = new TTB163_Page(driver);
//        loginPage = new LoginPage(driver);
//        basePage = new BasePage(driver);
//    }
//
//    @E("acessar o programa {string} feature TTB163")
//    public void acessarOProgramaFeatureTTB163(String programa) {
//        basePage.esperarMilissegundos(20000);// espera necessária
//        loginPage.loginNewMaxysNovo(programa);
//        basePage.esperarMilissegundos(20000);// espera necessária
//    }
//
//    @Quando("marcar checkbox Empresa feature TTB163")
//    public void marcarCheckboxEmpresaFeatureTTB163() {
//        TTB163_Page.marcarCheckboxEmpresaFeatureTTB163();
//    }
//
//    @E("preencher Observação feature TTB163")
//    public void preencherObservaçãoFeatureTTB163() {
//        TTB163_Page.preencherObservaçãoFeatureTTB163(massaTeste.getMassaTestePorPathEChave(tagMassa, "observacao"));
//    }
//
//    @E("clicar botão {string} feature TTB163")
//    public void clicarCréditoEmContaFeatureTTB163(String creditoemconta) {
//        TTB163_Page.clicarCréditoEmContaFeatureTTB163(creditoemconta);
//    }
//
//    @E("clicar botão Crédito em Conta {string} feature TTB163")
//    public void clicarFecharFeatureTTB163(String fechar) {
//        TTB163_Page.clicarFecharFeatureTTB163(fechar);
//    }
//
//    @Então("clicar botão ToolBar {string} feature TTB163")
//    public void clicarBotãoToolBarFeatureTTB163(String botao) {
//       basePage.esperarMilissegundos(2000); // espera necessária
//       basePage.clicarBotaoToolBar(botao);
//    }
//
//    @Quando("apresentar o modal H5 {string} feature TTB163")
//    public void apresentarOModalH5FeatureTTB163(String title) {
//            basePage.esperarMilissegundos(2000);//espera necessária
//            basePage.validaModalByH5(title);
//            basePage.esperarMilissegundos(2000);//espera necessária
//        }
//
//    @E("apresentar a mensagem {string} feature TTB163")
//    public void apresentarAMensagemFeatureTTB163(String mensagem) {
//        basePage.esperarMilissegundos(2000);//espera necessária
//        basePage.validaMensagemLabelByText(mensagem);
//    }
//
//    @Então("clicar botão {string} do modal feature TTB163")
//    public void clicarBotãoDoModalFeatureTTB163(String acao) {
//        basePage.esperarMilissegundos(000); //espera necessária
//        basePage.clicarBotaoDoModal(acao);
//        basePage.esperarMilissegundos(2000); //espera necessária
//    }
//
//    @Quando("apresenta o modal H4 {string} feature TTB163")
//    public void apresentaOModalHFeatureTTB163(String title) {
//        basePage.validaModalByH4(title);
//    }
//
//    @E("apresenta o modal {string} feature TTB163")
//    public void apresentaOModalFeatureTTB163(String title) {
//        basePage.validaModalByH5(title);
//    }
//
//    @Então("pressionar tecla {string} feature TTB163")
//    public void pressionarTeclaFeatureFCT(String tecla) {
//        basePage.pressionarTecla(tecla);
//    }
//
//    @Então("pressionar teclas shift + f6 para excluir TTB163")
//    public void pressionarTeclasShiftF6ParaExcluirTTB163() {
//        basePage.pressionarShiftF6();
//    }
//}
//
