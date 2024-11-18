package pages.Materiais.TCO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Objects;

public class TCO035_Page extends BasePage {
    WebDriver driver;

    // Filtros
    String inputEmpresaXpath = "//*[@id='controlerestrito-cdEmpresa']/div/input";
    String inputAutorizadorXpath = "//*[@id='controlerestrito-cdAutorizador']/div/input";
    String inputCCustoXpath = "//*[@id='controlerestrito-cdCentrocusto']/div/input";
    String btnConsultarXpath = "//*[@id='controle-btnConsulta']/button/div";

    // Grid Autorizadores
    String inputEmpresaGridXpathInicio = "//*[@id='carregaDados-cdEmpresa-";
    String inputAutorizadorGridXpathInicio = "//*[@id='carregaDados-cdAutorizador-";
    String inputCCustoGridXpathInicio = "//*[@id='carregaDados-cdCentrocusto-";
    String selectStatusGridXpathInicio = "//*[@id='carregaDados-stRegistro-";


    // Globais
    String inputXpathFim = "']/div/input";
    String selectXpathFim = "']/div/select";
    int primeiraLinhaEmBranco;

    public TCO035_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Inicialização da primeiraLinhaEmBranco
    public void setPrimeiraLinhaEmBranco() { primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);}

    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
    private void verificarOuSetarPrimeiraLinhaEmBranco() {
        if (primeiraLinhaEmBranco != 0) {setPrimeiraLinhaEmBranco();}
    }

    // Informa Autorizador para Consulta
    public void informaAutorizadorFeatureTCO035(String autorizador) {
        alterarParaIframeComElemento(inputAutorizadorXpath); // Alterna para o iframe correto
        esperarEncontrarEPreencherElementos(inputAutorizadorXpath, autorizador); // Clica no elemento
    }

    // Realiza Consulta
    public void realizaConsultaFeatureTCO035() {
        clicarElementoByXpath(btnConsultarXpath);
    }

    // Informar Empresa no Grid Autorizador
    public void preencherEmpresaFeatureTCO035() {
        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String

        verificarOuSetarPrimeiraLinhaEmBranco();
        String inputEmpresaGridXpath = inputEmpresaGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;

        esperarEncontrarEPreencherElementos(inputEmpresaGridXpath, empresaAutorizador);
    }

    // Informar Autorizador no Gride Autorizador
    public void preencherAutorizadorFeatureTCO035(String autorizador) {
        verificarOuSetarPrimeiraLinhaEmBranco();
        String inputAutorizadorGridXpath = inputAutorizadorGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
        esperarEncontrarEPreencherElementos(inputAutorizadorGridXpath, autorizador);
    }

    // Informar Centro de Custo no Gride Autorizador
    public void preencherCCustoFeatureTCO035() {
        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String

        verificarOuSetarPrimeiraLinhaEmBranco();
        String inputCentroCustoGridXpath = inputCCustoGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
        esperarEncontrarEPreencherElementos(inputCentroCustoGridXpath, centroCustoAutorizador);
    }

    // Seleciona Status do Autorizador
    public void selecionaStatusFeatureTCO035(String status) {
        verificarOuSetarPrimeiraLinhaEmBranco();
        String selectStatusGridXpath = selectStatusGridXpathInicio + primeiraLinhaEmBranco + selectXpathFim;

        // Cria um objeto Web
        WebElement dropdown = driver.findElement(By.xpath(selectStatusGridXpath));
        // Clicar elemento
        dropdown.click();
        // Cria uma instância de Select
        Select select = new Select(dropdown);

        // Espera necessária
        esperarMilissegundos(4000);

        // Seleciona o Status reportado
        if ("Ativo".equalsIgnoreCase(status)) {
            select.selectByVisibleText("Ativo");
        } else if ("Inativo".equalsIgnoreCase(status)) {
            select.selectByVisibleText("Inativo");
        }

        // Espera necessária
        esperarMilissegundos(4000);

        // Pressiona Tab para sair do elemento
        //pressionaTabActions();

        // Espera necessária
        esperarMilissegundos(3000);

    }

    public void selecionaAutorizadorFeatureTCO035(String autorizador) {
        esperarMilissegundos(5000); // espera necessária
        testConsultaRegistroGrid(autorizador,inputAutorizadorGridXpathInicio, inputXpathFim);
    }
}