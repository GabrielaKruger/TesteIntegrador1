package pages.Transporte.TTB;

import io.cucumber.java.pt.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    String btn_cliforPagadorCredito = "//*[@id='PAG_LIBERACAOCREDITO']";
    String btn_clicarBotaoConsultar = "//*[@id='filtro-btConsultar']/div/button/div";
    String inputMotivoRecusaAutorizacao = "//*[@id='clifortranspcred-dsMotcredclifor']/div/textarea";
    String inputClifor = "//*[@id='filtro-cdClifor']/div/input";


    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpatFimDatas = "']/div/div/input";


    public void preencherEmpresaFeatureTTB113(String empresa) {
        //esperarMilissegundos(10000); //espera necessária
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridEmpresaXpath, 2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
        pressionaTabActions();
    }

    public void preencherUsuárioFeatureTTB113(String user) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridUserXpath = inputUserXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridUserXpath, 2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridUserXpath, user);
    }

    public void preencherTipoSolicFeatueTTB113(String tipoSolicitante) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        // Ajustar para pegar do intervalo
        //int codigoSimulatedInt = faker.random().nextInt(1, 16);
        //String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridTipoSolicXpath = inputTipoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipoSolicXpath, 2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridTipoSolicXpath, tipoSolicitante);
    }

    public void preencherCódDaAlçadaFeatureTTB113() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        int codigoSimulatedInt = faker.random().nextInt(1, 10);
        String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridCodAlcadaXpath = inputCodDaAlcadaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCodAlcadaXpath, 2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridCodAlcadaXpath, codigoSimulateAlcada);
    }

    public void prencherDataDeVencimentoFeatureTTB113() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridDataVencXpath = inputDataVencXpath + primeiraLinhaEmBranco + inputXpatFimDatas;

        clicarElementoByXpathNVezes(linhaGridDataVencXpath, 2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridDataVencXpath, DataUtils.DataAtual());
    }

    public void clicarBotaoTransicao() {
        clicarElementoByXpath(btn_liberacaoCliforPagadores);
        clicarElementoByXpath(btn_cliforPagadorCredito);
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


    //Segunda page começa aqui


    public void acessarPageCliforPagadorCreditoFeatureTTB113(String credito) {
        esperarMilissegundos(5000);
        clicarElementoByXpath(btn_cliforPagadorCredito);
    }

    public void clicarBotaoConsultar() {
        clicarElementoByXpath(btn_clicarBotaoConsultar);
    }

    public void selecionarOperacaoFeatureTTB113(String statusOperacao) {
        // Localiza o dropdown usando o xpath do elemento pai
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='filtro-stLibcredclifor']/div/select"));
        //*[@id="filtro-stLibcredclifor"]/div/select
        // Cria um objeto WebDriverWait de espera
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        // Espera até que o dropdown esteja visível e clicável
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));

        // Clica no dropdown para abrir a lista de opções
        dropdown.click();

        esperarMilissegundos(5000);

        // Cria uma instância de Select para interagir com o dropdown
        Select select = new Select(dropdown);

        // Seleciona a opção com base no parâmetro fornecido na feature
        if ("Pendente".equalsIgnoreCase(statusOperacao)) {
            select.selectByVisibleText("Pendente");
        } else if ("Próximo Lançamento".equalsIgnoreCase(statusOperacao)) {
            select.selectByVisibleText("Próximo Lançamento");
        } else if ("Alterar Limite".equalsIgnoreCase(statusOperacao)) {
            select.selectByVisibleText("Alterar Limite");
        } else if ("Não Autorizado".equalsIgnoreCase(statusOperacao)) {
            select.selectByVisibleText("Não Autorizado");
        } else if (" ".equalsIgnoreCase(statusOperacao)) {
            select.selectByVisibleText(" ");
        }
        // Fecha o dropdown clicando fora dele
        WebElement outroElemento = driver.findElement(By.xpath("/html/body/app-root/div/section/lib-ttb113/footer"));
        outroElemento.click();
        esperarMilissegundos(2000);
    }

    public void marcarCheckboxCliforFeatureTTB113() {
        String chkCliforXpath = "//*[@id='clifortranspcred-stSelecao-3']/div/button";
        testMarcaDesmarcaCheckBox("marcar", chkCliforXpath);
        esperarMilissegundos(5000);
    }

    public void selecionarCampoStatusDeLiberacaoFeatureTTB113(String statusLiberacao) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='clifortranspcred-stLibcredclifor-3']/div/select"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        wait.until(ExpectedConditions.elementToBeClickable(dropdown));

        dropdown.click();

        esperarMilissegundos(5000);

        Select select = new Select(dropdown);

        if ("Pendente".equalsIgnoreCase(statusLiberacao)) {
            select.selectByVisibleText("Pendente");
        } else if ("Próximo Lançamento".equalsIgnoreCase(statusLiberacao)) {
            select.selectByVisibleText("Próximo Lançamento");
        } else if ("Alterar Limite".equalsIgnoreCase(statusLiberacao)) {
            select.selectByVisibleText("Alterar Limite");
        } else if ("Não Autorizado".equalsIgnoreCase(statusLiberacao)) {
            select.selectByVisibleText("Não Autorizado");
        } else if (" ".equalsIgnoreCase(statusLiberacao)) {
            select.selectByVisibleText(" ");
        }

        WebElement outroElemento = driver.findElement(By.xpath("/html/body/app-root/div/section/lib-ttb113/footer"));
        outroElemento.click();
        esperarMilissegundos(5000);
    }

    public void preencherOMotivoDeRecusaAutorizacaoFeatureTTB113(String observacao) {
        clicarElementoByXpath(inputMotivoRecusaAutorizacao);
        esperarElementoVisivelByXpath(inputMotivoRecusaAutorizacao);
        preencherElementoByXpath(inputMotivoRecusaAutorizacao, observacao);
    }


    //Cenário triste


    public void preencherCliforFeatureTTB113(String valor) {
        clicarElementoByXpath(inputClifor);
        esperarElementoVisivelByXpath(inputClifor);
        preencherElementoByXpath(inputClifor, valor);
    }



}
