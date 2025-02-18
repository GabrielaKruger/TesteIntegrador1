package pages.Faturamento.VFS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VFS014_Page extends BasePage {

    WebDriver driver;

    public VFS014_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    
    String BTN_TRANSICAO_ID = "button-basic";

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
}
