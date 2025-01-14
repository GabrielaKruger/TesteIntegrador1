package pages.Originacao.BAL;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static utils.DataUtils.DataAtual;
import static utils.DataUtils.DataRetroativo;

public class BAL017_Page extends BasePage {
    WebDriver driver;

    //Strings Pesagens Bloqueadas
    String inputEmpresaXpath= "//*[@id='filtro-cdEmpresa']/div/input";
    String inputDepositoXpath= "//*[@id='filtro-nrMoega']/div/input";
    String inputPeriodoInicialXpath="//*[@id='filtro-dtInicio']/div/div/input";
    String inputPeriodoFinalXpath="//*[@id='filtro-dtFinal']/div/div/input";
    String btnAutorizarXpath= "//*[@id='pesagembal-bntAutorizar']/button/div";
    String btnRecusarXpath= "//*[@id='pesagembal-bntRecusar']/button/div";
    String btnFiltrarXpath= "//*[@id='filtro-btnFiltrar']/button/div";
    String btnFiltrarXpath1 = "//*[@id='filtro-btnFiltrar']/button";
    String dataAtual = DataAtual();
    String dataRetroativa = DataRetroativo(40);

    //Strings para Filtrar
    String selectStatusXpath= "//*[@id='filtro-stBloqueio']/div/select";
    String selectAmbosXpath= "//*[@id='filtro-tpFaturamento']/div/select";

    public BAL017_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherEmpresaFeatureBAL017(String empresa) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputEmpresaXpath, 2);
        preencherElementoByXpath(inputEmpresaXpath, empresa);
        esperarMilissegundos(2000);//espera necessária
    }

    public void preencherDepósitoFeatureBAL017(String deposito) {
        esperarMilissegundos(4000);//espera necessária
        clicarElementoByXpathNVezes(inputDepositoXpath, 2);
        esperarMilissegundos(2000);//espera necessária
        preencherElementoByXpath(inputDepositoXpath, deposito);
        esperarMilissegundos(4000);//espera necessária
    }

    public void selecionarStatusFeatureBAL017(String opcao) {
        esperarMilissegundos(3000);//espera necessária
        esperarEncontrarESelecionar(selectStatusXpath, opcao);
        esperarMilissegundos(2000);//espera necessária
    }

    public void selecionarFaturamentoFeatureBAL017(String opcao) {
        esperarMilissegundos(3000);//espera necessária
        esperarEncontrarESelecionar(selectAmbosXpath, opcao);
        esperarMilissegundos(2000);//espera necessária
    }

    public void preencherPeríodoInicialFeatureBAL017(String periodoInicial) {
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(inputPeriodoInicialXpath, 2);
        preencherElementoByXpath(inputPeriodoInicialXpath, dataRetroativa);
        esperarMilissegundos(2000);//espera necessária
    }

    public void preencherPeríodoFinalFeatureBAL017(String periodoFinal) {
        esperarMilissegundos(2000);//espera necessária
        clicarElementoByXpathNVezes(inputPeriodoFinalXpath, 2);
        esperarMilissegundos(2000);//espera necessária
        preencherElementoByXpath(inputPeriodoFinalXpath, dataAtual);
        esperarMilissegundos(2000);//espera necessária
    }

    public void clicarBotãoParaFiltrarBAL017(String filtrar) {
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(btnFiltrarXpath1, 3);
        esperarMilissegundos(5000);//espera necessária
        //Incluido clicar no campo empresa para desbloquear grid abaixo autorizar
        clicarElementoByXpathNVezes(inputEmpresaXpath, 1);
        esperarMilissegundos(2000);
    }

    public void clicarBotãoAutorizarFeatureBAL017(String botao) {
        esperarMilissegundos(5000);//espera necessária
        clicarElementoByXpathNVezes(btnAutorizarXpath, 1);
        esperarMilissegundos(4000);//espera necessária
    }

    public void clicarBotãoRecusarFeatureBAL017(String botao2) {
        esperarMilissegundos(5000);//espera necessária
        clicarElementoByXpathNVezes(btnRecusarXpath, 1);
        esperarMilissegundos(4000);//espera necessária
    }
}
