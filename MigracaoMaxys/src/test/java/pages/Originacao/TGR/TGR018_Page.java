package pages.Originacao.TGR;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TGR018_Page extends BasePage {
    WebDriver driver;

    public TGR018_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Solicitante/Autorizador
    String inputModalidadeXpath = "//*[@id='tipomodalgrao-cdModalidade-";
    String slectTipoContratoXpath = "//*[@id='tipomodalgrao-tpContrato-";

    //Globais
    int primeiraLinhaEmBranco;
    int validaLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String selectXpathFim = "']/div/select";


    public void preencherModalidadeFeatureTGR018(String empresa) {
        esperarMilissegundos(500); // espera necessária
        primeiraLinhaEmBranco = Integer.parseInt(testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(inputModalidadeXpath, inputXpathFim));

        String linhaGridModalidadeXpath = inputModalidadeXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridModalidadeXpath,2);
        preencherElementoByXpath(linhaGridModalidadeXpath, empresa);
        pressionaTabActions();
    }

    public void selecionarOTipoContratoFeatureTGR018(String tipoContrato) {

        String linhaGridTipoContratoXpath = slectTipoContratoXpath + primeiraLinhaEmBranco + selectXpathFim;
        String selectGridTipoContratoXpath = slectTipoContratoXpath + primeiraLinhaEmBranco + selectXpathFim + "/option[" + tipoContrato + "]";

        clicarElementoByXpathNVezes(linhaGridTipoContratoXpath,1);
        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(selectGridTipoContratoXpath,1);
        esperarMilissegundos(500); // espera necessária
        clicarElementoByXpathNVezes(linhaGridTipoContratoXpath,1);
        esperarMilissegundos(2000); // espera necessária
    }
}

