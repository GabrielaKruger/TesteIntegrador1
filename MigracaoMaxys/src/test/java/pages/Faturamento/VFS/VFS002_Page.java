package pages.Faturamento.VFS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.DataUtils;

import java.util.HashMap;
import java.util.Map;

public class VFS002_Page extends BasePage {

    WebDriver driver;

    public VFS002_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String radioBtnNenhum = "//*[@id='ngx-radio-1']";

    String inputDataEmissao = "//*[@id='movtofaturar-dtEmissao']/div/div/input";
    String inputCliforNotaFiscal = "//*[@id='movtofaturar-cdClifor']/div/input";

//    public void selecionadoTipoDeVendaFeatureVFS002(String tipoVenda) {
//
//        esperarEncontrarEPreencherElementos(radioBtnNenhum, tipoVenda);
//
////        // Mapeia as opções disponíveis para os XPaths correspondentes
////        Map<String, String> tipoVendaMap = new HashMap<>();
////        tipoVendaMap.put("0", "//*[@id='ngx-radio-1']");
////        tipoVendaMap.put("1", "//*[@id='ngx-radio-2']");
////        tipoVendaMap.put("2", "//*[@id='ngx-radio-3']");
////        tipoVendaMap.put("3", "//*[@id='ngx-radio-4']");
////        tipoVendaMap.put("4", "//*[@id='ngx-radio-5']");
////        tipoVendaMap.put("5", "//*[@id='ngx-radio-6']");
////        tipoVendaMap.put("6", "//*[@id='ngx-radio-7']");
////
////        // Obtém o XPath correspondente ao tipo de venda
////        String xpathSelecionado = tipoVendaMap.get(tipoVenda);
////
////        if (xpathSelecionado != null) {
////            WebElement radioButton = driver.findElement(By.xpath(xpathSelecionado));
////            if (!radioButton.isSelected()) {
////                radioButton.click();
////            }
////        } else {
////            throw new IllegalArgumentException("Tipo de venda inválido: " + tipoVenda);
////        }
//    }
//
//    public void esperarEncontrarEPreencherElementos(String elemento, String valor) {
//        esperarMilissegundos(300); //espera necessaria
//        encontrarElementoByXpath(elemento);
//        esperarMilissegundos(200);//espera necessaria
//        clicarElementoByXpath(elemento);
//        esperarMilissegundos(200);//espera necessaria
//        preencherElementoByXpath(elemento, valor);
//        esperarMilissegundos(300); //espera necessaria
//        pressionaTabActions();
//    }

    public void selecionaASerieDaNotaFiscalFeatureVFS002(String serieNotaFiscal) {
        WebElement dropdownTpRegistro = driver.findElement(By.xpath("//*[@id='movtofaturar-cdSerienf']/div/select"));

        // Cria um objeto Select para manipular o dropdown
        Select select = new Select(dropdownTpRegistro);

        // Seleciona a opção baseada no texto visível
        select.selectByVisibleText(serieNotaFiscal);
    }

    public void informaDataEmissaoDaNotaFeatureVFS002() {
        limparElementoByXpath(inputDataEmissao);
        clicarElementoByXpath(inputDataEmissao);
        preencherElementoByXpath(inputDataEmissao, DataUtils.DataAtual());
    }

    public void preencheOCliforDaNotaFeatureVFS002(String cliforNotaFiscal) {
        limparElementoByXpath(inputCliforNotaFiscal);
        clicarElementoByXpath(inputCliforNotaFiscal);
        preencherElementoByXpath(inputCliforNotaFiscal, cliforNotaFiscal);
        esperarMilissegundos(2000);
        pressionaTabActions();
    }
}
