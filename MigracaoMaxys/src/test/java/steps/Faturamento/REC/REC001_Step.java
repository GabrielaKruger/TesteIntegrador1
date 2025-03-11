package steps.Faturamento.REC;

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
import pages.Faturamento.REC.REC001_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class REC001_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private REC001_Page REC001_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do REC001")
    public void inicializeAExecuçãoDosCenáriosDoREC001() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        REC001_Page = new REC001_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature REC001")
    public void acessarOProgramaFeatureREC(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

    @Quando("clicar botão ToolBar {string} feature REC001")
    public void clicarBotãoNovoRegistroFeatureREC001(String botao) {
        basePage.esperarMilissegundos(15000); // espera necessária
        basePage.clicarBotaoToolBar(botao);
    }

    @Quando("apresentar o modal H5 {string} feature REC001")
    public void apresentarOModalH5FeatureREC001(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem parcial {string} feature REC001")
    public void apresentarAMensagemParcialFeatureREC001(String mensagem) {
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @E("apresentar a mensagem {string} feature REC001")
    public void apresentarAMensagemFeatureREC001(String mensagem) {
        basePage.esperarMilissegundos(5000); // espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @Então("clicar botão {string} do modal feature REC001")
    public void clicarBotãoDoModalFeatureREC001(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("pressionar tecla {string} feature REC001")
    public void pressionarTeclaFeatureREC001(String tecla) {
        basePage.esperarMilissegundos(1000); //espera necessária
        basePage.pressionarTecla(tecla);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @Então("pressionar teclas shift + f6 para excluir REC001")
    public void pressionarTeclasShiftFParaExcluirREC001() {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.pressionarShiftF6();
    }

    @Quando("apresentar o modal H4 {string} feature REC001")
    public void apresentarOModalH4FeatureREC001(String title) {
        basePage.validaModalByH4(title);
    }

    @Quando("acessar a tela REC001 - page Nota Fiscal feature REC001")
    public void acessarATelaRECPageNotaFiscalFeatureREC() {
        // tempo de espera apenas - esse é o padrão
    }

    @Quando("encontrar a page {string} feature REC001")
    public void encontrarAPageFeatureREC(String page) {
        basePage.selecionarPaginaNoMenu(page);
    }

    @After
    public void tearDown() {
        if (driver != null && scenario != null && scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
        BasePage.tearDownCloseQuit(driver);
    }


    @E("preenche N CNPJ CPF feature REC001")
    public void preencheNCNPJCPFFeatureREC001() {
        REC001_Page.preencheNCNPJCPFFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }

    @Então("clicar em Cancelar na tela de Seleção de Notas Mestras feature REC001")
    public void clicarEmCancelarNaTelaDeSeleçãoDeNotasMestrasFeatureREC001() {
        REC001_Page.clicarEmCancelarNaTelaDeSeleçãoDeNotasMestrasFeatureREC001();
    }

    @E("preencher Nota Fiscal feature REC001")
    public void preencherNotaFiscalFeatureREC001() {
        REC001_Page.preencherNotaFiscalFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "notaFiscal"));
    }

    @E("preencher Série feature REC001")
    public void preencherSérieFeatureREC001() {
        REC001_Page.preencherSérieFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "série"));
    }

    @E("preencher Espécie feature REC001")
    public void preencherEspecieFeatureREC001() {
        REC001_Page.preencherEspecieFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "especie"));
    }

    @E("preencher Data Emissão feature REC001")
    public void preencherDataEmissãoFeatureREC001() {
        REC001_Page.preencherDataEmissãoFeatureREC001();
    }

    @E("preencher Forma de Pagamento feature REC001")
    public void preencherFormaDePagamentoFeatureREC001() {
        REC001_Page.preencherFormaDePagamentoFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa,"formaPagamento"));
    }

    @E("preencher Condição Pagamento feature REC001")
    public void preencherCondiçãoPagamentoFeatureREC001() {
        REC001_Page.preencherCondiçãoPagamentoFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("preencher Data Vencimento feature REC001")
    public void preencherDataVencimentoFeatureREC001() {
        REC001_Page.preencherDataVencimentoFeatureREC001();
    }

    @E("preencher Moeda Transação feature REC001")
    public void preencherMoedaTransaçãoFeatureREC001() {
        REC001_Page.preencherMoedaTransaçãoFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa,""));
    }

    @Então("preencher Valor Nota feature REC001")
    public void preencherValorNotaFeatureREC001() {
        REC001_Page.preencherValorNotaFeatureREC001(massaTeste.getMassaTestePorPathEChave(tagMassa, "valorNota"));
    }

    @E("preencher Item feature REC{int}")
    public void preencherItemFeatureREC(int arg0) {

    }

    @E("preencher Movim. feture REC{int}")
    public void preencherMovimFetureREC(int arg0) {

    }

    @E("preencher Quantidade  feature GPE{int}")
    public void preencherQuantidadeFeatureGPE(int arg0) {

    }

    @Então("preencher Valor Unit. feature GPE{int}")
    public void preencherValorUnitFeatureGPE(int arg0) {

    }

    @Quando("acessar a tela {string} feature REC{int}")
    public void acessarATelaFeatureREC(String arg0, int arg1) {

    }

    @E("preencher primeiro item Empresa  feature REC{int}")
    public void preencherPrimeiroItemEmpresaFeatureREC(int arg0) {

    }

    @E("preencher primeiro item Centro Custo featue REC{int}")
    public void preencherPrimeiroItemCentroCustoFeatueREC(int arg0) {
    }

}