package pages.Materiais.TCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class TCO024_Page extends BasePage {
    WebDriver driver;

    // Globais
    String inputXpathFim = "']/div/input";
    String selectXpathFim = "']/div/select";
    int primeiraLinhaEmBranco;

    public TCO024_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Inicialização da primeiraLinhaEmBranco
    public void setPrimeiraLinhaEmBranco() { primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);}

    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
    private void verificarOuSetarPrimeiraLinhaEmBranco() {
        if (primeiraLinhaEmBranco != 0) {setPrimeiraLinhaEmBranco();}
    }

}