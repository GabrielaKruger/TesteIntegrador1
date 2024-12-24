package pages.Financeiro;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FCT007_Page extends BasePage {
    WebDriver driver;

    //Globais
    int primeiraLinhaEmBranco;

    //Strings Aprovação Comercial
    String inputObservacaoXpath = "//*[@id='processocaixa-dsObservacao']/div/textarea";
    String inputCreditoemcontaXpath = "//*[@id='processocaixa-btnCreditoemconta']/button/div";
    String inputFecharXpath = "//*[@id='recebchequepag-btnFechar']/button/div";
    String inputDetalhesXpath = "//*[@id='processocaixa-btnDetalhe']/button/div";
    String inputContratoXpath = "//*[@id='itemproccaixa-btnConsultacontrato']/button/div";
    String inputVoltarXpath = "//*[@id='detalheProcesso-btnVoltar']/button/div";

    public FCT007_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void marcarCheckboxEmpresaFeatureFCT007() {
        esperarMilissegundos(20000);//espera necessária
        verificarOuSetarPrimeiraLinhaEmBranco();

        String chkEmpresaXpath = "//*[@id='processocaixa-cbProcesso-" + primeiraLinhaEmBranco + "']/div/button";

        testMarcaDesmarcaCheckBox("marcar", chkEmpresaXpath);
    }

    public void preencherObservaçãoFeatureFCT007(String observacao) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputObservacaoXpath, 2);
        preencherElementoByXpath(inputObservacaoXpath, observacao);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarCréditoEmContaFeatureFCT007(String creditoemconta) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputCreditoemcontaXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarFecharFeatureFCT007(String fechar) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputFecharXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }

    public void recusarProcessoFeatureFCT007(String mensagem, String title, String acao, String botao) {
        if (mensagem.equals("Erro: O tipo de pedido (FM) não pode ser recusado. Utilize o programa de fechamento de lote (AVE009).")) {
            //validaModalByH4(title);
            clicarBotaoDoModal(acao);
            clicarBotaoToolBar(botao);
            validaModalByH5(title);
            validaMensagemLabelByText(mensagem);
            clicarBotaoDoModal(acao);
        } else if (mensagem.equals("Registro salvo com sucesso.")) {
            //validaModalByH4(title);
            clicarBotaoDoModal(acao);
            validaModalByH5(title);
            clicarBotaoDoModal(acao);
        } else {
            // Caso não seja nenhuma das mensagens esperadas, exibe um erro
            System.out.println("Mensagem inesperada: " + mensagem);
        }
    }

    public void clicarBotãoDetalhesFeatureFCT007(String detalhes) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputDetalhesXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarBotãoContratoFeatureFCT007(String contrato) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputContratoXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarBotãoVoltarFeatureFCT007(String voltar) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputVoltarXpath, 1);
        esperarMilissegundos(2000);//espera necessária
    }
}
