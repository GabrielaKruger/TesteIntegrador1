package steps.Financeiro.CTI;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.Financeiro.CTI.CTI009_Page;
import pages.LoginPage;
import pages.Financeiro.CTI.CTI009_Page;
import utils.MassaTeste;

import java.io.IOException;
import java.time.Duration;

public class CTI009_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private CTI009_Page CTI009_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do CTI009")
    public void inicializeAExecuçãoDosCenáriosDoCTI009() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        CTI009_Page = new CTI009_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature CTI009")
    public void acessarOProgramaFeatureCTI009(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
    }

    @Então("clicar botão ToolBar {string} feature CTI009")
    public void clicarBotãoToolBarFeatureCTI009(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @Quando("apresentar o modal H5 {string} feature CTI009")
    public void apresentarOModalH5FeatureCTI009(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature CTI009")
    public void apresentarAMensagemFeatureCTI009(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("apresentar a mensagem parcial {string} feature CTI009")
    public void apresentarAMensagemParcialFeatureCTI009(String mensagem) throws IOException{
        basePage.validaMensagemLabelByContainsText(mensagem);
        BasePage.takeScreenshot(driver, "CTI009", mensagem);
    }

    @Então("clicar botão {string} do modal feature CTI009")
    public void clicarBotãoDoModalFeatureCTI009(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature CTI009")
    public void apresentaOModalHFeatureCTI009(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature CTI009")
    public void apresentaOModalFeatureCTI009(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature CTI009")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir CTI009")
    public void pressionarTeclasShiftF6ParaExcluirCTI009() {
        basePage.pressionarShiftF6();
    }

    @Então("apresentar a mensagem no pop-up {string} feature CTI009")
    public void apresentarAMensagemNoPopUpFeatureCTI009(String mensagem) throws IOException{
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
//        BasePage.takeScreenshot(driver, "CTI009", mensagem);
    }

    @Quando("preencher Empresa feature CTI009")
    public void preencherEmpresaFeatureCTI009() {
        CTI009_Page.preencherEmpresaFeatureCTI009(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("selecionar Ordem feature CTI009")
    public void selecionarOrdemFeatureCTI009() {
//        CTI009_Page.selecionarOrdemFeatureCTI009();
    }

    @Então("realizar a Consulta feature CTI009")
    public void realizarAConsultaFeatureCTI009() {
//        CTI009_Page.realizarAConsultaFeatureCTI009();
    }

    @Quando("selecionar Variação Financeira na feature CTI009")
    public void selecionarVariaçãoFinanceiraNaFeatureCTI009() {
//        CTI009_Page.selecionarVariaçãoFinanceiraNaFeatureCTI009();
    }

    @E("preencher a Empresa feature CTI009")
    public void preencherAEmpresaFeatureCTI009() {
//        CTI009_Page.preencherAEmpresaFeatureCTI009();
    }

    @Então("preencher Mês feature CTI009")
    public void preencherMêsFeatureCTI009() {
//        CTI009_Page.preencherMêsFeatureCTI009();
    }

    @After
    public void tearDown() {
        BasePage.limparCapturasdeTelaAntigas();

        if (driver != null) {
            if (scenario != null && scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            }
        }
        BasePage.tearDownCloseQuit(driver);
    }

}