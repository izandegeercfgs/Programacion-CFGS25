package APIs;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class coinAPI {
    public static void main(String[] args) {
        try {

            String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd,eur";

            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            Gson gson = new Gson();
            CoinGecko Datos = gson.fromJson(response.toString(), CoinGecko.class);

            System.out.println("Precios actuales");
            System.out.println("****************");

            System.out.println("> Bitcoin");
            System.out.println("USD - " + Datos.bitcoin.usd + "$");
            System.out.println("EUR - " + Datos.bitcoin.eur + "€");

            System.out.println("> Ethereum");
            System.out.println("USD - " + Datos.ethereum.usd + "$");
            System.out.println("EUR - " + Datos.ethereum.eur + "€");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
