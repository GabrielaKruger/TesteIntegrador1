package pages.Faturamento.COM;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

import java.util.Objects;

public class COM019_Page extends BasePage {
    WebDriver driver;

    public COM019_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Aba - Pedidos Compra
    String inputCliforXpath = "//*[@id='pedido-cdClifor";
    String inputConPagamentoXpath = " //*[@id='pedido-cdCondpagto";
    String inputDataIniCorrecaoXpath = "//*[@id='pedido-dtIniciocorrecao";
    String inputMoedaXpath = "//*[@id='pedido-cdMoeda";
    String inputFormaPagamentoXpath = "//*[@id='pedido-cdFormapagto";
    String inputTaxaXpath = "//*[@id='pedido-txMoedaconv";
    String inputDescricaoMotivoLiberaRecusa = "//*[@id='pedido-dsMotivo']/div/input";

    String selectTipoPedidoXpath = "//*[@id='pedido-tpTxmoedaconv']/div/select";

    String chkSelecionaPedidoCompra = "//*[@id='pedido-chkSeleciona-";

    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpathDataFim = "']/div/div/input";
    String btnXpathFim = "']/div/button";

    public void confirmarMensagemSQLDeConsultaFeature() {
        esperarMilissegundos(12000); // Se realmente for necessário esperar antes
        clicarBotaoDoModal("ok");   // Reaproveita seu método já existente
        esperarMilissegundos(8000);
    }


    public void preencherCliforFeatureCOM019(String clifor) {
        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(inputCliforXpath + inputXpathFim, 2);
        preencherElementoByXpath(inputCliforXpath + inputXpathFim, clifor);
        pressionaTabActions();
    }

    public void preencherCondiçãoPagtoFeatureCOM019(String condicaoPagamento) {
        clicarElementoByXpathNVezes(inputConPagamentoXpath + inputXpathFim, 2);
        limparCampoDeTextoPorXpath(inputConPagamentoXpath + inputXpathFim);
        preencherElementoByXpath(inputConPagamentoXpath + inputXpathFim, condicaoPagamento);
        pressionaTabActions();
    }

    public void preencherMoedaFeatureCOM019(String moeda) {
        clicarElementoByXpathNVezes(inputMoedaXpath + inputXpathFim, 2);
        limparCampoDeTextoPorXpath(inputMoedaXpath + inputXpathFim);
        esperarMilissegundos(1000); // espera necessária
        preencherElementoByXpath(inputMoedaXpath + inputXpathFim, moeda);
        pressionaTabActions();
    }

    public void preencherFormaPagamentoFeatureCOM019(String formaPagamento) {
        clicarElementoByXpathNVezes(inputFormaPagamentoXpath + inputXpathFim, 2);
        preencherElementoByXpath(inputFormaPagamentoXpath + inputXpathFim, formaPagamento);
        pressionaTabActions();
    }

    public void selecionarTipoTaxaSendoFeatureCOM019(String tipoTaxa) {
        selecionarListaByXpathValor(selectTipoPedidoXpath, tipoTaxa);
        pressionaTabActions();
    }

    public void preencherDtInícioDaCorreçãoFeatureCOM019() {
        clicarElementoByXpathNVezes(inputDataIniCorrecaoXpath + inputXpathDataFim, 2);
        preencherElementoByXpath(inputDataIniCorrecaoXpath + inputXpathDataFim, DataUtils.DataAtual());
        pressionaTabActions();
    }

    public void preencherTaxaFeatureCOM019(String valorTaxa) {
        clicarElementoByXpathNVezes(inputTaxaXpath + inputXpathFim, 2);
        preencherElementoByXpath(inputTaxaXpath + inputXpathFim, valorTaxa);
        pressionaTabActions();
    }

    public void marcarCheckboxNumeroDoPedidoFeatureCOM019() {
        String checkboxPedidosDeCompra = chkSelecionaPedidoCompra + primeiraLinhaEmBranco + btnXpathFim;

        testMarcaDesmarcaCheckBox("marcar", checkboxPedidosDeCompra);
    }

    public void clicarBotaoPedidoDoModal(String acao) {
        String botaoPedidoModal;
        if (Objects.equals(acao, "liberar")) {
            botaoPedidoModal = "//*[@id='pedido-btnLiberar']/div/button";
        } else if (Objects.equals(acao, "retornar")) {
            botaoPedidoModal = "//*[@id='pedido-btnRetornar']/div/button";
        } else if (Objects.equals(acao, "recusar")) {
            botaoPedidoModal = "//*[@id='pedido-btnRecusar']/div/button";
        } else {
            throw new IllegalArgumentException("Botão inexistente: " + acao + ". Informe 'liberar', 'retornar' ou 'recusar'.");
        }
        {
            esperarElementoClicavelByXpath(botaoPedidoModal);
            clicarElementoByXpathComRetentativa(botaoPedidoModal);
        }
    }

    public void informaMotivoLiberacaoRecusaFeatureCOM019(String dsMotivoLiberaRecusa) {
        clicarElementoByXpath(inputDescricaoMotivoLiberaRecusa);
    }
}
