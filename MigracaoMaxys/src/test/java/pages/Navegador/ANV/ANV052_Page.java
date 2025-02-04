package pages.Navegador.ANV;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ANV052_Page extends BasePage {
    WebDriver driver;

    //Strings Input
    String inputProgramaXpath= "//*[@id='controle-nmPrograma']/div/input";
    String inputDescricaoXpath= "//*[@id='controle-dsPrograma']/div/input";
    String inputArquivoXpath= "//*[@id='controle-nmArquivo']/div/input";

    //Strings Input page Programa
    String inputProgramapageXpath= "//*[@id='deskprograma-nmPrograma-1']/div/input";
    String inputDescricaopageXpath= "//*[@id='deskprograma-dsPrograma-1']/div/input";
    String inputArquivopageXpath= "//*[@id='deskprograma-nmArquivo-1']/div/input";

    //Strings select
    String selectTipoProgramaXpath= "//*[@id='controle-tpPrograma']/div/select";
    String selectExclusaoXpath= "//*[@id='controle-excluir']/div/select";
    String selectInclusaoXpath= "//*[@id='controle-incluir']/div/select";
    String selectAlteracaoXpath= "//*[@id='controle-alterar']/div/select";

    //Strings select page Programa
    String selectTipoProgramapageXpath= "//*[@id='deskprograma-tpPrograma-1']/div/select";
    String selectExclusaopageXpath= "//*[@id='deskprograma-tpPrograma-1']/div/select";
    String selectInclusaopageXpath= "//*[@id='deskprograma-incluir-1']/div/select";
    String selectAlteracaopageXpath= "//*[@id='deskprograma-alterar-1']/div/select";

    //Strings Botão
    String btnConsultarXpath= "//*[@id='controle-btnConsulta']/div/button/div";

    //Strings Botão Recurso

    String btnAbasXpath="//*[@id='deskprograma-btnAbas']/div/button/div";
    String btnSalvarXpath= "//*[@id='pageprograma-btSalvar']/div/button/div";
    String btnFecharXpath= "//*[@id='pageprograma-btCancelar']/div/button/div";


    public ANV052_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void preencherProgramaPageProgramaFeatureANV052(String programa1) {
        //limparCampoDeTextoPorXpath(inputProgramapageXpath);
        limparElementoByXpath(inputProgramapageXpath);
        preencherCampoPorXpathFeatureANV052(inputProgramapageXpath, programa1);
    }

    public void preencherDescriçãoPageProgramaFeatureANV052(String descricao) {
        preencherCampoPorXpathFeatureANV052(inputDescricaopageXpath, descricao);
    }

    public void preencherArquivoPageProgramaFeatureANV052(String arquivo1) {
        limparElementoByXpath(inputArquivopageXpath);
        preencherCampoPorXpathFeatureANV052(inputArquivopageXpath, arquivo1);
    }

    public void selecionarTipoProgramaPageProgramaFeatureANV052(String tipoPrograma) {
        preencherCampoPorXpathFeatureANV052(selectTipoProgramapageXpath, tipoPrograma);
    }

    public void selecionarExclusãoPageProgramaFeatureANV052(String exclusao) {
        preencherCampoPorXpathFeatureANV052(selectExclusaopageXpath,exclusao);
    }

    public void selecionarInclusãoPageProgramaFeatureANV052(String programa1) {
        preencherCampoPorXpathFeatureANV052(selectInclusaopageXpath, programa1);
    }

    public void selecionarAlteraçãoPageProgramaFeatureANV052(String alteracao) {
        preencherCampoPorXpathFeatureANV052(selectAlteracaopageXpath, alteracao);
    }

    //DIVISÃO

    public void preencherProgramaFeatureANV052(String programa) {
        preencherCampoPorXpathFeatureANV052(inputProgramaXpath, programa);
    }

    public void preencherDescriçãoFeatureANV052(String descricao) {
        preencherCampoPorXpathFeatureANV052(inputDescricaoXpath, descricao);
    }

    public void preencherArquivoFeatureANV052(String arquivo) {
        preencherCampoPorXpathFeatureANV052(inputArquivoXpath, arquivo);
    }

    public void selecionarTipoProgramaFeatureANV052(String tipoPrograma) {
        preencherCampoPorXpathFeatureANV052(selectTipoProgramaXpath, tipoPrograma);
    }

    public void selecionarExclusãoFeatureANV052(String exclusao) {
        preencherCampoPorXpathFeatureANV052(selectExclusaoXpath, exclusao);
    }

    public void selecionarInclusãoFeatureANV052(String inclusao) {
        preencherCampoPorXpathFeatureANV052(selectInclusaoXpath, inclusao);
    }

    public void selecionarAlteraçãoFeatureANV052(String alteracao) {
        preencherCampoPorXpathFeatureANV052(selectAlteracaoXpath, alteracao);
    }

    public void clicarBotãoConsultarFeatureANV052(String consultar) {
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(btnConsultarXpath, 2);
        esperarMilissegundos(3000);//espera necessária
    }

    public void clicarBotãoFeatureAbasANV052(String abas) {
        clicarElementoByXpathNVezesFeatureANV052(btnAbasXpath,1);
    }

    public void clicarBotãoParaSalvarFeatureANV052(String salvar) {
        clicarElementoByXpathNVezesFeatureANV052(btnSalvarXpath,1);
    }

    public void clicarBotãoParaFecharFeatureANV052(String fechar) {
        clicarElementoByXpathNVezesFeatureANV052(btnFecharXpath,1);
    }


    public void preencherProgramaABT072PageProgramaFeatureANV052(String programa) {
        limparElementoByXpath(inputProgramapageXpath);
        preencherCampoPorXpathFeatureANV052(inputProgramapageXpath, programa);
    }

    public void preencherArquivoABT072PageProgramaFeatureANV052(String arquivo) {
        clicarElementoByXpathNVezesFeatureANV052(inputArquivopageXpath,1);
    }

    public void preencherCampoPorXpathFeatureANV052(String campoXpath, String valor) {
        esperarMilissegundos(7000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 2);
        preencherElementoByXpath(campoXpath, valor);
        pressionarENTERByXpath(campoXpath);
        //pressionaTabActions();
        esperarMilissegundos(4000);//espera necessária
    }

    public void clicarElementoByXpathNVezesFeatureANV052(String campoXpath, int vezes){
        esperarMilissegundos(4000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 1);
        esperarMilissegundos(4000);//espera necessária
    }
}
