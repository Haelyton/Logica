package Logica.SistemaProduto;

import lombok.Builder;

@Builder
public class Produtos {

    private Integer id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produtos() {
    }

    public Produtos(final Integer id, final String nome, final double preco, final int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(final double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(final int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int removeQuantityInStock(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Quantidade negativa não é permitida");
        }

        return this.quantidadeEstoque -= quantidadeEstoque;
    }

    public int addStock(final int quantidadeEstoque) {
        return this.quantidadeEstoque += quantidadeEstoque;
    }
}
