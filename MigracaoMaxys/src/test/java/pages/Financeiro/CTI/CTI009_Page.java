package pages.Financeiro.CTI;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

public class CTI009_Page extends BasePage {
    WebDriver driver;


    // Strings Consulta
    String inputEmpresaXpath = "//*[@id='controle-cdEmpresa";
    String selectOrdemXpath = "//*[@id='controle-lstOrdem";
    String btnConsultaXpath = "//*[@id='controle-btnConsultar";

    // Strings Alteração
    String radioValiFinanceiraXpath = "//*[@id='ngx-radio-1']";
    String radioValiContabilXpath = "//*[@id='ngx-radio-2']";
    String inoputEmpresaAltXpath = "//*[@id='alteracao-cdEmpresa";
    String inputMesAltXpath = "//*[@id='alteracao-dtAnomes";
    String btnAlteracaoXpath = "//*[@id='alteracao-btnAlterar";


    // Strings Genéricas
    String inputFimXpath = "']/div/input";
    String selectFimXpath = "']/div/select";
    String butttonFimXpath = "']/div/button/div";
    String dataFimXpath = "']/div/div/input";


    public CTI009_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void preencherEmpresaFeatureCTI009(String empresa) {
        encontrarEPreencherElementos(inputEmpresaXpath, inputFimXpath, empresa);
    }

    public void selecionarOrdemSendoFeatureCTI009(String ordem) {
        selecionarListaGridByXpathText(selectOrdemXpath + selectFimXpath, ordem);
    }

    public void realizarAConsultaFeatureCTI009() {
        clicarElementoByXpath(btnConsultaXpath + butttonFimXpath);
    }

    public void selecionarVariaçãoFinanceiraNaFeatureCTI009() {
        marcarRadioButon(radioValiFinanceiraXpath);
    }

    public void selecionarVariaçãoContabilNaFeatureCTI009() {
        marcarRadioButon(radioValiContabilXpath);
    }

    public void preencherAEmpresaFeatureCTI009(String empresa) {
        encontrarEPreencherElementos(inoputEmpresaAltXpath, inputFimXpath, empresa);
    }

    public void preencherMêsFeatureCTI009(String mes) {
        encontrarEPreencherElementos(inputMesAltXpath, dataFimXpath, mes);
    }

    public void realizarOFechamentoReaberturaFinanceiroFatureCTI009() {
        clicarElementoByXpath(btnAlteracaoXpath + butttonFimXpath);
    }

    public void removerMesInformadoFeatureCTI009() {
        limparCampoDeTextoPorXpath(inputMesAltXpath + dataFimXpath);
    }
}