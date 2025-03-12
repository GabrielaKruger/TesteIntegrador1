package steps.Materiais.TCO;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Materiais.TCO.TCO024_Page;
import utils.MassaTeste;

import java.time.Duration;

public class TCO024_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Materiais.TCO.TCO024_Page TCO024_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do TCO024")
    public void inicializeAExecuçãoDosCenáriosDoTCO024() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        TCO024_Page = new TCO024_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature TCO024")
    public void acessarOProgramaFeatureTCO024(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(4000); // espera necessária
    }

    @Quando("clicar botão ToolBar {string} feature TCO024")
    public void clicarBotãoToolbarFeatureTCO024(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar o modal H5 {string} feature TCO024")
    public void apresentarOModalH5FeatureTCO024(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature TCO024")
    public void apresentarAMensagemFeatureTCO024(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("apresentar a mensagem parcial {string} feature TCO024")
    public void apresentarAMensagemFeatureTCO02(String mensagem) {
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @E("clicar botão {string} do modal feature TCO024")
    public void clicarBotãoDoModalFeatureTCO024(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("recarregar o programa feature TCO024")
    public void recarregarOProgramaFeatureTCO024() {
        basePage.recarregarPaginaComRefresh();
    }

    @Quando("apresenta o modal H4 {string} feature TCO024")
    public void apresentaOModalH4FeatureTCO024(String title) {
        basePage.validaModalByH4(title);
    }

    @Quando("apresenta o modal {string} feature TCO024")
    public void apresentaOModalFeatureTCO024(String title) {
        basePage.validaModalByH5(title);
    }

    @Quando("informar Departamento feature TCO024")
    public void informarDepartamentoFeatureTCO024() {
        TCO024_Page.informarDepartamentoFeatureTCO024(massaTeste.getMassaTestePorPathEChave(tagMassa, "departamento"));
    }

    @Então("realizar a consulta feature TCO024")
    public void realizarAConsultaFeatureTCO024() {
        TCO024_Page.realizarAConsultaFeatureTCO024();
    }

    @Quando("selecionar o Grid Solicitante feature TCO024")
    public void selecionarOGridSolicitanteFeatureTCO024() {
        TCO024_Page.selecionarOGridSolicitanteFeatureTCO024();
    }

    @Então("informar Solicitante feature TCO024")
    public void informarSolicitanteFeatureTCO024() {
        TCO024_Page.informarSolicitanteFeatureTCO024(massaTeste.getMassaTestePorPathEChave(tagMassa, "solicitante"));
    }

    @Quando("selecionar o Grid Autorizador feature TCO024")
    public void selecionarOGridAutorizadorFeatureTCO024() {
        TCO024_Page.selecionarOGridAutorizadorFeatureTCO024();
    }

    @E("pressionar tecla {string} feature TCO024")
    public void pressionarTeclaFeatureTCO024(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @E("pressionar teclas shift + f6 para excluir TCO024")
    public void pressionarTeclasShiftF6ParaExcluirTCO024() {
        basePage.pressionarShiftF6();
    }

    @E("informar Autorizador feature TCO024")
    public void informarAutorizadorFeatureTCO024() {
        TCO024_Page.informarAutorizadorFeatureTCO024(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @E("informar Alcada feature TCO024")
    public void informarAlcadaFeatureTCO024() {
        TCO024_Page.informarAlcadaFeatureTCO024();
    }

    @E("informar Tipo Cargo feature TCO024")
    public void informarTipoCargoFeatureTCO024() {
        TCO024_Page.informarTipoCargoFeatureTCO024();
    }

    @E("{string} Aprovador de Necessidade feature TCO024")
    public void aprovadorDeNecessidadeFeatureTCO024(String selecionar) {
        TCO024_Page.aprovadorDeNecessidadeFeatureTCO024(selecionar);
    }

    @Então("{string} Comprador feature TCO024")
    public void compradorFeatureTCO024(String selecionar) {
        TCO024_Page.compradorFeatureTCO024(selecionar);
    }

    @Então("localiza Autorizador cadastrado feature TCO024")
    public void localizaAutorizadorCadastradoFeatureTCO024() {
        TCO024_Page.localizaAutorizadorCadastradoFeatureTCO024(massaTeste.getMassaTestePorPathEChave(tagMassa, "autorizador"));
    }

    @Quando("encontrar a page {string} feature TCO024")
    public void encontrarAPageFeatureTCO(String page) {
        TCO024_Page.selecionarPaginaNoMenu(page);
    }

    @E("informa Codigo de Tipos de Cargos feature TCO024")
    public void informaCodigoDeTiposDeCargosFeatureTCO024() {
        TCO024_Page.informaCodigoDeTiposDeCargosFeatureTCO024();
    }

    @Então("informa Descricao de Tipos de Cargos feature TCO024")
    public void informaDescricaoDeTiposDeCargosFeatureTCO024() {
        TCO024_Page.informaDescricaoDeTiposDeCargosFeatureTCO024();
    }

    @Quando("selecionar o Codigo de Tipos de Cargos cadastrado feature TCO024")
    public void selecionarOCodigoDeTiposDeCargosCadastradoFeatureTCO024() {
        TCO024_Page.selecionarOCodigoDeTiposDeCargosCadastradoFeatureTCO024();
    }

    @Quando("remover Descrição informada feature TCO024")
    public void removerDescriçãoInformadaFeatureTCO024() {
        TCO024_Page.removerDescriçãoInformadaFeatureTCO024();
    }

    @E("informa Codigo de Departamento feature TCO024")
    public void informaCodigoDeDepartamentoFeatureTCO024() {
        TCO024_Page.informaCodigoDeDepartamentoFeatureTCO024();
    }

    @Então("informa Descricao de Departamento feature TCO024")
    public void informaDescricaoDeDepartamentoFeatureTCO024() {
        TCO024_Page.informaDescricaoDeDepartamentoFeatureTCO024();
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
