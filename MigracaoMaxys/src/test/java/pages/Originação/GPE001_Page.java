package pages.Originação;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class GPE001_Page extends BasePage {
    WebDriver driver;

    public GPE001_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
//
//     //Filtros
//    String inputEmpresaXpath = "//*[@id='controlerestrito-cdEmpresa']/div/input";
//    String inputAutorizadorXpath = "//*[@id='controlerestrito-cdAutorizador']/div/input";
//    String inputCCustoXpath = "//*[@id='controlerestrito-cdCentrocusto']/div/input";
//    String btnConsultarXpath = "//*[@id='controle-btnConsulta']/button/div";
//
//    // Grid Autorizadores
//    String inputEmpresaGridXpathInicio = "//*[@id='carregaDados-cdEmpresa-";
//    String inputAutorizadorGridXpathInicio = "//*[@id='carregaDados-cdAutorizador-";
//    String inputCCustoGridXpathInicio = "//*[@id='carregaDados-cdCentrocusto-";
//    String selectStatusGridXpathInicio = "//*[@id='carregaDados-stRegistro-";
//
//
//    // Globais
//    String inputXpathFim = "']/div/input";
//    String selectXpathFim = "']/div/select";
//    int primeiraLinhaEmBranco;
//
//
//
//    // Inicialização da primeiraLinhaEmBranco
//    public void setPrimeiraLinhaEmBranco() { primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);}
//
//    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
//    private void verificarOuSetarPrimeiraLinhaEmBranco() {
//        if (primeiraLinhaEmBranco != 0) {setPrimeiraLinhaEmBranco();}
//    }
//
//    // Informa Autorizador para Consulta
//    public void informaAutorizadorFeatureTCO035(String autorizador) {
//        alterarParaIframeComElemento(inputAutorizadorXpath); // Alterna para o iframe correto
//        esperarEncontrarEPreencherElementos(inputAutorizadorXpath, autorizador); // Clica no elemento
//    }
//
//    // Realiza Consulta
//    public void realizarConsultaFeatureTCO035() {
//        clicarElementoByXpath(btnConsultarXpath);
//    }
//
//    // Informar Empresa no Grid Autorizador
//    public void preencherEmpresaFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputEmpresaGridXpath = inputEmpresaGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarEncontrarEPreencherElementos(inputEmpresaGridXpath, empresaAutorizador);
//    }
//
//    // Informar Autorizador no Gride Autorizador
//    public void preencherAutorizadorFeatureTCO035(String autorizador) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputAutorizadorGridXpath = inputAutorizadorGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        esperarEncontrarEPreencherElementos(inputAutorizadorGridXpath, autorizador);
//    }
//
//    // Informar Centro de Custo no Gride Autorizador
//    public void preencherCCustoFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputCentroCustoGridXpath = inputCCustoGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        esperarEncontrarEPreencherElementos(inputCentroCustoGridXpath, centroCustoAutorizador);
//    }
//
//    // Seleciona Status do Autorizador
//    public void selecionaStatusFeatureTCO035(String status) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String selectStatusGridXpath = selectStatusGridXpathInicio + primeiraLinhaEmBranco + selectXpathFim;
//
//        // Cria um objeto Web
//        WebElement dropdown = driver.findElement(By.xpath(selectStatusGridXpath));
//        // Clicar elemento
//        dropdown.click();
//        // Cria uma instância de Select
//        Select select = new Select(dropdown);
//
//        // Espera necessária
//        esperarMilissegundos(4000);
//
//        // Seleciona o Status reportado
//        if ("Ativo".equalsIgnoreCase(status)) {
//            select.selectByVisibleText("Ativo");
//        } else if ("Inativo".equalsIgnoreCase(status)) {
//            select.selectByVisibleText("Inativo");
//        }    }
//
//    public void selecionarAutorizadorFeatureTCO035(String autorizador) {
//        esperarMilissegundos(5000); // espera necessária
//        testConsultaRegistroGrid(autorizador, inputAutorizadorGridXpathInicio, inputXpathFim);
//    }
//
//    public void selecionarEmpresaConsultaFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//        String elementoTabelaEmpresa = "lovEmpresa1";
//
//        esperarClicarESelecionarF9(inputEmpresaXpath, empresaAutorizador, elementoTabelaEmpresa);
//    }
//
//    public void selecionarOAutorizadorConsultaFeatureTCO035(String autorizador) {
//        String elementoTabelaAutorizador = "lovSolres";
//        esperarClicarESelecionarF9(inputAutorizadorXpath, autorizador, elementoTabelaAutorizador);
//    }
//
//    public void selecionarOCCustoConsultaFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//        String elementoTabelaCCusto = "lovCentrocusto1";
//
//        esperarClicarESelecionarF9(inputCCustoXpath,centroCustoAutorizador, elementoTabelaCCusto);
//    }
//
//    public void selecionarAEmpresaGridFeatureTCO035() {
//        int[] empresas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 33, 48, 84, 108, 121, 122, 150, 500, 3009, 6666}; // Código das empresas apresentadas
//        int indiceEmpresasAleatorio = faker.random().nextInt(0, empresas.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int empresaSelecionada = empresas[indiceEmpresasAleatorio]; // Seleciona o valor no índice aleatório
//        String empresaAutorizador = Integer.toString(empresaSelecionada); // Converte o valor selecionado para String
//        String elementoTabelaEmpresa = "lovEmpresa";
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputEmpresaGridXpath = inputEmpresaGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarClicarESelecionarF9(inputEmpresaGridXpath,empresaAutorizador, elementoTabelaEmpresa);
//    }
//
//    public void selecionarOAutorizadorGridFeatureTCO035(String autorizador) {
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputAutorizadorGridXpath = inputAutorizadorGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//        String elementoTabelaAutorizador = "lovSol";
//
//        esperarClicarESelecionarF9(inputAutorizadorGridXpath,autorizador, elementoTabelaAutorizador );
//    }
//
//    public void selecionarOCCustoGridFeatureTCO035() {
//        int[] centrosDeCusto = {1, 6, 20, 23, 100, 403, 404, 501, 700, 800 }; // Código dos centros de custo. Limitado em 10 valores
//        int indiceCCAleatorio = faker.random().nextInt(0, centrosDeCusto.length - 1); // Gera um índice aleatório conforme o tamanho do array
//        int centroCustoSelecionado = centrosDeCusto[indiceCCAleatorio]; // Seleciona o valor no índice aleatório
//        String centroCustoAutorizador = Integer.toString(centroCustoSelecionado); // Converte o valor selecionado para String
//        String elementoTabelaCCusto = "lovCen";
//
//        verificarOuSetarPrimeiraLinhaEmBranco();
//        String inputCentroCustoGridXpath = inputCCustoGridXpathInicio + primeiraLinhaEmBranco + inputXpathFim;
//
//        esperarClicarESelecionarF9(inputCentroCustoGridXpath,centroCustoAutorizador, elementoTabelaCCusto);
//    }
}