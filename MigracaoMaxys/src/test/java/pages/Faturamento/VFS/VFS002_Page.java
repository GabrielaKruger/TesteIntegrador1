package pages.Faturamento.VFS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.DataUtils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class VFS002_Page extends BasePage {

    WebDriver driver;

    public VFS002_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String inputDataEmissao = "//*[@id='movtofaturar-dtEmissao']/div/div/input";
    String inputCliforNotaFiscal = "//*[@id='movtofaturar-cdClifor']/div/input";

    public void esperarOProgramaCarregarFeatureVFS002() {
        String elementoDeCarregamentoXpath = "/html/body/app-root/div/section/lib-vfs002/div/mx-maxys-spinner/div/div";
        esperarAteQueSpinnerNaoEstejaVisivel(elementoDeCarregamentoXpath);
        esperarMilissegundos(1000); //espera necessaria
    }

    public void selecionarTipoDeVenda(String tipoVenda) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/modal-container/div[2]/div")));

        // Monta o XPath dinâmico baseado na label do radio button
        String xpathInput = "//mx-maxys-radio-group/mx-maxys-radio-button[label[contains(text(),'" + tipoVenda + "')]]/label/input";

        // Aguarda o elemento estar clicável e clica
        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathInput)));
        radioButton.click();

        //Clicar botao OK do modal
        WebElement botaoOk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gerautomatico-btnOk']/div/button/div")));
        botaoOk.click();

        // Sai do iframe
        driver.switchTo().defaultContent();
    }


    public void selecionaASerieDaNotaFiscalFeatureVFS002(String serieNotaFiscal) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='movtofaturar-cdSerienf']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(serieNotaFiscal);
    }

    public void informaDataEmissaoDaNotaFeatureVFS002() {
        limparElementoByXpath(inputDataEmissao);
        clicarElementoByXpath(inputDataEmissao);
        preencherElementoByXpath(inputDataEmissao, DataUtils.DataAtual());
    }

    public void preencheOCliforDaNotaFeatureVFS002(String cliforNotaFiscal) {
        limparElementoByXpath(inputCliforNotaFiscal);
        clicarElementoByXpath(inputCliforNotaFiscal);
        preencherElementoByXpath(inputCliforNotaFiscal, cliforNotaFiscal);
        esperarMilissegundos(2000);
        pressionaTabActions();
    }
}
