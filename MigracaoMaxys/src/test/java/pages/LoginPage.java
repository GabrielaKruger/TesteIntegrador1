package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Variaveis para Acesso
    String cdUsuario = "MAX";
    String nmUsuario = "ADMINISTRADOR DO SISTEMA - AUTO";

    public void loginNewMaxysNovo(String programa, String empresa) {

        // Acessar a página de login
        driver.get("https://auto.maxiconsystems.com.br/#/login");

        // Informa dados necessários: user e senha
        WebElement emailField = driver.findElement(By.xpath("//*[@id='username']"));
        emailField.sendKeys("MAX");

        WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
        passwordField.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='kc-login']"));
        pressionaTabActions();
        loginButton.click();

        // Seleciona a empresa que será utilizada no Login
        String selectEmpresaXpath = "//*[@id='empresa']";
        selecionarListaByXpathValor(selectEmpresaXpath, empresa);

        WebElement selecEmpresaButton = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-select-empresa/div/div/div/form/button"));
        selecEmpresaButton.click();

        // Aguarda até ser redirecionado para o Home
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("#maxys/home"));

        // Seleciona o programa pelo Menu
        WebElement inputPesquisar = driver.findElement(By.xpath("//*[@id='sidebar']/div[1]/div/div/input"));
        inputPesquisar.sendKeys(programa);
        inputPesquisar.sendKeys(Keys.ENTER);
        encontrarIframe();
    }

}