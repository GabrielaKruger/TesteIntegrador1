package steps;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.Empresa_Page;
import utils.MassaTeste;

public class Empresa_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private Empresa_Page empresaPage;
    private String tagMassa;

    @Before
    public void before(io.cucumber.java.Scenario scenario) {
        this.driver = DriverManager.getBrowserManager("chrome").getDriver();
        this.driver.manage().window().maximize();
        empresaPage = new Empresa_Page(driver);
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(scenario);
    }

    @Dado("acessar a tela de nova empresa")
    public void acessarTelaDeNovaEmpresa() {
        empresaPage.acessarTelaNovaEmpresa();
    }

    @Quando("preencher Razão Social feature Empresa")
    public void preencherRazaoSocialFeatureEmpresa() {
        empresaPage.preencherRazaoSocial(massaTeste.getMassaTestePorPathEChave(tagMassa, "razaoSocial"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Nome Fantasia feature Empresa")
    public void preencherNomeFantasiaFeatureEmpresa() {
        empresaPage.preencherNomeFantasia(massaTeste.getMassaTestePorPathEChave(tagMassa, "nomeFantasia"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher CNPJ feature Empresa")
    public void preencherCNPJFeatureEmpresa() {
        empresaPage.preencherCNPJ(massaTeste.getMassaTestePorPathEChave(tagMassa, "cnpj"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Inscrição Estadual feature Empresa")
    public void preencherInscricaoEstadualFeatureEmpresa() {
        empresaPage.preencherInscricaoEstadual(massaTeste.getMassaTestePorPathEChave(tagMassa, "inscricaoEstadual"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Endereço feature Empresa")
    public void preencherEnderecoFeatureEmpresa() {
        empresaPage.preencherEndereco(massaTeste.getMassaTestePorPathEChave(tagMassa, "endereco"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Cidade feature Empresa")
    public void preencherCidadeFeatureEmpresa() {
        empresaPage.preencherCidade(massaTeste.getMassaTestePorPathEChave(tagMassa, "cidade"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Estado feature Empresa")
    public void preencherEstadoFeatureEmpresa() {
        empresaPage.preencherEstado(massaTeste.getMassaTestePorPathEChave(tagMassa, "estado"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Telefone feature Empresa")
    public void preencherTelefoneFeatureEmpresa() {
        empresaPage.preencherTelefone(massaTeste.getMassaTestePorPathEChave(tagMassa, "telefone"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Email feature Empresa")
    public void preencherEmailFeatureEmpresa() {
        empresaPage.preencherEmail(massaTeste.getMassaTestePorPathEChave(tagMassa, "email"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("preencher Data de Fundação feature Empresa")
    public void preencherDataFundacaoFeatureEmpresa() {
        empresaPage.preencherDataFundacao(massaTeste.getMassaTestePorPathEChave(tagMassa, "dataFundacao"));
        empresaPage.esperarMilissegundos(1000);
    }

    @E("marcar checkbox Ativo feature Empresa")
    public void marcarCheckboxAtivoFeatureEmpresa(String ativo) {
        empresaPage.esperarMilissegundos(1000);
        empresaPage.marcarCheckboxAtivoFeatureEmpresa(ativo);
        empresaPage.esperarMilissegundos(1000);
    }

    @E("clicar no botão Salvar feature Empresa")
    public void clicarNoBotaoSalvar() {
        empresaPage.clicarBotaoSalvar();
    }

}