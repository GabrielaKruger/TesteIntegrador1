package steps;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.Motorista_Page;
import utils.MassaTeste;

public class Motorista_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private Motorista_Page motoristaPage;
    private String tagMassa;

    @Before
    public void before(io.cucumber.java.Scenario scenario) {
        this.driver = DriverManager.getBrowserManager("chrome").getDriver();
        this.driver.manage().window().maximize();
        motoristaPage = new Motorista_Page(driver);
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(scenario);
    }

    @Dado("acessar a tela de novo motorista")
    public void acessarTelaDeNovoMotorista() {
        motoristaPage.acessarTelaNovoMotorista();
    }

    @Quando("preencher Nome Completo feature Motorista")
    public void preencherNomeCompletoFeatureMotorista() {
        motoristaPage.preencherNomeCompleto(massaTeste.getMassaTestePorPathEChave(tagMassa, "nomeCompleto"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Endereço feature Motorista")
    public void preencherEnderecoFeatureMotorista() {
        motoristaPage.preencherEndereco(massaTeste.getMassaTestePorPathEChave(tagMassa, "endereco"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Cidade feature Motorista")
    public void preencherCidadeFeatureMotorista() {
        motoristaPage.preencherCidade(massaTeste.getMassaTestePorPathEChave(tagMassa, "cidade"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher CNH feature Motorista")
    public void preencherCNHFeatureMotorista() {
        motoristaPage.preencherCNH(massaTeste.getMassaTestePorPathEChave(tagMassa, "cnh"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Estado feature Motorista")
    public void preencherEstadoFeatureMotorista() {
        motoristaPage.preencherEstado(massaTeste.getMassaTestePorPathEChave(tagMassa, "estado"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher CPF feature Motorista")
    public void preencherCPFFeatureMotorista() {
        motoristaPage.esperarMilissegundos(2000);
        motoristaPage.preencherCPF(massaTeste.getMassaTestePorPathEChave(tagMassa, "cpf"));
        motoristaPage.esperarMilissegundos(2000);
    }

    @E("preencher Celular feature Motorista")
    public void preencherCelularFeatureMotorista() {
        motoristaPage.preencherCelular(massaTeste.getMassaTestePorPathEChave(tagMassa, "celular"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher País feature Motorista")
    public void preencherPaisFeatureMotorista() {
        motoristaPage.preencherPais(massaTeste.getMassaTestePorPathEChave(tagMassa, "pais"));
        motoristaPage.esperarMilissegundos(1000);
    }

    @E("preencher Número feature Motorista")
    public void preencherNumeroFeatureMotorista() {
        motoristaPage.preencherNumero(massaTeste.getMassaTestePorPathEChave(tagMassa, "numero"));
        motoristaPage.esperarMilissegundos(500);
    }

    @E("clicar no botão Salvar feature Motorista")
    public void clicarNoBotaoSalvar() {
        motoristaPage.clicarBotaoSalvar();
    }

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