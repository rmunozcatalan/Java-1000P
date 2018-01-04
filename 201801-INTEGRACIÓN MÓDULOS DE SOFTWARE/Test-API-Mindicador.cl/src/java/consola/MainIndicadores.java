package consola;

//import .*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class MainIndicadores {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://mindicador.cl/api");
        InputStream entrada = url.openStream();
        JsonReader reader = Json.createReader(entrada);
        JsonObject objeto = reader.readObject();
        
        double valorUf = Double.parseDouble(
        objeto.getJsonObject("uf")
                .get("valor")
                .toString()
        );
        
        System.out.println("Valor UF: " + valorUf);
    }

}
