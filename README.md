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

O código utiliza de um looping onde o usuário poderá realizar quantas conversoes ele quiser. Após 

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

## Criando fork
1. Realize o fork desse repositório. Você pode seguir a documentação do GitHub sobre [forks](https://docs.github.com/pt/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo).
2. Após criar o fork, você terá o seu repositório (um repositório cópia do original) e poderá trabalhar nos próximos passos
## Clonando o repositório cópia
1. Clone o seu repositório, seguindo a imagem abaixo  
![image](https://github.com/user-attachments/assets/f6b353df-4cc1-41a0-8abc-f46719244cf3) ``fonte: alura fórum``
2. No Intelij, vá ir no menu em _file_ e selecionar _New_ > _Project from Version Control_, no pop-up selecionamos o _Git_ e cole o link que copiou no passo anterior.
3. Escolha o diretório onde deseja clonar o projeto em _Directory_ e clicar em _Clone_

__OBS: Para maiores informações, consulte o [artigo fonte](https://cursos.alura.com.br/forum/topico-importacao-do-github-para-o-intellij-433529)__

