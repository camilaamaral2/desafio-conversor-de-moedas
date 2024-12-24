import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Api {
    public void api(String moedaEscolhida, String moedaConvertida, double valorDigitado) throws IOException, InterruptedException {
        String endereco = "https://v6.exchangerate-api.com/v6/bd3b56a6e11d325515373a9b/latest/" + moedaEscolhida;
        Scanner leitura = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = new Gson()
                .fromJson(response.body(), JsonObject.class);

        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        JsonPrimitive convertidaRate = rates.getAsJsonPrimitive(moedaConvertida);

        Moeda moeda = new Moeda(moedaEscolhida, moedaConvertida);
        moeda.calcularConversao(valorDigitado, Double.parseDouble(convertidaRate.toString()));
        System.out.println(moeda);
    }
}
