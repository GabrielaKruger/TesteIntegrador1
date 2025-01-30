package steps.Navegador.ANV;

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
import pages.Navegador.ANV.ANV052_Page;
import pages.Navegador.ANV.ANV052_Page;
import utils.MassaTeste;

import java.time.Duration;

public class ANV052_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Navegador.ANV.ANV052_Page ANV052_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do ANV052")
    public void inicializeAExecuçãoDosCenáriosDoANV052() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        ANV052_Page = new ANV052_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature ANV052")
    public void acessarOProgramaFeatureANV052(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @E("preencher Programa não repetido page Programa feature ANV052")
    public void preencherProgramaPageProgramaFeatureANV052() {
        ANV052_Page.preencherProgramaPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa1"));
    }

    @E("preencher Descrição page Programa feature ANV052")
    public void preencherDescriçãoPageProgramaFeatureANV052() {
        ANV052_Page.preencherDescriçãoPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "descricao"));
    }

    @E("preencher Arquivo page Programa feature ANV052")
    public void preencherArquivoPageProgramaFeatureANV052() {
        ANV052_Page.preencherArquivoPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "arquivo1"));
    }

    @E("selecionar Tipo Programa page Programa feature ANV052")
    public void selecionarTipoProgramaPageProgramaFeatureANV052() {
        ANV052_Page.selecionarTipoProgramaPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoPrograma"));
    }

    @E("selecionar Exclusão page Programa feature ANV052")
    public void selecionarExclusãoPageProgramaFeatureANV052() {
        ANV052_Page.selecionarExclusãoPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "exclusao"));
    }

    @E("selecionar Inclusão page Programa feature ANV052")
    public void selecionarInclusãoPageProgramaFeatureANV052() {
        ANV052_Page.selecionarInclusãoPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }


    @E("selecionar Alteração page Programa feature ANV052")
    public void selecionarAlteraçãoPageProgramaFeatureANV052() {
        ANV052_Page.selecionarAlteraçãoPageProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "alteracao"));
    }

    @Quando("apresentar a mensagem parcial {string} feature ANV052")
    public void apresentarAMensagemParcialFeatureANV052(String mensagem) {
        basePage.esperarMilissegundos(2000);//espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem);
        basePage.esperarMilissegundos(2000);//espera necessária
    }

    @Então("clicar botão {string} do modal feature ANV052")
    public void clicarBotãoDoModalFeatureANV052(String acao) {
        basePage.esperarMilissegundos(3000); //espera necessária
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @Então("pressionar tecla {string} feature ANV052")
    public void pressionarTeclaFeatureANV(String tecla) {
        basePage.esperarMilissegundos(2000);
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir ANV052")
    public void pressionarTeclasShiftFParaExcluirANV() {
        basePage.esperarMilissegundos(2000);
        basePage.pressionarShiftF6();
    }

    @Quando("selecionar Programa não repetido feature ANV052")
    public void selecionarProgramaNãoRepetidoFeatureANV() {
    }

    // DIVISÃO
    @Quando("preencher Programa feature ANV052")
    public void preencherProgramaFeatureANV052() {
        ANV052_Page.preencherProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @E("preencher Descrição feature ANV052")
    public void preencherDescriçãoFeatureANV052() {
        ANV052_Page.preencherDescriçãoFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "descricao"));
    }

    @E("preencher Arquivo feature ANV052")
    public void preencherArquivoFeatureANV052() {
        ANV052_Page.preencherArquivoFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "arquivo"));
    }

    @E("selecionar Tipo Programa feature ANV052")
    public void selecionarTipoProgramaFeatureANV052() {
        ANV052_Page.selecionarTipoProgramaFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoPrograma"));
    }

    @E("selecionar Exclusão feature ANV052")
    public void selecionarExclusãoFeatureANV052() {
        ANV052_Page.selecionarExclusãoFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "exclusao"));
    }

    @E("selecionar Inclusão feature ANV052")
    public void selecionarInclusãoFeatureANV052() {
        ANV052_Page.selecionarInclusãoFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "inclusao"));
    }

    @E("selecionar Alteração feature ANV052")
    public void selecionarAlteraçãoFeatureANV052() {
        ANV052_Page.selecionarAlteraçãoFeatureANV052(massaTeste.getMassaTestePorPathEChave(tagMassa, "alteracao"));
    }

    @Então("clicar botão {string} para consultar feature ANV052")
    public void clicarBotãoConsultarFeatureANV052(String consultar) {
        ANV052_Page.clicarBotãoConsultarFeatureANV052(consultar);
    }

    @Quando("clicar botão ToolBar {string} feature ANV052")
    public void clicarBotãoToolBarFeatureANV052(String botao) {
        basePage.esperarMilissegundos(5000);// espera necessária
        basePage.clicarBotaoToolBar(botao);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @Quando("apresenta o modal H4 {string} feature ANV052")
    public void apresentaOModalHFeatureANV052(String title) {
        basePage.esperarMilissegundos(2000);// espera necessária
        basePage.validaModalByH4(title);
        basePage.esperarMilissegundos(2000);// espera necessária
    }

    @E("clicar botão {string} para abrir abas feature ANV052")
    public void clicarBotãoFeatureAbasANV052(String abas) {
        ANV052_Page.clicarBotãoFeatureAbasANV052(abas);
    }

    @Então("clicar botão {string} para salvar feature ANV052")
    public void clicarBotãoParaSalvarFeatureANV052(String salvar) {
        ANV052_Page.clicarBotãoParaSalvarFeatureANV052(salvar);
    }

    @Quando("clicar botão {string} para fechar feature ANV052")
    public void clicarBotãoParaFecharFeatureANV052(String fechar) {
        ANV052_Page.clicarBotãoParaFecharFeatureANV052(fechar);
    }


 //   @After
 //   public void tearDown() {
 //       if (driver != null) {
 //           if (scenario != null && scenario.isFailed()) {
 //               final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
 //               scenario.attach(screenshot, "image/png", "Screenshot");
 //           }
 //       }
 //       BasePage.tearDownCloseQuit(driver);
 //   }
}


