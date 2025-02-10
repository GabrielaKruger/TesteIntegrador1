package pages.Faturamento.VFS;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VFS015_Page extends BasePage {
    WebDriver driver;

    //Strings Select
    String selectFaturamentoXpath= "//*[@id='controle-tpFates']/div/select";

    //Strings Input
    String inputLancamentoXpath= "//*[@id='controle-nrLancamento']/div/input";
    String inputNotaFiscalXpath= "//*[@id='controle-nrNfempr']/div/input";
    String inputSerieXpath= "//*[@id='controle-cdSeriempr']/div/input";
    String inputNfFornecedorXpath= "//*[@id='controle-nrNffornec']/div/input";
    String inputDtEmissaoXpath= "//*[@id='controle-dtEmissao']/div/div/input";
    String inputEmpresaXpath= "//*[@id='controle-cdEmpresa']/div/input";
    String inputCliforXpath= "//*[@id='controle-cdClifor']/div/input";
    String inputContratoGraoXpath= "//*[@id='controle-nrContrato']/div/input";

    //Strings botão
    String btnConsultaXpath= "//*[@id='controle-btnConsulta']/div/button/div";


    public VFS015_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selecionarFaturamentoFeatureVFS015(String faturamento) {
        preencherCampoPorXpathFeatureVFS015(selectFaturamentoXpath, faturamento);
    }

    public void preencherLançamentoFeatureVFS015(String lancamento) {
        preencherCampoPorXpathFeatureVFS015(inputLancamentoXpath, lancamento);
    }

    public void preencherNotaFiscalFeatureVFS015(String notaFiscal) {
        preencherCampoPorXpathFeatureVFS015(inputNotaFiscalXpath, notaFiscal);
    }

    public void preencherSérieFeatureVFS015(String serie) {
        preencherCampoPorXpathFeatureVFS015(inputSerieXpath, serie);
    }

    public void preencherNFFornecedorFeatureVFS015(String nfFornecedor) {
        preencherCampoPorXpathFeatureVFS015(inputNfFornecedorXpath,nfFornecedor);
    }

    public void preencherDataEmissãoFeatureVFS015(String dtEmissao) {
        preencherCampoPorXpathFeatureVFS015(inputDtEmissaoXpath, dtEmissao);
    }

    public void preencherEmpresaFeatureVFS015(String empresa) {
        preencherCampoPorXpathFeatureVFS015(inputEmpresaXpath, empresa);
    }

    public void preencherCliforFeatureVFS015(String clifor) {
        preencherCampoPorXpathFeatureVFS015(inputCliforXpath, clifor);
    }

    public void preencherContratoGrãoFeatureVFS015(String contratoGrao) {
        preencherCampoPorXpathFeatureVFS015(inputContratoGraoXpath, contratoGrao);
    }

    public void clicarBotãoParaConsultarFeatureVFS015(String consultar) {
        clicarElementoByXpathNVezesFeatureVFS015(btnConsultaXpath, 1);
    }

    public void preencherCampoPorXpathFeatureVFS015(String campoXpath, String valor) { //método complementar
        esperarMilissegundos(4000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 2);
        preencherElementoByXpath(campoXpath, valor);
        pressionarENTERByXpath(campoXpath);
        //pressionaTabActions();
        esperarMilissegundos(4000);//espera necessária
    }

    public void clicarElementoByXpathNVezesFeatureVFS015(String campoXpath, int vezes){ //método complementar
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 1);
        esperarMilissegundos(3000);//espera necessária
    }
}
