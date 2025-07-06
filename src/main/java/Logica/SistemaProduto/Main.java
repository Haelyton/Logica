package Logica.SistemaProduto;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Produtos deseja cadastrar?");
        int N = scanner.nextInt();

        List<Produtos> produtos = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Preencha as Informacoes do " + i + 1 + " produto");

            System.out.print("id do produto: ");
            Integer id = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preco: ");
            double preco = scanner.nextDouble();

            System.out.println("Quantidade em Estoque: ");
            int quantidadeEstoque = scanner.nextInt();

            while (quantidadeEstoque <= 0) {
                System.out.println("Estoque do produto não pode ser negativo");
                quantidadeEstoque = scanner.nextInt();
            }

            while (preco <= 0) {
                System.out.println("Preco do produto não pode ser negativo");
                preco = scanner.nextDouble();
            }

            Produtos produtosCadastrados = Produtos.builder()
                    .id(id)
                    .nome(nome)
                    .quantidadeEstoque(quantidadeEstoque)
                    .preco(preco)
                    .build();

            produtos.add(produtosCadastrados);
        }

        System.out.println("Escolha uma opção:");
        System.out.print("1 - Listar produtos cadastrados: ");
        System.out.print("\n2 - Remover quantidade em estoque: ");
        System.out.print("\n3 - Adicionar quantidade em estoque: ");
        System.out.println();
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1: {
                for (Produtos listProduto : produtos) {
                    System.out.println(listProduto.getNome());
                }
                break;
            }
            case 2: {
                System.out.println("Insira o id do produto que deseja remover o estoque");
                int id = scanner.nextInt();

                Produtos produtoUpdate = null;
                for (Produtos produto : produtos) {
                    if (id == produto.getId()) {
                        System.out.println("Qual a quantidade que deseja remover?");
                        int quantidadeEstoqueRemoved = scanner.nextInt();

                        produtoUpdate = produto;
                        produtoUpdate.removeQuantityInStock(quantidadeEstoqueRemoved);
                    }
                }

                System.out.println("Produto atualizado");
                System.out.print("Nome: " + produtoUpdate.getNome() + "\nPreco: " + produtoUpdate.getPreco() + "\nQuantidade Atualizada: " + produtoUpdate.getQuantidadeEstoque());

                break;
            }
            case 3: {
                System.out.println("Insira o id do produto que deseja adicionar estoque");
                int id = scanner.nextInt();

                Produtos produtoUpdate = null;
                for (Produtos produtoAddStock : produtos) {
                    if (id == produtoAddStock.getId()) {
                        System.out.println("Qual a quantidade que deseja adicionar de estoque ao produto "
                                + produtoAddStock.getNome());
                        int quantidadeEstoque = scanner.nextInt();

                        produtoUpdate = produtoAddStock;
                        produtoUpdate.addStock(quantidadeEstoque);
                    }
                }

                System.out.println("Produto atualizado");
                System.out.print("Nome: " + produtoUpdate.getNome() + "\nPreco: " + produtoUpdate.getPreco() + "\nQuantidade Atualizada: " + produtoUpdate.getQuantidadeEstoque());

                break;
            }
        }
    }
}
