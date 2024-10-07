package utils;

import com.google.gson.Gson;
import io.cucumber.java.Scenario;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MassaTeste {

    private Map massaDeTeste = new HashMap<String, String>();
    private final Gson gson = new Gson();

    public void lerJson(String pathJson) throws FileNotFoundException {
        Reader reader = new FileReader(pathJson);
        massaDeTeste = gson.fromJson(reader, Map.class);
    }

    public String getData(String chave) {
        return massaDeTeste.get(chave).toString();
    }

    public void gravaJson(String pathJson) throws IOException {
        FileWriter writer = new FileWriter(pathJson);
        gson.toJson(massaDeTeste, writer);
        writer.flush();
        writer.close();
    }

    public Map getMassaTeste() {
        return massaDeTeste;
    }

    public void setMassaTeste(Map massaDeTeste) {
        this.massaDeTeste = massaDeTeste;
    }


    /**
     * Retorna o nome do arquivo json de massa de teste tendo como entrada o scenario
     *
     * @param scenario
     * @return
     */
    public String getPathByScenario(Scenario scenario) {
        String pathJson = "src/test/resources/massa_teste/";
        Iterator<String> tags = scenario.getSourceTagNames().iterator();
        String jsonFileName = "";
        while (tags.hasNext()) {
            String tagName = tags.next();
            if (tagName.startsWith("@dt_")) {
                jsonFileName = tagName.substring(tagName.indexOf('_') + 1) + ".json";
                break;
            }
        }
        return pathJson + jsonFileName;
    }

    public String getMassaTestePorPathEChave(String pathJson, String chave) {
        Map massaDeTesteLocal = new HashMap<String, String>();

        Reader reader;
        try {
            reader = new FileReader(pathJson);
            massaDeTesteLocal = gson.fromJson(reader, Map.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return massaDeTesteLocal.get(chave).toString();
    }

}
