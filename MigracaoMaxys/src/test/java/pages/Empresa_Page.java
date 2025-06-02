package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Empresa_Page extends BasePage {
    WebDriver driver;

    // Strings dos XPaths para preencher
    String inputRazaoSocialXpath = "//*[@id='razaoSocial']";
    String inputNomeFantasiaXpath = "//*[@id='nomeFantasia']";
    String inputCNPJXpath = "//*[@id='cnpj']";
    String inputInscricaoEstadualXpath = "//*[@id='inscricaoEstadual']";
    String inputEnderecoXpath = "//*[@id='endereco']";
    String inputCidadeXpath = "//*[@id='cidade']";
    String inputEstadoXpath = "//*[@id='estado']";
    String inputTelefoneXpath = "//*[@id='telefone']";
    String inputEmailXpath = "//*[@id='email']";
    String inputDataFundacaoXpath = "//*[@id='dataFundacao']";
    String inputAtivoXpath= "//*[@id='ativo']";
    String index = "11";
    String xpath = "/html/body/div/div/form/div/div[" + index + "]/button";

    public Empresa_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void acessarTelaNovaEmpresa() {
        esperarMilissegundos(1000);
        driver.get("http://localhost:8080/empresa/novo");
        esperarMilissegundos(1000); // pequena espera se necessário
    }

    public void preencherRazaoSocial(String razaoSocial) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputRazaoSocialXpath, 2);
        preencherElementoByXpath(inputRazaoSocialXpath, razaoSocial);
        pressionarENTERByXpath(inputRazaoSocialXpath);
        pressionaTabActions();
    }

    public void preencherNomeFantasia(String nomeFantasia) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputNomeFantasiaXpath, 2);
        preencherElementoByXpath(inputNomeFantasiaXpath, nomeFantasia);
        pressionarENTERByXpath(inputNomeFantasiaXpath);
        pressionaTabActions();
    }

    public void preencherCNPJ(String cnpj) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputCNPJXpath, 2);
        preencherElementoByXpath(inputCNPJXpath, cnpj);
        pressionarENTERByXpath(inputCNPJXpath);
        pressionaTabActions();
    }

    public void preencherInscricaoEstadual(String inscricaoEstadual) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputInscricaoEstadualXpath, 2);
        preencherElementoByXpath(inputInscricaoEstadualXpath, inscricaoEstadual);
        pressionarENTERByXpath(inputInscricaoEstadualXpath);
        pressionaTabActions();
    }

    public void preencherEndereco(String endereco) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEnderecoXpath, 2);
        preencherElementoByXpath(inputEnderecoXpath, endereco);
        pressionarENTERByXpath(inputEnderecoXpath);
        pressionaTabActions();
    }

    public void preencherCidade(String cidade) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputCidadeXpath, 2);
        preencherElementoByXpath(inputCidadeXpath, cidade);
        pressionarENTERByXpath(inputCidadeXpath);
        pressionaTabActions();
    }

    public void preencherEstado(String estado) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEstadoXpath, 2);
        preencherElementoByXpath(inputEstadoXpath, estado);
        pressionarENTERByXpath(inputEstadoXpath);
        pressionaTabActions();
    }

    public void preencherTelefone(String telefone) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputTelefoneXpath, 2);
        preencherElementoByXpath(inputTelefoneXpath, telefone);
        pressionarENTERByXpath(inputTelefoneXpath);
        pressionaTabActions();
    }

    public void preencherEmail(String email) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputEmailXpath, 2);
        preencherElementoByXpath(inputEmailXpath, email);
        pressionarENTERByXpath(inputEmailXpath);
        pressionaTabActions();
    }

    public void preencherDataFundacao(String dataFundacao) {
        esperarMilissegundos(500);
        clicarElementoByXpathNVezes(inputDataFundacaoXpath, 2);
        preencherElementoByXpath(inputDataFundacaoXpath, dataFundacao);
        pressionarENTERByXpath(inputDataFundacaoXpath);
        pressionaTabActions();
    }

    public void clicarBotaoSalvar() {
        esperarMilissegundos(1000);
        String btnSalvarXpath = "/html/body/div/div/form/div/div[" + index + "]/button";
        WebElement botaoSalvar = driver.findElement(By.xpath(btnSalvarXpath));
        botaoSalvar.click();
    }

    public void marcarCheckboxAtivoFeatureEmpresa(String ativo) {
        testMarcaDesmarcaCheckBox(inputAtivoXpath, ativo);
    }
}