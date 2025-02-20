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


    //Strings Input page Limite Fixação
    String inputEmpresa2Xpath= "//*[@id='consulta-cdEmpresa']/div/input";
    String inputItem2Xpath= "//*[@id='consulta-cdItem']/div/input";
    String inputCondtPagamentoXpath= "//*[@id='consulta-cdCondpagto']/div/input";

    String btnAmbasXpath= "//*[@id='ngx-radio-6']";

    String btnConsultarXpath= "//*[@id='consulta-btnConsultar']/div/button/div";

    String inputEmpresaLimiteXpath= "//*[@id='autorizquitacao-cdEmpresa-0']/div/input";
    String inputItemLimiteXpath= "//*[@id='autorizquitacao-cdItem-0']/div/input";
    String inputTipoPessoaLimiteXpath= "//*[@id='autorizquitacao-tpFornecedor-0']/div/input";
    String inputCondtPagamentoLimiteXpath= "//*[@id='autorizquitacao-cdCondpagto-0']/div/input";
    String inputPesoMínimoLimiteXpath= "//*[@id='autorizquitacao-psMinimo-0']/div/input";
    String inputPesoMáximoLimiteXpath= "//*[@id='autorizquitacao-psMaximo-0']/div/input";
    String inputValorMínimoLimiteXpath= "//*[@id='autorizquitacao-vlMinimo-0']/div/input";
    String inputValorMáximoLimiteXpath= "//*[@id='autorizquitacao-vlMaximo-0']/div/input";

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

    //Page Limite Fixação

    public void preencherEmpresaLimiteFeatureGAC002(String empresaLimite) {
        preencherCampoPorXpathFeatureGAC002(inputEmpresa2Xpath, empresaLimite);
    }

    public void preencherItemLimiteFeatureGAC002(String itemLimite) {
        preencherCampoPorXpathFeatureGAC002(inputItem2Xpath, itemLimite);
    }

    public void preencherCondtPagamentoLimiteFeatureGAC002(String condtPagamento) {
        preencherCampoPorXpathFeatureGAC002(inputCondtPagamentoXpath, condtPagamento);
    }

    public void selecionarTipoPessoaLimiteFeatureGAC002(String tipoPessoa) {
        clicarElementoWebByXpath(btnAmbasXpath);
    }

    public void preencherEmpresaLimitesFixaçãoFeatureGAC002(String empresaLimite2) {
        preencherCampoPorXpathFeatureGAC002(inputEmpresaLimiteXpath, empresaLimite2);
    }

    public void preencherItemLimitesFixaçãoFeatureGAC002(String itemLimite2) {
        preencherCampoPorXpathFeatureGAC002(inputItemLimiteXpath, itemLimite2);
    }

    public void preencherCondiçãoDePagementoLimitesFixaçãoFeatureGAC002(String condtPagamento2) {
        preencherCampoPorXpathFeatureGAC002(inputCondtPagamentoLimiteXpath, condtPagamento2);
    }

    public void preencherPesoMínimoLimitesFixaçãoFeatureGAC002(String pesoMinimo) {
        preencherCampoPorXpathFeatureGAC002(inputPesoMínimoLimiteXpath, pesoMinimo);
    }

    public void preencherPesoMáximoLimitesFixaçãoFeatureGAC002(String pesoMaximo) {
        preencherCampoPorXpathFeatureGAC002(inputPesoMáximoLimiteXpath, pesoMaximo);
    }

    public void preencherValorMínimoFeatureGAC002(String valorMinimo) {
        preencherCampoPorXpathFeatureGAC002(inputValorMínimoLimiteXpath, valorMinimo);
    }

    public void preencherValorMáximoFeatureGAC002(String valorMaximo) {
        preencherCampoPorXpathFeatureGAC002(inputValorMáximoLimiteXpath, valorMaximo);
    }

    public void selecionarPageFeatureGAC002(String botao) {
        esperarMilissegundos(2000); // espera necessária
        selecionarPaginaNoMenu(botao);
    }

    public void clicarBotãoConsultarFeatureGAC002(String botao) {
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(btnConsultarXpath, 2);
        esperarMilissegundos(3000);//espera necessária

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

