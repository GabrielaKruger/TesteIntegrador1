package steps.Originacao.TGR;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originacao.TGR.TGR025_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TGR025_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.TGR.TGR025_Page TGR025_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TGR025")
    public void inicializeAExecuçãoDosCenáriosDoTGR025() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TGR025_Page = new TGR025_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TGR025")
    public void acessarOProgramaFeatureTGR025(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature TGR025")
    public void clicarBotãoToolBarFeatureTGR025(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature TGR025")
    public void apresentarAMensagemNoPopUpFeatureTGR025(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature TGR025")
    public void apresentarOModalH5FeatureTGR025(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TGR025")
    public void apresentarAMensagemFeatureTGR025(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature TGR025")
    public void clicarBotãoDoModalFeatureTGR025(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature TGR025")
    public void apresentaOModalHFeatureTGR025(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature TGR025")
    public void apresentaOModalFeatureTGR025(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature TGR025")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir TGR025")
    public void pressionarTeclasShiftF6ParaExcluirTGR025() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Empresa feature TGR025")
    public void preencherEmpresaFeatureTGR025() {
        TGR025_Page.preencherEmpresaFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Tipo de Contrato feature TGR025")
    public void preencherTipoDeContratoFeatureTGR025() {
        TGR025_Page.preencherTipoDeContratoFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoContrato"));
    }

    @E("preencher Módulo feature TGR025")
    public void preencherMóduloFeatueTGR025() {
        TGR025_Page.preencherMóduloFeatueTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "modulo"));
    }

    @Então("{string} Ativo feature TGR025")
    public void deselecionarAtivoFeatureTGR025(String acao) {
        TGR025_Page.deselecionarAtivoFeatureTGR025(acao);
    }

    @E("preencher Programa feature TGR025")
    public void preencherProgramaFeatureTGR025() {
        TGR025_Page.preencherProgramaFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @E("preencher Motivo feature TGR025")
    public void preencherMotivoFeatureTGR025() {
        TGR025_Page.preencherMotivoFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "motivo"));
    }

    @Quando("selecionar a Autorização feature TGR025")
    public void selecionarAAutorizaçãoFeatureTGR025() {
        TGR025_Page.selecionarAAutorizaçãoFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @Entao("remover Programa feature TGR025")
    public void removerProgramaFeatureTGR025() {
        TGR025_Page.removerProgramaFeatureTGR025();
    }

    @Então("remover Tipo de Contrato feature TGR025")
    public void removerTipoDeContratoFeatureTGR025() {
        TGR025_Page.removerTipoDeContratoFeatureTGR025();
    }

    @Entao("remover Empresa feature TGR025")
    public void removerEmpresaFeatureTGR025() {
        TGR025_Page.removerEmpresaFeatureTGR025();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            if (scenario != null && scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            }
        }
        BasePage.tearDownCloseQuit(driver);
    }

}



