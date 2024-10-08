package steps;

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
import pages.EXP088_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class EXP088_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private EXP088_Page EXP088_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do EXP088")
    public void inicializeAExecuçãoDosCenáriosDoEXP088() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        EXP088_Page = new EXP088_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature EXP088")
    public void acessarOProgramaFeatureEXP088(String programa) {
        loginPage.loginNewMaxys(programa);
    }

    @Quando("recarregar o programa feature EXP088")
    public void recarregarOProgramaFeatureEXP088() {
        basePage.recarregarPaginaComRefresh();
    }

    @Quando("clicar botão ToolBar {string} feature EXP088")
    public void clicarBotãoNovoRegistroFeatureEXP088(String botao) {
        basePage.esperarMilissegundos(15000); // espera necessária
        basePage.clicarBotaoToolBar(botao);
    }

    @E("preencher descrição feature EXP088")
    public void preencherDescriçãoFeatureEXP088() {
        basePage.esperarMilissegundos(6000); // espera necessária
        EXP088_Page.preencherDescricaoFeatureEXP088(massaTeste.getMassaTestePorPathEChave(tagMassa, "descricao"));
    }

    @Quando("apresenta o modal {string} feature EXP088")
    public void apresentaOModalFeatureEXP088(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature EXP088")
    public void apresentarAMensagemFeatureEXP088(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature EXP088")
    public void clicarBotãoDoModalFeatureEXP088(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("selecionar a descrição cadastrada feature EXP088")
    public void selecionarADescriçãoCadastradaFeatureEXP088() {
        EXP088_Page.encontrarDescricaoFeatureEXP088();
    }

    @Quando("apresentar o modal H4 {string} feature EXP088")
    public void apresentarOModalHFeatureEXP088(String title) {
        basePage.esperarMilissegundos(2000); // espera necessária
        basePage.validaModalByH4(title);
    }

    @Então("pressionar tecla {string} feature EXP088")
    public void pressionarTeclaFeatureEXP088(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir EXP088")
    public void pressionarTeclasShiftF6FParaExcluirEXP088() {
        basePage.esperarMilissegundos(2000); // espera necessária
        basePage.pressionarShiftF6();
    }

    @After
    public void tearDown() {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
        BasePage.tearDownCloseQuit(driver);
    }
}
