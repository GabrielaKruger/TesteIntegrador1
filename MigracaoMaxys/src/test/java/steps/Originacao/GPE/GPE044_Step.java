package steps.Originacao.GPE;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.Originacao.GPE.GPE044_Page;
import pages.BasePage;
import pages.LoginPage;
import utils.MassaTeste;

import java.time.Duration;

public class GPE044_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private GPE044_Page GPE044_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do GPE044")
    public void inicializeAExecuçãoDosCenáriosDoGPE044() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        GPE044_Page = new GPE044_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} feature GPE044")
    public void acessarOProgramaFeatureGPE044(String programa) {
        loginPage.loginNewMaxysNovo(programa);
    }

    @Então("clicar botão ToolBar {string} feature GPE044")
    public void clicarBotãoToolBarFeatureGPE044(String botao) {
        basePage.clicarBotaoToolBar(botao);
    }

    @Quando("apresentar o modal H5 {string} feature GPE044")
    public void apresentarOModalH5FeatureGPE044(String title) {
        basePage.validaModalByH5(title);
    }

    @E("apresentar a mensagem {string} feature GPE044")
    public void apresentarAMensagemFeatureGPE044(String mensagem) {
        basePage.validaMensagemLabelByText(mensagem);
    }

    @E("apresentar a mensagem parcial {string} feature GPE044")
    public void apresentarAMensagemParcialFeatureGPE044(String mensagem) {
        basePage.validaMensagemLabelByContainsText(mensagem);
    }

    @Então("clicar botão {string} do modal feature GPE044")
    public void clicarBotãoDoModalFeatureGPE044(String acao) {
        basePage.clicarBotaoDoModal(acao);
    }

    @Quando("apresenta o modal H4 {string} feature GPE044")
    public void apresentaOModalHFeatureGPE044(String title) {
        basePage.validaModalByH4(title);
    }

    @E("apresenta o modal {string} feature GPE044")
    public void apresentaOModalFeatureGPE044(String title) {
        basePage.validaModalByH5(title);
    }

    @Então("pressionar tecla {string} feature GPE044")
    public void pressionarTeclaFeatureFCT(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Então("pressionar teclas shift + f6 para excluir GPE044")
    public void pressionarTeclasShiftF6ParaExcluirGPE044() {
        basePage.pressionarShiftF6();
    }

    @Quando("preencher Clifor feature GPE044")
    public void preencherCliforFeatureGPE044() {
        GPE044_Page.preencherCliforFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "clifor"));
    }

    @E("preencher Endereço feature GPE044")
    public void preencherEndereçoFeatureGPE044() {
        GPE044_Page.preencherEndereçoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "endereco"));
    }

    @E("preencher Empresa feature GPE044")
    public void preencherEmpresaFeatureGPE044() {
        GPE044_Page.preencherEmpresaFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Item feature GPE044")
    public void preencherItemFeatureGPE044() {
        GPE044_Page.preencherItemFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "item"));
    }

    @E("preencher Pré-Contrato feature GPE044")
    public void preencherPréContratoFeatureGPE044() {
        GPE044_Page.preencherPréContratoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "contrato"));
    }

    @E("preencher Data de Emissão feature GPE044")
    public void preencherDataDeEmissãoFeatureGPE044() {
        GPE044_Page.preencherDataDeEmissãoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataEmissaoInicio"));
    }

    @E("preencher Até feature GPE044")
    public void preencherAtéFeatureGPE044() {
        GPE044_Page.preencherAtéFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataEmissaoFim"));
    }

    @Então("realizar a Consulta feature GPE044")
    public void realizarAConsultaFeatureGPE044() {
        GPE044_Page.realizarAConsultaFeatureGPE044();
    }

    @Quando("selecionar no grid Pré-Contrato feature GPE044")
    public void selecionarNoGridPréContratoFeatureGPE044() {
        GPE044_Page.selecionarNoGridPréContratoFeatureGPE044();
    }

    @E("preencher Motivo feature GPE044")
    public void preencherMotivoFeatureGPE044() {
        GPE044_Page.preencherMotivoFeatureGPE044(massaTeste.getMassaTestePorPathEChave(tagMassa, "motivoBloqueio"));
    }

    @Então("realizar Liberação feature GPE044")
    public void realizarLiberaçãoFeatureGPE044() {
        GPE044_Page.realizarLiberaçãoFeatureGPE044();
    }

    @Então("realizar Recusa feature GPE044")
    public void realizarRecusaFeatureGPE044() {
        GPE044_Page.realizarRecusaFeatureGPE044();
    }

    @Então("realiza Consulta por {string} feature GPE044")
    public void realizaConsultaPorFeatureGPE044(String tecla) {
        basePage.pressionarTecla(tecla);
    }

    @Quando("consulta GPE000 feature GPE044")
    public void consultaGPE000FeatureGPE() {
        GPE044_Page.consultaGPE000FeatureGPE044();
    }

    @Então("sair da tela GPE000 feature GPE044")
    public void sairDaTelaGPE000FeatureGPE() {
        GPE044_Page.sairDaTelaGPE000FeatureGPE();
    }
}