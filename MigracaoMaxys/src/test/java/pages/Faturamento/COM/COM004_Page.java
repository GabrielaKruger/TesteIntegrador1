package pages.Faturamento.COM;

import org.openqa.selenium.WebDriver;
import utils.DataUtils;
import pages.BasePage;

public class COM004_Page extends BasePage {
    WebDriver driver;

    public COM004_Page(WebDriver driver) {
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
    String selectTipoPedidoXpath = "//*[@id='pedido-tpTxmoedaconv']/div/select";


    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpatDataFim = "']/div/div/input";
    String btnXpathFim = "']/div/button";


    public void preencherCliforFeatureCOM004(String clifor) {
        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(inputCliforXpath + inputXpathFim,2);
        preencherElementoByXpath(inputCliforXpath + inputXpathFim, clifor);
        pressionaTabActions();
    }

    public void preencherCondiçãoPagtoFeatureCOM004(String condicaoPagamento) {
        clicarElementoByXpathNVezes(inputConPagamentoXpath + inputXpathFim,2);
        limparCampoDeTextoPorXpath(inputConPagamentoXpath + inputXpathFim);
        preencherElementoByXpath(inputConPagamentoXpath + inputXpathFim, condicaoPagamento);
        pressionaTabActions();
    }

    public void preencherMoedaFeatureCOM004(String moeda) {
        clicarElementoByXpathNVezes(inputMoedaXpath + inputXpathFim,2);
        limparCampoDeTextoPorXpath(inputMoedaXpath + inputXpathFim);
        esperarMilissegundos(1000); // espera necessária
        preencherElementoByXpath(inputMoedaXpath + inputXpathFim, moeda);
        pressionaTabActions();
    }

    public void preencherFormaPagamentoFeatureCOM004(String formaPagamento) {
        clicarElementoByXpathNVezes(inputFormaPagamentoXpath + inputXpathFim,2);
        preencherElementoByXpath(inputFormaPagamentoXpath + inputXpathFim, formaPagamento);
        pressionaTabActions();
    }

    public void selecionarTipoTaxaSendoFeatureCOM004(String tipoTaxa) {
        selecionarListaByXpathValor(selectTipoPedidoXpath, tipoTaxa);
        pressionaTabActions();
    }

    public void preencherDtInícioDaCorreçãoFeatureCOM004() {
        clicarElementoByXpathNVezes(inputDataIniCorrecaoXpath + inputXpatDataFim,2);
        preencherElementoByXpath(inputDataIniCorrecaoXpath + inputXpatDataFim, DataUtils.DataAtual());
        pressionaTabActions();
    }

    public void preencherTaxaFeatureCOM004(String valorTaxa) {
        clicarElementoByXpathNVezes(inputTaxaXpath + inputXpathFim,2);
        preencherElementoByXpath(inputTaxaXpath + inputXpathFim, valorTaxa);
        pressionaTabActions();
    }

}

