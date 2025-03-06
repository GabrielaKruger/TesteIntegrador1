package steps.Faturamento.VFS;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
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

    @E("acessar o programa {string} feature VFS002")
    public void acessarOProgramaFeatureVFS002(String programa) {
        basePage.esperarMilissegundos(3000);
        loginPage.loginNewMaxysNovo(programa);
        basePage.esperarMilissegundos(10000);
    }

    @E("esperar o programa carregar feature VFS002")
    public void esperarOProgramaCarregarFeatureVFS002() {
        VFS002_Page.esperarOProgramaCarregarFeatureVFS002();
    }

    @Quando("selecionado tipo de venda {string} na feature VFS002")
    public void selecionadoTipoDeVendaFeatureVFS002(String tipoVenda) {
        VFS002_Page.selecionarTipoDeVenda(tipoVenda);
    }

//    @E("seleciona a serie da nota fiscal feature VFS002")
//    public void selecionaASerieDaNotaFiscalFeatureVFS002() {
//        VFS002_Page.selecionaASerieDaNotaFiscalFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNotaFiscal"));
//    }

    @E("seleciona a serie da nota fiscal feature VFS002")
    public void selecionaASerieDaNotaFiscalFeatureVFS002() {
        System.out.println("Tag Massa: " + tagMassa);

        String serie = massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNotaFiscal");

        if (serie == null) {
            throw new RuntimeException("Erro: Chave 'serieNotaFiscal' não encontrada na massa de teste.");
        }

        System.out.println("Série da Nota Fiscal carregada: " + serie);

        VFS002_Page.selecionaASerieDaNotaFiscalFeatureVFS002(serie);
    }


    @E("informa data emissao da nota feature VFS002")
    public void informaDataEmissaoDaNotaFeatureVFS002() {
        VFS002_Page.informaDataEmissaoDaNotaFeatureVFS002();
    }

    @E("preenche o clifor da nota feature VFS002")
    public void preencheOCliforDaNotaFeatureVFS002() {
        VFS002_Page.preencheOCliforDaNotaFeatureVFS002(massaTeste.getMassaTestePorPathEChave(tagMassa, "cliforNotaFiscal"));
    }

}
