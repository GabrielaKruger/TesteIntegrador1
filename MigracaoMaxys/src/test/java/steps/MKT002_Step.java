package steps;

import driver.driverManager.DriverManager;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.MKT002_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class MKT002_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.MKT002_Page MKT002_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do MKT002")
    public void inicializeAExecuçãoDosCenáriosDoMKT002() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        MKT002_Page = new MKT002_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature MKT002")
    public void acessarOProgramaFeatureMKT002(String programa) {
        loginPage.loginNewMaxys(programa);
    }

//    // Step que informa os dados de filtro
//    @Quando("informar dados de filtro")
//    public void informarDadosDeFiltro() {
//        mkt002Page.informarEmpresa(MassaTeste.getData("empresa"));
//        mkt002Page.informarItem(MassaTeste.getData("item"));
//        mkt002Page.informarTradeSlip(MassaTeste.getData("tradeSlip"));
//        mkt002Page.informarClifor(MassaTeste.getData("clifor"));
//        mkt002Page.informarTipo();
//        mkt002Page.clicarBotaoFiltrar();
//    }
//
//    // Step que clica no botão de Informações Adicionais
//    @E("clicar botão Informações Adicionais")
//    public void clicarBotaoInformacoesAdicionais() {
//        esperarSegundos(20); // Espera necessária para o carregamento do modal
//        mkt002Page.clicarInformacoesAdicionais();
//        basePage.validarModal("Informações Adicionais");
//    }
//
//    // Step que informa os dados adicionais
//    @Então("informar dados adicionais")
//    public void informarDadosAdicionais() {
//        mkt002Page.preencherCTRCorretora(MassaTeste.getData("ctrCorretora"));
//        mkt002Page.preencherTFornecedor(MassaTeste.getData("tFornecedor"));
//        mkt002Page.preencherTDeCompra(MassaTeste.getData("tDeCompra"));
//        mkt002Page.preencherLocalDeDescarga(MassaTeste.getData("localDescarga"));
//        mkt002Page.preencherTerminalPorto(MassaTeste.getData("terminalPorto"));
//        mkt002Page.preencherComissaoExp(MassaTeste.getData("comissaoExp"));
//        mkt002Page.preencherCarringChargesExp(MassaTeste.getData("carryingChargesExp"));
//        mkt002Page.preencherDespatchExp(MassaTeste.getData("despatchExp"));
//        mkt002Page.preencherExtensionExp(MassaTeste.getData("extensionExp"));
//        mkt002Page.preencherPreAdviceExp(MassaTeste.getData("preAdviceExp"));
//        mkt002Page.preencherLoadingRateExp(MassaTeste.getData("loadingRateExp"));
//    }
//
//    // Step que clica no botão Gravar Adicionais
//    @Então("clicar botão Gravar Adicionais")
//    public void clicarBotaoGravarAdicionais() {
//        mkt002Page.clicarBotaoGravarInfAdicionais();
//        esperarSegundos(5); // Espera necessária após a gravação
//    }
//
//    // Step que remove os dados adicionados
//    @E("remover dados adicionados")
//    public void removerDadosAdicionados() {
//        mkt002Page.removerCampos(
//                "CTRCorretora", "TFornecedor", "TDeCompra", "LocalDeDescarga", "TerminalPorto",
//                "ComissaoExp", "CarringChargesExp", "DespatchExp", "ExtensionExp", "PreAdviceExp", "LoadingRateExp"
//        );
//    }
//
//    // Step que clica no botão Abrir Contrato
//    @Então("clicar botão Abrir Contrato")
//    public void clicarBotaoAbrirContrato() {
//        esperarSegundos(10); // Espera necessária para o carregamento do contrato
//        mkt002Page.clicarBotaoAbrirContrato();
//    }
//
//    // Método auxiliar para pausar a execução por uma quantidade de segundos
//    private void esperarSegundos(int segundos) {
//        basePage.esperarPorSegundos(segundos);
//    }
//
//    @Então("esperar para reconhecer a gravação MKT002")
//    public void esperarParaReconhecerGravação() {
//        basePage.esperarPorSegundos(5); // espera necessária
//    }
}
