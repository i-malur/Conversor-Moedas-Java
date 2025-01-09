package br.com.alura.ConversorMoedas.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversorJson {
    private String data;
    private double valorOriginal;
    private String moedaOrigem;
    private String moedaDestino;
    private double valorConvertido;

    public ConversorJson(double valorOriginal, String moedaOrigem, String moedaDestino, double valorConvertido) {
        this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.valorOriginal = valorOriginal;
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorConvertido = valorConvertido;
    }

    // Getters
    public String getData() {
        return data;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }
}
