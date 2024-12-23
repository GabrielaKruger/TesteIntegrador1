package steps.Financeiro.FCT;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Financeiro.FCT007_Page;
import utils.MassaTeste;

import java.time.Duration;

public class FCT007_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Financeiro.FCT007_Page FCT007_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do FCT007")
    public void inicializeAExecuçãoDosCenáriosDoFCT007() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        FCT007_Page = new FCT007_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature FCT007")
    public void acessarOProgramaFeatureFCT007(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @Quando("marcar checkbox Empresa feature FCT007")
    public void marcarCheckboxEmpresaFeatureFCT007() {
        FCT007_Page.marcarCheckboxEmpresaFeatureFCT007();
    }

    @E("preencher Observação feature FCT007")
    public void preencherObservaçãoFeatureFCT007() {
        FCT007_Page.preencherObservaçãoFeatureFCT007(massaTeste.getMassaTestePorPathEChave(tagMassa, "observacao"));
    }

    @E("clicar botão {string} feature FCT007")
    public void clicarCréditoEmContaFeatureFCT007(String creditoemconta) {
        FCT007_Page.clicarCréditoEmContaFeatureFCT007(creditoemconta);
    }

    @E("clicar botão Crédito em Conta {string} feature FCT007")
    public void clicarFecharFeatureFCT007(String fechar) {
        FCT007_Page.clicarFecharFeatureFCT007(fechar);
    }

    @Então("clicar botão ToolBar {string} feature FCT007")
    public void clicarBotãoToolBarFeatureFCT007(String botao) {
       basePage.esperarMilissegundos(2000); // espera necessária
       basePage.clicarBotaoToolBar(botao);
    }

    @Quando("apresentar o modal H5 {string} feature FCT007")
    public void apresentarOModalH5FeatureFCT007(String title) {
            basePage.esperarMilissegundos(2000);//espera necessária
            basePage.validaModalByH5(title);
            basePage.esperarMilissegundos(2000);//espera necessária
        }

    @E("apresentar a mensagem {string} feature FCT007")
    public void apresentarAMensagemFeatureFCT007(String mensagem) {
        basePage.esperarMilissegundos(2000);//espera necessária
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature FCT007")
    public void clicarBotãoDoModalFeatureFCT007(String acao) {
        basePage.esperarMilissegundos(1000); //espera necessária
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @Quando("apresenta o modal H4 {string} feature FCT007")
    public void apresentaOModalHFeatureFCT007(String title) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature FCT007")
    public void apresentaOModalFeatureFCT007(String title) {
        basePage.validaModalByH5(title);
    }


    @Então("pressionar tecla {string} feature FCT007")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir FCT007")
    public void pressionarTeclasShiftF6ParaExcluirFCT007() {
        basePage.pressionarShiftF6();
    }

    @Então("recusar processo feature FCT007")
    public void recusarProcessoFeatureFCT007(String mensagem, String title, String acao, String botao) {
        FCT007_Page.recusarProcessoFeatureFCT007(mensagem, title, acao, botao);
    }

    @E("preencher Usuário processo feature FCT007")
    public void preencherUsuárioProcessoFeatureFCT007() {
        FCT007_Page.preencherUsuárioProcessoFeatureFCT007(massaTeste.getMassaTestePorPathEChave(tagMassa, "usuarioProcesso"));
    }

    @Então("validar pop up feature FCT{int}")
    public void validarPopUpFeatureFCT(int arg0) {
    }
}

