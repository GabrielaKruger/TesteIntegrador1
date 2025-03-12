package steps.Navegador.ANV;

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
import pages.Navegador.ANV.ANV053_Page;
import pages.Navegador.ANV.ANV053_Page;
import utils.MassaTeste;

import java.time.Duration;

public class ANV053_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private pages.Navegador.ANV.ANV053_Page ANV053_Page;
    private BasePage basePage;
    private LoginPage loginPage;
    private String tagMassa;
    private String browser;
    Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("inicialize a execução dos cenários do ANV053")
    public void inicializeAExecuçãoDosCenáriosDoANV053() {
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(this.scenario);
        browser = DriverManager.getBrowserByScenario(this.scenario);
        this.driver = DriverManager.getBrowserManager(browser).getDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        ANV053_Page = new ANV053_Page(driver);
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @E("acessar o programa {string} pela empresa {string} feature ANV053")
    public void acessarOProgramaFeatureANV053(String programa, String empresa) {
        basePage.esperarMilissegundos(5000);//espera necessária
        loginPage.loginNewMaxysNovo(programa, empresa);
        basePage.esperarMilissegundos(5000);//espera necessária
    }

    @Quando("preencher Empresa feature ANV053")
    public void preencherEmpresaFeatureANV053() {
        ANV053_Page.preencherEmpresaFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Usuário feature ANV053")
    public void preencherUsuárioFeatureANV053() {
        ANV053_Page.preencherUsuárioFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "usuario"));
    }

    @E("preencher Programa feature ANV053")
    public void preencherProgramaFeatureANV053() {
        ANV053_Page.preencherProgramaFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @E("selecionar Tipo de Acesso feature ANV053")
    public void selecionarTipoDeAcessoFeatureANV053() {
        ANV053_Page.selecionarTipoDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoAcesso"));
    }

    @E("selecionar Exclusão feature ANV053")
    public void selecionarExclusãoFeatureANV053() {
        ANV053_Page.selecionarExclusãoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "exclusao"));
    }

    @E("selecionar Inclusão feature ANV053")
    public void selecionarInclusãoFeatureANV053() {
        ANV053_Page.selecionarInclusãoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "inclusao"));
    }

    @E("selecionar Alteração feature ANV053")
    public void selecionarAlteraçãoFeatureANV053() {
        ANV053_Page.selecionarAlteraçãoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "alteracao"));
    }

    @E("selecionar Emp.Logada feature ANV053")
    public void selecionarEmpLogadaFeatureANV053() {
        ANV053_Page.selecionarEmpLogadaFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empLogada"));
    }

    @E("selecionar Emp.Usuário feature ANV053")
    public void selecionarEmpUsuárioFeatureANV053() {
        ANV053_Page.selecionarEmpUsuárioFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empUsuario"));
    }

    @Então("clicar botão {string} para consultar feature ANV053")
    public void clicarBotãoParaConsultarFeatureANV053(String consultar) {
        ANV053_Page.clicarBotãoConsultarFeatureANV053(consultar);
    }

    @Quando("preencher Empresa Regras de Acesso feature ANV053")
    public void preencherEmpresaRegrasDeAcessoFeatureANV053() {
        ANV053_Page.preencherEmpresaRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa2"));
    }

    @E("preencher Usuário Regras de Acesso feature ANV053")
    public void preencherUsuárioRegrasDeAcessoFeatureANV053() {
        ANV053_Page.preencherUsuárioRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "usuario2"));
    }

    @E("preencher Programa Regras de Acesso feature ANV053")
    public void preencherProgramaRegrasDeAcessoANV053() {
        ANV053_Page.preencherProgramaRegrasDeAcessoANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa2"));
    }

    @E("selecionar Tipo de Acesso Regras de Acesso feature ANV053")
    public void selecionarTipoDeAcessoRegrasDeAcessoFeatureANV053() {
        ANV053_Page.selecionarTipoDeAcessoRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "tipoAcesso2"));
    }

    @E("selecionar Exclusão Regras de Acesso feature ANV053")
    public void selecionarExclusãoRegrasDeAcessoFeatureANV053() {
        ANV053_Page.selecionarExclusãoRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "exclusao2"));
    }

    @E("selecionar Inclusão Regras de Acesso feature ANV053")
    public void selecionarInclusãoRegrasDeAcessoFeatureANV053() {
        ANV053_Page.selecionarInclusãoRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "inclusao2"));
    }

    @E("selecionar Alteração {string} Regras de Acesso feature ANV053")
    public void selecionarAlteraçãoRegrasDeAcessoFeatureANV053(String alteracao2) {
        ANV053_Page.selecionarAlteraçãoRegrasDeAcessoFeatureANV053(alteracao2);
    }

    @E("selecionar Emp.Logada Regras de Acesso feature ANV053")
    public void selecionarEmpLogadaRegrasDeAcessoFeatureANV053() {
        ANV053_Page.selecionarEmpLogadaRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empLogada2"));
    }

    @E("selecionar Emp.Usuário Regras de Acesso feature ANV053")
    public void selecionarEmpUsuárioRegrasDeAcessoFeatureANV053() {
        ANV053_Page.selecionarEmpUsuárioRegrasDeAcessoFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empUsuario2"));
    }

    @Então("clicar botão ToolBar {string} feature ANV053")
    public void clicarBotãoToolBarFeatureANV053(String botao) {
        basePage.esperarMilissegundos(5000);// espera necessária
        basePage.clicarBotaoToolBar(botao);
        basePage.esperarMilissegundos(5000);// espera necessária
    }

    @Quando("apresentar a mensagem parcial {string} feature ANV053")
    public void apresentarAMensagemParcialFeatureANV053(String mensagem) {
        basePage.esperarMilissegundos(2000);//espera necessária
        basePage.validaMensagemLabelByContainsText(mensagem);
        basePage.esperarMilissegundos(2000);//espera necessária

    }

    @Então("clicar botão {string} do modal feature ANV053")
    public void clicarBotãoDoModalFeatureANV053(String acao) {
        basePage.esperarMilissegundos(3000); //espera necessária
        basePage.clicarBotaoDoModalAlert(acao);
        basePage.esperarMilissegundos(2000); //espera necessária
    }

    @Quando("selecionar Empresa cadastrada feature ANV053")
    public void selecionarEmpresaCadastradaFeatureANV053() {
        ANV053_Page.selecionarEmpresaCadastradaFeatureANV053();
    }

    @Então("validar mensagem pop up {string} feature ANV053")
    public void validarMensagemPopUpFeatureANV053(String validar) {
        basePage.esperarMilissegundos(2000); //espera necessária
        basePage.validarMensagemByToastContainer(validar);
        basePage.esperarMilissegundos(4000); //espera necessária
    }

    @Então("pressionar tecla {string} feature ANV053")
    public void pressionarTeclaFeatureANV053(String tecla) {
        basePage.esperarMilissegundos(2000);// espera necessária
        basePage.pressionarTecla(tecla);
    }

    //Negativo
    @Quando("clicar botão {string} para abrir abas feature ANV053")
    public void clicarBotãoParaAbrirAbasFeatureANV053(String abas) {
        ANV053_Page.clicarBotãoConsultarFeatureANV052(abas);
    }

    @E("clicar botão {string} para fechar feature ANV053")
    public void clicarBotãoParaFecharFeatureANV053(String fechar) {
        ANV053_Page.clicarBotãoParaFecharFeatureANV053(fechar);
    }

    @Então("clicar botão {string} para as verificar permissões feature ANV053")
    public void clicarBotãoParaAsVerificarPermissõesFeatureANV053(String permissoesUnificadas) {
        ANV053_Page.clicarBotãoParaAsVerificarPermissõesFeatureANV053(permissoesUnificadas);
    }

    @Quando("preencher Empresa Consulta de Permissões feature ANV053")
    public void preencherEmpresaConsultaDePermissõesFeatureANV053() {
        ANV053_Page.preencherEmpresaConsultaDePermissõesFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "empresa"));
    }

    @E("preencher Usuário Consulta de Permissões feature ANV053")
    public void preencherUsuárioConsultaDePermissõesFeatureANV053() {
        ANV053_Page.preencherUsuárioConsultaDePermissõesFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "usuario"));
    }

    @E("preencher Programa Consulta de Permissões feature ANV053")
    public void preencherProgramaConsultaDePermissõesFeatureANV053() {
        ANV053_Page.preencherProgramaConsultaDePermissõesFeatureANV053(massaTeste.getMassaTestePorPathEChave(tagMassa, "programa"));
    }

    @E("clicar botão {string} Consulta de Permissões ANV053")
    public void clicarBotãoConsultaDePermissõesANV053(String consultaPermissoes) {
        ANV053_Page.clicarBotãoConsultaDePermissõesANV053(consultaPermissoes);
    }

    @Então("clicar botão {string} Consulta ANV053")
    public void clicarBotãoFecharConsultaANV053(String fecharConsulta) {
        ANV053_Page.clicarBotãoFecharConsultaANV053(fecharConsulta);
    }

    @Então("clicar Programa Regras de Acesso feature ANV053")
    public void clicarProgramaRegrasDeAcessoFeatureANV053() {
        ANV053_Page.clicarProgramaRegrasDeAcessoFeatureANV053();
    }

    @Quando("apresenta o modal H4 {string} feature ANV053")
    public void apresentaOModalHFeatureANV(String title) {
        basePage.esperarMilissegundos(2000);// espera necessária
        basePage.validaModalByH4(title);
        basePage.esperarMilissegundos(2000);// espera necessária
    }

    @Quando("selecionar Programa não repetido feature ANV{int}")
    public void selecionarProgramaNãoRepetidoFeatureANV(int arg0) {
    }


    //   @After
    //   public void tearDown() {
    //       if (driver != null) {
    //           if (scenario != null && scenario.isFailed()) {
    //               final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    //               scenario.attach(screenshot, "image/png", "Screenshot");
    //           }
    //       }
    //       BasePage.tearDownCloseQuit(driver);
    //   }
}