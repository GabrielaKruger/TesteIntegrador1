package pages.Faturamento.VFS;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.DataUtils;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class VFS002_Page extends BasePage {

    WebDriver driver;

    public VFS002_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String inputDataEmissao = "//*[@id='movtofaturar-dtEmissao']/div/div/input";
    String inputCliforNotaFiscal = "//*[@id='movtofaturar-cdClifor']/div/input";
    String fecharSelNotasEItensDeMestra = "//*[@id='mestra-btnFechar']/div/button/div";
    String inputCondicaoPagto = "//*[@id='movtofaturar-cdCondpagto']/div/input";
    String inputformaDePagto = "//*[@id='movtofaturar-cdFormapagto']/div/input";
    String inputMoedaTransacao = "//*[@id='movtofaturar-cdMoedatrans']/div/input";

    public void loginMigracao(String tela) {
        //Metodo teste precisa-se adequa-lo
        // Navegar para a página de login
        driver.get("https://auto.maxiconsystems.com.br/#/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Verificar se o elemento sidenavAccordion está presente (usuário já logado)
        boolean jaLogado;

        try {
            // Verifica se o menu lateral (sidenavAccordion) está visível
            jaLogado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidenavAccordion']"))) != null;
        } catch (TimeoutException e) {
            // Caso o elemento não seja encontrado, assume que o usuário não está logado
            jaLogado = false;
        }

        if (!jaLogado) {
            // Caso não esteja logado, realiza o processo de login

            WebElement emailField = driver.findElement(By.xpath("//*[@id='email']"));
            emailField.sendKeys("MAX");

            WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
            passwordField.sendKeys("123456");

            WebElement loginButton = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/form/div[3]/button"));
            pressionaTabActions();
            esperarMilissegundos(2000);
            loginButton.click();

            // Aguarda até ser redirecionado para o Home
            wait.until(ExpectedConditions.urlContains("/#/home"));
        } else {
            System.out.println("Usuário já está logado, pulando a etapa de login.");
        }

        esperarMilissegundos(2000);

        // Clique no campo de pesquisa para acessar o programa
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar']/div[1]/div/input")));
        searchField.sendKeys(tela); // Passa o nome do programa para o campo de pesquisa

        // Aguarda até que o elemento de sugestão de programa esteja visível
        WebElement suggestionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span/strong[normalize-space(text())='" + tela + "']") // XPath genérico que procura pelo nome da tela
        ));

        // Clica no item da sugestão correspondente ao programa
        suggestionElement.click();

        esperarMilissegundos(8000);

//        WebDriverWait loading = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        if (!iframes.isEmpty()) {
            // Espera até que o primeiro iframe esteja visível e pronto
            WebElement iframe = iframes.get(0);
            wait.until(ExpectedConditions.visibilityOf(iframe));

            // Após garantir que o iframe está visível, faz a troca para ele
            driver.switchTo().frame(iframe);
        } else {
            throw new RuntimeException("Nenhum iframe encontrado!");
        }
    }

    public void esperarOProgramaCarregarFeatureVFS002() {
        String elementoDeCarregamentoXpath = "/html/body/app-root/div/section/lib-vfs002/div/mx-maxys-spinner/div/div";
        esperarAteQueSpinnerNaoEstejaVisivel(elementoDeCarregamentoXpath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementoDeCarregamentoXpath)));
    }

    public void selecionarTipoDeVenda(String tipoVenda) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/modal-container/div[2]/div")));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("    /html/body/modal-container/div/div")));

        // Monta o XPath dinâmico baseado na label do radio button
        String xpathInput = "//mx-maxys-radio-group/mx-maxys-radio-button[label[contains(text(),'" + tipoVenda + "')]]/label/input";

        // Aguarda o elemento estar clicável e clica
        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathInput)));
        radioButton.click();

        //Clicar botao OK do modal
        WebElement botaoOk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gerautomatico-btnOk']/div/button/div")));
        botaoOk.click();

        // Sai do iframe
        driver.switchTo().defaultContent();
    }

    private void executarNoIframe(Runnable acao) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));

        try {
            acao.run(); // Executa a ação dentro do iframe
        } finally {
            driver.switchTo().defaultContent(); // Sempre sai do iframe no final
        }
    }

    public void selecionaASerieDaNotaFiscalFeatureVFS002(String serieNotaFiscal) {
        executarNoIframe(() -> {

            WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='movtofaturar-cdSerienf']/div/select"));

            // Clica no dropdown para abrir as opções
            dropdownTpRegistro.click();

            // Aguarda um curto período para garantir que as opções estejam visíveis
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(dropdownTpRegistro));

            // Cria um objeto Select para manipular o dropdown
            Select select = new Select(dropdownTpRegistro);

            // Seleciona a opção baseada no texto visível
            select.selectByVisibleText(serieNotaFiscal);

            //Fecha dropdown com a opcao selecionada
            dropdownTpRegistro.click();

            pressionaTabActions();
        });
    }

    public void informaDataEmissaoDaNotaFeatureVFS002() {
        executarNoIframe(() -> {

        limparElementoByXpath(inputDataEmissao);
        clicarElementoByXpath(inputDataEmissao);
        preencherElementoByXpath(inputDataEmissao, DataUtils.DataAtual());
        clicarElementoByXpath(inputDataEmissao);
        });
    }

    public void preencheOCliforDaNotaFeatureVFS002(String cliforNotaFiscal) {
        executarNoIframe(() -> {

            clicarElementoByXpath(inputCliforNotaFiscal);
            preencherElementoByXpath(inputCliforNotaFiscal, cliforNotaFiscal);
            esperarMilissegundos(2000);
            pressionaTabActions();
        });
    }

    public void carregaCNJPFeatureVFS002() {
        executarNoIframe(() -> {

            pressionarENTERByXpath("//*[@id='input-search-lov']");
            pressionarENTERByXpath("//*[@id='input-search-lov']");
        });
    }

    public void fechaSelNotasEItensDeMestraFeatureVFS002() {
        executarNoIframe(() -> {

            esperarMilissegundos(5000);
            clicarElementoByXpath(fecharSelNotasEItensDeMestra);
            esperarMilissegundos(7000);
        });
    }

    public void preencheCondicaoPagamentoFeatureVFS002(String condicaoPagamento) {
        esperarMilissegundos(2000);
        clicarElementoByXpath(inputCondicaoPagto);
        limparElementoByXpath(inputCondicaoPagto);
        esperarMilissegundos(2000);
        preencherElementoByXpath(inputCondicaoPagto, condicaoPagamento);
        pressionaTabActions();
        esperarMilissegundos(500);
        pressionaTabActions();
    }

    public void preencherFormaDePagamentoFeatureVFS002(String formaDePagamento) {
        limparElementoByXpath(inputformaDePagto);
        clicarElementoByXpath(inputformaDePagto);
        esperarMilissegundos(2000);
        preencherElementoByXpath(inputformaDePagto, formaDePagamento);
    }

    public void preencherMoedaTransacaoFeatureVFS002(String moedaTransacao) {
        clicarElementoByXpath(inputMoedaTransacao);
        limparElementoByXpath(inputMoedaTransacao);
        esperarMilissegundos(2000);
        preencherElementoByXpath(inputMoedaTransacao, moedaTransacao);

    }

    public String acessoPagesXpath(String nomePagina) {
        Map<String, String> paginas = Map.of(
                "Itens", "//*[@id='PAG_ITENS']",
                "Dados", "//*[@id='PAG_DADOS']]",
                "Embarque", "//*[@id='PAG_EMBARQUE']",
                "Cálculo com tabela frete", "//*[@id='PAG_CALCULO_FRETE']",
                "Impostos", "//*[@id='PAG_IMPOSTO']"
        );

        return paginas.getOrDefault(nomePagina, ""); // Retorna o XPath ou uma string vazia se não encontrar
    }


    public void clicaNaPageFeatureVFS002(String nomePagina) {
        String xpathListaAbas = "//*[@id='WIN_NFSAIDA']/mx-maxys-tab-group/ul/li";
        String xpathPagina = acessoPagesXpath(nomePagina); // Obtém o XPath da página

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> abas = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathListaAbas)));

        for (WebElement aba : abas) {
            if (aba.getText().trim().equalsIgnoreCase(nomePagina)) {
                aba.click();
                if (!xpathPagina.isEmpty()) { // Se tiver XPath associado, aguarda carregar
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathPagina)));
                }
                break;
            }
        }
    }

}
