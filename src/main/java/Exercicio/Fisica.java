package Exercicio;

public class Fisica extends Pessoa {

    private Double gastosSaude;

    public Fisica(final Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public Fisica(final String nome, final Double rendaAnual, final Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(final Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double tax() {
        double impostoBase = getRendaAnual() < 20000 ?
                getRendaAnual() * 15 :
                getRendaAnual() * 25;

        impostoBase -= gastosSaude * 0.5;
        if (impostoBase < 0) return 0.0;

        return impostoBase;
    }
}
