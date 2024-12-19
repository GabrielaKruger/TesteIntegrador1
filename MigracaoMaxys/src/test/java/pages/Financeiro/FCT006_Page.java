package pages.Financeiro;//package pages.Financeiro;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FCT006_Page extends BasePage {
    WebDriver driver;

    // Strings Parâmetros de Consulta de Processos Bloqueados
    String inputEmpresaXpath = "//*[@id='controle-cdEmpresa']/div/input";
                                //*[@id="controle-cdEmpresa"]/div/input
    String btnConsultarXpath = "//*[@id='controle-btConsulta']/button/div";
    String inputDataPagamentoXpath = "//*[@id='controle-dtPagamento']/div/div/input";

    // String Observação
    String inputObservacaoXpath = "//*[@id='processocaixa-dsObservacao']/div/textarea";

    // Botões - Processo Bloqueados
    String btnAtualizaPXpath = "//*[@id='processocaixa-btnAutoriza']/button/div";
    String btnRecusarXpath = "//*[@id='processocaixa-btnRecusa']/button/div";
    String btnDetalhesXpath = "//*[@id='processocaixa-btnDetalhe']/button/div";
    String btnPerfilXpath = "//*[@id='processocaixa-btnPerfil']/button/div";
    String brnCreditoXpath = "//*[@id='cliforcredito-btnCredito']/button/div";
    String btnCreditoContaXpath = "//*[@id='processocaixa-btnCreditoemconta']/button/div";
    String btnContaOrigXpath = "//*[@id='processocaixa-btnOrigem']/button/div";
    String btnDossieXpath = "//*[@id='processocaixa-btnDossie']/button/div";

    // Globais
    String inputXpathFim = "']/div/input";
    String selectXpathFim = "']/div/select";
    String descricaoFaker;
    int primeiraLinhaEmBranco;

    public FCT006_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void informarEmpresaFeatureFCT006(String empresa) {
        clicarElementoByXpathNVezes(inputEmpresaXpath,2);
        preencherElementoByXpath(inputEmpresaXpath, empresa);
        //*[@id="controle-cdEmpresa"]/div/input
    }

    public void realizarAConsultaFeatureFCT006() {
        clicarElementoByXpathNVezes(btnConsultarXpath,1);
    }

    public void informaDataPagamentoFeatureFCT006(String dataPagamento) {
        clicarElementoByXpathNVezes(inputDataPagamentoXpath,2);
        esperarMilissegundos(1000); // espera necessária
        preencherElementoByXpath(inputDataPagamentoXpath, dataPagamento);
    }

    public void selecionarOProcessoFeatureFCT006() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String chkProcessoXpath = "//*[@id='processocaixa-cbProcesso-" + primeiraLinhaEmBranco + "']/div/button";

        testMarcaDesmarcaCheckBox("marcar", chkProcessoXpath);
    }

    public void informarObservaçãoFeatureFCT006() {
        descricaoFaker = faker.color().name() + " teste";

        clicarElementoByXpathNVezes(inputObservacaoXpath,2);
        preencherElementoByXpath(inputObservacaoXpath, descricaoFaker);
    }

    public void autorizaProcessoFeatureFCT006() {
        clicarElementoByXpathNVezes(btnAtualizaPXpath,1);
        esperarMilissegundos(50000); //espera necessária - Tempo para validar massa no Grid
    }

    public void rescusaProcessoFeatureFCT006() {
        clicarElementoByXpathNVezes(btnRecusarXpath,1);
    }

    public void informarEmpresaNovamenteFeatureFCT006() {
        alterarParaIframeComElemento(inputEmpresaXpath);
    }
}