package pages.Transporte.TAF;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

public class TAF001_Page extends BasePage {
    WebDriver driver;

    public TAF001_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }



    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpatFimDatas = "']/div/div/input";



}
