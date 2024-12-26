package pages.Originação.GPE;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class GPE044_Page extends BasePage {
    WebDriver driver;

    // Strings Consulta
    String inputCliforXpath = "//*[@id='filtro-cdClifor";
    String inputEnderecoXpath = "//*[@id='filtro-cdEndereco";
    String inputEmpresaXpath = "//*[@id='filtro-cdEmpresa";
    String inputItemXpath = "//*[@id='filtro-cdItem";
    String inputPreContratoXpath = "//*[@id='filtro-nrPrecontrato";
    String inputDataEmissaoInicioXapth = "//*[@id='filtro-dtInicial";
    String inputDataEmissaoFimXpath = "//*[@id='filtro-dtFinal";
    String btnConsultarXpath = "//*[@id='filtro-btnConsulta']/button";

    // Pré-Contratos Bloqueados/Liberados/Recusados
    String inputMotivoXpath = "//*[@id='precontrato-dsMotivo";
    String btnLiberarXpath = "//*[@id='precontrato-btnLiberar']/button/div";
    String btnRecusarXpath = "//*[@id='precontrato-btnRecusar']/button/div";
    String btnConsultarGPE000Xpath = "//*[@id='precontrato-btnConsultar']/button/div";


    // String Globais
    int primeiraLinhaEmBranco;
    String codigoSimulated;
    String descricaoFaker;
    String xPathColunaTabelaCodigoFim = "']/div/input";
    String xPathColunaTabelaDataCodigoFim = "']/div/div/input";
    String btnSairXpath = "//*[@id='btn-close-templateModalCanDetalhe']";


    public GPE044_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCliforFeatureGPE044(String clifor) {
        preencherCampoPorXpathFeatureGPE044(inputCliforXpath, xPathColunaTabelaCodigoFim, clifor);
    }

    public void preencherEndereçoFeatureGPE044(String endereco) {
        preencherCampoPorXpathFeatureGPE044(inputEnderecoXpath, xPathColunaTabelaCodigoFim, endereco);
    }

    public void preencherEmpresaFeatureGPE044(String empresa) {
        preencherCampoPorXpathFeatureGPE044(inputEmpresaXpath, xPathColunaTabelaCodigoFim, empresa);
    }

    public void preencherItemFeatureGPE044(String item) {
        preencherCampoPorXpathFeatureGPE044(inputItemXpath, xPathColunaTabelaCodigoFim, item);
    }

    public void preencherPréContratoFeatureGPE044(String contrato) {
        preencherCampoPorXpathFeatureGPE044(inputPreContratoXpath, xPathColunaTabelaCodigoFim, contrato);
    }

    public void preencherDataDeEmissãoFeatureGPE044(String dataEmissaoInicio) {
        preencherCampoPorXpathFeatureGPE044(inputDataEmissaoInicioXapth, xPathColunaTabelaDataCodigoFim, dataEmissaoInicio);
    }

    public void preencherAtéFeatureGPE044(String dataEmissaoFim) {
        preencherCampoPorXpathFeatureGPE044(inputDataEmissaoFimXpath, xPathColunaTabelaDataCodigoFim, dataEmissaoFim);
    }

    public void realizarAConsultaFeatureGPE044() {
        clicarElementoByXpath(btnConsultarXpath);
    }

    public void selecionarNoGridPréContratoFeatureGPE044() {
        String chekBoxPreContratoXpath = "//*[@id='precontrato-chkSeleciona-" + primeiraLinhaEmBranco + "']/div/button";
        testMarcaDesmarcaCheckBox("marcar", chekBoxPreContratoXpath);
    }

    public void preencherMotivoFeatureGPE044(String motivoBloqueio) {
        preencherCampoPorXpathFeatureGPE044(inputMotivoXpath, xPathColunaTabelaCodigoFim, motivoBloqueio);
    }

    public void realizarLiberaçãoFeatureGPE044() {
        clicarElementoByXpath(btnLiberarXpath);
    }

    public void realizarRecusaFeatureGPE044() {
        clicarElementoByXpath(btnRecusarXpath);
    }

    public void consultaGPE000FeatureGPE044() {
        clicarElementoByXpath(btnConsultarGPE000Xpath);
    }

    public void sairDaTelaGPE000FeatureGPE() {
        clicarElementoByXpath(btnSairXpath);
        //pressionarAltF4();
    }

    // Metodo auxiliar
    public void preencherCampoPorXpathFeatureGPE044(String campoInicioXpath, String campoFimXpath, String valor) {
        String elementoXpath = campoInicioXpath + campoFimXpath;
        clicarElementoByXpathNVezes(elementoXpath, 2);
        preencherElementoByXpath(elementoXpath, valor);
        pressionarENTERByXpath(elementoXpath);
        pressionaTabActions();
    }

}