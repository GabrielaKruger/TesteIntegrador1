package pages;

import org.openqa.selenium.WebDriver;

public class EXP088_Page extends BasePage {
    WebDriver driver;

    String descricaoFaker;
    int primeiraLinhaEmBranco;

    public EXP088_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherDescricaoFeatureEXP088(String descricao) {
        primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);
        String linhaDescricaoElement = "//*[@id='msTipoinfprecificacao-dsTipoinfprecificacao-" + primeiraLinhaEmBranco + "']/div/input";
        descricaoFaker = descricao;
        clicarElementoByXpath(linhaDescricaoElement);
        esperarMilissegundos(5000); //espera necessária
        preencherElementoByXpath(linhaDescricaoElement, descricaoFaker);
    }

    public void encontrarDescricaoFeatureEXP088() {
        String varDescricaoInf = descricaoFaker;
        String xPathColunaTabelaInicio = "//*[@id='msTipoinfprecificacao-dsTipoinfprecificacao-";
        String xPathColunaTabelaFim = "']/div/input";
        boolean encontrouRegistro = testConsultaRegistroGrid(varDescricaoInf, xPathColunaTabelaInicio, xPathColunaTabelaFim);
    }

}

