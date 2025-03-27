package steps.Navegador.ANV;

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
import pages.Navegador.ANV.ANV054_Page;
import utils.MassaTeste;

import java.time.Duration;

public class ANV054_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Navegador.ANV.ANV054_Page ANV054_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do ANV054")
    public void inicializeAExecuçãoDosCenáriosDoANV054() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        ANV054_Page = new ANV054_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature ANV054")
    public void acessarOProgramaFeatureANV054(String programa, String empresa) {
        basePage.esperarMilissegundos(5000);//espera necessária
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(5000);//espera necessária
    }

    @E("informar o campo empresa feature ANV054")
    public void informarOCampoEmpresaFeatureANV054() {
        ANV054_Page.informarOCampoEmpresaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("informar o programa feature ANV054")
    public void informarOProgramaFeatureANV054() {
        ANV054_Page.informarOProgramaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @Então("clicar botao consultar feature ANV054")
    public void clicarBotaoConsultarFeatureANV054() {
        ANV054_Page.clicarBotaoConsultarFeatureANV054();
    }

    @E("preencher campo empresa feature ANV054")
    public void preencherCampoEmpresaFeatureANV054() {
        ANV054_Page.preencherCampoEmpresaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("selecionar duplicacao de papel feature ANV054")
    public void selecionarDuplicacaoDePapelFeatureANV054() {
        ANV054_Page.selecionarDuplicacaoDePapelFeatureANV054();
    }

    @E("informar no grid papel feature ANV054")
    public void informarNoGridPapelFeatureANV054() {
        ANV054_Page.informarNoGridPapelFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "papel"));
    }

    @E("informar no grid programa feature ANV054")
    public void informarNoGridProgramaFeatureANV054() {
        ANV054_Page.informarNoGridProgramaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @E("informar no grid pagina feature ANV054")
    public void informarNoGridPaginaFeatureANV054() {
        ANV054_Page.informarNoGridPaginaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "pagina"));
    }

    @E("selecionar no grid tipo de acesso Consulta feature ANV054")
    public void selecionarNoGridTipoDeAcessoConsultaFeatureANV054() {
        ANV054_Page.selecionarNoGridTipoDeAcessoConsultaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoAcesso"));
    }


    @E("clicar botão Toolbar {string} feature ANV054")
    public void clicarBotãoToolbarFeatureANV054(String botao) {
        basePage.esperarMilissegundos(2000);
        basePage.clicarBotaoToolBar(botao);
        basePage.esperarMilissegundos(3000);
    }

    @Entao("apresentar a mensagem {string} feature ANV054")
    public void apresentarAMensagemFeatureANV054(String mensagem) {
        basePage.esperarMilissegundos(2000);
        basePage.validarMensagemByToastContainer(mensagem);
        basePage.esperarMilissegundos(2000);
    }

    @Quando("selecionar pagina cadastrada feature ANV054")
    public void selecionarPaginaCadastradaFeatureANV054() {
        ANV054_Page.selecionarPaginaCadastradaFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "pagina"));
    }

    @E("apresenta o modal H4 {string} feature ANV054")
    public void apresentaOModalHFeatureANV054(String title) {
        basePage.esperarMilissegundos(2000);
        basePage.validaModalByH4(title);
    }

    @E("clicar botão {string} do modal feature ANV054")
    public void clicarBotãoDoModalFeatureANV054(String acao) {
        basePage.esperarMilissegundos(2000);
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(1000);
    }

    @E("pressionar tecla {string} feature ANV054")
    public void pressionarTeclaFeatureANV054(String tecla) {
        basePage.esperarMilissegundos(2000);
        basePage.pressionarTecla(tecla);
        basePage.esperarMilissegundos(2000);
    }

    @E("pressionar teclas shift + f6 para excluir feature ANV054")
    public void pressionarTeclasShiftF6ParaExcluirFeatureANV054() {
        basePage.pressionarShiftF6();
    }

    @E("informar no grid pagina em duplicidade feature ANV054")
    public void informarNoGridPaginaEmDuplicidadeFeatureANV054() {
        ANV054_Page.informarNoGridPaginaEmDuplicidadeFeatureANV054(massaTeste.getMassaTestePorPathEChave(tagMassa, "paginaDuplicada"));


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
