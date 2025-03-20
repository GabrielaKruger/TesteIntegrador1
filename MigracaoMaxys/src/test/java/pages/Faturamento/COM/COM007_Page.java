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


    //Globais
    String primeiraLinhaEmBranco;
    String btnFinalXpath = "']/div/button/div";
    String btnGridFimXpath = "']/div/button";

    public void confirmarMensagemSQLDeConsultaFeatureCOM007() {
        clicarElementoByXpath(btnOkXpath);
    }

    public void fecharJanelaDeSolicitaçõesEmAbertoFeatureCOM007() {
        esperarMilissegundos(8000); // espera necessária por conta do carregamento do grid
        clicarElementoByXpath(btnFecharXpath + btnFinalXpath);
    }

    public void selecionarNegociaçãoFeatureCOM007() {
        primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(btnNegociacaoXapth, btnGridFimXpath);
        String negociacao = btnNegociacaoXapth + primeiraLinhaEmBranco + btnGridFimXpath ;

        marcarRadioButon(negociacao);

    }

    public void nãoConfirmarSeleçãoDeLoteFeatureCOM007() {

    }
}

