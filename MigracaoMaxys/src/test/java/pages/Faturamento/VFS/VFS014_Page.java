package pages.Faturamento.VFS;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.DataUtils;

import java.util.List;

public class VFS014_Page extends BasePage {

    WebDriver driver;

    public VFS014_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String BTN_TRANSICAO_ID = "button-basic";

    //Page Nota Fiscal Eletronica
    String inputEmissaoInicial = "//*[@id='controle-dtInicial']/div/div/input";
    String inputEmissaoFinal = "//*[@id='controle-dtFinal']/div/div/input";
    String inputUsuario = "//*[@id='controle-cdUsuario']/div/input";
    String inputEmpresa = "//*[@id='controle-cdEmpresa']/div/input";

    String btnConsultar = "//*[@id='controle-btnConsultar']/div/button/div";

    //Page Inutilizacao
    String inputSerieNota = "//*[@id='controle-txtcdSerie']/div/input";
    String inputDataInicial = "//*[@id='controle-txtdtInicial']/div/div/input";
    String inputDataFinal = "//*[@id='controle-txtdtFinal']/div/div/input";
    String btnConsultarInutilizacao = "//*[@id='nfeinutilizaseq-btnConsultar']/div/button/div";

    //Page Informacoes
    String inputPeriodoInicial = "//*[@id='infonfe-dtInicio']/div/div/input";
    String inputPeriodoFinal = "//*[@id='infonfe-dtFim']/div/div/input";
    String btnComputaEstatistica = "//*[@id='infonfe-btnComputar']/div/button/div";
    String inputEmpresaPageInformacoes = "//*[@id='infonfe-cdEmpresa']/div/input";


    public void clicarBotaoTransicao() {
        clicarElementoById(BTN_TRANSICAO_ID);
    }


    // Se você quiser há o método selecionarPaginaNoMenu na BasePage que pode ser utilizado aqui
    public void acessarPageFeatureVFS014(String nomePage) {
        clicarElementoByText(nomePage);
    }

    // Moço Henrique, há outras telas com pages, tente manter esse código na BasePage, se possivel :)
    // Clica em um elemento localizado pelo texto.
    public void clicarElementoByText(String text) {
        String texto = "//*[text()='" + text + "']";
        driver.findElement(By.xpath(texto)).click();
    }

    public void informaDataEmissaoInicialFeatureVFS014() {
        limparElementoByXpath(inputEmissaoInicial);
        clicarElementoByXpath(inputEmissaoInicial);
        preencherElementoByXpath(inputEmissaoInicial, DataUtils.DataRetroativo(2));
    }

    public void informaDataEmissaoFinalFeatureVFS014() {
        limparElementoByXpath(inputEmissaoFinal);
        clicarElementoByXpath(inputEmissaoFinal);
        preencherElementoByXpath(inputEmissaoFinal, DataUtils.DataAtual());
    }

