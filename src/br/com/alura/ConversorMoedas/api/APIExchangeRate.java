package br.com.alura.ConversorMoedas.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIExchangeRate {
    private final String API_KEY = "598c8658049ff01a7c7d1fd1";

    public double obterTaxaConversao(String moedaOrigem, String moedaDestino) throws Exception {
        String chaveAPI = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaOrigem;
        URL url = new URL(chaveAPI);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);

        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new Exception("Erro ao acessar a API. Código de resposta: " + responseCode);
        }

        Scanner scanner = new Scanner(conn.getInputStream());
        StringBuilder resposta = new StringBuilder();

        while (scanner.hasNext()) {
            resposta.append(scanner.nextLine());
        }

        scanner.close();

        JsonObject jsonResposta = JsonParser.parseString(resposta.toString()).getAsJsonObject();
        if (!jsonResposta.has("conversion_rates")) {
            throw new Exception("Resposta da API não contém as taxas de câmbio. Verifique a chave ou a API.");
        }

        JsonObject taxas = jsonResposta.getAsJsonObject("conversion_rates");

        if (!taxas.has(moedaDestino)) {
            throw new Exception("Moeda destino não encontrada nas taxas de câmbio.");
        }
        return taxas.get(moedaDestino).getAsDouble();
    }
}
