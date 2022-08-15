import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {
    InimigoService inimigoService;

    public BuscaInimigo(InimigoService inimigoService) {
        this.inimigoService = inimigoService;
    }

    public Inimigo buscaInimigo(int id) {
        // Faz a busca pelo service com o ID
        String inimigoJSON = inimigoService.busca(id);
        // Converte em objeto json
        JsonObject jsonObject = JsonParser.parseString(inimigoJSON).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }
}
