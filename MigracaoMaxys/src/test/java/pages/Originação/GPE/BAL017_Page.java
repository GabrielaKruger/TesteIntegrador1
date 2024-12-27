package pages.Originação.GPE;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BAL017_Page extends BasePage {
    WebDriver driver;

    String inputEmpresaXpath= "//*[@id='filtro-cdEmpresa']/div/input";

    public BAL017_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void preencherEmpresaFeatureBAL017(String empresa) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputEmpresaXpath, 2);
        preencherElementoByXpath(inputEmpresaXpath, empresa);
        esperarMilissegundos(2000);//espera necessária
    }
}
