package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExecutionUtils {
    private static ExecutionUtils instance = null;

    public static MassaTeste massaTeste = new MassaTeste();
    public String tagMassaTeste;
    public static Map<String, MassaTeste> massaTesteMap = new HashMap<>();
    public static Map<String, WebDriver> driversMap = new HashMap<>();

    public static ExecutionUtils getInstance(Scenario scenario) {
        if (instance == null) {
            instance = new ExecutionUtils();
        }
        return instance;
    }

    /**
     * Retorna as massas de teste
     *
     * @param scenario
     * @return
     */
    public MassaTeste getMassaTeste(Scenario scenario) {
        String tagMassaTeste = getMassaTesteByTag(scenario);
        try {
            if (massaTesteMap.get(tagMassaTeste) == null) {
                setMassaTeste(scenario);
            }
        } catch (Exception e) {
            setMassaTeste(scenario);
        }
        return massaTesteMap.get(tagMassaTeste);
    }

    /**
     * Adiciona as massas de teste no map da classe ExecutionUtils
     *
     * @param scenario
     */
    public void setMassaTeste(Scenario scenario) {
        this.tagMassaTeste = getMassaTesteByTag(scenario);
        lerJsonMassaTeste(tagMassaTeste);
        massaTesteMap.put(tagMassaTeste, massaTeste);
    }

    /**
     * Retorna o nome do arquivo json de massa de teste tendo como entrada o scenario
     *
     * @param scenario
     * @return
     */
    public String getMassaTesteByTag(Scenario scenario) {
        Iterator<String> tags = scenario.getSourceTagNames().iterator();
        String jsonFileName = "";
        while (tags.hasNext()) {
            String tagName = tags.next();
            if (tagName.startsWith("@dt_")) {
                jsonFileName = tagName.substring(tagName.indexOf('_') + 1) + ".json";
                break;
            }
        }
        return jsonFileName;
    }

    /**
     * Le o arquivo json de massa de teste e seta(internamente) o mapa de massa de teste da classe MassaTeste
     *
     * @param jsonFileName
     */
    public void lerJsonMassaTeste(String jsonFileName) {
        String pathJson = "src/test/resources/massa_teste/";

        try {
            massaTeste.lerJson(pathJson + jsonFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setDriver(Scenario scenario, WebDriver driver) {

        driversMap.put(scenario.getId(), driver);
    }

    public WebDriver getDriver(Scenario scenario) {
        System.out.println("metodo getDriver");
        System.out.println("Execution - Driver: " + driversMap.get(scenario.getId()).toString());
        System.out.println("Execution  - Scenarios: " + scenario.getId());
        return driversMap.get(scenario.getId());
    }

    public WebDriver getDriver(String scenarioId) {
        return driversMap.get(scenarioId);
    }

    public void quitDrivers() {
        for (Map.Entry<String, WebDriver> entry : driversMap.entrySet()) {
            entry.getValue().quit();
        }
    }

    public void exibirWebdrivers() {
        for (Map.Entry<String, WebDriver> entry : driversMap.entrySet()) {
            System.out.println(entry.getValue().toString());
            System.out.println(entry.getKey());
        }
    }

    public void exibirMassaTeste() {
        for (Map.Entry<String, MassaTeste> entry : massaTesteMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().toString());
        }
    }

}
