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


    //Opções de Ordem
    //*[@id="controle-lstOrdem"]/div/select/option[1]
    //*[@id="controle-lstOrdem"]/div/select/option[2]


    public CTI009_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void preencherEmpresaFeatureCTI009(String empresa) {
        encontrarEPreencherElementos(inputEmpresaXpath, inputFimXpath, empresa);
    }

}