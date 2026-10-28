package br.com.alexandre.sistemacaixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        String[] nomesProdutos = {"Arroz", "Feijão", "Macarrão", "Óleo"};
        double[] precos = {25, 8, 5, 9};
        int[] quantidadesEmEstoque = {10, 15, 20, 12};
        double valorTotalCaixa = 0;

        do {

            System.out.println("\n====== SISTEMA DE CAIXA ======");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Registrar venda");
            System.out.println("3 - Consultar estoque");
            System.out.println("4 - Relatório do caixa");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < nomesProdutos.length; i++) {
                        System.out.println(
                                (i + 1) + " - " + nomesProdutos[i]
                                        + " | R$ " + precos[i]
                                        + "| Estoque: " + quantidadesEmEstoque[i]
                        );
                    }
                    break;
                case 2:
                    System.out.println("Digite o código do produto: ");
                    int codigoProduto = input.nextInt();

                    if (codigoProduto < 1 || codigoProduto > quantidadesEmEstoque.length) {
                        System.out.println("Código inválido!");
                    } else {
                        int indice = codigoProduto - 1;

                        System.out.println("Quantidade desejada: ");
                        int quantidade = input.nextInt();

                        if (quantidade < 1 || quantidade > quantidadesEmEstoque[indice]) {
                            System.out.println("Quantidade indisponível!");
                        } else {
                            double totalVenda = precos[indice] * quantidade;
                            System.out.println("Total da venda: R$ " + totalVenda);
                            valorTotalCaixa += totalVenda;

                            quantidadesEmEstoque[indice] = quantidadesEmEstoque[indice] - quantidade;
                            System.out.println("Estoque restante: " + quantidadesEmEstoque[indice]);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Digite o código do produto: ");
                    codigoProduto = input.nextInt();

                    if (codigoProduto < 1 || codigoProduto > quantidadesEmEstoque.length){
                        System.out.println("Código inválido!");
                    } else {
                        int indice = codigoProduto - 1;
                        System.out.println("Produto: "+nomesProdutos[indice]);
                        System.out.println("Estoque disponível: "+quantidadesEmEstoque[indice]);
                    }
                    break;
                case 4:
                    System.out.println("====== RELATÓRIO DO CAIXA ======");
                    System.out.println("Total do caixa: R$ "+valorTotalCaixa);
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }

}