package pages;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class MKT002_Page extends BasePage {

    // Constantes para IDs dos elementos na página
    private static final String CARRING_ID = "infoadicional-dsInfocarrginexp";
    private static final String CLIFOR_ID = "controle-cdClifor";
    private static final String COMISSAO_ID = "infoadicional-dsInfocomissaoexp";
    private static final String CTR_CORRETORA_ID = "infoadicional-dsInfocorretora";
    private static final String DESPATCH_ID = "infoadicional-dsInfodemdeskexp";
    private static final String EMPRESA_ID = "controle-cdEmpresa";
    private static final String EXTENSION_ID = "infoadicional-dsInfoextensionexp";
    private static final String ITEM_ID = "controle-cdItem";
    private static final String LOADING_RATE_ID = "infoadicional-dsInfoloadingrateexp";
    private static final String LOCAL_DESCARGA_ID = "infoadicional-dsInfolocaldescarga";
    private static final String PRE_ADVICE_ID = "infoadicional-dsInfopreadviceexp";
    private static final String T_DE_COMPRA_ID = "infoadicional-dsInfotipocompra";
    private static final String TERMINAL_PORTO_ID = "infoadicional-dsInfoterminalporto";
    private static final String T_FORNECEDOR_ID = "infoadicional-dsInfofornecedor";
    private static final String TRADE_SLIP_ID = "controle-nrTradeslip";
    private static final String BTN_ABRIR_CONTRATO_XPATH = "//*[@id='controle-btnContrato']/button/div";
    private static final String BTN_FILTRAR_XPATH = "//*[@id='controle-btnFiltrar']/button/div";
    private static final String BTN_GRAVAR_ADICIONAIS_XPATH = "//*[@id='infoadicional-btnGravar']/button/div";
    private static final String BTN_INFORMACOES_XPATH = "//*[@id='controle-btnInfoadicional']/button/div";
    private static final String TIPO_LOV_XPATH = "//*[@id='controle-cdTipotradeslip']/div/select";

    public MKT002_Page(WebDriver driver) {
        super(driver);
    }

    // MÉTODOS GENÉRICOS
//
//    // Preenche um campo de entrada com um valor especificado, baseado no ID do elemento.
//    public void informarElementoGenerico(String elementoId, String valor) {
//        String elemento = construirXpathElementoGenerico(elementoId);
//        informarElemento(elemento, valor);
//    }
//
//    // Limpa o conteúdo de um campo de entrada, baseado no ID do elemento.
//    public void removerElementoGenerico(String elementoId) {
//        String elemento = construirXpathElementoGenerico(elementoId);
//        clicarElementoByXpath(elemento, 1);
//        limparElementoByXpath(elemento);
//    }
//
//    // Constrói o XPath para o elemento genérico a partir do ID
//    private String construirXpathElementoGenerico(String elementoId) {
//        return "//*[@id='" + elementoId + "']/div/input";
//    }
//
//    // INFORMA FILTROS PARA OFERTAS ORIGINAÇÃO
//
//    // Preenche o campo de entrada para a empresa com o valor especificado.
//    public void informarEmpresa(String empresa) {
//        esperarElementoClicavelByXpathConcatenado(EMPRESA_ID);
//        informarElementoConcatenado(EMPRESA_ID, empresa);
//    }
//
//    // Preenche o campo de entrada para o item com o valor especificado.
//    public void informarItem(String item) {
//        informarElementoConcatenado(ITEM_ID, item);
//    }
//
//    // Preenche o campo de entrada para o trade slip com o valor especificado.
//    public void informarTradeSlip(String tradeSlip) {
//        clicarElementoByXpathConcatenado(TRADE_SLIP_ID);
//        esperarPorSegundos(0.5); // espera necessária
//        informarElementoConcatenado(TRADE_SLIP_ID, tradeSlip);
//    }
//
//    // Preenche o campo de entrada para o clifor com o valor especificado.
//    public void informarClifor(String clifor) {
//        informarElementoConcatenado(CLIFOR_ID, clifor);
//    }
//
//    // Método para selecionar o tipo da oferta específico em uma LOV.
//    public void informarTipo() {
//        selecionarOpcaoPorIndice(TIPO_LOV_XPATH, 1);
//    }
//
//    // Método para clicar no botão de filtrar após esperar que ele esteja clicável.
//    public void clicarBotaoFiltrar() {
//        esperarElementoClicavelByXpath(BTN_FILTRAR_XPATH);
//        clicarElementoByXpath(BTN_FILTRAR_XPATH, 1);
//    }
//
//    // Método para clicar no botão de informações adicionais.
//    public void clicarInformacoesAdicionais() {
//        clicarElementoByXpath(BTN_INFORMACOES_XPATH, 1);
//    }
//
//    // Método para clicar no botão de abrir contrato.
//    public void clicarBotaoAbrirContrato() {
//        clicarElementoByXpath(BTN_ABRIR_CONTRATO_XPATH, 1);
//    }
//
//    // PREENCHE OS DADOS ADICIONAIS
//
//    // Preenche o campo de entrada para o TFornecedor com o valor especificado.
//    public void preencherTFornecedor(String tFornecedor) {
//        informarElementoGenerico(T_FORNECEDOR_ID, tFornecedor);
//    }
//
//    // Preenche o campo de entrada para o TDeCompra com o valor especificado.
//    public void preencherTDeCompra(String tDeCompra) {
//        informarElementoGenerico(T_DE_COMPRA_ID, tDeCompra);
//    }
//
//    // Preenche o campo de entrada para o LocalDeDescarga com o valor especificado.
//    public void preencherLocalDeDescarga(String localDescarga) {
//        informarElementoGenerico(LOCAL_DESCARGA_ID, localDescarga);
//    }
//
//    // Preenche o campo de entrada para o TerminalPorto com o valor especificado.
//    public void preencherTerminalPorto(String terminalPorto) {
//        informarElementoGenerico(TERMINAL_PORTO_ID, terminalPorto);
//    }
//
//    // Preenche o campo de entrada para o CTRCorretora com o valor especificado.
//    public void preencherCTRCorretora(String ctrCorretora) {
//        informarElementoGenerico(CTR_CORRETORA_ID, ctrCorretora);
//    }
//
//    // Preenche o campo de entrada para o ComissaoExp com o valor especificado.
//    public void preencherComissaoExp(String comissaoExp) {
//        informarElementoGenerico(COMISSAO_ID, comissaoExp);
//    }
//
//    // Preenche o campo de entrada para o CarringChargesExp com o valor especificado.
//    public void preencherCarringChargesExp(String carryingChargesExp) {
//        informarElementoGenerico(CARRING_ID, carryingChargesExp);
//    }
//
//    // Preenche o campo de entrada para o DespatchExp com o valor especificado.
//    public void preencherDespatchExp(String despatchExp) {
//        informarElementoGenerico(DESPATCH_ID, despatchExp);
//    }
//
//    // Preenche o campo de entrada para o ExtensionExp com o valor especificado.
//    public void preencherExtensionExp(String extensionExp) {
//        informarElementoGenerico(EXTENSION_ID, extensionExp);
//    }
//
//    // Preenche o campo de entrada para o PreAdviceExp com o valor especificado.
//    public void preencherPreAdviceExp(String preAdviceExp) {
//        informarElementoGenerico(PRE_ADVICE_ID, preAdviceExp);
//    }
//
//    // Preenche o campo de entrada para o LoadingRateExp com o valor especificado.
//    public void preencherLoadingRateExp(String loadingRateExp) {
//        informarElementoGenerico(LOADING_RATE_ID, loadingRateExp);
//    }
//
//    // Clicar no botão de "Gravar" em informações adicionais.
//    public void clicarBotaoGravarInfAdicionais() {
//        clicarElementoByXpathComRetentativa(BTN_GRAVAR_ADICIONAIS_XPATH);
//    }
//
//    // REMOVE OS DADOS ADICIONAIS INFORMADOS
//    // Remove os campos especificados chamando o método removerCampo para cada um
//    public void removerCampos(String... campos) {
//        Arrays.stream(campos).forEach(this::removerCampo);
//    }
//
//    // Método para remover o campo específico com base no parâmetro 'campo' passado.
//    private void removerCampo(String campo) {
//        switch (campo) {
//            case "CTRCorretora":
//                removerElementoGenerico(CTR_CORRETORA_ID);
//                break;
//            case "TFornecedor":
//                removerElementoGenerico(T_FORNECEDOR_ID);
//                break;
//            case "TDeCompra":
//                removerElementoGenerico(T_DE_COMPRA_ID);
//                break;
//            case "LocalDeDescarga":
//                removerElementoGenerico(LOCAL_DESCARGA_ID);
//                break;
//            case "TerminalPorto":
//                removerElementoGenerico(TERMINAL_PORTO_ID);
//                break;
//            case "ComissaoExp":
//                removerElementoGenerico(COMISSAO_ID);
//                break;
//            case "CarringChargesExp":
//                removerElementoGenerico(CARRING_ID);
//                break;
//            case "DespatchExp":
//                removerElementoGenerico(DESPATCH_ID);
//                break;
//            case "ExtensionExp":
//                removerElementoGenerico(EXTENSION_ID);
//                break;
//            case "PreAdviceExp":
//                removerElementoGenerico(PRE_ADVICE_ID);
//                break;
//            case "LoadingRateExp":
//                removerElementoGenerico(LOADING_RATE_ID);
//                break;
//            default:
//                throw new IllegalArgumentException("Campo não reconhecido: " + campo);
//        }
//    }

}
