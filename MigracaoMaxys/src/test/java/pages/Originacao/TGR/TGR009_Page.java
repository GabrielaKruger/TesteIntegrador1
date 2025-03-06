package pages.Originacao.TGR;


import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TGR009_Page extends BasePage {
    WebDriver driver;

    public TGR009_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Solicitante/Autorizador
    String inputProdBalancaXpath = "//*[@id='itemsimilar-cdItembal-";
    String inputProdutoXpath = "//*[@id='itemsimilar-cdItem-";
    String selectSomentGraosXpath = "//*[@id='itemsimilar-stMovtograos-";
    String inputCulturaXpath = "//*[@id='itemsimilar-cdCultura-";

    //String Tipo de Cálculo
    String btnTpCalculo = "//*[@id='controle-btnCadastratpcalc']/div/button/div";
    String btnSalvarTipCalculoXpath = "//*[@id='controle-btnSalvar']/div/button/div";
    String btnFecharXpath = "//*[@id='controle-btnVoltar']/div/button/div";
    String inputTpCalculoXpath = "//*[@id='tpcalculo-cdTipocalculo-";


    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String btnXpathFim = "']/div/button";
    String selectXpathFim = "']/div/select";


    public void preencherProdutoDaBalancaFeatureTGR009(String prodBalanca) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputProdBalancaXpath, inputXpathFim));

        String linhaGridProdBalancaXpath = inputProdBalancaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridProdBalancaXpath,2);
        preencherElementoByXpath(linhaGridProdBalancaXpath, prodBalanca);
        pressionaTabActions();
    }

    public void preencherProdutoFeatureTGR009(String produto) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputProdutoXpath, inputXpathFim));

        String linhaGridProdutoXpath = inputProdutoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridProdutoXpath,2);
        preencherElementoByXpath(linhaGridProdutoXpath, produto);
        pressionaTabActions();
    }

    public void selecionaParaSomenteGrãosFeatureTGR009(int status) {

        String linhaGridSomentGraosXpath = selectSomentGraosXpath + primeiraLinhaEmBranco + selectXpathFim;

        String selectGridSomenteGraosXpath = selectSomentGraosXpath + primeiraLinhaEmBranco + selectXpathFim + "/option[" + status + "]";

        clicarElementoByXpathNVezes(linhaGridSomentGraosXpath,1);
//        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(selectGridSomenteGraosXpath,1);
//        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(linhaGridSomentGraosXpath,1);
//        esperarMilissegundos(2000); // espera necessária
    }

    public void preencherCulturaFeatureTGR009(String cultura) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputCulturaXpath, inputXpathFim));

        String linhaGridCulturaXpath = inputCulturaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCulturaXpath,2);
        preencherElementoByXpath(linhaGridCulturaXpath, cultura);
        pressionaTabActions();
    }

    public void selecionarOProdutoSimilarFeatureTGR009(String produtoBalanca, String produto) {
        testConsultaRegistroGridDuasColunas(produtoBalanca, inputProdBalancaXpath, inputXpathFim, produto, inputProdutoXpath, inputXpathFim);
    }

    public void clicarBotãoTipoDeCálculoFeatureTGR009() {
        clicarElementoByXpath(btnTpCalculo);
    }

    public void preencherTpCálculoFeatureTGR009(String tpCalculo) {
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputTpCalculoXpath, inputXpathFim));

        String linhaGridTipCalculoXpath = inputTpCalculoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipCalculoXpath,2);
        preencherElementoByXpath(linhaGridTipCalculoXpath, tpCalculo);
        pressionaTabActions();
    }

    public void clicarBotãoFecharFeatureTGR009() {
        clicarElementoByXpathNVezes(btnFecharXpath,1);
    }

    public void clicarBotãoSalvarTipoCálculoFeatureTGR009() {
        clicarElementoByXpathNVezes(btnSalvarTipCalculoXpath, 1);
    }

    public void selecionaTpCálculoFeatureTGR009(String tpCalculo) {
        testConsultaRegistroGrid(tpCalculo, inputTpCalculoXpath, inputXpathFim);
    }

}

