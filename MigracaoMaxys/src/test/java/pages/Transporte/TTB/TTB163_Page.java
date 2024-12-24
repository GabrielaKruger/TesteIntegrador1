package pages.Transporte.TTB;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TTB163_Page extends BasePage {
    WebDriver driver;

    public TTB163_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Globais
    int primeiraLinhaEmBranco;

    //Strings Aprovação Comercial
    String inputObservacaoXpath = "//*[@id='processocaixa-dsObservacao']/div/textarea";
    String inputCreditoemcontaXpath = "//*[@id='processocaixa-btnCreditoemconta']/button/div";
    String inputFecharXpath = "//*[@id='recebchequepag-btnFechar']/button/div";

    public void marcarCheckboxEmpresaFeatureTTB163() {
        esperarMilissegundos(20000);//espera necessária
        verificarOuSetarPrimeiraLinhaEmBranco();

        String chkEmpresaXpath = "//*[@id='processocaixa-cbProcesso-" + primeiraLinhaEmBranco + "']/div/button";

        testMarcaDesmarcaCheckBox("marcar", chkEmpresaXpath);
    }

    public void preencherObservaçãoFeatureTTB163(String observacao) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputObservacaoXpath, 2);
        preencherElementoByXpath(inputObservacaoXpath, observacao);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarCréditoEmContaFeatureTTB163(String creditoemconta) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputCreditoemcontaXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarFecharFeatureTTB163(String fechar) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputFecharXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }
}
