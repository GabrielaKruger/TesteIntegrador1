package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListarCargas_Page extends BasePage {
    WebDriver driver;

    // Ajuste os XPaths conforme o HTML real da sua página
    String inputOrigemXpath = "//*[@id='origem']";
    String inputDestinoXpath = "//*[@id='destino']";
    String inputProdutoXpath = "//*[@id='produto']";
    String inputEspecieXpath = "//*[@id='especie']";
    String btnBuscarXpath = "//*[@id='btnBuscar']";

    public ListarCargas_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void acessarTelaListarCargas() {
        driver.get("http://localhost:8080/cargas/listar");
        esperarMilissegundos(1000); // ajuste se necessário
    }

    public void preencherOrigem(String origem) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputOrigemXpath, 2);
        preencherElementoByXpath(inputOrigemXpath, origem);
        pressionarENTERByXpath(inputOrigemXpath);
        pressionaTabActions();
    }

    public void preencherDestino(String destino) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputDestinoXpath, 2);
        preencherElementoByXpath(inputDestinoXpath, destino);
        pressionarENTERByXpath(inputDestinoXpath);
        pressionaTabActions();
    }

    public void preencherProduto(String produto) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputProdutoXpath, 2);
        preencherElementoByXpath(inputProdutoXpath, produto);
        pressionarENTERByXpath(inputProdutoXpath);
        pressionaTabActions();
    }

    public void preencherEspecie(String especie) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEspecieXpath, 2);
        preencherElementoByXpath(inputEspecieXpath, especie);
        pressionarENTERByXpath(inputEspecieXpath);
        pressionaTabActions();
    }

    public void clicarBotaoBuscar() {
        esperarMilissegundos(500);
        driver.findElement(By.xpath(btnBuscarXpath)).click();
    }
}