package steps;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.Motorista1_Page;
import utils.MassaTeste;

public class Motorista1_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private Motorista1_Page motoristaPage;
    private String tagMassa;

    @Before
    public void before(io.cucumber.java.Scenario scenario) {
        this.driver = DriverManager.getBrowserManager("chrome").getDriver();
        this.driver.manage().window().maximize();
        motoristaPage = new Motorista1_Page(driver);
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(scenario);
    }

    @Dado("acessar a tela de novo Motorista1")
    public void acessarTelaDeNovoMotorista1() {
        motoristaPage.acessarTelaNovoMotorista1();
    }

    @Quando("preencher Nome Completo feature Motorista1")
    public void preencherNomeCompletoFeatureMotorista1() {
        motoristaPage.preencherNomeCompletoMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "nomeCompleto"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Endereço feature Motorista1")
    public void preencherEnderecoFeatureMotorista1() {
        motoristaPage.preencherEnderecoMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "endereco"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Cidade feature Motorista1")
    public void preencherCidadeFeatureMotorista1() {
        motoristaPage.preencherCidadeMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "cidade"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher CNH feature Motorista1")
    public void preencherCNHFeatureMotorista1() {
        motoristaPage.preencherCNHMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "cnh"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Estado feature Motorista1")
    public void preencherEstadoFeatureMotorista1() {
        motoristaPage.preencherEstadoMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "estado"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher CPF feature Motorista1")
    public void preencherCPFFeatureMotorista1() {
        motoristaPage.esperarMilissegundos(2000);
        motoristaPage.preencherCPFMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "cpf"));
        motoristaPage.esperarMilissegundos(2000);
    }

    @E("preencher Celular feature Motorista1")
    public void preencherCelularFeatureMotorista1() {
        motoristaPage.preencherCelularMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "celular"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher País feature Motorista1")
    public void preencherPaisFeatureMotorista1() {
        motoristaPage.preencherPaisMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "pais"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Número feature Motorista1")
    public void preencherNumeroFeatureMotorista1() {
        motoristaPage.preencherNumeroMotorista1(massaTeste.getMassaTestePorPathEChave(tagMassa, "numero"));
        motoristaPage.esperarMilissegundos(500);
    }

//    @E("clicar no botão Salvar feature Motorista")
//    public void clicarNoBotaoSalvar() {
//        motoristaPage.clicarBotaoSalvar();
//    }

//    @E("clicar botao {string} feature Motorista")
//    public void clicarBotaoFeatureMotorista(String botao) {
//        motoristaPage.clicarBotaoFeatureMotorista(botao);
//    }

//    @E("clico no botão Salvar")
//    public void clicoNoBotaoSalvar() {
//        motoristaPage.clicarBotaoFeatureMotorista();
//    }
//
//    @E("preencher Exemplo feature Motorista")
//    public void preencherExemploFeatureMotorista() {
//        motoristaPage.preencherExemplo(massaTeste.getMassaTestePorPathEChave(tagMassa, "exemplo"));
//        motoristaPage.esperarMilissegundos(500);
//    }
}
