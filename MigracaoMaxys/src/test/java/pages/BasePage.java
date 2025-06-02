package pages;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import java.time.Duration;
import java.util.*;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.fail;

public class BasePage {
    WebDriver driver;
    public MaxiconFaker faker = new MaxiconFaker();
    public static String varPosLinha;

    int primeiraLinhaEmBranco;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // para chamar no @after nos steps
    public static void tearDownCloseQuit(WebDriver driver) {
        if (driver != null) {
            try {
                driver.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //----------------------------------------------------------------------------------
    //    //Funções para ESPERAR
    //----------------------------------------------------------------------------------

    // espera 30 segundos para encontrar o elemento By Id
    public WebElement esperarElementoById(String id) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    // espera o elemento By Xpath por 30 segundos ou menos
    public WebElement esperarElementoByXpath(String xpath) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    // espera em milissegundos (1000 milissegundos igual a 1 segundo)
    public void esperarMilissegundos(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            System.err.print(e.getMessage());
            System.err.print(e.getStackTrace().toString());
        }
    }

    // WebElement que espera um elemento por Xpath até ficar visivel (por no maximo 30 segundos)
    public WebElement esperarElementoVisivelByXpath(String xpath) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    // WebElement que espera um elemento ficar Clicavel por Xpath até ficar visivel (por no maximo 30 segundos)
    public WebElement esperarElementoClicavelByXpath(String xpath) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    // WebElement que espera um elemento ficar Clicavel por Xpath até ficar visivel (por no maximo 5 minutos) //excessão
    public WebElement esperarElementoClicavelPorAte5MinutosByXpath(String xpath) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    // espera até que o elemento não esteja mais visível
    public void esperarAteQueElementoNaoEstejaVisivel(String elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300)); // Espera até no máximo 5 minutos
        By elementoDeCarregamento = By.xpath(elemento);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementoDeCarregamento));
    }

    // espera até que o elemento não esteja mais visível
    public void esperarAteQueSpinnerNaoEstejaVisivel(String elemento) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Espera até no máximo 5 minutos
        By elementoDeCarregamento = By.xpath(elemento);
        try {
            boolean visivel = validarSeOElementoEstaVisivelByDisplayed(elemento);
            if (visivel) {
                WebElement spinner = driver.findElement(By.xpath(elemento));
                while (spinner.isDisplayed()) {
                    spinner.click();
                    clicarAleatorioNaTelaPorCoordenada(500, 350);
                    visivel = validarSeOElementoEstaVisivelByDisplayed(elemento);
                    if (!visivel) {
                        break;
                    }
                }
            }
            wait.until(ExpectedConditions.invisibilityOfElementLocated(elementoDeCarregamento));
        } catch (NoSuchElementException e) {
            // Lidar com o caso em que o elemento não é encontrado
            System.out.println("Elemento não encontrado: " + e.getMessage());

        }
    }
    //----------------------------------------------------------------------------------
    //    //Funções para PREENCHER
    //----------------------------------------------------------------------------------

    // preenche o campo com o elemento By Xpath e com o valor
    public void preencherElementoByXpath(String elemento, String valor) {
        driver.findElement(By.xpath(elemento)).sendKeys(valor);
    }

    //----------------------------------------------------------------------------------
    //    //Funções para CLICAR
    //----------------------------------------------------------------------------------

    // clica no elemento By Id
    public void clicarElementoById(String elemento) {
        driver.findElement(By.id(elemento)).click();
    }

    // clica no elemente By Xpath
    public void clicarElementoByXpath(String elemento) {
        driver.findElement(By.xpath(elemento)).click();
    }

    // Método para clicar no elemento web
    public void clicarElementoWebByXpath(String elementoXpath) {
        WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(elementoXpath))); // Espera o elemento ser clicável
        elemento.click();
    }

    // duplo clique em um elemento
    public void darDuploCliqueNoElemento(WebElement elemento) {
        Actions action = new Actions(driver);
        action.doubleClick(elemento).perform();
    }

    // Clica em um elemento localizado pelo XPath um número especificado de vezes.
    public void clicarElementoByXpathNVezes(String elemento, int vezes) {
        WebElement webElement = driver.findElement(By.xpath(elemento));
        for (int i = 0; i < vezes; i++) {
            webElement.click();
        }
    }

    // Clica em um elemento localizado pelo ID um número especificado de vezes.
    public void clicarElementoByIdNVezes(String elemento, int vezes) {
        WebElement webElement = driver.findElement(By.id(elemento));
        for (int i = 0; i < vezes; i++) {
            webElement.click();
        }
    }

    // verifica qual o xpath do botao desejado da toolbar para o método 'clicarBotaoToolBar'
    private static final Map<String, String> xpathMap = new HashMap<>();

    static {
        xpathMap.put("novo", "//*[@id='btn-new-document']");
        xpathMap.put("salvar", "//*[@id='btn-save']");
        xpathMap.put("excluir", "//*[@id='btn-excluir']");
        xpathMap.put("imprimir", "//*[@id='btn-printer']");
        xpathMap.put("dashboard", "//*[@id='btn-dashboard']");
        xpathMap.put("primeiro Registro", "//*[@id='btn-double-left']");
        xpathMap.put("registro anterior", "//*[@id='btn-left']");
        xpathMap.put("proximo registro", "//*[@id='btn-right']");
        xpathMap.put("ultimo registro", "//*[@id='btn-double-right']");
        xpathMap.put("pesquisa", "//*[@id='btn-search']");
        xpathMap.put("mostrar todos", "//*[@id='btn-database']");
        xpathMap.put("limpar", "//*[@id='btn-limpar']");
        xpathMap.put("sobre", "//*[@id='btn-info']");
    }

    // clicar botões ToolBar
    public void clicarBotaoToolBar(String botao) {
        String botaoXpath = xpathMap.get(botao);
        if (botaoXpath != null) {
            clicarElementoByXpathComRetentativa(botaoXpath);
        } else {
            System.out.println("Botão não reconhecido: " + botao);
        }
    }

    // metódo para clicar em botões de modal (ok, sim ou detalhes)
    public void clicarBotaoDoModal(String acao) {
        String botaoModal;
        if (Objects.equals(acao, "ok")) {
            botaoModal = "//*[@id='mxModalInfoBtnOk']";
        } else if (Objects.equals(acao, "sim")) {
            botaoModal = "/html/body/modal-container/div[2]/div/lib-mx-maxys-alert/div[3]/button[1]";
        } else if (Objects.equals(acao, "nao")) {
            botaoModal = "/html/body/modal-container[2]/div[2]/div/lib-mx-maxys-alert/div[3]/button[2]";
        } else {
            botaoModal = "/html/body/modal-container/div[2]/div/mx-modal-info/div[3]/button[2]";
        }
        esperarElementoClicavelByXpath(botaoModal);
        clicarElementoByXpathComRetentativa(botaoModal);
    }

    public void clicarBotaoDoModalAlert(String acao) {
        esperarMilissegundos(1000);
        String botaoModal = "";
        if (acao.equals("sim")) {
            botaoModal = "//button[contains(text(),'Sim')]";
        } else if (acao.equals("nao")) {
            botaoModal = "//button[contains(text(),'Não')]";
        }
        esperarElementoClicavelByXpath(botaoModal);
        clicarElementoByXpathComRetentativa(botaoModal);
        System.out.println("Clicou em " + botaoModal);
    }

    public void clicarElementoByXpathComRetentativa(String elemento) {
        try {
            driver.findElement(By.xpath(elemento)).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            driver.findElement(By.xpath(elemento)).click();
        }
    }

    // método para clicar no botão de OK no modal "Inconcistencias" (ANV040)
    public void clicarBotaoOkDoModalInconcistencias() {
        String botaoOKModalInconcistenciasXpath = "//*[@id='inconsistenciaAnv040-btnOk']/button";
        esperarElementoClicavelByXpath(botaoOKModalInconcistenciasXpath);
        clicarElementoByXpath(botaoOKModalInconcistenciasXpath);
    }

    //----------------------------------------------------------------------------------
    //    //Funções para SELECIONAR
    //----------------------------------------------------------------------------------

    // seleciona um determinado elemento de acordo com o valor
    public void selecionarListaByXpathValor(String elemento, String valor) {
        Select select = new Select(driver.findElement(By.xpath(elemento)));
        select.selectByValue(valor);
    }

    // Seleciona uma opção em um elemento de lista suspensa por índice.
    public void selecionarOpcaoPorIndice(String elemento, int indice) {
        Select select = new Select(driver.findElement(By.xpath(elemento)));
        select.selectByIndex(indice);
    }

    // WebElement para selecionar um elemento por Xpath
    public WebElement selecionarElementByXpath(String element) {
        return driver.findElement(By.xpath(element));
    }

    // método que seleciona um valor em uma lista suspensa -
    // - passamos o xpath e o valor que queremos selecionar
    public void selecionarListaGridByXpathText(String xpath, String valor) {
        try {
            //tenta encontrar o elemento dropdown(lista suspensa) usando o xpath fornecido
            WebElement dropdownElement = driver.findElement(By.xpath(xpath));

            // cria um objeto Select a partir do elemento dropdown encontrado
            Select select = new Select(dropdownElement);

            // pega todas as opções do dropdown
            List<WebElement> listElements = select.getOptions();

            // flag que verifica se o valor foi encontrado na lista
            boolean found = false;

            // itera sobre todas as opções do dropdown
            for (WebElement element : listElements) {
                // verifica se o texto da opção é igual ao valor procurado
                if (element.getText().equals(valor)) {
                    // sse for igual, clica na opção
                    element.click();

                    // atualiza a flag para indicar que o valor foi encontrado
                    found = true;

                    // sai do loop, pois já encontrous e clicou na opção desejada
                    break;
                }
            }

            if (!found) {
                System.out.println("Valor não encontrado na lista: " + valor);
            }
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Elemento não encontrado pelo xpath: " + xpath);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao selecionar a lista: " + e.getMessage());
        }
    }

    // método para abrir a LOV (F9) e preencher um valor no campo de pesquisa
    // e encontrar esse valor pesquisado
    // Explicação das Strings: elementoCampo = elemento do campo que será pressionado o F9
    // valor = valor que será consultado e selecionado
    // elementoTabela = é o id da tabela, onde será concatenado na string tabelaXpath
    // exemplo elementoTabela: antes de chamar o método crie a variavel 'String elementoTabela = "lovCidade"
    public void selecionarPeloF9(String elementoCampo, String valor, String elementoTabela) {
        String h4ModalLOVId = "modal-basic-title";
        String inputLovXpath = "//*[@id='input-search-lov']";
        String tabelaXpath = "//tbody/tr[contains(@id, '" + elementoTabela + "-')]";
        //*[@id="input-search-lov"]

        esperarMilissegundos(500); //espera necessaria
        encontrarElementoByXpath(elementoCampo);
        pressionarF9ByXpath(elementoCampo);
        esperarMilissegundos(2000); //espera necessaria
        if (!validarSeContemOElemento(h4ModalLOVId)) {
            pressionarF9ByXpath(elementoCampo);
        }
        validaModalByH4(h4ModalLOVId);
        WebElement inputLovXpathElement = driver.findElement(By.xpath(inputLovXpath));
        esperarElementoByXpath(inputLovXpath);
        preencherElementoByXpath(inputLovXpath, valor);
        inputLovXpathElement.sendKeys(Keys.ENTER);
        esperarMilissegundos(5000); //espera necessaria
        encontrarElementoNaTabela(tabelaXpath, valor);
    }

    //metódo para selecionar um texto completo de um elemento
    public void selecionarTextoCompletoByXpath(String xpath) {
        WebElement elemento = driver.findElement(By.xpath(xpath));
        elemento.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    }

    // método onde passamos o nome da page que desejamos clicar, exemplo: 'Principal'
    // é clicado primeiro no botão para ver todas as pages da tela, e depois é clicado na page escolhida
    public void selecionarPaginaNoMenu(String page) {
        String botaoEncontrarTodasAsPages = "//*[@id='button-basic']";
        encontrarElementoByXpath(botaoEncontrarTodasAsPages);
        clicarElementoByXpath(botaoEncontrarTodasAsPages);
        esperarMilissegundos(400); // espera necessária

        String pageSelecionada = "//ul[@id='dropdown-basic']//span[text()='" + page + "']";
        encontrarElementoByXpath(pageSelecionada); // espera necessária
        esperarMilissegundos(200); // espera necessária
        clicarElementoByXpath(pageSelecionada);
        esperarMilissegundos(200); // espera necessária
    }


    //----------------------------------------------------------------------------------
    //    //Funções para VALIDAR
    //----------------------------------------------------------------------------------

    // método que valida se o Modal H4 esta sendo apresentado - (titulo = id do elemento)
    public void validaModalByH4(String title) {
        String modalH4 = "//h4[@id='" + title + "']";
        esperarElementoVisivelByXpath(modalH4);
    }

    // método que valida se o Modal H5 esta sendo apresentado - (titulo = id do elemento)
    public void validaModalByH5(String title) {
        String modalH5 = "//h5[@id='" + title + "']";
        esperarElementoVisivelByXpath(modalH5);
    }

    // método que gera um Boolean que valida se o Modal H5 esta sendo apresentado - (titulo = id do elemento)
    public boolean validaModalByH5Boolean(String title) {
        String modalH5 = "//h5[@id='" + title + "']";
        if (validarSeContemOElemento(modalH5)) {
            return true;
        } else {
            return false;
        }
    }

    // método que valida se o Modal H4 By Xpath esta sendo apresentado - (titulo = id do elemento)
    public void validaModalByH4ByXpath(String title) {
        String modalH4 = "//*[@id='" + title + "']/h4";
        esperarElementoVisivelByXpath(modalH4);
    }

    // método para validar Mansagem de modal-Label de acordo com o texto exato
    public void validaMensagemLabelByText(String mensagem) {
        String modalLabel = "//*[@id='mxModalInfoLabel']";
        esperarElementoVisivelByXpath(modalLabel);
        WebElement element = driver.findElement(By.xpath(modalLabel));
        String mensagemAlerta = element.getText();
        System.out.println(element.getText());
        Assert.assertEquals(mensagem, mensagemAlerta);
    }

    // método para validar Mansagem de modal-Label de acordo com o texto parcial
    public void validaMensagemLabelByContainsText(String mensagem) {
        String modalLabel = "//*[@id='mxModalInfoLabel']";
        esperarElementoVisivelByXpath(modalLabel);
        WebElement element = driver.findElement(By.xpath(modalLabel));
        String mensagemAlerta = element.getText();
        System.out.println(element.getText());
        Assert.assertTrue("A mensagem não foi encontrada no texto do modal-label", mensagemAlerta.contains(mensagem));
    }


    // método que retorna um Boolean que valida se contem determinado elemento na tela
    public boolean validarSeContemOElemento(String element) {
        return driver.getPageSource().contains(element);
    }

    // método que retorna um Boolean que valida se contem o elemento visivel by displayed
    public boolean validarSeOElementoEstaVisivelByDisplayed(String element) {
        try {
            return driver.findElement(By.xpath(element)).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public void validarMensagemByToastContainer(String substringEsperada) {
        String elementXPath = "//*[@id='toast-container']";
        try {
            WebElement element = esperarElementoVisivelByXpath(elementXPath);
            String textoAtual = element.getText();
            Assert.assertTrue(String.format("Texto esperado'%s', Mas foi encontrado: '%s'", substringEsperada, textoAtual),
                    textoAtual.contains(substringEsperada));
        } catch (Exception e) {
            Assert.fail("Elemento nao encontrado ou nao visivel: " + e.getMessage());
        }
    }

    // método para validar uma mensagem gerada em um toast container com /DIV/DIV no final do elemento
    public void validarMensagemByToastContainerDivDiv(String mensagem) {
        String toastMensagem = "//*[@id='toast-container']/div/div";
        encontrarElementoByXpath(toastMensagem);
        esperarElementoVisivelByXpath(toastMensagem);
        validarSeOElementoEstaVisivelByDisplayed(toastMensagem);
        Assert.assertTrue(mensagem, true);
        System.out.println(mensagem);
    }

    // método para validar uma mensagem gerada em um toast container com /DIV no final do elemento
    public void validarMensagemByToastContainerDiv(String mensagem) {
        String toastMensagem = "//*[@id='toast-container']/div";
        encontrarElementoByXpath(toastMensagem);
        esperarElementoVisivelByXpath(toastMensagem);
        validarSeOElementoEstaVisivelByDisplayed(toastMensagem);
        Assert.assertTrue(mensagem, true);
        System.out.println(mensagem);
    }

    //SJM - 07-06-24 - valida se o campo foi preenchido, se não foi pode ser validado para preencher novamente em alguma condição
    public boolean validarPreenchimentoCampo(String elemento) {
        String resultado = driver.findElement(By.xpath(elemento)).getAttribute("value");
        if (!resultado.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    // método para validar um Valor de um Elemento(campo) -
    // necessario passar o valor que se deseja comparar e o elemento que se encontra o valor de comparação
    public void validarValorDoCampo(String valor, String elemento) {
        try {
            WebElement campoElement = driver.findElement(By.xpath(elemento));
            // String valorAtual = campoElement.getText(); // ACS 25/06/24 - não esta funcionando, testando pegarValorDoElemento()
            String valorAtual = pegarValorDoElemento(elemento);

            // se o valor do campo for igual ao valor esperado gera mensagem
            if (valorAtual.equalsIgnoreCase(valor)) {
                System.out.println("Valor do campo está correto. Esperado: " + valor + ", Encontrado: " + valorAtual);
            } else {
                // se o valor não corresponder, gera uma falha
                fail("Valor do campo incorreto. Esperado: " + valor + ", Encontrado: " + valorAtual);
            }
        } catch (NoSuchElementException e) {
            // se o elemento não for encontrado, falha o teste
            fail("Campo não encontrado com o seletor: " + elemento);
        }
    }

    // Verifica se há algum elemento de entrada com o valor do código fornecido,
    // percorrendo todos os elementos relevantes encontrados pelo ID parcial especificado.
    // Retorna true se encontrar um código já cadastrado, caso contrário, retorna false.
    protected boolean isCodigoCadastrado(String codigo, String idColunaCadastrada) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'" + idColunaCadastrada + "')]/div/input"));
            for (WebElement element : elements) {
                // Remove zeros à esquerda do valor do elemento encontrado
                // ^0+ corresponde a um ou mais zeros no início da string.
                //(?!$) assegura que não removemos zeros se for o único caractere.
                String valorElemento = element.getAttribute("value").replaceFirst("^0+(?!$)", "");
                // Remove zeros à esquerda do código a ser verificado
                String codigoNormalizado = codigo.replaceFirst("^0+(?!$)", "");
                if (codigoNormalizado.equals(valorElemento)) {
                    return true; // Encontramos um campo com o código já cadastrado
                }
            }
            return false; // Não encontramos nenhum campo com o código
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    // Obtém um código existente selecionado aleatoriamente entre os elementos de entrada encontrados,
    // identificados pelo ID parcial especificado, representando uma coluna de valores cadastrados.
    // Lança uma exceção se nenhum código for encontrado nos elementos.
    protected String obterCodigoExistente(String idColunaCadastrada) {
        try {
            // Buscar todos os campos de entrada relevantes - Mudar o id conforme a coluna do valor cadastrado
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@id,'" + idColunaCadastrada + "')]/div/input"));
            if (elements.isEmpty()) {
                throw new NoSuchElementException("Nenhum código cadastrado encontrado.");
            }
            // Selecionar um código aleatoriamente entre os existentes
            Random random = new Random();
            WebElement element = elements.get(random.nextInt(elements.size()));
            return element.getAttribute("value");
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Falha ao encontrar códigos cadastrados.", e);
        }
    }

