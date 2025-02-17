package pages.Originacao.GAC;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class GAC002_Page extends BasePage {
    WebDriver driver;

    //Strings Input page Preço de Graos
    String inputEmpresaXpath= "//*[@id='controle-cdEmpresa']/div/input";
    String inputProdutoXpath= "//*[@id='controle-cdItem']/div/input";
    String inputDtInicialXpath= "//*[@id='controle-dtInicial']/div/div/input";
    String inputDtFinalXpath= "//*[@id='controle-dtFinal']/div/div/input";


    String inputEmpresaPrecoXpath ="//*[@id='precograo-cdEmpresa-0']/div/input";
    String inputItemPrecoXpath= "//*[@id='precograo-cdItem-0']/div/input";
    String inputUnitarioXpath= "//*[@id='precograo-vlUnitario-0']/div/input";
    String selectTipoCalculoXpath= "//*[@id='precograo-cdTipocalculo-0']/div/select";
    String selectTipoPrecoXpath= "//*[@id='precograo-tpPreco-0']/div/select";
    String inputAcimaXpath= "//*[@id='precograo-pcVaracima-0']/div/input";
    String inputAbaixoXpath= "//*[@id='precograo-pcVarabaixo-0']/div/input";

    public GAC002_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherEmpresaFeatureGAC002(String empresa) {
        preencherCampoPorXpathFeatureGAC002(inputEmpresaXpath, empresa);
    }

    public void preencherProdutoFeatureGAC002(String produto) {
        preencherCampoPorXpathFeatureGAC002(inputProdutoXpath, produto);
    }

    public void preencherDataInicialFeatureGAC002(String dtInicial) {
        preencherCampoPorXpathFeatureGAC002(inputDtInicialXpath, dtInicial);
    }

    public void preencherDataFinalFeatureGAC002(String empresaPreco) {
        preencherCampoPorXpathFeatureGAC002(inputDtFinalXpath, empresaPreco);
    }

    public void preencherEmpresaPreçoDeGrãoFeatureGAC002(String empresaPreco) {
        clicarElementoByXpathNVezesFeatureGAC002(inputEmpresaPrecoXpath,1);

        //preencherCampoPorXpathFeatureGAC002(inputEmpresaPrecoXpath, empresaPreco);
    }

    public void preencherItemPreçoDeGrãoFeatureGAC002(String itemPreco) {
        clicarElementoByXpathNVezesFeatureGAC002(inputItemPrecoXpath,1);
        //limparElementoByXpath(inputItemPrecoXpath);
       // preencherCampoPorXpathFeatureGAC002(inputItemPrecoXpath, itemPreco);
    }

    public void preencherUnitárioPreçoDeGrãoFeatureGAC002(String unitario) {
        preencherCampoPorXpathFeatureGAC002(inputUnitarioXpath, unitario);
    }

    public void selecionarTipoDeCálculoPreçoDeGrãoFeatureGAC002(String tipoCalculo) {
        preencherCampoPorXpathFeatureGAC002(selectTipoCalculoXpath, tipoCalculo);
    }

    public void selecionarTipoDePreçoPreçoDeGrãoFeatureGAC002(String tipoPreco) {
        preencherCampoPorXpathFeatureGAC002(selectTipoPrecoXpath, tipoPreco);
    }

    public void preencherAcimaPreçoDeGrãoFeatureGAC002(String acima) {
        preencherCampoPorXpathFeatureGAC002(inputAcimaXpath, acima);
    }

    public void preencherAbaixoPreçoDeGrãoFeatureGAC002(String abaixo) {
        preencherCampoPorXpathFeatureGAC002(inputAbaixoXpath, abaixo);
    }

    public void preencherCampoPorXpathFeatureGAC002(String campoXpath, String valor) { //método complementar
        esperarMilissegundos(7000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 2);
        preencherElementoByXpath(campoXpath, valor);
        pressionarENTERByXpath(campoXpath);
        //pressionaTabActions();
        esperarMilissegundos(4000);//espera necessária
    }

    public void clicarElementoByXpathNVezesFeatureGAC002(String campoXpath, int vezes){ //método complementar
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 1);
        esperarMilissegundos(3000);//espera necessária
    }
}

