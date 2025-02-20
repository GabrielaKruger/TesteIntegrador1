package steps.Faturamento.VFS;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.Faturamento.VFS.VFS014_Page;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class VFS014_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Faturamento.VFS.VFS014_Page VFS014_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do VFS014")
    public void inicializeAExecuçãoDosCenáriosDoVFS014() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        VFS014_Page = new VFS014_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature VFS014")
    public void acessarOProgramaFeatureVFS014(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

    @Quando("acessar page {string} feature VFS014")
    public void acessarPageFeatureVFS014(String nomePage) {
        VFS014_Page.clicarBotaoTransicao();
        VFS014_Page.acessarPageFeatureVFS014(nomePage);
    }

    @E("informa data emissao inicial feature VFS014")
    public void informaDataEmissaoInicialFeatureVFS014() {
        VFS014_Page.informaDataEmissaoInicialFeatureVFS014();
    }

    @E("informa data emissao final feature VFS014")
    public void informaDataEmissaoFinalFeatureVFS014() {
        VFS014_Page.informaDataEmissaoFinalFeatureVFS014();
    }

    @E("seleciona status de envio feature VFS014")
    public void selecionaStatusDeEnvioFeatureVFS014() {
        VFS014_Page.selecionaStatusDeEnvioFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusEnvio"));
    }

    @E("informa usuario feature VFS014")
    public void informaUsuarioFeatureVFS014() {
        VFS014_Page.informaUsuarioFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "user"));
    }

    @E("informa empresa feature VFS014")
    public void informaEmpresaFeatureVFS014() {
        VFS014_Page.informaEmpresaFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }
}
