# Sistema de Caixa

Aplicação de console desenvolvida em Java para simular operações básicas de um caixa comercial. Criei este projeto para colocar em prática os fundamentos da linguagem e exercitar a construção de um programa com diferentes funcionalidades.

## Funcionalidades

- Listar produtos com preço e quantidade em estoque.
- Registrar vendas, validando o código do produto e a quantidade solicitada.
- Atualizar o estoque após cada venda válida.
- Consultar o estoque de um produto específico.
- Exibir o valor total arrecadado durante a execução.

## Tecnologias

- Java
- Git e GitHub
- IntelliJ IDEA

## Como executar

1. Tenha o JDK instalado no computador.
2. Clone o repositório:

   ```bash
   git clone git@github.com:xande10/projeto01-sistema-caixa.git
   ```

3. Abra a pasta do projeto no IntelliJ IDEA.
4. Execute a classe `Main`, no pacote `br.com.alexandre.sistemacaixa`.
5. Utilize o menu exibido no terminal.

Também é possível compilar e executar pelo terminal, a partir da raiz do projeto:

```bash
javac -d out src/br/com/alexandre/sistemacaixa/Main.java
java -cp out br.com.alexandre.sistemacaixa.Main
```

## Conceitos praticados

- Arrays
- Estruturas condicionais (`if`, `else` e `switch`)
- Estruturas de repetição (`for` e `do-while`)
- Leitura de dados com `Scanner`
- Validação de entradas
- Manipulação de variáveis e cálculos

## Limitações

Os produtos são definidos diretamente no código, e os dados são mantidos apenas em memória. Ao encerrar o programa, o estoque e o total do caixa voltam aos valores iniciais.

Este projeto ainda não utiliza banco de dados ou interface gráfica.
