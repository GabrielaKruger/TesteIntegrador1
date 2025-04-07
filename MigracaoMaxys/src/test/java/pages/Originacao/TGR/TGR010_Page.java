package pages.Originacao.TGR;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import com.github.javafaker.Faker;

public class TGR010_Page extends BasePage {
    WebDriver driver;

    public TGR010_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Solicitante/Autorizador
    String inputCodigoXpath = "//*[@id='itembalanca-cdItembal-";
    String inputTipoPedidoXpath = "//*[@id='itembalanca-cdTipopedido-";
    String inputDescricaoXpath = "//*[@id='itembalanca-dsItembal-";
    String inputItemTransXpath = "//*[@id='itembalanca-cdItemtransgenico-";

    String radioClassificarXpath = "//*[@id='itembalanca-stDesdobro-";
    String radioSegundaClasXpath = "//*[@id='itembalanca-stManterpesagempendente-";
    String radioProdutoBiomaXpath = "//*[@id='itembalanca-stRestricaobiomamazonico-";
    String radioProdutoPOPXpath = "//*[@id='itembalanca-stConformecertificacao-";
    String radioOrdemXpath = "//*[@id='itembalanca-stOrdemcarregobrigatoria-";


    //Globais
    int primeiraLinhaEmBranco;
    String descricaoFaker = "Teste automacao -";
    String inputXpathFim = "']/div/input";
    String checkBoxFim = "1']/div/button";


    public void preencherCódigoFeatureTGR010(String codigo) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputCodigoXpath, inputXpathFim));

        String linhaGridCodigoXpath = inputCodigoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCodigoXpath,2);
        preencherElementoByXpath(linhaGridCodigoXpath, codigo);
        pressionaTabActions();
    }

    public void preencherTipoDePedidoFeatureTGR010(String tipoPerido) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputTipoPedidoXpath, inputXpathFim));

        String linhaGridTipoPedidoXpath = inputTipoPedidoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipoPedidoXpath,2);
        preencherElementoByXpath(linhaGridTipoPedidoXpath, tipoPerido);
    }

    public void preencherDescriçãoFeatureTGR010() {
        descricaoFaker = "Teste automacao - " + faker.numerify("###");
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputDescricaoXpath, inputXpathFim));

        String linhaGridDescricaoXpath = inputDescricaoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridDescricaoXpath,2);
        preencherElementoByXpath(linhaGridDescricaoXpath, descricaoFaker);
    }

    public void preencherItemTransgênicoFeatureTGR010(String itemTransfenico) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputItemTransXpath, inputXpathFim));

        String linhaGridItemTransXpath = inputItemTransXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridItemTransXpath,2);
        preencherElementoByXpath(linhaGridItemTransXpath, itemTransfenico);
    }

    public void classificarFeatureTGR010(String acao) {
        String radioCancelarXpath = radioClassificarXpath + checkBoxFim;
        testMarcaDesmarcaCheckBox("marcar", radioCancelarXpath);
    }

    public void segurnaClassificacaoFeatureTGR010(String acao) {
        String radioSegundaXpath = radioSegundaClasXpath + checkBoxFim;
        testMarcaDesmarcaCheckBox("marcar", radioSegundaXpath);
    }

    public void produtoComRestricaoNoBiomaAmazônicoFeatureTGR010() {
        String radioProdutoBioXpath = radioProdutoBiomaXpath + checkBoxFim;
        testMarcaDesmarcaCheckBox("marcar", radioProdutoBioXpath);
    }

    public void produtoComCertificaçãoDeQualidadePOPFeatureTGR010() {
        String radioProdutoQPOPXpath = radioProdutoPOPXpath + checkBoxFim;
        testMarcaDesmarcaCheckBox("marcar", radioProdutoQPOPXpath);
    }

    public void ordemDeCarregamentoObrigatóriaFeatueTGR010() {
        String radioOrdemCXpath = radioOrdemXpath + checkBoxFim;
        testMarcaDesmarcaCheckBox("marcar", radioOrdemCXpath);
    }

    public void nãoPreencherCódigoFeatureTGR010() {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputCodigoXpath, inputXpathFim));

        String linhaGridCodigoXpath = inputCodigoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCodigoXpath,2);
        pressionaTabActions();
    }

    public void nãoPreencherTipoDePedidoFeatureTGR010() {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputTipoPedidoXpath, inputXpathFim));

        String linhaGridTipoPedidoXpath = inputTipoPedidoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipoPedidoXpath,2);
        pressionaTabActions();
    }
}