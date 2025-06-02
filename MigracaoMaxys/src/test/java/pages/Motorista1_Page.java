package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Motorista1_Page extends BasePage {
    WebDriver driver;

    // Strings dos XPaths para preencher (preencha após)

    String inputNomeCompletoXpath = "//*[@id='nome']";
    String inputEnderecoXpath = "//*[@id='endereco']";
    String inputCidadeXpath = "//*[@id='cidade']";
    String inputCNHXpath = "//*[@id='cnh']";
    String inputEstadoXpath = "//*[@id='estado']";
    String inputCPFXpath = "//*[@id='cpf']";
    String inputCelularXpath = "//*[@id='celular']";
    String inputPaisXpath = "//*[@id='pais']";;
    String inputNumeroXpath = "//*[@id='antt']";
//    String btnSalvarXpath = "/html/body/div/div/form/div/div[" + index + "]/button";
    String index = "11";
    String xpath = "/html/body/div/div/form/div/div[" + index + "]/button";

    public Motorista1_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void acessarTelaNovoMotorista1() {
        driver.get("http://localhost:8080/motorista/novo");
        esperarMilissegundos(1000); // pequena espera se necessário
    }

// ...restante do código...

    public void preencherNomeCompletoMotorista1(String nomeCompleto) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputNomeCompletoXpath, 2);
        preencherElementoByXpath(inputNomeCompletoXpath, nomeCompleto);
        pressionarENTERByXpath(inputNomeCompletoXpath);
        pressionaTabActions();
    }

    public void preencherEnderecoMotorista1(String endereco) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEnderecoXpath, 2);
        preencherElementoByXpath(inputEnderecoXpath, endereco);
        pressionarENTERByXpath(inputEnderecoXpath);
        pressionaTabActions();
    }

    public void preencherCidadeMotorista1(String cidade) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputCidadeXpath, 2);
        preencherElementoByXpath(inputCidadeXpath, cidade);
        pressionarENTERByXpath(inputCidadeXpath);
        pressionaTabActions();
    }

    public void preencherCNHMotorista1(String cnh) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputCNHXpath, 2);
        preencherElementoByXpath(inputCNHXpath, cnh);
        pressionarENTERByXpath(inputCNHXpath);
        pressionaTabActions();
    }

    public void preencherEstadoMotorista1(String estado) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEstadoXpath, 2);
        preencherElementoByXpath(inputEstadoXpath, estado);
        pressionarENTERByXpath(inputEstadoXpath);
        pressionaTabActions();
    }

    public void preencherCPFMotorista1(String cpf) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputCPFXpath, 2);
        preencherElementoByXpath(inputCPFXpath, cpf);
//        pressionarENTERByXpath(inputCPFXpath);
//        pressionaTabActions();
    }

    public void preencherCelularMotorista1(String celular) {
        esperarMilissegundos(1000);
        clicarElementoByXpathNVezes(inputCelularXpath, 2);
        preencherElementoByXpath(inputCelularXpath, celular);
//        pressionarENTERByXpath(inputCelularXpath);
        pressionaTabActions();
    }

    public void preencherPaisMotorista1(String pais) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputPaisXpath, 2);
        preencherElementoByXpath(inputPaisXpath, pais);
//        pressionarENTERByXpath(inputPaisXpath);
        pressionaTabActions();
    }

    public void preencherNumeroMotorista1(String numero) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputNumeroXpath, 2);
        preencherElementoByXpath(inputNumeroXpath, numero);
        pressionarENTERByXpath(inputNumeroXpath);
        pressionaTabActions();
    }

    public void clicarBotaoSalvar() {
        esperarMilissegundos(1000);
        String btnSalvarXpath = "/html/body/div/div/form/div/div[" + index + "]/button";
        WebElement botaoSalvar = driver.findElement(By.xpath(btnSalvarXpath));
        botaoSalvar.click();
    }
//
//    public void clicarBotaoFeatureMotorista(String botao) {
//        esperarMilissegundos(1000);
//        encontrarElementoByXpath(btnSalvarXpath);
//        clicarElementoByXpathNVezes(btnSalvarXpath, 1);
//    }
//
//    public void clicarBotaoPorTexto(String texto) {
//        String xpath = "//button[contains(text(),'" + texto + "')]";
//        WebElement botao = driver.findElement(By.xpath(xpath));
//        botao.click();
//    }
//
//    public void preencherExemplo(String exemplo) {
//        esperarMilissegundos(500);
//        clicarElementoByXpathNVezes(inputExemploXpath, 2);
//        preencherElementoByXpath(inputExemploXpath, exemplo);
//        pressionarENTERByXpath(inputExemploXpath);
//        pressionaTabActions();
    }
