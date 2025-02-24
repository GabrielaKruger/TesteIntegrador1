package steps.Faturamento.VFS;

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
        basePage.esperarMilissegundos(12000);
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

    @E("informa empresa feature VFS014")
    public void informaEmpresaFeatureVFS014() {
        VFS014_Page.informaEmpresaFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("informa usuario feature VFS014")
    public void informaUsuarioFeatureVFS014() {
        VFS014_Page.informaUsuarioFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "user"));
    }


    @E("seleciona status da impressao feature VFS014")
    public void selecionaStatusDaImpressaoFeatureVFS014() {
        VFS014_Page.selecionaStatusDaImpressaoFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "stDaImpressao"));
    }

    @E("seleciona status contigencia feature VFS014")
    public void selecionaStatusContigenciaFeatureVFS014() {
        VFS014_Page.selecionaStatusContigenciaFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusContingencia"));
    }

    @E("seleciona status recolhimento funrural feature VFS014")
    public void selecionaStatusRecolhimentoFunruralFeatureVFS014() {
        VFS014_Page.selecionaStatusRecolhimentoFunruralFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusRecolhimentoFunrural"));
    }

    @E("seleciona tipo faturamento feature VFS014")
    public void selecionaTipoFaturamentoFeatureVFS014() {
        VFS014_Page.selecionaTipoFaturamentoFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusTpFaturamento"));
    }

    @E("seleciona tipo impressao feature VFS014")
    public void selecionaTipoImpressaoFeatureVFS014() {
        VFS014_Page.selecionaTipoImpressaoFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusImpressao"));
    }

    @E("clica em consultar feature VFS014")
    public void clicaEmConsultarFeatureVFS014() {
        VFS014_Page.clicaEmConsultarFeatureVFS014();
    }

    @Então("validar se possui notas fiscais no grid feature VFS014")
    public void validarSePossuiNotasFiscaisNoGridFeatureVFS014() {
        VFS014_Page.validarSePossuiNotasFiscaisNoGridFeatureVFS014();
    }

    @E("seleciona status de inutilizacão feature VFS014")
    public void selecionaStatusDeInutilizacaoFeatureVFS014() {
        VFS014_Page.selecionaStatusDeInutilizacaoFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "statusInutilizacao"));
    }

    @E("informa serie nota feature VFS014")
    public void selecionaSerieNotaFeatureVFS014() {
        VFS014_Page.informaSerieNotaFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "serieNota"));
    }

    @E("informa data inicial feature VFS014")
    public void informaDataInicialFeatureVFS014() {
        VFS014_Page.informaDataInicialFeatureVFS014();
    }

    @E("informa data final feature VFS014")
    public void informaDataFinalFeatureVFS014() {
        VFS014_Page.informaDataFinalFeatureVFS014();
    }

    @E("clica em consultar inutilizacao feature VFS014")
    public void clicaEmConsultarInutilizacaoFeatureVFS014() {
        VFS014_Page.clicaEmConsultarInutilizacaoFeatureVFS014();
    }

    @E("informa periodo data inicial feature VFS014")
    public void informaPeriodoDataInicialFeatureVFS014() {
        VFS014_Page.informaPeriodoDataInicialFeatureVFS014();
    }

    @E("informa periodo data final feature VFS014")
    public void informaPeriodoDataFinalFeatureVFS014() {
        VFS014_Page.informaPeriodoDataFinalFeatureVFS014();
    }

    @E("informa empresa na page informacoes feature VFS014")
    public void informaEmpresaNaPageInformacoesFeatureVFS014() {
        VFS014_Page.informaEmpresaNaPageInformacoesFeatureVFS014(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("clica em computar estatistica feature VFS014")
    public void clicaEmComputarEstatisticaFeatureVFS014() {
        VFS014_Page.clicaEmComputarEstatisticaFeatureVFS014();
    }



//    @After
//    public void tearDown() {
//        if (driver != null) {
//            if (scenario != null && scenario.isFailed()) {
//                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", "Screenshot");
//            }
//        }
//        BasePage.tearDownCloseQuit(driver);
//    }


}
