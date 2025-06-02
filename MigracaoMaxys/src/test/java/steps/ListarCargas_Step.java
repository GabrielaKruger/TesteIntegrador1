package steps;

import driver.driverManager.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import pages.ListarCargas_Page;
import utils.MassaTeste;

public class ListarCargas_Step {

    private WebDriver driver;
    private MassaTeste massaTeste;
    private ListarCargas_Page listarCargasPage;
    private String tagMassa;

    @Before
    public void before(io.cucumber.java.Scenario scenario) {
        this.driver = DriverManager.getDriver();
        this.driver.manage().window().maximize();
        listarCargasPage = new ListarCargas_Page(driver);
        massaTeste = new MassaTeste();
        tagMassa = massaTeste.getPathByScenario(scenario);
    }

    @After
    public void after() {
        DriverManager.quitDriver();
    }

    @Dado("acessar a tela de listagem de cargas")
    public void acessarTelaDeListagemDeCargas() {
        listarCargasPage.acessarTelaListarCargas();
    }

    @Quando("preencher Origem na feature ListarCargas")
    public void preencherOrigem() {
        listarCargasPage.preencherOrigem(massaTeste.getMassaTestePorPathEChave(tagMassa, "origem"));
    }

    @E("preencher Destino na feature ListarCargas")
    public void preencherDestino() {
        listarCargasPage.preencherDestino(massaTeste.getMassaTestePorPathEChave(tagMassa, "destino"));
    }

    @E("preencher Produto na feature ListarCargas")
    public void preencherProduto() {
        listarCargasPage.preencherProduto(massaTeste.getMassaTestePorPathEChave(tagMassa, "produto"));
    }

    @E("preencher Espécie na feature ListarCargas")
    public void preencherEspecie() {
        listarCargasPage.preencherEspecie(massaTeste.getMassaTestePorPathEChave(tagMassa, "especie"));
    }

    @E("clicar no botão Buscar na feature ListarCargas")
    public void clicarNoBotaoBuscar() {
        listarCargasPage.clicarBotaoBuscar();
    }
}