package steps.Faturamento.COM;

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
import pages.Faturamento.COM.COM019_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class COM019_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private COM019_Page COM019_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do COM019")
    public void inicializeAExecuçãoDosCenáriosDoCOM019() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        COM019_Page = new COM019_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @Quando("confirmar mensagem SQL de Consulta feature COM019")
    public void confirmarMensagemSQLDeConsultaFeatureCOM019() {
        basePage.confirmarMensagemSQLDeConsultaFeature();
    }

    @E("acessar o programa {string} pela empresa {string} feature COM019")
    public void acessarOProgramaFeatureCOM019(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature COM019")
    public void clicarBotãoToolBarFeatureCOM019(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature COM019")
    public void apresentarAMensagemNoPopUpFeatureCOM019(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature COM019")
    public void apresentarOModalH5FeatureCOM019(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature COM019")
    public void apresentarAMensagemFeatureCOM019(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature COM019")
    public void clicarBotãoDoModalFeatureCOM019(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature COM019")
    public void apresentaOModalHFeatureCOM019(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature COM019")
    public void apresentaOModalFeatureCOM019(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature COM019")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir COM019")
    public void pressionarTeclasShiftF6ParaExcluirCOM019() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Clifor feature COM019")
    public void preencherCliforFeatureCOM019() {
        COM019_Page.preencherCliforFeatureCOM019(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }


    @E("preencher Condição Pagto feature COM019")
    public void preencherCondiçãoPagtoFeatureCOM019() {
        COM019_Page.preencherCondiçãoPagtoFeatureCOM019(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("preencher Moeda feature COM019")
    public void preencherMoedaFeatureCOM019() {
        COM019_Page.preencherMoedaFeatureCOM019(massaTeste.getMassaTestePorPathEChave(tagMassa, "moeda"));
    }

    @E("preencher Forma Pagamento feature COM019")
    public void preencherFormaPagamentoFeatureCOM019() {
        COM019_Page.preencherFormaPagamentoFeatureCOM019(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaPagamento"));
    }

    @E("selecionar Tipo Taxa sendo {string} feature COM019")
    public void selecionarTipoTaxaSendoFeatureCOM019(String tipoTaxa) {
        COM019_Page.selecionarTipoTaxaSendoFeatureCOM019(tipoTaxa);
    }

    @E("preencher Dt início da correção feature COM019")
    public void preencherDtInícioDaCorreçãoFeatureCOM019() {
        COM019_Page.preencherDtInícioDaCorreçãoFeatureCOM019();
    }

    @Então("preencher Taxa feature COM019")
    public void preencherTaxaFeatureCOM019() {
        COM019_Page.preencherTaxaFeatureCOM019(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorTaxa"));
    }

    @Quando("preencher os {string} Itens de Pedido de Compra feature COM019")
    public void preencherOsItensDePedidoDeCompraFeatureCOM(String arg0) {

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



