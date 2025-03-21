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

    // String Grid - Page Itens
    String linhaGridItensXpath = "//*[@id='viewNegociacao-cdItem-0']/div/input";

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
        esperarMilissegundos(8000); // espera necessária por conta do carregamento do grid
        primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(btnNegociacaoXapth, btnGridFimXpath);
        String negociacao = btnNegociacaoXapth + primeiraLinhaEmBranco + btnGridFimXpath ;

        marcarRadioButon(negociacao);
        pressionaTabActions();
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

    public void darDuploCliqueNoPrimeiroItemFeatureCOM007() {
        clicarElementoByXpathNVezes(linhaGridItensXpath, 8); // Necessário duplo clique
    }

    public void verificaSeAModalComAMensagemFoiApresentadaFeatureCOM007(String mensagem) {
        String modalItemNegociacao = "//*[@id='mh-templateModalCanDetalhestoque']";
        esperarElementoVisivelByXpath(modalItemNegociacao);
        validaMensagemLabelByContainsText(mensagem);
    }

    public void fechaAModalFeatureCOM007() {
        String fecharXpath = "//*[@id='detalhestoque-btnFechar" + btnFinalXpath;
        clicarElementoByXpathNVezes(fecharXpath, 1);
    }
}

