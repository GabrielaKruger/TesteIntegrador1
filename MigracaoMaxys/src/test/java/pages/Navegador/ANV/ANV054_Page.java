package pages.Navegador.ANV;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ANV054_Page extends BasePage {
    WebDriver driver;

    public ANV054_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

//    Botão consultar
    String btnConsultar = "//*[@id='controle-btnConsultar']/div/button/div";

//    Radio Button
    String radioBtnDePapel = "//*[@id='ngx-radio-1']";
    String radioBtnDeEmpresa = "//*[@id='ngx-radio-2']";
    String radioBtnParaTodasEmpresas = "//*[@id='ngx-radio-3']";

    int primeiraLinhaEmBranco;
    String primeiraLinhaEmBrancoCodigo;

    String inputEmpresaXpath = "//*[@id='controle-cdEmpresa']/div/input";
    String inputProgramaXpath = "//*[@id='controle-nmPrograma']/div/input";

    String xPathColunaEmpresaInicio = "//*[@id='programaempr-cdEmpresa-";
    String xPathColunaFim = "']/div/input";
    String xpathCompletoEmpresa;
    String xPathColunaPapelInicio = "//*[@id='programaempr-cdPapel-";
    String xpathCompletoPapel;
    String xPathColunaProgramaInicio = "//*[@id='programaempr-nmPrograma-";
    String xpathCompletoPrograma;
    String xpathCompletoPagina;
    String xPathColunaPaginaInicio = "//*[@id='programaempr-dsPage-";
    String xpathColunaTipoAcessoInicio = "//*[@id='programaempr-stExibir-";
    String xPathColunaTipoAcessoInicioCompleto;


    String h4ModalLOVId = "modal-basic-title";
    String inputLovXpath = "//*[@id='input-search-lov']";
    String tabelaPapelXpath = "//tbody/tr[contains(@id, 'lovUsuario2-')]";
    String tabelaProgramaXpath = "//tbody/tr[contains(@id, 'lovPage-')]";

    public void informarOCampoEmpresaFeatureANV054(String empresa) {
        esperarElementoClicavelByXpath(inputEmpresaXpath);
        clicarElementoByXpathNVezes(inputEmpresaXpath, 2);
        preencherElementoByXpath(inputEmpresaXpath, empresa);

    }

    public void informarOProgramaFeatureANV054(String programa) {
        esperarMilissegundos(2000);
        esperarElementoClicavelByXpath(inputProgramaXpath);
        clicarElementoByXpathNVezes(inputProgramaXpath, 2);
        esperarMilissegundos(2000);
        preencherElementoByXpath(inputProgramaXpath, programa);
    }

    public void selecionarDuplicacaoDePapelFeatureANV054() {
        WebElement radioButton = driver.findElement(By.xpath(radioBtnDePapel));

        if (!radioButton.isSelected()) {
            radioButton.click();
        }
    }

    public void clicarBotaoConsultarFeatureANV054() {
        esperarMilissegundos(1000);
        esperarElementoClicavelByXpath(btnConsultar);
        clicarElementoByXpathNVezes(btnConsultar, 2);
    }

    public void selecionarGridFeatureANV054(String empresa) {
        esperarMilissegundos(2000);
        primeiraLinhaEmBrancoCodigo = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(xPathColunaEmpresaInicio, xPathColunaFim);
        xpathCompletoEmpresa = xPathColunaEmpresaInicio + primeiraLinhaEmBrancoCodigo + xPathColunaFim;
        clicarBotaoToolBar("novo");
        encontrarElementoByXpath(xpathCompletoEmpresa);
        preencherElementoByXpath(xpathCompletoEmpresa, empresa);
        driver.findElement(By.xpath(xpathCompletoEmpresa)).sendKeys(Keys.TAB);
    }

    public void informarNoGridPapelFeatureANV054(String papel) {
        primeiraLinhaEmBrancoCodigo = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(xPathColunaPapelInicio, xPathColunaFim);
        xpathCompletoPapel = xPathColunaPapelInicio + primeiraLinhaEmBrancoCodigo + xPathColunaFim;
        encontrarElementoByXpath(xpathCompletoPapel);
        esperarMilissegundos(2000);
        pressionarF9ByXpath(xpathCompletoPapel);
        esperarMilissegundos(2000);
        if (!validarSeContemOElemento(h4ModalLOVId)) {
            pressionarF9ByXpath(xpathCompletoPapel);
        }
        validaModalByH4(h4ModalLOVId);
        WebElement inputLovXpathElement = driver.findElement(By.xpath(inputLovXpath));
        esperarElementoByXpath(inputLovXpath);
        preencherElementoByXpath(inputLovXpath, papel);
        esperarMilissegundos(2000);
        inputLovXpathElement.sendKeys(Keys.ENTER);
        esperarMilissegundos(2000); //espera necessaria
        encontrarElementoNaTabela(tabelaPapelXpath, papel);
        esperarMilissegundos(2000); //espera necessaria
        driver.findElement(By.xpath(xpathCompletoPapel)).sendKeys(Keys.TAB);
    }

    public void informarNoGridProgramaFeatureANV054(String programa) {
        primeiraLinhaEmBrancoCodigo = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(xPathColunaProgramaInicio, xPathColunaFim);
        xpathCompletoPrograma = xPathColunaProgramaInicio + primeiraLinhaEmBrancoCodigo + xPathColunaFim;
        encontrarElementoByXpath(xpathCompletoPrograma);
        preencherElementoByXpath(xpathCompletoPrograma, programa);
        esperarMilissegundos(1000);
        driver.findElement(By.xpath(xpathCompletoPrograma)).sendKeys(Keys.TAB);
    }

    public void informarNoGridPaginaFeatureANV054(String pagina) {
        primeiraLinhaEmBrancoCodigo = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(xPathColunaPaginaInicio, xPathColunaFim);
        xpathCompletoPagina = xPathColunaPaginaInicio + primeiraLinhaEmBrancoCodigo + xPathColunaFim;
        clicarElementoByXpath(xpathCompletoPagina);
        encontrarElementoByXpath(xpathCompletoPagina);
        esperarMilissegundos(4000);
        pressionarF9ByXpath(xpathCompletoPagina);
        esperarMilissegundos(4000);
        if (!validarSeContemOElemento(h4ModalLOVId)) {
            pressionarF9ByXpath(xpathCompletoPagina);
        }
        validaModalByH4(h4ModalLOVId);
        WebElement inputLovXpathElement = driver.findElement(By.xpath(inputLovXpath));
        esperarElementoByXpath(inputLovXpath);
        preencherElementoByXpath(inputLovXpath, pagina);
        esperarMilissegundos(4000);
        inputLovXpathElement.sendKeys(Keys.ENTER);
        esperarMilissegundos(4000); //espera necessaria
        encontrarElementoNaTabela(tabelaProgramaXpath, pagina);
        esperarMilissegundos(4000); //espera necessaria
        driver.findElement(By.xpath(xpathCompletoPagina)).sendKeys(Keys.TAB);
    }

    public void selecionarNoGridTipoDeAcessoFeatureANV054(String tipoAcesso) {
        primeiraLinhaEmBrancoCodigo = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(xpathColunaTipoAcessoInicio, xPathColunaFim);
        xPathColunaTipoAcessoInicioCompleto = xpathColunaTipoAcessoInicio + primeiraLinhaEmBrancoCodigo + xPathColunaFim;
        encontrarElementoByXpath(xPathColunaTipoAcessoInicioCompleto);
        selecionarListaByXpathValor(xPathColunaTipoAcessoInicioCompleto, tipoAcesso);

//        preencherElementoByXpath(xPathColunaTipoAcessoInicioCompleto, tipoAcesso);
//        String xpathCompletoLista = "//*[@id='programaempr-stExibir-" + primeiraLinhaEmBranco + "']/div/select";

    }
}
