package Exercicio;

public class Juridica extends Pessoa{

    private int numeroFuncionarios;

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public Juridica(final int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Juridica(final String nome, final Double rendaAnual, final int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void setNumeroFuncionarios(final int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double tax() {
        if (numeroFuncionarios > 10) {
            return getRendaAnual() + (14 / 100) * getRendaAnual();
        }

        return getRendaAnual() + (16 / 100) * getRendaAnual();
    }
}
