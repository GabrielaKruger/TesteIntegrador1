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

    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String btnXpathFim = "']/div/button";
    String selectXpathFim = "']/div/select";

//    public void selecionarAAutorizaçãoFeatureTGR009(String empresa) {
//        testConsultaRegistroGrid (empresa, inputEmpresaXpath, inputXpathFim);
//    }

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

    public void removeProdutoFeatureTGR009(String produto) {
        testConsultaRegistroGrid (produto, inputProdutoXpath, inputXpathFim);


    }
}

