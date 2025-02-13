package steps.Faturamento.VFS;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.Faturamento.VFS.VFS015_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class VFS015_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.VFS.VFS015_Page VFS015_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do VFS015")
    public void inicializeAExecuçãoDosCenáriosDoVFS015() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        VFS015_Page = new VFS015_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature VFS015")
    public void acessarOProgramaFeatureVFS015(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

    @Quando("selecionar Faturamento feature VFS015")
    public void selecionarFaturamentoFeatureVFS015() {
        VFS015_Page.selecionarFaturamentoFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "faturamento"));
    }

    @E("preencher Lançamento feature VFS015")
    public void preencherLançamentoFeatureVFS015() {
        VFS015_Page.preencherLançamentoFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "lancamento"));
    }

    @E("preencher Nota Fiscal feature VFS015")
    public void preencherNotaFiscalFeatureVFS015() {
        VFS015_Page.preencherNotaFiscalFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "notaFiscal"));
    }

    @E("preencher Série feature VFS015")
    public void preencherSérieFeatureVFS015() {
        VFS015_Page.preencherSérieFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "serie"));
    }

    @E("preencher NF Fornecedor feature VFS015")
    public void preencherNFFornecedorFeatureVFS015() {
        VFS015_Page.preencherNFFornecedorFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "nfFornecedor"));
    }

    @E("preencher Data Emissão feature VFS015")
    public void preencherDataEmissãoFeatureVFS015() {
        VFS015_Page.preencherDataEmissãoFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtEmissao"));
    }

    @E("preencher Empresa feature VFS015")
    public void preencherEmpresaFeatureVFS015() {
        VFS015_Page.preencherEmpresaFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Clifor feature VFS015")
    public void preencherCliforFeatureVFS015() {
        VFS015_Page.preencherCliforFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }

    @E("preencher Contrato Grão feature VFS015")
    public void preencherContratoGrãoFeatureVFS015() {
        VFS015_Page.preencherContratoGrãoFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "contratoGrao"));
    }

    @Então("clicar botão {string} para consultar feature VFS015")
    public void clicarBotãoParaConsultarFeatureVFS015(String consultar) {
        VFS015_Page.clicarBotãoParaConsultarFeatureVFS015(consultar);
    }

    @Quando("preencher Clifor de Remessas feature VFS015")
    public void preencherCliforDeRemessasFeatureVFS015() {
        VFS015_Page.preencherCliforDeRemessasFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforRemessas"));
    }

    @E("preencher Empresa Clifor de Remessas feature VFS015")
    public void preencherEmpresaCliforDeRemessasFeatureVFS015() {
        VFS015_Page.preencherEmpresaCliforDeRemessasFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresaRemessas"));
    }

    @E("clicar botão ToolBar {string} feature VFS015")
    public void clicarBotãoToolBarFeatureVFS015(String botao) {
        //espera necessária
        basePage.clicarBotaoToolBar(botao);
        //espera necessária
    }

    @E("preencher Clifor não repetido Clifor de Remessas feature VFS015")
    public void preencherCliforNãoRepetidoCliforDeRemessasFeatureVFS015() {
        VFS015_Page.preencherCliforNãoRepetidoCliforDeRemessasFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforNrepetido"));
    }

    @E("preencher Empresa não repetido Clifor de Remessas feature VFS015")
    public void preencherEmpresaNãoRepetidoCliforDeRemessasFeatureVFS015() {
        VFS015_Page.preencherEmpresaNãoRepetidoCliforDeRemessasFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresaNrepetido"));
    }

    @Então("validar mensagem pop up {string} feature VFS015")
    public void validarMensagemPopUpFeatureVFS015(String validar) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.validarMensagemByToastContainer(validar);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @E("apresenta o modal H4 {string} feature VFS015")
    public void apresentaOModalH4FeatureVFS015(String title) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.validaModalByH4(title);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @Então("clicar botão {string} do modal feature VFS015")
    public void clicarBotãoDoModalFeatureVFS015(String acao) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @Quando("clicar Clifor de Remessas feature VFS015")
    public void clicarCliforDeRemessasFeatureVFS015() {
        VFS015_Page.clicarCliforDeRemessasFeatureVFS015(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforRemessas"));
    }

    @Então("pressionar tecla {string} feature VFS015")
    public void pressionarTeclaFeatureVFS015(String tecla) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir VFS015")
    public void pressionarTeclasShiftFParaExcluirVFS015() {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.pressionarShiftF6();
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @E("preencher Clifor {string} Clifor de Remessas feature VFS015")
    public void preencherCliforCliforDeRemessasFeatureVFS015(String clifor) {
        VFS015_Page.preencherCliforCliforDeRemessasFeatureVFS015(clifor);
    }

    @Quando("apresentar a mensagem {string} feature VFS015")
    public void apresentarAMensagemFeatureVFS(String mensagem) {
        basePage.esperarMilissegundos(2000);//espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem);
        basePage.esperarMilissegundos(2000);//espera necessária
    }
}


//  @After
// public void tearDown() {
//     if (driver != null) {
//         if (scenario != null && scenario.isFailed()) {
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "Screenshot");
//        }
//    }
//    BasePage.tearDownCloseQuit(driver);
//}


//}

