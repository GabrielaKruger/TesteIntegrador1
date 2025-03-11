package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Variaveis para acesso com Token
    String cdEmpresa = "84";
    String cdUsuario = "MAX";
    String nmUsuario = "ADMINISTRADOR DO SISTEMA - AUTO";
    String urlDefault = "https://auto.maxiconsystems.com.br";



    public void loginNewMaxysNovo(String programa) {
        // Navegar para a página de login
        driver.get("https://auto.maxiconsystems.com.br/#/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Verificar se o elemento sidenavAccordion está presente (usuário já logado)
        boolean jaLogado;

        try {
            // Verifica se o menu lateral (sidenavAccordion) está visível
            jaLogado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidenavAccordion']"))) != null;
        } catch (TimeoutException e) {
            // Caso o elemento não seja encontrado, assume que o usuário não está logado
            jaLogado = false;
        }

        if (!jaLogado) {
            // Caso não esteja logado, realiza o processo de login

            //WebElement emailField = driver.findElement(By.xpath("//*[@id='email']")); // Ajuste dia 11/03 - Login Novo
            WebElement emailField = driver.findElement(By.xpath("//*[@id='username']"));
            emailField.sendKeys("MAX");


            WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
            passwordField.sendKeys("123456");

            //WebElement loginButton = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/form/div[3]/button"));
            WebElement loginButton = driver.findElement(By.xpath("//*[@id='kc-login']"));
            pressionaTabActions();
            esperarMilissegundos(2000); // espera necessária
            loginButton.click();

            /// Acrescentar aqui a seleção da empresa que será logada

            // Aguarda até ser redirecionado para o Home
            wait.until(ExpectedConditions.urlContains("/#/home"));
        } else {
            System.out.println("Usuário já está logado, pulando a etapa de login.");
        }

        // Verifica o programa e segue o fluxo original
        if (programa.equals("MKT027") || programa.equals("MKT002")) {
            System.out.println(callForm(programa));
            driver.get(callForm(programa));
        } else {
            String programUrl = "https://auto.maxiconsystems.com.br/#/" + programa.toLowerCase();
            driver.get(programUrl);
        }
        // Altera o contexto para o primeiro iframe encontrado, ou lança exceção se não houver iframes
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        if (!iframes.isEmpty()) {
            driver.switchTo().frame(iframes.get(0));
        } else {
            throw new RuntimeException("Nenhum iframe encontrado!");
        }
    }


    public String callForm(String programa) {
        String globalJson = String.format("{" + "\"cdUsuario\":\"%s\"," + "\"cdEmpresa\":%s," + "\"nmUsuario\":\"%s\"," + "\"dsPrograma\":\"%s\"," + "\"cdModulo\":\"%s\"," + "\"cdPrograma\":%d," + "\"stAuditoria\":\"S\"," + "\"tpAcesso\":\"M\"," + "\"cdModalidade\":null" + "}", cdUsuario, cdEmpresa, nmUsuario, programa.substring(0, 3) + Integer.parseInt(programa.substring(3)), programa.substring(0, 3), Integer.parseInt(programa.substring(3)));

        String text = cdEmpresa + "|" + programa.toUpperCase() + "|" + cdUsuario + "|" + nmUsuario + "|" + LocalDate.now().minusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() + "|" + globalJson + "|" + UUID.randomUUID().toString();
        text += '|';

        System.out.println(text);


        String globalTelaId = UUID.randomUUID().toString();

        // Criação da data de ontem
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date yesterday = cal.getTime();

        text = String.format("%s|%s|%s|%s|%d|%s|%s|", cdEmpresa, programa.toUpperCase(), cdUsuario, nmUsuario, yesterday.getTime(), globalJson, globalTelaId);

        int soma = text.length();
        for (int i = 0; i < text.trim().length(); i++) {
            soma += text.charAt(i) * 2;
        }
        int dv = soma % 11;
        text += "|" + dv;

        String token = Base64.getEncoder().encodeToString(Base64.getEncoder().encodeToString(text.getBytes()).getBytes());

        return urlDefault + "/" + programa.toLowerCase() + "/#/?token=" + token;
    }

}