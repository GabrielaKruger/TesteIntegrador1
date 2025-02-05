package steps.Originacao.TGR;

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
import pages.LoginPage;
import pages.Transporte.TTB.TGR025_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TGR025_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Transporte.TTB.TGR025_Page TGR025_Page;
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

    @E("acessar o programa {string} feature TGR025")
    public void acessarOProgramaFeatureTGR025(String programa) {
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature TGR025")
    public void clicarBotãoToolBarFeatureTGR025(String botao) {
        basePage.clicarBotaoToolBar(botao);
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

    @E("preencher Usuário feature TGR025")
    public void preencherUsuárioFeatureTGR025() {
        TGR025_Page.preencherUsuárioFeatureTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "user"));
    }

    @E("preencher Tipo Solic featue TGR025")
    public void preencherTipoSolicFeatueTGR025() {
        TGR025_Page.preencherTipoSolicFeatueTGR025(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoSolicitante"));
    }

    @E("preencher Cód. da Alçada feature TGR025")
    public void preencherCódDaAlçadaFeatureTGR025() {
        TGR025_Page.preencherCódDaAlçadaFeatureTGR025();
    }

    @Então("prencher Data de Vencimento feature TGR025")
    public void prencherDataDeVencimentoFeatureTGR025() {
        TGR025_Page.prencherDataDeVencimentoFeatureTGR025();
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



