package Exercicio;

public abstract class Pessoa {

    private String nome;

    private Double rendaAnual;

    public Pessoa() {
    }

    public Pessoa(final String nome, final Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(final Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double tax();
}
