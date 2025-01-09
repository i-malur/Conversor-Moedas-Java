package br.com.alura.ConversorMoedas.principal;

import br.com.alura.ConversorMoedas.api.APIExchangeRate;
import br.com.alura.ConversorMoedas.conversor.ConversorMoeda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrincipalMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        ConversorMoeda conversor = new ConversorMoeda(new APIExchangeRate());
        List<ConversorJson> historicoConversoes = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        while (escolha != 7) {
            System.out.println("Seja bem vindo(a)\n");
            System.out.println("***********************************************************************");
            System.out.println("Digite de 1 a 6 para uma conversão:");
            System.out.println("\n1. Dólar para Peso Argentino (USD → ARS)");
            System.out.println("2. Peso Argentino para Dólar (ARS → USD)");
            System.out.println("3. Dólar para Real Brasileiro (USD → BRL)");
            System.out.println("4. Real Brasileiro para Dólar (BRL → USD)");
            System.out.println("5. Dólar para Peso Colombiano (USD → COP)");
            System.out.println("6. Peso Colombiano para Dólar (COP → USD)");
            System.out.println("7. Para sair!");
            System.out.println("***********************************************************************\n");

            System.out.print("Digite a opção desejada: ");
            while (true) {
                try {
                    escolha = scanner.nextInt();
                    if (escolha < 1 || escolha > 7) {
                        System.out.println("Opção inválida! Por favor, escolha um número entre 1 e 7.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número válido.");
                    scanner.nextLine();
                }
            }

            if (escolha == 7) {
                System.out.println("Saindo do programa...");
                break;
            }

            double valor = 0;
            while (true) {
                try {
                    System.out.print("Digite o valor a ser convertido: ");
                    valor = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número válido.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            String moedaOrigem = "";
            String moedaDestino = "";

            switch (escolha) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 2:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "COP";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    break;
            }

            try {
                double resultado = conversor.converter(moedaOrigem, moedaDestino, valor);
                System.out.println("Resultado da conversão: " + valor + " " + moedaOrigem + " = " + resultado + " " + moedaDestino);
                historicoConversoes.add(new ConversorJson(valor, moedaOrigem, moedaDestino, resultado));

            } catch (Exception e) {
                System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            }
        }

        try (FileWriter writer = new FileWriter("historico_conversoes.json")) {
            if (historicoConversoes.isEmpty()) {
                System.out.println("Nenhuma conversão realizada para salvar.");
            } else {
                gson.toJson(historicoConversoes, writer);  // Salva o histórico no arquivo
                System.out.println("Histórico de conversões salvo com sucesso!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o histórico: " + e.getMessage());
        }

        System.out.println("Programa encerrado.");
    }
}
