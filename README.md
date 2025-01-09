# 💲 Conversor de moedas - challenge alura 💲
Este repositório possui o código do Conversor de moedas e desenvolvido em Java para o alura Challenge. 

# 🛠 Construção
☕ Linguagem Java;  
👩‍💻 API [Exchange Rate](https://www.exchangerate-api.com/);  
💻 IDE Intelij para construção e execução de código;   
💻 [.JAR Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0) para a conversão de objetos Java em .json.

# 🏹 Objetivo do projeto
O conversor de moedas criado, trabalha com Dólar [USD], Real Brasileiro [BRL], Peso Argentino [ARS] e Peso Colombiano [COP], respeitando as nomenclaturas da API. O conversor tem a capacidade de realizar os processos de convenção:
1. Dólar para Peso Argentino (USD → ARS)
2. Peso Argentino para Dólar (ARS → USD);
3. Dólar para Real Brasileiro (USD → BRL);
4. Real Brasileiro para Dólar (BRL → USD);
5. Dólar para Peso Colombiano (USD → COP);
6. Peso Colombiano para Dólar (COP → USD);
7. Sair!

# 📂 Organização de arquivos: 
```bash
ConversorMoedas/
├── .idea/
├── out/
├── src/
│   └── br.com.alura.ConversorMoedas/
│       ├── api/
│       │   └── APIExchangeRate
│       ├── conversor/
│       │   ├── ConversorJson
│       │   └── ConversorMoeda
│       └── principal/
│           └── PrincipalMoeda
├── .gitignore
├── ConversorMoedas.iml
└── historico_conversoes.json
```

# Testando o projeto
