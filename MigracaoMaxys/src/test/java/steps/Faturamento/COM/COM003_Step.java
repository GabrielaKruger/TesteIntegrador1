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
import pages.Faturamento.COM.COM003_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class COM003_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.COM.COM003_Page COM003_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do COM003")
    public void inicializeAExecuçãoDosCenáriosDoCOM003() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        COM003_Page = new COM003_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature COM003")
    public void acessarOProgramaFeatureCOM003(String programa, String empresa) {
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature COM003")
    public void clicarBotãoToolBarFeatureCOM003(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature COM003")
    public void apresentarAMensagemNoPopUpFeatureCOM003(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature COM003")
    public void apresentarOModalH5FeatureCOM003(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature COM003")
    public void apresentarAMensagemFeatureCOM003(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature COM003")
    public void clicarBotãoDoModalFeatureCOM003(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature COM003")
    public void apresentaOModalHFeatureCOM003(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature COM003")
    public void apresentaOModalFeatureCOM003(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature COM003")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir COM003")
    public void pressionarTeclasShiftF6ParaExcluirCOM003() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Clifor feature COM003")
    public void preencherCliforFeatureCOM003() {
        COM003_Page.preencherCliforFeatureCOM003(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }


    @E("preencher Condição Pagto feature COM003")
    public void preencherCondiçãoPagtoFeatureCOM003() {
        COM003_Page.preencherCondiçãoPagtoFeatureCOM003(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("preencher Moeda feature COM003")
    public void preencherMoedaFeatureCOM003() {
        COM003_Page.preencherMoedaFeatureCOM003(massaTeste.getMassaTestePorPathEChave(tagMassa, "moeda"));
    }

    @E("preencher Forma Pagamento feature COM003")
    public void preencherFormaPagamentoFeatureCOM003() {
        COM003_Page.preencherFormaPagamentoFeatureCOM003(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaPagamento"));
    }

    @E("selecionar Tipo Taxa sendo {string} feature COM003")
    public void selecionarTipoTaxaSendoFeatureCOM003(String tipoTaxa) {
        COM003_Page.selecionarTipoTaxaSendoFeatureCOM003(tipoTaxa);
    }

    @E("preencher Dt início da correção feature COM003")
    public void preencherDtInícioDaCorreçãoFeatureCOM003() {
        COM003_Page.preencherDtInícioDaCorreçãoFeatureCOM003();
    }

    @Então("preencher Taxa feature COM003")
    public void preencherTaxaFeatureCOM003() {
        COM003_Page.preencherTaxaFeatureCOM003(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorTaxa"));
    }

    @Quando("preencher os {string} Itens de Pedido de Compra feature COM003")
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



