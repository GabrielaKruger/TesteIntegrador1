package utils;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class CredenciaisLogin {
    String pathJson = "src/test/resources/massa_teste/credenciais.json";
    public static Map credenciais = new HashMap<String, String>();
    private final Gson gson = new Gson();

    public CredenciaisLogin() {
        try {
            lerJson();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void lerJson() throws FileNotFoundException {
        Reader reader = new FileReader(pathJson);
        credenciais = gson.fromJson(reader, Map.class);
    }

    /**
     * Passada uma chave, retorna o valor correspondente
     *
     * @param chave - pode ser um login ou um password
     * @return
     */
    public String getData(String chave) {
        return credenciais.get(chave).toString();
    }

}
