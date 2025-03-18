package pages.Originacao.GPE;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

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
    String btnConsultarXpath = "//*[@id='filtro-btnConsulta']/div/button/div";

    // Pré-Contratos Bloqueados/Liberados/Recusados
    String inputMotivoXpath = "//*[@id='precontrato-dsMotivo";
    String btnLiberarXpath = "//*[@id='precontrato-btnLiberar']/div/button/div";
    String btnRecusarXpath = "//*[@id='precontrato-btnRecusar']/div/button/div";
    String btnConsultarGPE000Xpath = "//*[@id='precontrato-btnConsultar']/div/button/div";


    // String Globais
    int primeiraLinhaEmBranco;
    String xPathColunaTabelaCodigoFim = "']/div/input";
    String xPathColunaTabelaDataCodigoFim = "']/div/div/input";
    String btnSairXpath = "//*[@id='btn-close-templateModalCanDetalhe']";


    public GPE044_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCliforFeatureGPE044(String clifor) {
        encontrarEPreencherElementos(inputCliforXpath, xPathColunaTabelaCodigoFim, clifor);
    }

    public void preencherEndereçoFeatureGPE044(String endereco) {
        encontrarEPreencherElementos(inputEnderecoXpath, xPathColunaTabelaCodigoFim, endereco);
    }

    public void preencherEmpresaFeatureGPE044(String empresa) {
        encontrarEPreencherElementos(inputEmpresaXpath, xPathColunaTabelaCodigoFim, empresa);
    }

    public void preencherItemFeatureGPE044(String item) {
        encontrarEPreencherElementos(inputItemXpath, xPathColunaTabelaCodigoFim, item);
    }

    public void preencherPréContratoFeatureGPE044(String contrato) {
        encontrarEPreencherElementos(inputPreContratoXpath, xPathColunaTabelaCodigoFim, contrato);
    }

    public void preencherDataDeEmissãoFeatureGPE044(String dataEmissaoInicio) {
        encontrarEPreencherElementos(inputDataEmissaoInicioXapth, xPathColunaTabelaDataCodigoFim, dataEmissaoInicio);
    }

    public void preencherAtéFeatureGPE044(String dataEmissaoFim) {
        encontrarEPreencherElementos(inputDataEmissaoFimXpath, xPathColunaTabelaDataCodigoFim, dataEmissaoFim);
    }

    public void preencherDataDeEmissãoAtualFeatureGPE004() {
        encontrarEPreencherElementos(inputDataEmissaoInicioXapth, xPathColunaTabelaDataCodigoFim, DataUtils.DataAtual());
    }

    public void realizarAConsultaFeatureGPE044() {
        clicarElementoByXpath(btnConsultarXpath);
    }

    public void selecionarNoGridPréContratoFeatureGPE044() {
        esperarMilissegundos(500); // espera necessária
        String chekBoxPreContratoXpath = "//*[@id='precontrato-chkSeleciona-" + primeiraLinhaEmBranco + "']/div/button";
        testMarcaDesmarcaCheckBox("marcar", chekBoxPreContratoXpath);
    }

    public void preencherMotivoFeatureGPE044(String motivoBloqueio) {
        encontrarEPreencherElementos(inputMotivoXpath, xPathColunaTabelaCodigoFim, motivoBloqueio);
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
    }

    // Metodo auxiliar
    public void preencherCampoPorXpathFeatureGPE044(String campoInicioXpath, String campoFimXpath, String valor) {
        String elementoXpath = campoInicioXpath + campoFimXpath;
        clicarElementoByXpathNVezes(elementoXpath, 2);
        esperarMilissegundos(200); // espera necessária
        preencherElementoByXpath(elementoXpath, valor);
        pressionarENTERByXpath(elementoXpath);
        pressionaTabActions();
    }

}