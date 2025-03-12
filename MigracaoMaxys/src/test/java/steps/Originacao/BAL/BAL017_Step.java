package steps.Originacao.BAL;

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
import pages.LoginPage;
import pages.Originacao.BAL.BAL017_Page;
import utils.MassaTeste;

import java.time.Duration;

public class BAL017_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.BAL.BAL017_Page BAL017_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do BAL017")
    public void inicializeAExecuçãoDosCenáriosDoBAL017() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        BAL017_Page = new BAL017_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature BAL017")
    public void acessarOProgramaFeatureBAL017(String programa, String empresa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @Quando("preencher Empresa feature BAL017")
    public void preencherEmpresaFeatureBAL017() {
        BAL017_Page.preencherEmpresaFeatureBAL017(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Depósito feature BAL017")
    public void preencherDepósitoFeatureBAL017() {
        BAL017_Page.preencherDepósitoFeatureBAL017(massaTeste.getMassaTestePorPathEChave(tagMassa, "deposito"));
    }

    @E("selecionar status {string} feature BAL017")
    public void selecionarStatusFeatureBAL017(String opcao) {
        BAL017_Page.selecionarStatusFeatureBAL017(opcao);
    }

    @E("selecionar Faturamento {string} feature BAL017")
    public void selecionarFaturamentoFeatureBAL017(String opcao) {
        BAL017_Page.selecionarFaturamentoFeatureBAL017(opcao);
    }

    @E("preencher Período inicial feature BAL017")
    public void preencherPeríodoInicialFeatureBAL017() {
        BAL017_Page.preencherPeríodoInicialFeatureBAL017(massaTeste.getMassaTestePorPathEChave(tagMassa, "periodoInicial"));
    }

    @E("preencher Período final feature BAL017")
    public void preencherPeríodoFinalFeatureBAL017() {
        BAL017_Page.preencherPeríodoFinalFeatureBAL017(massaTeste.getMassaTestePorPathEChave(tagMassa, "periodoFinal"));
    }

    @Então("clicar botão para autorizar {string} feature BAL017")
    public void clicarBotãoAutorizarFeatureBAL017(String botao) {
        BAL017_Page.clicarBotãoAutorizarFeatureBAL017(botao);
    }

    @Então("clicar botão de recusa {string} feature BAL017")
    public void clicarBotãoDeRecusaFeatureBAL017(String botao2) {
        BAL017_Page.clicarBotãoRecusarFeatureBAL017(botao2);
    }

    @Quando("apresentar o modal H5 {string} feature BAL017")
    public void apresentarOModalHFeatureBAL(String title) {
        basePage.esperarMilissegundos(1000);//espera necessária
        basePage.validaModalByH5(title);
        basePage.esperarMilissegundos(1000);//espera necessária
    }

    @E("apresentar a mensagem parcial do botão autorizar {string} feature BAL017")
    public void apresentarAMensagemParcialAutorizadaFeatureBAL017(String mensagem1) {
        basePage.esperarMilissegundos(1000); //espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem1);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @E("apresentar a mensagem parcial da recusa {string} feature BAL017")
    public void apresentarAMensagemParcialRecusadaFeatureBAL017(String mensagem2) {
        basePage.esperarMilissegundos(1000); //espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem2);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @Então("clicar botão {string} do modal feature BAL017")
    public void clicarBotãoDoModalFeatureBAL017(String acao) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.clicarBotaoDoModal(acao);
        basePage.esperarMilissegundos(1000); //espera necessária
    }

    @Então("clicar botão para filtrar {string} BAL017")
    public void clicarBotãoParaFiltrarBAL017(String filtrar) {
        BAL017_Page.clicarBotãoParaFiltrarBAL017(filtrar);
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

