package steps.Faturamento.COM;

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
import pages.Faturamento.COM.COM004_Page;
import utils.MassaTeste;

import java.time.Duration;

public class COM004_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.COM.COM004_Page COM004_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do COM004")
    public void inicializeAExecuçãoDosCenáriosDoCOM004() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        COM004_Page = new COM004_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature COM004")
    public void acessarOProgramaFeatureCOM004(String programa) {
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(1000); // espera necessária
    }

    @Então("clicar botão ToolBar {string} feature COM004")
    public void clicarBotãoToolBarFeatureCOM004(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @E("apresentar a mensagem {string} no pop-up feature COM004")
    public void apresentarAMensagemNoPopUpFeatureCOM004(String mensagem) {
        basePage.esperarMilissegundos(500); // espera necessária
        basePage.validarMensagemByToastContainerDivDiv(mensagem);
    }

    @Quando("apresentar o modal H5 {string} feature COM004")
    public void apresentarOModalH5FeatureCOM004(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature COM004")
    public void apresentarAMensagemFeatureCOM004(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @Então("clicar botão {string} do modal feature COM004")
    public void clicarBotãoDoModalFeatureCOM004(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature COM004")
    public void apresentaOModalHFeatureCOM004(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature COM004")
    public void apresentaOModalFeatureCOM004(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature COM004")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.esperarMilissegundos(1000); // espera necessária
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir COM004")
    public void pressionarTeclasShiftF6ParaExcluirCOM004() {
        basePage.pressionarShiftF6();
    }

    @E("preencher Clifor feature COM004")
    public void preencherCliforFeatureCOM004() {
        COM004_Page.preencherCliforFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }


    @E("preencher Condição Pagto feature COM004")
    public void preencherCondiçãoPagtoFeatureCOM004() {
        COM004_Page.preencherCondiçãoPagtoFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("preencher Moeda feature COM004")
    public void preencherMoedaFeatureCOM004() {
        COM004_Page.preencherMoedaFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "moeda"));
    }

    @E("preencher Forma Pagamento feature COM004")
    public void preencherFormaPagamentoFeatureCOM004() {
        COM004_Page.preencherFormaPagamentoFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaPagamento"));
    }

    @E("selecionar Tipo Taxa sendo {string} feature COM004")
    public void selecionarTipoTaxaSendoFeatureCOM004(String tipoTaxa) {
        COM004_Page.selecionarTipoTaxaSendoFeatureCOM004(tipoTaxa);
    }

    @E("preencher Dt início da correção feature COM004")
    public void preencherDtInícioDaCorreçãoFeatureCOM004() {
        COM004_Page.preencherDtInícioDaCorreçãoFeatureCOM004();
    }

    @Então("preencher Taxa feature COM004")
    public void preencherTaxaFeatureCOM004() {
        COM004_Page.preencherTaxaFeatureCOM004(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorTaxa"));
    }

    @Quando("preencher os {string} Itens de Pedido de Compra feature COM004")
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