//----------------------------------------------------------------------------------
//    //Funções para ENCONTRAR
//----------------------------------------------------------------------------------

    // apenas encontra o Elemento pelo Xpath
    public WebElement encontrarElementoByXpath(String elemento) {
        return driver.findElement(By.xpath(elemento));
    }

    // apenas encontra o Elemento pelo ID
    public WebElement encontrarElementoById(String elemento) {
        return driver.findElement(By.id(elemento));
    }

    // encontrar em uma tabela o elemento com o valor passado, e clicar no elemento encontrado com retentativa
    public void encontrarElementoNaTabela(String elemento, String valor) {
        // localizar linha da tabela
        WebElement linhaTabela = driver.findElement(By.xpath(elemento));

        // verificar se a linha da tabela tem o valor desejado
        List<WebElement> celulas = linhaTabela.findElements(By.tagName("td"));
        for (WebElement celula : celulas) {
            if (celula.getText().trim().equals(valor)) {
                //linhaTabela.click();
                clicarElementoByXpathComRetentativa(elemento);
                return;
            }
        }
        System.out.println("Elemento com o valor '" + valor + "' não encontrado na tabela.");
    }


//----------------------------------------------------------------------------------
//    //Funções para PRESSIONAR
//----------------------------------------------------------------------------------

    //SJM - 10-05-24 - Copiado do TIT062 para o base page
    public void pressionaTabActions() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    // método para pressionar o ENTER por Xpath
    public void pressionarENTERByXpath(String elemento) {
        driver.findElement(By.xpath(elemento)).sendKeys(Keys.ENTER);
    }

    // metódo privado para mapear as teclas
    private static final HashMap<String, Keys> teclasMap = new HashMap<>();

    static {
        teclasMap.put("f1", Keys.F1);
        teclasMap.put("f2", Keys.F2);
        teclasMap.put("f3", Keys.F3);
        teclasMap.put("f4", Keys.F4);
        teclasMap.put("f5", Keys.F5);
        teclasMap.put("f6", Keys.F6);
        teclasMap.put("f7", Keys.F7);
        teclasMap.put("f8", Keys.F8);
        teclasMap.put("f9", Keys.F9);
        teclasMap.put("f10", Keys.F10);
        teclasMap.put("f11", Keys.F11);
        teclasMap.put("f12", Keys.F12);
        teclasMap.put("delete", Keys.DELETE);
        teclasMap.put("apagar", Keys.BACK_SPACE);
        teclasMap.put("seta_para_baixo", Keys.ARROW_DOWN);
        teclasMap.put("seta_para_cima", Keys.ARROW_UP);
        teclasMap.put("seta_para_direita", Keys.ARROW_RIGHT);
        teclasMap.put("seta_para_esquerda", Keys.ARROW_LEFT);
    }

    // método para simular o pressionar de uma tecla
    public void pressionarTecla(String tecla) {
        Actions action = new Actions(driver);
        Keys key = teclasMap.get(tecla.toLowerCase());
        if (key != null) {
            action.sendKeys(key).perform();
        } else {
            System.out.println("Tecla não suportada: " + tecla);
        }
    }

    // método para simular o pressionar do SHIFT + F6
    public void pressionarShiftF6() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(Keys.F6).keyUp(Keys.SHIFT).build().perform();
    }


    // método para simular o pressionar do SHIFT + F8
    public void pressionarShiftF8() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(Keys.F8).keyUp(Keys.SHIFT).build().perform();
    }

    // método para simular o pressionar do SHIFT + F6
    public void pressionarAltF4() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.SHIFT).build().perform();
    }

