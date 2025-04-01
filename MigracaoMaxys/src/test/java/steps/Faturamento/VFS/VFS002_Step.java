package steps.Faturamento.VFS;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.Faturamento.VFS.VFS002_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class VFS002_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.VFS.VFS002_Page VFS002_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do VFS002")
    public void inicializeAExecuçãoDosCenáriosDoVFS002() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        VFS002_Page = new VFS002_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature VFS002")
    public void acessarOProgramaFeatureVFS002(String programa, String empresa) {
        basePage.esperarMilissegundos(5000);
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(10000);
    }

    @E("acessa o programa {string} feature VFS002")
    public void acessaOProgramaFeatureVFS002(String tela) {
        VFS002_Page.loginMigracao(tela);
    }

    @E("esperar o programa carregar feature VFS002")
    public void esperarOProgramaCarregarFeatureVFS002() {
        VFS002_Page.esperarOProgramaCarregarFeatureVFS002();
    }

    @Quando("selecionado tipo de venda {string} na feature VFS002")
    public void selecionadoTipoDeVendaFeatureVFS002(String tipoVenda) {
        VFS002_Page.selecionarTipoDeVenda(tipoVenda);
    }

    @E("seleciona a serie da nota fiscal feature VFS002")
    public void selecionaASerieDaNotaFiscalFeatureVFS002() {
        VFS002_Page.selecionaASerieDaNotaFiscalFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNotaFiscal"));
    }

    @E("informa data emissao da nota feature VFS002")
    public void informaDataEmissaoDaNotaFeatureVFS002() {
        VFS002_Page.informaDataEmissaoDaNotaFeatureVFS002();
    }

    @E("preenche o clifor da nota feature VFS002")
    public void preencheOCliforDaNotaFeatureVFS002() {
        VFS002_Page.preencheOCliforDaNotaFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforNotaFiscal"));
    }

    @E("carrega CNJP feature VFS002")
    public void carregaCNJPFeatureVFS002() {
        VFS002_Page.carregaCNJPFeatureVFS002();
    }

    @E("fecha sel notas e itens de mestra feature VFS002")
    public void fechaSelNotasEItensDeMestraFeatureVFS002() {
        VFS002_Page.fechaSelNotasEItensDeMestraFeatureVFS002();
    }

    @E("preenche condicao pagamento feature VFS002")
    public void preencheCondicaoPagamentoFeatureVFS002() {
        VFS002_Page.preencheCondicaoPagamentoFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "condicaoPagamento"));
    }

    @E("preencher forma de pagamento feature VFS002")
    public void preencherFormaDePagamentoFeatureVFS002() {
        VFS002_Page.preencherFormaDePagamentoFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "formaDePagamento"));
    }

    @E("preencher moeda transação feature VFS002")
    public void preencherMoedaTransacaoFeatureVFS002() {
        VFS002_Page.preencherMoedaTransacaoFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "moedaTransacao"));
    }

    @E("clica na page {string} feature VFS002")
    public void clicaNaPageFeatureVFS002(String Itens) {
        VFS002_Page.clicaNaPageFeatureVFS002(Itens);
    }
}
