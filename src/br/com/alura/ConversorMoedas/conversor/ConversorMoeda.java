package br.com.alura.ConversorMoedas.conversor;

import br.com.alura.ConversorMoedas.api.APIExchangeRate;

public class ConversorMoeda {
    private APIExchangeRate apiExchangeRate;

    public ConversorMoeda(APIExchangeRate apiExchangeRate){
        this.apiExchangeRate = apiExchangeRate;
    }

    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        try {
            double taxa = apiExchangeRate.obterTaxaConversao(moedaOrigem, moedaDestino);
            return valor * taxa;
        } catch (Exception e) {
            System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            return 0;
        }
    }
}
