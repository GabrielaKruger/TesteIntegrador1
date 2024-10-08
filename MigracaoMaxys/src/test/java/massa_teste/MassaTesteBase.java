package massa_teste;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class MassaTesteBase {
    String pathJson;
    public static Map massaTeste = new HashMap<String, String>();
    private final Gson gson = new Gson();

    public void setMassaTeste(String pathJson) {
        try {
            massaTeste = lerJson();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map lerJson() throws FileNotFoundException {
        Reader reader = new FileReader(pathJson);
        return gson.fromJson(reader, Map.class);
    }

    /**
     * Passada uma chave, retorna o valor correspondente
     *
     * @param chave - pode ser um login ou um password
     * @return
     */
    public static String getData(String chave) {
        return massaTeste.get(chave).toString();
    }

}
