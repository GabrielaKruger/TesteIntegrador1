package pages.Faturamento.REC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.DataUtils;

import java.time.Duration;


public class REC001_Page extends BasePage {
    WebDriver driver;


    // String Page Notas
    String btnCanelarNotaMestraXpath = "//*[@id='esttransmestraAux-btnCancelar";
    String inputCNPJCPFXpath = "//*[@id='esttrans-nrCgcclifor";
    String inputNotaFiscalXpath = "//*[@id='esttrans-nrNffornec";
    String inputSerieXpath = "//*[@id='esttrans-cdSeriefornec";
    String inputEspecieXpath = "//*[@id='esttrans-cdEspecfornec";
    String inputDataEmissaoXpath = "//*[@id='esttrans-dtEmissaofornec";
    String inputDesembarqueXpath = "//*[@id='esttrans-nrEmbarque";
    String inputDataVenciXpath = "//*[@id='esttrans-dtVencimento";
    String inputFormaPagXpath = "//*[@id='esttrans-cdFormapagto";
    String inputCondPagXpath = "//*[@id='esttrans-cdCondpagto";
    String inputMoedaXpath = "//*[@id='esttrans-cdMoedatrans";
    String inputValorNotaXpath = "//*[@id='esttrans-vlNfcontabil";
    String inputDepartamentoXpath = "//*[@id='esttranscompl-cdDepartamento";


    // String Globais
    String primeiraLinhaEmBranco;
    String codigoSimulated;
    String linhaDescricaoElement;
    String descricaoFaker = "Teste automacao -";
    String inputXpathFim = "']/div/input";
    String btnXpathFim = "']/div/button/div";
    String inputDataXpath = "']/div/div/input";


    public REC001_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencheNCNPJCPFFeatureREC001(String clifor) {
        encontrarEPreencherElementos(inputCNPJCPFXpath, inputXpathFim, clifor);
    }

    public void clicarEmCancelarNaTelaDeSeleçãoDeNotasMestrasFeatureREC001() {
        String btnCancelar = btnCanelarNotaMestraXpath + btnXpathFim;
        esperarMilissegundos(5000); // espera necessária
        clicarElementoByXpathNVezes(btnCancelar,1);
    }

    public void preencherNotaFiscalFeatureREC001(String notaFiscal) {
        encontrarEPreencherElementos(inputNotaFiscalXpath, inputXpathFim,notaFiscal);
    }

    public void preencherSérieFeatureREC001(String serie) {
        encontrarEPreencherElementos(inputSerieXpath, inputXpathFim, serie);
    }

    public void preencherEspecieFeatureREC001(String especie) {
        String elementoTabela = "lovEspecie";
        selecionarPeloF9REC001(elementoTabela, especie);
    }

    public void preencherDataEmissãoFeatureREC001() {
        encontrarEPreencherElementos(inputDataEmissaoXpath,inputDataXpath,DataUtils.DataAtual() );
        pressionaTabActions();
    }

    public void clicarEmDesembarqueFeatureREC001() {
        clicarElementoByXpathNVezes(inputDesembarqueXpath + inputXpathFim, 1 );
        pressionaTabActions();
    }

    public void preencherFormaDePagamentoFeatureREC001(String formaPagamento) {
        encontrarEPreencherElementos(inputFormaPagXpath,inputXpathFim,formaPagamento);
    }

    public void preencherCondiçãoPagamentoFeatureREC001(String condicaoPagamento) {
        encontrarEPreencherElementos(inputCondPagXpath,inputXpathFim,condicaoPagamento);
    }

    public void preencherDataVencimentoFeatureREC001() {
        encontrarEPreencherElementos(inputDataVenciXpath,inputDataXpath,DataUtils.DataAtual() );
    }

    public void preencherMoedaTransaçãoFeatureREC001(String moedaTransacao) {
        limparCampoDeTextoPorXpath(inputMoedaXpath + inputXpathFim);
        encontrarEPreencherElementos(inputMoedaXpath,inputXpathFim, moedaTransacao);
    }

    public void preencherValorNotaFeatureREC001(String valorNota) {
        encontrarEPreencherElementos(inputValorNotaXpath, inputXpathFim, valorNota);
    }


    public void clicarEmDepartamentoFeatureREC001() {
        clicarElementoByXpathNVezes(inputDepartamentoXpath + inputXpathFim, 1);
        pressionaTabActions();
    }


    // Método auxiliar para Seleção da Espécie
    public void selecionarPeloF9REC001(String elementoTabela, String valor) {

        String inputLovXpath = "//*[@id='input-search-lov']";
        String tabelaXpath = "//tbody/tr[contains(@id, '" + elementoTabela + "-')]";

        WebElement inputLovXpathElement = driver.findElement(By.xpath(inputLovXpath));
        esperarElementoByXpath(inputLovXpath);
        preencherElementoByXpath(inputLovXpath, valor);
        inputLovXpathElement.sendKeys(Keys.ENTER);
        encontrarElementoNaTabela(tabelaXpath, valor);
        pressionaTabActions();
    }



//    // Meteodo para preencher código
//    public void preencherCodigoRepetidoFeatureREC001(String repetido) {
//        primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid("//*[@id='msTipocertificado-cdTipocertificado-", "']/div/input");
//        String linhaCodigoElement = "//*[@id='msTipocertificado-cdTipocertificado-" + primeiraLinhaEmBranco + "']/div/input";
//
//        if (repetido.equalsIgnoreCase("sim")) {
//            // Buscar todos os códigos já cadastrados e selecionar um deles
//            codigoSimulated = obterCodigoExistente(idColunaCadastrada);
//        } else {
//            do {
//                codigoSimulated = faker.numerify("###");
//            } while (isCodigoCadastrado(codigoSimulated, idColunaCadastrada));
//        }
//
//        clicarElementoByXpathNVezes(linhaCodigoElement, 2);
//        esperarMilissegundos(1000);
//        preencherElementoByXpath(linhaCodigoElement, codigoSimulated);
//    }
//
//    // Metodo para preencher Descricao
//    public void preencherDescriçãoFeatureREC001() {
//        if (primeiraLinhaEmBranco == null) {
//            primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid("//*[@id='msTipocertificado-dsTipocertificado-", "']/div/input");
//        }
//        linhaDescricaoElement = "//*[@id='msTipocertificado-dsTipocertificado-" + primeiraLinhaEmBranco + "']/div/input";
//        descricaoFaker = "Teste automacao - " + faker.numerify("###");
//        clicarElementoByXpath(linhaDescricaoElement);
//        esperarMilissegundos(5000);
//        preencherElementoByXpath(linhaDescricaoElement, descricaoFaker);
//    }
//
//    // Metodo para selecionar codigo cadastrado
//    public void selecionarCódigoCadastradoFeatureREC001() {
//        String varNrRecebto = codigoSimulated;
//        String xPathColunaTabelaInicio = "//*[@id='msTipocertificado-cdTipocertificado-";
//        String xPathColunaTabelaFim = "']/div/input";
//        boolean encontrouRegistro = testConsultaRegistroGrid(varNrRecebto, xPathColunaTabelaInicio, xPathColunaTabelaFim);
//        if (encontrouRegistro) {
//            System.out.println("Registro encontrado");
//
//        }
//    }


}








