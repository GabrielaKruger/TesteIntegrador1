package pages.Faturamento.COM;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

public class COM007_Page extends BasePage {
    WebDriver driver;

    public COM007_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Strings Mensagem SQL
    String btnOkXpath = "//*[@id='mxModalInfoBtnOk']";

    // Strings Solicitações em Aberto
    String btnFecharXpath = "//*[@id='mensagem-btFechar";

    // String Grid - Aprovação das Negociações
    String btnNegociacaoXapth = "//*[@id='aprovanegoc-verificaAprovanegoc-";

    // String Page Validar
    String textObservacaoXpath = "//*[@id='aprovanegoc-dsObsrenegociacao";
    String btnAprovarXpath = "//*[@id='aprovanegoc-btnAprovar";
    String btnRenegociarXpath = "//*[@id='aprovanegoc-btnRenegociar";
    String btnCancelarXapth = "//*[@id='aprovanegoc-btnCancelar";

    //Globais
    String primeiraLinhaEmBranco;
    String descricaoFaker = "Teste automacao - ";
    String btnFinalXpath = "']/div/button/div";
    String btnGridFimXpath = "']/div/button";
    String textFimXpath = "']/div/textarea";

    public void confirmarMensagemSQLDeConsultaFeatureCOM007() {
        clicarElementoByXpath(btnOkXpath);
        esperarMilissegundos(8000); // espera necessária
    }

    public void fecharJanelaDeSolicitaçõesEmAbertoFeatureCOM007() {
        esperarMilissegundos(12000); // espera necessária por conta do carregamento do grid
        clicarElementoByXpath(btnFecharXpath + btnFinalXpath);
    }

    public void selecionarNegociaçãoFeatureCOM007() {
        esperarMilissegundos(10000); // espera necessária por conta do carregamento do grid
        primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(btnNegociacaoXapth, btnGridFimXpath);
        String negociacao = btnNegociacaoXapth + primeiraLinhaEmBranco + btnGridFimXpath ;

        marcarRadioButon(negociacao);
        pressionaTabActions();
    }

    public void nãoConfirmarSeleçãoDeLoteFeatureCOM007() {
        // Ajustar para o segundo caso
    }

    public void acessarPageFeatureCOM007(String page) {
        selecionarPaginaNoMenu(page);
    }

    public void preencherObservaçãoDaRenegociaçãoCancelamentoFeatureCOM007() {
        descricaoFaker = descricaoFaker + faker.animal();
        encontrarEPreencherElementos(textObservacaoXpath, textFimXpath, descricaoFaker);
    }

    public void aprovarNegociacaoFeatureCOM007() {
        clicarElementoByXpath(btnAprovarXpath+btnFinalXpath);
    }

    public void clicarBotãoNovoDoModalFeatureCOM007() {
        String nao = "/html/body/modal-container/div[2]/div/lib-mx-maxys-alert/div[3]/button[2]";

       clicarElementoByXpath(nao);
    }
}

