package steps.Materiais.TCO;

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
import pages.Materiais.TCO.TCO035_Page;
import utils.MassaTeste;

import java.time.Duration;
import java.io.IOException;

public class TCO035_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Materiais.TCO.TCO035_Page TCO035_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TCO035")
    public void inicializeAExecuçãoDosCenáriosDoTCO035() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TCO035_Page = new TCO035_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TCO035")
    public void acessarOProgramaFeatureTCO035(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(4000); // espera necessária
    }

    @Quando("clicar botão ToolBar {string} feature TCO035")
    public void clicarBotãoToolbarFeatureTCO035(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature TCO035")
    public void apresentarOModalH5FeatureTCO035(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TCO035")
    public void apresentarAMensagemFeatureTCO035(String mensagem) throws IOException {
        BasePage.takeScreenshot(driver, "TCO035", "Registro Salvo Com Sucesso");
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("clicar botão {string} do modal feature TCO035")
    public void clicarBotãoDoModalFeatureTCO035(String acao) throws IOException {
        basePage.clicarBotaoDoModal(acao);
        BasePage.takeScreenshot(driver, "TCO035", "Validação Modal Realizada");
    }

    @Quando("recarregar o programa feature TCO035")
    public void recarregarOProgramaFeatureTCO035() {
        basePage.recarregarPaginaComRefresh();
    }

    @Quando("apresenta o modal H4 {string} feature TCO035")
    public void apresentaOModalH4FeatureTCO035(String title) {
        basePage.validaModalByH4(title);
    }

    @E("preencher Empresa feature TCO035")
    public void preencherEmpresaFeatureTCO035() {
        TCO035_Page.preencherEmpresaFeatureTCO035();
    }

    @E("preencher Autorizador feature TCO035")
    public void preencherAutorizadorFeatureTCO035() {
        TCO035_Page.preencherAutorizadorFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @E("preencher C.Custo feature TCO035")
    public void preencherCCustoFeatureTCO035() {
        TCO035_Page.preencherCCustoFeatureTCO035();
    }

    @Então("seleciona Status {string} feature TCO035")
    public void selecionaStatusFeatureTCO035(String status) {
        TCO035_Page.selecionaStatusFeatureTCO035(status);
    }

    @E("informa Autorizador feature TCO035")
    public void informaAutorizadorFeatureTCO035() {
        TCO035_Page.informaAutorizadorFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @E("realizar consulta feature TCO035")
    public void realizarConsultaFeatureTCO035() {
        TCO035_Page.realizarConsultaFeatureTCO035();
    }

    @E("selecionar Autorizador feature TCO035")
    public void selecionarAutorizadorFeatureTCO035() {
        TCO035_Page.selecionarAutorizadorFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @Quando("pressionar tecla {string} feature TCO035")
    public void pressionarTeclaFeatureTCO035(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Quando("pressionar tecla shift + f6 feature TCO035")
    public void pressionarTeclaShiftFFeatureTCO035() {
        basePage.pressionarShiftF6();
    }


    @E("selecionar a Empresa Consulta feature TCO035")
    public void selecionarAEmpresaConsultaFeatureTCO035() {
        TCO035_Page.selecionarEmpresaConsultaFeatureTCO035();
    }

    @E("selecionar o Autorizador Consulta feature TCO035")
    public void selecionarOAutorizadorConsultaFeatureTCO035() {
        TCO035_Page.selecionarOAutorizadorConsultaFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @E("selecionar o C.Custo Consulta feature TCO035")
    public void selecionarOCCustoConsultaFeatureTCO035() {
        TCO035_Page.selecionarOCCustoConsultaFeatureTCO035();
    }

    @E("selecionar a Empresa Grid feature TCO035")
    public void selecionarAEmpresaGridFeatureTCO035() {
        TCO035_Page.selecionarAEmpresaGridFeatureTCO035();
    }

    @E("selecionar o Autorizador Grid feature TCO035")
    public void selecionarOAutorizadorGridFeatureTCO035() {
        TCO035_Page.selecionarOAutorizadorGridFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador02"));
    }

    @E("selecionar o C.Custo Grid feature TCO035")
    public void selecionarOCCustoGridFeatureTCO035() {
        TCO035_Page.selecionarOCCustoGridFeatureTCO035();
    }

    @E("informa o Autorizador feature TCO035")
    public void informaOAutorizadorFeatureTCO035() {
        TCO035_Page.informaOAutorizadorFeatureTCO035(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador02"));
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
