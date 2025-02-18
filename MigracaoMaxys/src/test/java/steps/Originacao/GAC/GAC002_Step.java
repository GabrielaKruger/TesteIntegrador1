package steps.Originacao.GAC;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.Originacao.GAC.GAC002_Page;
import utils.MassaTeste;

import java.time.Duration;

public class GAC002_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Originacao.GAC.GAC002_Page GAC002_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;


    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do GAC002")
    public void inicializeAExecuçãoDosCenáriosDoGAC002() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        GAC002_Page = new GAC002_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature GAC002")
    public void acessarOProgramaFeatureGAC002(String programa) {
        basePage.esperarMilissegundos(5000);// espera necessária
        loginPage.loginNewMaxysNovo(programa);
    }

    @Quando("preencher Empresa feature GAC002")
    public void preencherEmpresaFeatureGAC002() {
        GAC002_Page.preencherEmpresaFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Produto feature GAC002")
    public void preencherProdutoFeatureGAC002() {
        GAC002_Page.preencherProdutoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto"));
    }

    @E("preencher Data Inicial feature GAC002")
    public void preencherDataInicialFeatureGAC002() {
        GAC002_Page.preencherDataInicialFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtInicial"));
    }

    @E("preencher Data Final feature GAC002")
    public void preencherDataFinalFeatureGAC002() {
        GAC002_Page.preencherDataFinalFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "dtFinal"));
    }

    @Quando("preencher Empresa Preço de Grão feature GAC002")
    public void preencherEmpresaPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.preencherEmpresaPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresaPreco"));
    }

    @E("preencher Item Preço de Grão feature GAC002")
    public void preencherItemPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.preencherItemPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "itemPreco"));
    }

    @E("preencher Unitário Preço de Grão feature GAC002")
    public void preencherUnitárioPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.preencherUnitárioPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "unitario"));
    }

    @E("selecionar Tipo de Cálculo Preço de Grão feature GAC002")
    public void selecionarTipoDeCálculoPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.selecionarTipoDeCálculoPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoCalculo"));
    }

    @E("selecionar Tipo de Preço Preço de Grão feature GAC002")
    public void selecionarTipoDePreçoPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.selecionarTipoDePreçoPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoPreco"));
    }

    @E("preencher Acima Preço de Grão feature GAC002")
    public void preencherAcimaPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.preencherAcimaPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "acima"));
    }

    @E("preencher Abaixo Preço de Grão feature GAC002")
    public void preencherAbaixoPreçoDeGrãoFeatureGAC002() {
        GAC002_Page.preencherAbaixoPreçoDeGrãoFeatureGAC002(massaTeste.getMassaTestePorPathEChave(tagMassa, "abaixo"));
    }

    @Quando("clicar botão ToolBar {string} feature GAC002")
    public void clicarBotãoToolBarFeatureGAC002(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @Então("validar mensagem pop up {string} feature GAC002")
    public void validarMensagemPopUpFeatureGAC002(String validar) {
        basePage.validarMensagemByToastContainer(validar);
    }

    @E("apresenta o modal H4 {string} feature GAC002")
    public void apresentaOModalHFeatureGAC002(String title) {
        basePage.esperarMilissegundos(2000);// espera necessária
        basePage.validaModalByH4(title);
        basePage.esperarMilissegundos(2000);// espera necessária
    }

    @Então("clicar botão {string} do modal feature GAC002")
    public void clicarBotãoDoModalFeatureGAC002(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("pressionar tecla {string} feature GAC002")
    public void pressionarTeclaFeatureGAC002(String tecla) {
        basePage.esperarMilissegundos(2000);
        basePage.pressionarTecla(tecla);
    }

    @Quando("pressionar teclas shift + f6 para excluir GAC002")
    public void pressionarTeclasShiftFParaExcluirGAC002() {
        basePage.esperarMilissegundos(2000);
        basePage.pressionarShiftF6();
    }

    @Quando("preencher Empresa Limite feature GAC{int}")
    public void preencherEmpresaLimiteFeatureGAC(int arg0) {
        
    }

    @E("preencher Item Limite feature GAC{int}")
    public void preencherItemLimiteFeatureGAC(int arg0) {
        
    }

    @E("preencher Condt. Pagamento Limite feature GAC{int}")
    public void preencherCondtPagamentoLimiteFeatureGAC(int arg0) {
        
    }

    @Então("selecionar Tipo Pessoa Limite feature GAC{int}")
    public void selecionarTipoPessoaLimiteFeatureGAC(int arg0) {
        
    }

    @Quando("preencher Empresa Limites Fixação feature GAC{int}")
    public void preencherEmpresaLimitesFixaçãoFeatureGAC(int arg0) {
        
    }

    @E("preencher Item Limites Fixação feature GAC{int}")
    public void preencherItemLimitesFixaçãoFeatureGAC(int arg0) {
        
    }

    @E("preencher Condição de Pagemento Limites Fixação feature GAC{int}")
    public void preencherCondiçãoDePagementoLimitesFixaçãoFeatureGAC(int arg0) {
        
    }

    @E("preencher Peso mínimo Limites Fixação feature GAC{int}")
    public void preencherPesoMínimoLimitesFixaçãoFeatureGAC(int arg0) {
        
    }

    @E("preencher Peso máximo Limites Fixação feature GAC{int}")
    public void preencherPesoMáximoLimitesFixaçãoFeatureGAC(int arg0) {
        
    }

    @E("preencher Valor mínimo feature GAC{int}")
    public void preencherValorMínimoFeatureGAC(int arg0) {
        
    }

    @E("preencher Valor máximo feature GAC{int}")
    public void preencherValorMáximoFeatureGAC(int arg0) {
    }


    // @After
   // public void tearDown() {
   //     if (driver != null) {
   //         if (scenario != null && scenario.isFailed()) {
   //             final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
   //             scenario.attach(screenshot, "image/png", "Screenshot");
   //         }
   //     }
   //     BasePage.tearDownCloseQuit(driver);
    //}

}
