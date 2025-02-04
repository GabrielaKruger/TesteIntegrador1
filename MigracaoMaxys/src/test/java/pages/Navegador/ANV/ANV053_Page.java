package pages.Navegador.ANV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class ANV053_Page extends BasePage {
    WebDriver driver;

    //Strings Input
    String inputEmpresaXpath= "//*[@id='controle-cdEmpresa']/div/input";
    String inputUsuárioXpath= "//*[@id='controle-cdUsuario']/div/input";
    String inputProgramaXpath= "//*[@id='controle-nmPrograma']/div/input";

    //Strings Select
    String selectTipoDeAcessoXpath= "//*[@id='controle-tpAcesso']/div/select";
    String selectExclusãoXpath= "//*[@id='controle-excluir']/div/select";
    String selectInclusãoXpath= "//*[@id='controle-incluir']/div/select";
    String selectAlteraçãoXpath= "//*[@id='controle-alterar']/div/select";
    String selectEmpLogadaXpath= "//*[@id='controle-emplogada']/div/select";
    String selectEmpUsuárioXpath= "//*[@id='controle-empusuario']/div/select";

    //Strings Botão
    String btnConsultarXpath= "//*[@id='controle-btnConsulta']/div/button/div";
    String btnGridXpath= "//*[@id='deskacesso-cbExcluir-0']/div/button";
    String btnAbasXpath= "//*[@id='deskacesso-btAbas']/div/button/div";
    String btnFecharXpath= "//*[@id='programaempr-btFechar']/div/button/div";
    String btnPermissoesUnificadasXpath= "//*[@id='deskacesso-btPermunificada']/div/button/div";
    String btnConsultarConsultaXpath= "//*[@id='conspermissao-pushButton23']/div/button";
    String btnFecharConsultaXpath= "//*[@id='conspermissao-item30']/div/button/div";

    //String Regras de Acesso
    String inputEmpresaRegrasDeAcesso= "//*[@id='deskacesso-cdEmpresa-0']/div/input";
    String inputUsuárioRegrasDeAcessoXpath= "//*[@id='deskacesso-usuario-0']/div/input";
    String inputProgramaRegrasDeAcessoXpath= "//*[@id='deskacesso-nmPrograma-0']/div/input";

    //Strings Select Regras de Acesso
    String selectTipoDeAcessoRegrasDeAcessoXpath= "//*[@id='deskacesso-tpAcesso-0']/div/select";
    String selectExclusãoRegrasDeAcessoXpath= "//*[@id='deskacesso-excluir-0']/div/select";
    String selectInclusãoRegrasDeAcessoXpath= "//*[@id='deskacesso-incluir-0']/div/select";
    String selectAlteraçãoRegrasDeAcessoXpath= "//*[@id='deskacesso-alterar-0']/div/select";
    String selectEmpLogadaRegrasDeAcessoXpath= "//*[@id='deskacesso-emplogada-0']/div/select";
    String selectEmpUsuárioRegrasDeAcessoXpath= "//*[@id='deskacesso-empusuario-0']/div/select";

    //Strings Input Regras de Acesso Consulta
    String inputEmpresaConsultaXpath= "//*[@id='conspermissao-cdEmpresa']/div/input";
    String inputUsuarioConsultaXpath= "//*[@id='conspermissao-cdUsuario']/div/input";
    String inputProgramaConsultaXpath= "//*[@id='conspermissao-nmPrograma']/div/input";

    public ANV053_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherEmpresaFeatureANV053(String empresa) {
        preencherCampoPorXpathFeatureANV053(inputEmpresaXpath, empresa);
    }

    public void preencherUsuárioFeatureANV053(String usuario) {
        preencherCampoPorXpathFeatureANV053(inputUsuárioXpath, usuario);
    }

    public void preencherProgramaFeatureANV053(String programa) {
        preencherCampoPorXpathFeatureANV053(inputProgramaXpath, programa);
    }

    public void selecionarTipoDeAcessoFeatureANV053(String tipoAcesso) {
        preencherCampoPorXpathFeatureANV053(selectTipoDeAcessoXpath, tipoAcesso);
    }

    public void selecionarExclusãoFeatureANV053(String exclusao) {
        preencherCampoPorXpathFeatureANV053(selectExclusãoXpath, exclusao);
    }

    public void selecionarInclusãoFeatureANV053(String inclusao) {
        preencherCampoPorXpathFeatureANV053(selectInclusãoXpath, inclusao);
    }

    public void selecionarAlteraçãoFeatureANV053(String alteracao) {
        preencherCampoPorXpathFeatureANV053(selectAlteraçãoXpath, alteracao);
    }

    public void selecionarEmpLogadaFeatureANV053(String empLogada) {
        preencherCampoPorXpathFeatureANV053(selectEmpLogadaXpath, empLogada);
    }

    public void selecionarEmpUsuárioFeatureANV053(String empusuario) {
        preencherCampoPorXpathFeatureANV053(selectEmpUsuárioXpath, empusuario);
    }

    public void clicarBotãoConsultarFeatureANV053(String consultar) {
        clicarElementoByXpathNVezesFeatureANV053(btnConsultarXpath, 1);
    }

    public void preencherEmpresaRegrasDeAcessoFeatureANV053(String empresa2) {
        preencherCampoPorXpathFeatureANV053(inputEmpresaRegrasDeAcesso, empresa2);
    }

    public void preencherUsuárioRegrasDeAcessoFeatureANV053(String usuario2) {
        preencherCampoPorXpathFeatureANV053(inputUsuárioRegrasDeAcessoXpath, usuario2);
        pressionaTabActions();
    }

    public void preencherProgramaRegrasDeAcessoANV053(String programa2) {
        clicarElementoByXpathNVezesFeatureANV053(inputProgramaRegrasDeAcessoXpath, 1);
    }

    public void selecionarTipoDeAcessoRegrasDeAcessoFeatureANV053(String tipoAcesso2) {
        preencherCampoPorXpathFeatureANV053(selectTipoDeAcessoRegrasDeAcessoXpath, tipoAcesso2);
    }

    public void selecionarExclusãoRegrasDeAcessoFeatureANV053(String exclusao2) {
        preencherCampoPorXpathFeatureANV053(selectExclusãoRegrasDeAcessoXpath, exclusao2);
    }

    public void selecionarInclusãoRegrasDeAcessoFeatureANV053(String inclusao2) {
        preencherCampoPorXpathFeatureANV053(selectInclusãoRegrasDeAcessoXpath, inclusao2);
    }

    public void selecionarAlteraçãoRegrasDeAcessoFeatureANV053(String alteracao2) {
        preencherCampoPorXpathFeatureANV053(selectAlteraçãoRegrasDeAcessoXpath, alteracao2);
    }

    public void selecionarEmpLogadaRegrasDeAcessoFeatureANV053(String empLogada) {
        preencherCampoPorXpathFeatureANV053(selectEmpLogadaRegrasDeAcessoXpath, empLogada);
    }

    public void selecionarEmpUsuárioRegrasDeAcessoFeatureANV053(String empUsuario) {
        preencherCampoPorXpathFeatureANV053(selectEmpUsuárioRegrasDeAcessoXpath, empUsuario);
    }

    public void selecionarEmpresaCadastradaFeatureANV053() {
        // Aguarda 3 segundos
        esperarMilissegundos(3000);

        try {
            // XPath do botão na primeira linha do grid
            String xpathPrimeiraLinhaBotao = "//*[@id='deskacesso-cbExcluir-0']/div/button";

            // Localiza o botão na primeira linha
            WebElement botaoPrimeiraLinha = driver.findElement(By.xpath(xpathPrimeiraLinhaBotao));

            // Clica no botão localizado
            botaoPrimeiraLinha.click();

            // Aguarda para observar o comportamento após o clique
            esperarMilissegundos(2000);

            // Mensagem de sucesso
            System.out.println("Botão na primeira linha clicado com sucesso.");

        } catch (Exception e) {
            // Exibe mensagem de erro caso o botão não seja encontrado ou clicável
            System.out.println("Erro ao clicar no botão na primeira linha do grid: " + e.getMessage());
        }

        // Aguarda mais 4 segundos após a operação
        esperarMilissegundos(4000);
    }

    public void clicarProgramaRegrasDeAcessoFeatureANV053() {
        clicarElementoByXpathNVezes(inputProgramaRegrasDeAcessoXpath, 1);
    }

    //Negativo

    public void clicarBotãoConsultarFeatureANV052(String abas) {
        clicarElementoByXpathNVezesFeatureANV053(btnAbasXpath, 1);
    }

    public void clicarBotãoParaFecharFeatureANV053(String fechar) {
        clicarElementoByXpathNVezesFeatureANV053(btnFecharXpath, 1);
    }

    public void clicarBotãoParaAsVerificarPermissõesFeatureANV053(String permissoesUnificadas) {
        clicarElementoByXpathNVezesFeatureANV053(btnPermissoesUnificadasXpath, 1);
    }

    public void preencherEmpresaConsultaDePermissõesFeatureANV053(String empresa) {
        preencherCampoPorXpathFeatureANV053(inputEmpresaConsultaXpath, empresa);
    }

    public void preencherUsuárioConsultaDePermissõesFeatureANV053(String usuario) {
        preencherCampoPorXpathFeatureANV053(inputUsuarioConsultaXpath, usuario);
    }

    public void preencherProgramaConsultaDePermissõesFeatureANV053(String programa) {
        preencherCampoPorXpathFeatureANV053(inputProgramaConsultaXpath, programa);
    }

    public void clicarBotãoConsultaDePermissõesANV053(String consultaPermissoes) {
        clicarElementoByXpathNVezesFeatureANV053(btnConsultarConsultaXpath, 1);
    }

    public void clicarBotãoFecharConsultaANV053(String fecharConsulta) {
        clicarElementoByXpathNVezesFeatureANV053(btnFecharConsultaXpath, 1);
    }


    public void preencherCampoPorXpathFeatureANV053(String campoXpath, String valor) { //método complementar
        esperarMilissegundos(7000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 2);
        preencherElementoByXpath(campoXpath, valor);
        pressionarENTERByXpath(campoXpath);
        //pressionaTabActions();
        esperarMilissegundos(4000);//espera necessária
    }

    public void clicarElementoByXpathNVezesFeatureANV053(String campoXpath, int vezes){ //método complementar
        esperarMilissegundos(3000);//espera necessária
        clicarElementoByXpathNVezes(campoXpath, 1);
        esperarMilissegundos(3000);//espera necessária
    }

}