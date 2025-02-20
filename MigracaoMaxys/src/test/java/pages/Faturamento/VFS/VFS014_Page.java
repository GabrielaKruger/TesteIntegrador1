package pages.Faturamento.VFS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.DataUtils;

public class VFS014_Page extends BasePage {

    WebDriver driver;

    public VFS014_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String BTN_TRANSICAO_ID = "button-basic";

    String inputDataInicial = "//*[@id='controle-dtInicial']/div/div/input";
    String inputDataFinal = "//*[@id='controle-dtFinal']/div/div/input";
    String inputUsuario = "//*[@id='controle-cdUsuario']/div/input";
    String inputEmpresa = "//*[@id='controle-cdEmpresa']/div/input";


    public void clicarBotaoTransicao() {
        clicarElementoById(BTN_TRANSICAO_ID);
    }

    public void acessarPageFeatureVFS014(String nomePage) {
        clicarElementoByText(nomePage);
    }

    // Clica em um elemento localizado pelo texto.
    public void clicarElementoByText(String text) {
        String texto = "//*[text()='" + text + "']";
        driver.findElement(By.xpath(texto)).click();
    }

    public void informaDataEmissaoInicialFeatureVFS014() {
        limparElementoByXpath(inputDataInicial);
        clicarElementoById(inputDataInicial);
        preencherElementoByXpath(inputDataInicial, DataUtils.DataRetroativo(2));
    }

    public void informaDataEmissaoFinalFeatureVFS014() {
        limparElementoByXpath(inputDataFinal);
        clicarElementoById(inputDataFinal);
        preencherElementoByXpath(inputDataFinal, DataUtils.DataAtual());
    }

    public void selecionaStatusDeEnvioFeatureVFS014(String statusEnvio) {

        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-tpRegistro']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusEnvio);
    }

    public void informaUsuarioFeatureVFS014(String user) {
        limparElementoByXpath(inputUsuario);
        clicarElementoById(inputUsuario);
        preencherElementoByXpath(inputUsuario, user);
    }

    public void informaEmpresaFeatureVFS014(String empresa) {
        limparElementoByXpath(inputEmpresa);
        clicarElementoById(inputEmpresa);
        preencherElementoByXpath(inputEmpresa, empresa);
    }
}
