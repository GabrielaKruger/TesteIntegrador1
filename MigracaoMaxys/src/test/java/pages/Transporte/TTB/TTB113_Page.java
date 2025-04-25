package pages.Transporte.TTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.DataUtils;

import java.time.Duration;

public class TTB113_Page extends BasePage {
    WebDriver driver;

    public TTB113_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Solicitante/Autorizador
    String inputEmpresaXpath = "//*[@id='solicitantecontrfrete-cdEmpresa-";
    String inputUserXpath = "//*[@id='solicitantecontrfrete-cdUsuario-";
    String inputTipoXpath = "//*[@id='solicitantecontrfrete-stSolicitante-";
    String inputCodDaAlcadaXpath = "//*[@id='solicitantecontrfrete-cdAlcada-";
    String inputDataVencXpath = "//*[@id='solicitantecontrfrete-dtVencimento-";
    String btn_liberacaoCliforPagadores = "//*[@id='PAG_LIBERACAO']/a/span";
    String btn_desbloqueiaSelecionados = "//*[@id='controle-btDesbloq']/div/button";


    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpatFimDatas = "']/div/div/input";


    public void preencherEmpresaFeatureTTB113(String empresa) {
        //esperarMilissegundos(10000); //espera necessária
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
        pressionaTabActions();
    }


    public void preencherUsuárioFeatureTTB113(String user) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridUserXpath = inputUserXpath+ primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridUserXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridUserXpath, user);
    }

    public void preencherTipoSolicFeatueTTB113(String tipoSolicitante) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        // Ajustar para pegar do intervalo
        //int codigoSimulatedInt = faker.random().nextInt(1, 16);
        //String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridTipoSolicXpath = inputTipoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipoSolicXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridTipoSolicXpath, tipoSolicitante);
    }

    public void preencherCódDaAlçadaFeatureTTB113() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        int codigoSimulatedInt = faker.random().nextInt(1, 10);
        String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridCodAlcadaXpath = inputCodDaAlcadaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCodAlcadaXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridCodAlcadaXpath, codigoSimulateAlcada);
    }

    public void prencherDataDeVencimentoFeatureTTB113() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridDataVencXpath = inputDataVencXpath + primeiraLinhaEmBranco + inputXpatFimDatas;

        clicarElementoByXpathNVezes(linhaGridDataVencXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridDataVencXpath, DataUtils.DataAtual());
    }

//    public void acessarPageCliforPagadorFeatureTTB113(String nomePage) {
//        clicarElementoByText(nomePage);
//    }
//
//    public void clicarElementoByText(String text) {
//        String texto = "//*[text()='" + text + "']";
//        driver.findElement(By.xpath(texto)).click();
//    }

    public void acessarPageCliforPagadorFeatureTTB113(String text) {
        String xpath = "//*[contains(text(),'" + text + "')]";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        elemento.click();
    }

    public void clicarBotaoTransicao() {
        clicarElementoByXpath(btn_liberacaoCliforPagadores);
    }

    public void marcarCheckboxDoCliforPagadorFeatureTTB113() {
        String chkCliforXpath = "//*[@id='clifortransporte-stSelecao-" + primeiraLinhaEmBranco + "']/div/button";
        testMarcaDesmarcaCheckBox("marcar", chkCliforXpath);
    }

    public void clicarDesbloqueiaSelecionadosFeatureTTB113() {
        clicarElementoByXpath(btn_desbloqueiaSelecionados);
        esperarMilissegundos(2000);
    }

    public void clicarBotaoDoModal(String nomeBotao) {
        String xpathBotao = "//modal-container//button[translate(normalize-space(text()), 'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚÂÊÎÔÛÃÕÇ', 'abcdefghijklmnopqrstuvwxyzáéíóúâêîôûãõç') = '"
                + nomeBotao.toLowerCase() + "']";

        encontrarElementoByXpath(xpathBotao);
        esperarMilissegundos(200);
        clicarElementoByXpath(xpathBotao);
    }
}