//----------------------------------------------------------------------------------
//    //OUTRAS Funções
//----------------------------------------------------------------------------------

    // Método para capturar a tela (Print da tela)
    public static void takeScreenshot(WebDriver driver, String tela, String stepName) throws IOException {
        // Faz a captura da tela
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Gera timestamp do momento da captura. Exemplo: 20250313_140509
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Define o diretório específico para a tela dentro de "screenshots/"
        String directoryPath = "screenshots/" + tela;
        File screenshotDir = new File(directoryPath);

        // Verifica se o diretório existe, caso não, cria um
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }

        // Define o caminho completo onde o print será salvo
        String filePath = directoryPath + "/" + stepName + "_" + timestamp + ".png";

        // Move o arquivo gerado para o local definido
        FileUtils.copyFile(srcFile, new File(filePath));

        // Exibe no console o caminho do print salvo
        System.out.println("📸 Screenshot salvo em: " + filePath);
    }

    // Método para limpar o diretório de prints após 14 dias
    public static void limparCapturasdeTelaAntigas() {
        File screenshotsDir = new File("screenshots");

        if (screenshotsDir.exists() && screenshotsDir.isDirectory()) {
            File[] files = screenshotsDir.listFiles();

            if (files != null) {
                long now = System.currentTimeMillis();
                long duasSemanasMillis = 14L * 24 * 60 * 60 * 1000; // 14 dias em milissegundos

                for (File file : files) {
                    // Verifica se é um diretório (pasta de uma tela específica)
                    if (file.isDirectory()) {
                        File[] subFiles = file.listFiles(); // Obtém os arquivos dentro do diretório

                        if (subFiles != null) {
                            for (File subFile : subFiles) {
                                if (subFile.isFile() && (now - subFile.lastModified() > duasSemanasMillis)) {
                                    subFile.delete();
                                    System.out.println("🗑 Arquivo deletado: " + subFile.getAbsolutePath());
                                }
                            }
                        }

                        // Após apagar os arquivos, verifica se a pasta está vazia e remove
                        if (file.list().length == 0) {
                            file.delete();
                            System.out.println("🗑 Diretório removido: " + file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }


    // metódo para recarregar pagina com refresh e clicar em um elemento para carregar corretamente a pagina
    public void recarregarPaginaComRefresh() {
        driver.navigate().refresh();
    }

//    //TODO ADRIANA 21/06/24 - ADICIONADO CTRL + F5 PARA RODAR ENQUANTO VERIFICAM ERRO
//    // metódo para recarregar pagina com refresh e clicar em um elemento para carregar corretamente a pagina
//    // EXCLUIR ESSE METODO DEPOIS E DESCOMENTAR O DE CIMA --------------------------------------------------------
//    public void recarregarPaginaComRefresh() {
//        driver.navigate().refresh();
//        esperarMilissegundos(500);
//        try {
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_F5);
//            robot.keyRelease(KeyEvent.VK_F5);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//
//            esperarMilissegundos(15000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //SJM - 04/09/22 - Consulta genérica em grid.
    //SJM - 10-05-24 - Alterado para boolean para teste, caso der errado voltar para void
    //---------------------------------------------------------------------------------------
    //varValorComparacao = valor a ser buscado no grid
    //xPathColunaTabelaInicio = parte da string do xpath, que será quebrada referente a linha para ser concatenado pelo varCount
    // "//*[@id='conRecebimentovos']/div/table/tbody/tr["
    //xPathColunaTabelaFim = parte final do xpath do campo
    // "]/td[3]/mx-maxys-input/div/input"
    //varCount = numero referente a linha para consulta do valor no grid, que será incrementada até encontrar o registro ou chegar ao fim do grid
    //Xpath 'final' = "//*[@id='conRecebimentovos']/div/table/tbody/tr[" + linha + "]/td[3]/mx-maxys-input/div/input"
    public boolean testConsultaRegistroGrid(String varValorComparacao, String xPathColunaTabelaInicio, String xPathColunaTabelaFim) {
        esperarMilissegundos(500);
        int varLinha = 0;
        WebElement gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
        String varValorColuna1 = gridColuna1.getAttribute("value");
        String varValorAntigo = "";
        boolean encontrouRegistro = true;
        esperarMilissegundos(500);

        while (!(varValorComparacao.equals(varValorColuna1))) {
            //recebe valor inicial da linha do foco
            varValorAntigo = varValorColuna1;
            //desce uma linha no grid
            gridColuna1.sendKeys(Keys.DOWN);
            //incrementa contador
            varLinha++;

            //verifica se o elemento existe, se não existir sai do while
            boolean varContemOElementoGridColuna1 = validarSeOElementoEstaVisivelByDisplayed((xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
            if (!varContemOElementoGridColuna1) {
                encontrouRegistro = false;
                break;
            }
            //carrega o elemento na posição atualizada do contador
            gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));

            //recebe o novo valor do campo para variavel de comparação
            varValorColuna1 = gridColuna1.getAttribute("value");
            esperarMilissegundos(1000);

            //se o valor da coluna 1 for maior que o valor procurado também quer dizer que nao encontrou
            try {
                if (NumberUtils.isParsable(varValorAntigo)) {
                    if (Integer.parseInt(varValorAntigo) > Integer.parseInt(varValorComparacao)) {
                        encontrouRegistro = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input String cannot be parsed to Integer.");
            }

            //se o valor valor antigo é igual ao valor encontrado na 'nova linha' ou o valor encontrado for nulo quer dizer que chegou no fim do grid sem encontrar
            if (varValorAntigo.equals(varValorColuna1) || varValorColuna1.equals("")) {
                encontrouRegistro = false;
                break; //Adri 21-05-24 - adicionado break para sair do loop
            }
        }

        //SJM - 28/06/24 - Se a condição do while for falsa e sai do loop não alterava o encontrou registro portanto,
        //                  se a condição for atendida o registro tem que ser considerado encontrado
        if (encontrouRegistro = false ||
                varValorColuna1.equals(varValorComparacao)) {
            encontrouRegistro = true;
            gridColuna1.click();
        }

        esperarMilissegundos(500);
        if (encontrouRegistro) {
            System.out.println("Encontrou o registro: " + varValorComparacao + ", na linha " + varLinha + ", e clicou no elemento na posição encontrada");
            clicarElementoByXpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim);

        } else {
            System.out.println("Não encontrou o registro: " + varValorComparacao);
        }
        esperarMilissegundos(500);
        varPosLinha = String.valueOf(varLinha);
        return encontrouRegistro;
    }

    //SJM - 16-05-24 - Alterado procedimento acima na intenção de conseguir consultar um registro em um grid contendo mais de uma coluna
    //                 no caso comparando valor 'x e y' como se fosse uma matriz de 2 valores
    //                 ajudando a encontrar um registro quando poder haver mais de um registro cadastrado para um determinado 'item' no grid (exemplo tabela de classificação)
    //                 ****** VERIFICAR PROCEDIMENTO ACIMA ONDE DEMONSTRA COMO É ESTRUTURADO XPATH, NAO DEIXADO NESSE PROCEDIMENTO PARA NAO DUPLICAR COMENTARIOS
    public boolean testConsultaRegistroGridDuasColunas(String varValorComparacao1, String xPathColunaTabelaInicio, String xPathColunaTabelaFim,
                                                       String varValorComparacao2, String xPathColunaTabelaInicio2, String xPathColunaTabelaFim2) {


        esperarMilissegundos(1000);
        int varLinha = 0;
        WebElement gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
        String varValorColuna1 = gridColuna1.getAttribute("value");
        String varValorAntigo1 = "";
        WebElement gridColuna2 = driver.findElement(By.xpath(xPathColunaTabelaInicio2 + varLinha + xPathColunaTabelaFim2));
        String varValorColuna2 = gridColuna2.getAttribute("value");
        String varValorAntigo2 = "";
        boolean encontrouRegistro = false;

        while (!varValorColuna1.equals(varValorComparacao1) ||
                !varValorColuna2.equals(varValorComparacao2)) {
            //recebe valores iniciais das linhas do foco
            varValorAntigo1 = varValorColuna1;
            varValorAntigo2 = varValorColuna2;

            //incrementa contador
            varLinha++;

            //verifica se o elemento existe, se não existir sai do while
            boolean varContemOElementoGridColuna1 = validarSeOElementoEstaVisivelByDisplayed((xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
            if (!varContemOElementoGridColuna1) {
                encontrouRegistro = false;
                break;
            }

            //carrega o elemento na posição atualizada do contador
            gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
            gridColuna2 = driver.findElement(By.xpath(xPathColunaTabelaInicio2 + varLinha + xPathColunaTabelaFim2));

            //recebe o novo valor do campo para variavel de comparação
            varValorColuna1 = gridColuna1.getAttribute("value");
            varValorColuna2 = gridColuna2.getAttribute("value");

            //se o valor antigo é igual ao valor encontrado na 'nova linha' ou o valor encontrado for nulo quer dizer que chegou no fim do grid sem encontrar
            if (varValorAntigo1.equals(varValorColuna1) || varValorColuna1.equals("") &&
                    varValorAntigo2.equals(varValorColuna2) || varValorColuna2.equals("")) {
                encontrouRegistro = false;
            }

            //se o valor da coluna 1 for maior que o valor procurado também quer dizer que nao encontrou
            try {
                if (NumberUtils.isParsable(varValorAntigo1)) {
                    if (Integer.parseInt(varValorAntigo1) > Integer.parseInt(varValorComparacao1)) {
                        encontrouRegistro = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input String cannot be parsed to Integer.");
            }

            if (varValorComparacao1.equals(varValorColuna1) &&
                    varValorComparacao2.equals(varValorColuna2)) {
                encontrouRegistro = true;
                gridColuna2.click();
            }
        }

        //SJM - 28/06/24 - Se a condição do while for falsa e sai do loop não alterava o encontrou registro portanto,
        //                  se a condição for atendida o registro tem que ser considerado encontrado
        if (encontrouRegistro = false ||
                varValorColuna1.equals(varValorComparacao1) ||
                varValorColuna2.equals(varValorComparacao2)) {
            encontrouRegistro = true;
            gridColuna2.click();
        }

        if (encontrouRegistro) {
            System.out.println("Encontrou o registro: " + varValorComparacao1 + ", " + varValorComparacao2);
        } else {
            System.out.println("Não encontrou o registro: " + varValorComparacao1 + ", " + varValorComparacao2);
        }
        varPosLinha = String.valueOf(varLinha);
        return encontrouRegistro;

    }

    //SJM - 24-05-24 - Alterado procedimento acima novamente para consultar registro em uma tabela de 3 colunas por exemplo ANV008
    //                 ****** VERIFICAR PROCEDIMENTO ACIMA ONDE DEMONSTRA COMO É ESTRUTURADO XPATH, NAO DEIXADO NESSE PROCEDIMENTO PARA NAO DUPLICAR COMENTARIOS
    public boolean testConsultaRegistroGridTresColunas(String varValorComparacao1, String xPathColunaTabelaInicio, String xPathColunaTabelaFim,
                                                       String varValorComparacao2, String xPathColunaTabelaInicio2, String xPathColunaTabelaFim2,
                                                       String varValorComparacao3, String xPathColunaTabelaInicio3, String xPathColunaTabelaFim3) {


        int varLinha = 0;
        esperarMilissegundos(2000); //espera necessaria
        WebElement gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
        String varValorColuna1 = gridColuna1.getAttribute("value");
        String varValorAntigo1 = "";
        WebElement gridColuna2 = driver.findElement(By.xpath(xPathColunaTabelaInicio2 + varLinha + xPathColunaTabelaFim2));
        String varValorColuna2 = gridColuna2.getAttribute("value");
        String varValorAntigo2 = "";
        WebElement gridColuna3 = driver.findElement(By.xpath(xPathColunaTabelaInicio3 + varLinha + xPathColunaTabelaFim3));
        String varValorColuna3 = gridColuna3.getAttribute("value");
        String varValorAntigo3 = "";
        boolean encontrouRegistro = false;

        while (!varValorColuna1.equals(varValorComparacao1) ||
                !varValorColuna2.equals(varValorComparacao2) ||
                !varValorColuna3.equals(varValorComparacao3)) {
            //recebe valores iniciais das linhas do foco
            varValorAntigo1 = varValorColuna1;
            varValorAntigo2 = varValorColuna2;
            varValorAntigo3 = varValorColuna3;

            //incrementa contador
            varLinha++;

            //verifica se o elemento existe, se não existir sai do while
            boolean varContemOElementoGridColuna1 = validarSeOElementoEstaVisivelByDisplayed((xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
            if (!varContemOElementoGridColuna1) {
                encontrouRegistro = false;
                break;
            }

            //carrega o elemento na posição atualizada do contador
            gridColuna1 = driver.findElement(By.xpath(xPathColunaTabelaInicio + varLinha + xPathColunaTabelaFim));
            gridColuna2 = driver.findElement(By.xpath(xPathColunaTabelaInicio2 + varLinha + xPathColunaTabelaFim2));
            gridColuna3 = driver.findElement(By.xpath(xPathColunaTabelaInicio3 + varLinha + xPathColunaTabelaFim3));

            //recebe o novo valor do campo para variavel de comparação
            varValorColuna1 = gridColuna1.getAttribute("value");
            varValorColuna2 = gridColuna2.getAttribute("value");
            varValorColuna3 = gridColuna3.getAttribute("value");

            //se o valor antigo é igual ao valor encontrado na 'nova linha' ou o valor encontrado for nulo quer dizer que chegou no fim do grid sem encontrar
            if (varValorAntigo1.equals(varValorColuna1) || varValorColuna1.equals("") &&
                    varValorAntigo2.equals(varValorColuna2) || varValorColuna2.equals("") &&
                    varValorAntigo3.equals(varValorColuna3) || varValorColuna3.equals("")) {
                encontrouRegistro = false;
                gridColuna3.click();
            }

            //se o valor da coluna 1 for maior que o valor procurado também quer dizer que nao encontrou
            try {
                if (NumberUtils.isParsable(varValorAntigo1)) {
                    if (Integer.parseInt(varValorAntigo1) > Integer.parseInt(varValorComparacao1)) {
                        encontrouRegistro = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input String cannot be parsed to Integer.");
            }

            if (varValorComparacao1.equals(varValorColuna1) &&
                    varValorComparacao2.equals(varValorColuna2) &&
                    varValorComparacao3.equals(varValorColuna3)) {
                encontrouRegistro = true;
                gridColuna1.click();
            } else {
                encontrouRegistro = true;
            }
        }

        //SJM - 28/06/24 - Se a condição do while for falsa e sai do loop não alterava o encontrou registro portanto,
        //                  se a condição for atendida o registro tem que ser considerado encontrado
        if (encontrouRegistro == false ||
                varValorColuna1.equals(varValorComparacao1) ||
                varValorColuna2.equals(varValorComparacao2) ||
                varValorColuna3.equals(varValorComparacao3)) {
            encontrouRegistro = true;
            gridColuna3.click();
        }

        if (encontrouRegistro) {
            System.out.println("Encontrou o registro: " + varValorComparacao1 + ", " + varValorComparacao2 + ", " + varValorComparacao3);
        } else {
            System.out.println("Não encontrou o registro: " + varValorComparacao1 + ", " + varValorComparacao2 + ", " + varValorComparacao3);
        }
        esperarMilissegundos(2000); //espera necessaria
        varPosLinha = String.valueOf(varLinha);
        return encontrouRegistro;

    }

    //encontrarPrimeiraPosicaoEmBranco
    public String testEncontraPrimeiraPosicaoEmBrancoLinhaGrid1(String xPathColunaTabelaInicio, String xPathColunaTabelaFim) {
        int contador = 0;
        WebElement elementoAtual;
        String valorAtual;

        try {
            while (true) {
                // Tenta encontrar o elemento com o contador atual
                elementoAtual = driver.findElement(By.xpath(xPathColunaTabelaInicio + contador + xPathColunaTabelaFim));
                valorAtual = elementoAtual.getAttribute("value");

                // Verifica se o campo está vazio
                if (valorAtual == null || valorAtual.isEmpty()) {
                    //System.out.println("O primeiro registro em branco foi encontrado na posição: " + contador);
                    return String.valueOf(contador);
                }

                // Incrementa o contador para verificar o próximo elemento
                contador++;
            }
        } catch (NoSuchElementException e) {
            // Caso chegue ao fim do grid e não encontre elementos
            System.out.println("Chegou ao último registro do grid. Nenhuma linha está em branco.");
            return "-1";
        }
    }

    //testConsultaRegistroGrid
    public boolean testConsultaRegistroGrid1(String codigoCadastrado, String xPathColunaTabelaInicio, String xPathColunaTabelaFim) {
        esperarMilissegundos(500);
        int linha = 0;

        try {
            while (true) {
                // Verifica se o elemento existe antes de tentar acessá-lo
                if (!validarSeOElementoEstaVisivelByDisplayed(xPathColunaTabelaInicio + linha + xPathColunaTabelaFim)) {
                    System.out.println("Não encontrou o registro: " + codigoCadastrado);
                    break;
                }

                WebElement gridColuna = driver.findElement(By.xpath(xPathColunaTabelaInicio + linha + xPathColunaTabelaFim));
                String valorColuna = gridColuna.getAttribute("value");

                // Se encontrou o valor procurado, clique e saia do loop
                if (codigoCadastrado.equals(valorColuna)) {
                    gridColuna.click();
                    System.out.println("Encontrou o registro: " + codigoCadastrado + ", na linha " + linha + ", e clicou no elemento na posição encontrada");
                    gridColuna.click();
                    break;
                }
                // Atualiza variáveis e rola para a próxima linha
                gridColuna.sendKeys(Keys.DOWN);
                linha++;
                esperarMilissegundos(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar o registro: " + codigoCadastrado);
        }

        return false;
    }


    //SJM - 10-05-24 - procura no grid de registros a primeira posição sem nenhum registro,
    //                 retorno do metodo é a posição em branco no grid, se não tiver registro em branco retorna -1;
    public String testEncontraPrimeiraPosicaoEmBrancoLinhaGrid(String xPathColunaTabelaInicio, String xPathColunaTabelaFim) {
        //xPathColunaTabelaInicio = parte da string do xpath, que será quebrada referente a linha para ser concatenado pelo varCount
        // "//*[@id='conRecebimentovos']/div/table/tbody/tr["
        //xPathColunaTabelaFim = parte final do xpath do campo
        // "]/td[3]/mx-maxys-input/div/input"
        //varCount = numero referente a linha para consulta do valor no grid, que será incrementada até encontrar o registro ou chegar ao fim do grid
        //Xpath 'final' = "//*[@id='conRecebimentovos']/div/table/tbody/tr[" + varCount + "]/td[3]/mx-maxys-input/div/input"

        int varCount = 0;
        WebElement tfRecebtoGrid = driver.findElement(By.xpath(xPathColunaTabelaInicio + varCount + xPathColunaTabelaFim));
        String varValorCampoGrid = tfRecebtoGrid.getAttribute("value");
        String varValorAntigo = "";
        boolean registroEmBranco = true;
        esperarMilissegundos(200);

        while (!(varValorCampoGrid.isEmpty())) {
            //se entrou no while a primeira vez quer dizer que o registro não está em branco portanto atribui false para a variavel
            registroEmBranco = false;
            //recebe valor inicial da linha do foco
            varValorAntigo = varValorCampoGrid;
            //incrementa contador
            varCount++;

            esperarMilissegundos(200);
            //verifica se o elemento existe, se não existir sai do while
            boolean varContemOElementoGrid = validarSeOElementoEstaVisivelByDisplayed((xPathColunaTabelaInicio + varCount + xPathColunaTabelaFim));
            if (!varContemOElementoGrid) {
                registroEmBranco = true;
                break;
            }

            esperarMilissegundos(200);
            //carrega o elemento na posição atualizada do contador
            tfRecebtoGrid = driver.findElement(By.xpath(xPathColunaTabelaInicio + varCount + xPathColunaTabelaFim));
            //recebe o novo valor do campo para variavel de comparação
            varValorCampoGrid = tfRecebtoGrid.getAttribute("value");

            esperarMilissegundos(200);
            //se o valor valor antigo é igual ao valor encontrado na 'nova linha' ou o valor encontrado for nulo quer dizer que chegou no fim do grid sem encontrar
            if (varValorCampoGrid.isEmpty()) {
                registroEmBranco = true;
            }
            esperarMilissegundos(200);
            if (varValorCampoGrid.equals(varValorAntigo)) {
                System.out.println("Chegou ao ultimo registro do grid e nenhuma linha está em branco");
                varCount = -1;
                break;
            }
        }
        esperarMilissegundos(200);
        if (registroEmBranco) {
            System.out.println("O primeiro registro em branco foi encontrado na posição: " + varCount);
        }
        esperarMilissegundos(200);
        return varCount + "";
    }

    // método para pressionar o F9 por Xpath para abrir o LOV do campo
    public void pressionarF9ByXpath(String elemento) {
        driver.findElement(By.xpath(elemento)).sendKeys(Keys.F9);
    }

    // método para selecionar uma linha de tabela aleatoriamente e clicar nessa linha selecionada
    // (ex: abrir uma lov e aleatoriamente clicar em um dos valores)
    public void selecionarEClicarEmLinhaDeTabelaAleatoriamente(String elemento) {
        // aguarda um tempo para carregar a LOV
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // localiza todas as linhas da tabela
        List<WebElement> linhasTabela = driver.findElements(By.xpath(elemento));

        // seleciona aleatoriamente uma linha da tabela
        Random rand = new Random();
        int index = rand.nextInt(linhasTabela.size());
        WebElement linhaSelecionada = linhasTabela.get(index);

        // clica na linha selecionada
        linhaSelecionada.click();
    }

    // método para retornar String com o texto do elemento
    public String pegarTextoDoElemento(String element) {
        return driver.findElement(By.xpath(element)).getText();
    }

    // método para retornar String com o valor do elemento
    public String pegarValorDoElemento(String element) {
        return driver.findElement(By.xpath(element)).getAttribute("value");
    }

    // método para limpar um campo com elemento by Xpath
    public void limparElementoByXpath(String element) {
        driver.findElement(By.xpath(element)).clear();
    }

    // método para limpar um campo pelo BACK SPACE, necessario passar o campo que se deseja limpar
    // explicação: campoDescrição vai receber o valor do campo a ser apagado e vai clicar no back space até limpar t'odo valor desse campo
    // a maioria dos casos pode-se utilizar o método 'limparElementoByXpath', porem em alguns casos não funciona então utiliza-se o back space
    public void apagarCampoClicandoBackSpace(String elemento) {
        String tecla = "apagar";
        String campoDescricao = pegarValorDoElemento(elemento);
        while (!Objects.equals(campoDescricao, "")) {
            encontrarElementoByXpath(elemento);
            clicarElementoByXpath(elemento);
            selecionarTextoCompletoByXpath(elemento);
            pressionarTecla(tecla);
            campoDescricao = pegarValorDoElemento(elemento);
        }
        esperarMilissegundos(300);
        pressionaTabActions();
    }

    // método onde passamos a ação "marcar" ou "desmarcar" e o elemento do checkbox
    // dessa forma é verificado a ação e clicado ou não no checkbox
    public void testMarcaDesmarcaCheckBox(String acao, String elemento) {
        // sse o elemento do checkbox estiver vazio finaliza o caso
        if (elemento.isEmpty()) {
            System.out.println("Elemento de checkbox inválido!");
            return;
        }

        // verifica se o checkbox está marcado
        WebElement checkboxElement = driver.findElement(By.xpath(elemento));
        boolean isChecked = checkboxElement.getAttribute("class").contains("checked");

        encontrarElementoByXpath(elemento);

        if (Objects.equals(acao, "marcar") && !isChecked) {
            checkboxElement.click();
        } else if (Objects.equals(acao, "desmarcar") && isChecked) {
            checkboxElement.click();
        }
    }

    // Marca um botão de rádio especificado pelo XPath.
    public void marcarRadioButon(String xpathDoElemento) {
        WebElement radioButton = driver.findElement(By.xpath(xpathDoElemento));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }
    }

    // Cria um objeto Actions para executar a ação de clicar em uma posição específica
    public void clicarAleatorioNaTelaPorCoordenada(int x, int y) {
        Actions actions = new Actions(driver);
        try {
            actions.moveByOffset(x, y).click().perform();
        } catch (MoveTargetOutOfBoundsException e) {
            esperarMilissegundos(2000);
            actions.moveByOffset(510, 310).click().perform();
        }
    }

    // Inicialização da primeiraLinhaEmBranco
    public void setPrimeiraLinhaEmBranco() {
        primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);
    }

    // Garantindo que a primeiraLinhaEmBranco seja inicializada apenas uma vez
    public void verificarOuSetarPrimeiraLinhaEmBranco() {
        if (primeiraLinhaEmBranco != 0) {
            setPrimeiraLinhaEmBranco();
        }
    }

    public int encontrarPrimeiraLinhaEmBrancoNoGrid(WebDriver driver) {
        // Encontrar a tabela

        WebElement table = driver.findElement(By.id("mxdatatable"));

        // Obter todas as linhas da tabela
        java.util.List<WebElement> linhas = table.findElements(By.tagName("tr"));

        // Iterar sobre as linhas e verificar se alguma está em branco
        for (int i = 0; i < linhas.size(); i++) {
            WebElement linha = linhas.get(i);

            // Encontrar o elemento de input na linha
            WebElement inputElement = linha.findElement(By.tagName("input"));

            // Verificar se a linha está em branco
            if (isInputVazioSemClasseDirty(inputElement)) {
                return i;
            }
        }
        // Se não for encontrada nenhuma linha em branco, retorne -1
        return -1;
    }


    // Verifica valor vazio e ausência da classe "ng-dirty".
    public boolean isInputVazioSemClasseDirty(WebElement inputElement) {
        // Verificar se o valor do input está vazio
        String value = inputElement.getAttribute("value");

        // Verificar se a classe "ng-dirty" não está presente
        String classes = inputElement.getAttribute("class");

        // Verificar se a linha está em branco
        return value.isEmpty() && !classes.contains("ng-dirty");
    }

//----------------------------------------------------------------------------------------
//    //Funções para LOCALIZAR - CLICAR - PREENCHER - CONFERIR - dentro de um MODAL (SEL)
// ----------------------------------------------------------------------------------------

    // método para localizar e clicar em um elemento dentro de um modal (SEL)
    public void localizarEClicarElementoDoModal(String xpathElemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("modal-container")));

        WebElement iframe = modal.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        WebElement elementoDesejado = driver.findElement(By.xpath(xpathElemento));
        elementoDesejado.click();

        driver.switchTo().defaultContent();
        esperarMilissegundos(500);
    }

    // método para localizar, clicar e preencher um elemento dentro de um modal (SEL)
    public void localizarClicarEPreencherElementoDoModal(String xpathElemento, String valor) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("modal-container")));

        WebElement iframe = modal.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        WebElement elementoDesejado = driver.findElement(By.xpath(xpathElemento));
        elementoDesejado.click();
        elementoDesejado.sendKeys(valor);

        driver.switchTo().defaultContent();
        esperarMilissegundos(500);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    // método para conferir o valor de um elemento dentro de um modal (SEL)
    protected void conferirValorDoElementoDoModal(String xpathElemento, String valor) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("modal-container")));

        WebElement iframe = modal.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        WebElement elementoDesejado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathElemento)));
        String valorAtual = elementoDesejado.getAttribute("value");

        // Comparar o valor atual com o valor esperado
        if (valorAtual.equals(valor)) {
            System.out.println("O valor do campo é igual ao valor esperado: " + valor);
        } else {
            System.out.println("O valor do campo é diferente do valor esperado:");
            System.out.println("Valor esperado: " + valor);
            System.out.println("Valor atual: " + valorAtual);
        }

        driver.switchTo().defaultContent();
        esperarMilissegundos(500);
    }

    // método para localizar e apagar o conteúdo de um elemento dentro de um modal (SEL)
    public void localizarEApagarConteudoDoElementoDoModal(String elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("modal-container")));

        WebElement iframe = modal.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        WebElement elementoDesejado = driver.findElement(By.xpath(elemento));
        elementoDesejado.click();
        elementoDesejado.clear();

        driver.switchTo().defaultContent();
        esperarMilissegundos(500);
    }

//-------------------------------------------------------------------------------------------
//    //Funções de ESPERAR - ENCONTRAR - LOCALIZAR - CLICAR - PREENCHER - FUNÇÕES COMPLETAS
// ------------------------------------------------------------------------------------------

    // para preencher um elemento com um valor - função completa - com esperas
    public void esperarEncontrarEPreencherElementos(String elemento, String valor) {
        esperarMilissegundos(300); //espera necessária
        encontrarElementoByXpath(elemento);
        esperarMilissegundos(200);//espera necessária
        clicarElementoByXpath(elemento);
        esperarMilissegundos(200);//espera necessária
        preencherElementoByXpath(elemento, valor);
        esperarMilissegundos(300); //espera necessária
        pressionaTabActions();
    }

    // para preencher um elemento com um valor - função completa - com esperas
    public void encontrarEPreencherElementos(String campoInicioXpath, String campoFimXpath, String valor) {
        String elementoXpath = campoInicioXpath + campoFimXpath;
        clicarElementoByXpathNVezes(elementoXpath, 2);
        esperarMilissegundos(200); // espera necessária
        preencherElementoByXpath(elementoXpath, valor);
        pressionarENTERByXpath(elementoXpath);
        pressionaTabActions();
    }

    // para selecionar uma opção em um grid - função completa - com esperas
    public void esperarEncontrarESelecionar(String elemento, String valor) {
        esperarMilissegundos(500); //espera necessaria
        selecionarListaGridByXpathText(elemento, valor);
        esperarMilissegundos(1000); //espera necessaria
        pressionaTabActions();
    }

    // para abrir LOV de um campo e selecionar - função completa - com esperas
    public void esperarClicarESelecionarF9(String elemento, String valor, String elementoTabela) {
        esperarMilissegundos(300); //espera necessaria
        clicarElementoByXpath(elemento);
        selecionarPeloF9(elemento, valor, elementoTabela);
        pressionaTabActions();
    }

    // para Apagar/limpar um campo - função completa - com esperas
    public void encontrarEApagarCampo(String elemento) {
        esperarMilissegundos(300); //espera necessaria
        encontrarElementoByXpath(elemento);
        apagarCampoClicandoBackSpace(elemento);
        esperarMilissegundos(500); //espera necessaria
        pressionaTabActions();
    }

    // Limpa um elemento pelo seu XPath e TAB após limpar o elemento.
    public void limparElementoTABByXpath(String elemento) {
        WebElement campo = driver.findElement(By.xpath(elemento));
        campo.click(); // Garante que o campo está focado
        campo.clear(); // Tenta limpar o campo inicialmente

        // Utiliza Ctrl+A seguido de Delete para limpar o campo
        campo.sendKeys(Keys.CONTROL + "a"); // Seleciona o texto por completo
        campo.sendKeys(Keys.DELETE); // Apaga o texto selecionado

        // Verifica se o campo ainda contém valor após tentar limpar com Ctrl+A e Delete
        String valor = campo.getAttribute("value");
        if (valor != null && !valor.isEmpty()) {
            campo.sendKeys(Keys.CONTROL + "a"); // Seleciona o texto por completo, novamente
            campo.sendKeys(Keys.DELETE); // Apaga o texto selecionado novamente
        }

        // Simula uma interação humana para garantir que a alteração seja detectada
        campo.sendKeys(" "); // Adiciona um espaço
        campo.sendKeys(Keys.DELETE); // Remove o espaço
        campo.sendKeys(Keys.TAB); // Sai do campo para disparar eventos de alteração
    }

    public void limparCampoDeTextoPorXpath(String elemento) {
        WebElement campo = driver.findElement(By.xpath(elemento));
        campo.click(); // Garante que o campo está focado
        campo.clear(); // Tenta limpar o campo inicialmente

        // Utiliza Ctrl+A seguido de Delete para limpar o campo
        campo.sendKeys(Keys.CONTROL + "a"); // Seleciona o texto por completo
        campo.sendKeys(Keys.DELETE); // Apaga o texto selecionado

        // Verifica se o campo ainda contém valor após tentar limpar com Ctrl+A e Delete
        String valor = campo.getAttribute("value");
        if (valor != null && !valor.isEmpty()) {
            campo.sendKeys(Keys.CONTROL + "a"); // Seleciona o texto por completo, novamente
            campo.sendKeys(Keys.DELETE); // Apaga o texto selecionado novamente
        }
    }

    // Altera o contexto para o iframe que contém o elemento
    public void alterarParaIframeComElemento(String xpathElemento) {
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        boolean encontrouIframe = false;

        for (WebElement iframe : iframes) {
            driver.switchTo().frame(iframe); // Alterna para o iframe atual
            if (!driver.findElements(By.xpath(xpathElemento)).isEmpty()) { // Verifica se o elemento existe no iframe
                encontrouIframe = true;
                break; // Sai do loop se encontrar o elemento
            }
            driver.switchTo().defaultContent(); // Volta para o contexto principal caso o elemento não esteja no iframe
        }

        if (!encontrouIframe) {
            throw new RuntimeException("O elemento não foi encontrado em nenhum iframe!");
        }
    }

    // método que verifica se existe mais de um iframe, se sim ele entra no 0
    public void encontrarIframe() {
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        if (!iframes.isEmpty()) {
            driver.switchTo().frame(iframes.get(0));
        } else {
            try {
                driver.switchTo().frame(iframes.get(0));
                throw new RuntimeException("Nenhum iframe encontrado!");
            } catch (IndexOutOfBoundsException e) {
                driver.switchTo().parentFrame();
            }
        }
    }

    public void direcionarAba(int indiceAba) {
        Set<String> abas = driver.getWindowHandles();
        List<String> listaAbas = new ArrayList<>(abas);

        if (indiceAba < listaAbas.size()) {
            driver.switchTo().window(listaAbas.get(indiceAba));
        } else {
            throw new IllegalArgumentException("Índice da aba inválido: " + indiceAba);
        }
    }
}