    public void selecionaStatusDeEnvioFeatureVFS014(String statusEnvio) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-tpRegistro']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusEnvio);
    }

    public void informaUsuarioFeatureVFS014(String user) {
        limparElementoByXpath(inputUsuario);
        clicarElementoByXpath(inputUsuario);
        preencherElementoByXpath(inputUsuario, user);
    }

    public void informaEmpresaFeatureVFS014(String empresa) {
        limparElementoByXpath(inputEmpresa);
        clicarElementoByXpath(inputEmpresa);
        preencherElementoByXpath(inputEmpresa, empresa);
    }

    public void selecionaStatusDaImpressaoFeatureVFS014(String stDaImpressao) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-stImpressao']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(stDaImpressao);
    }

    public void selecionaStatusContigenciaFeatureVFS014(String statusContingencia) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-lstContingencia']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusContingencia);
    }

    public void selecionaStatusRecolhimentoFunruralFeatureVFS014(String statusRecolhimentoFunrural) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-tpRecolhimentofunrural']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusRecolhimentoFunrural);
    }

    public void selecionaTipoFaturamentoFeatureVFS014(String statusTpFaturamento) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-tpFates']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusTpFaturamento);
    }

    public void selecionaTipoImpressaoFeatureVFS014(String statusImpressao) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-lstImpressao']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusImpressao);
    }

    public void clicaEmConsultarFeatureVFS014() {
        esperarMilissegundos(2000);
        clicarElementoByXpath(btnConsultar);
    }

    public void validarSePossuiNotasFiscaisNoGridFeatureVFS014() {
        esperarMilissegundos(3000); // Espera necessária
        esperarElementoVisivelByXpath("//*[@id='mxdatatable']");

        String mensagemEsperada = "Não foram encontradas notas para os dados informados.";
        String xpathBotaoOk = "//*[@id='mxModalInfoBtnOk']";
        String xpathTabela = "//*[@id='mxdatatable']";
        String xpathLinhasTabela = "//*[@id='mxdatatable']//tr";

        try {
            // Verifica se a mensagem de erro está visível e corresponde ao esperado
            validaMensagemLabelByText(mensagemEsperada);

            // Se a mensagem foi validada, significa que a tabela não contém registros
            System.out.println("A tabela não contém registros.");

            // Clicar no botão OK
            WebElement botaoOk = driver.findElement(By.xpath(xpathBotaoOk));
            botaoOk.click();

            return; // Sai do método, pois já sabemos que a tabela está vazia.
        } catch (AssertionError | NoSuchElementException e) {
            // Se a mensagem não foi encontrada, continua a verificação da tabela
        }

        // Verifica se há registros na tabela
        List<WebElement> linhas = driver.findElements(By.xpath(xpathLinhasTabela));

        if (!linhas.isEmpty()) {
            System.out.println("Tabela encontrada e contém " + linhas.size() + " registros.");
        } else {
            throw new RuntimeException("Erro: A tabela mxdatatable não contém registros.");
        }
    }


    public void selecionaStatusDeInutilizacaoFeatureVFS014(String statusInutilizacao) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='controle-stInutilizacao']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(statusInutilizacao);
    }

    public void informaSerieNotaFeatureVFS014(String serieNota) {
        limparElementoByXpath(inputSerieNota);
        clicarElementoByXpath(inputSerieNota);
        preencherElementoByXpath(inputSerieNota, serieNota);
    }

    public void informaDataInicialFeatureVFS014() {
        limparElementoByXpath(inputDataInicial);
        clicarElementoByXpath(inputDataInicial);
        preencherElementoByXpath(inputDataInicial, DataUtils.DataRetroativo(2));
    }

    public void informaDataFinalFeatureVFS014() {
        limparElementoByXpath(inputDataFinal);
        clicarElementoByXpath(inputDataFinal);
        preencherElementoByXpath(inputDataFinal, DataUtils.DataAtual());
    }

    public void clicaEmConsultarInutilizacaoFeatureVFS014() {
        esperarMilissegundos(2000);
        clicarElementoByXpath(btnConsultarInutilizacao);
        esperarMilissegundos(3000);
    }

    public void informaPeriodoDataInicialFeatureVFS014() {
        limparElementoByXpath(inputPeriodoInicial);
        clicarElementoByXpath(inputPeriodoInicial);
        preencherElementoByXpath(inputPeriodoInicial, DataUtils.DataRetroativo(2));
    }

    public void informaPeriodoDataFinalFeatureVFS014() {
        limparElementoByXpath(inputPeriodoFinal);
        clicarElementoByXpath(inputPeriodoFinal);
        preencherElementoByXpath(inputPeriodoFinal, DataUtils.DataAtual());
        clicarElementoByXpath(inputPeriodoFinal);
    }

    public void informaEmpresaNaPageInformacoesFeatureVFS014(String empresa) {
        clicarElementoByXpath(inputEmpresaPageInformacoes);
        preencherElementoByXpath(inputEmpresaPageInformacoes, empresa);

    }

    public void clicaEmComputarEstatisticaFeatureVFS014() {
        esperarMilissegundos(2000);
        clicarElementoByXpath(btnComputaEstatistica);
        esperarMilissegundos(2000);
    }


}
