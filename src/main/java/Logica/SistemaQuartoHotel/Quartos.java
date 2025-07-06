package Logica.SistemaQuartoHotel;

public class Quartos {

    private String nome;
    private String email;
    private int numeroQuarto;

    public Quartos(final String email, final String nome, final int numeroQuarto) {
        this.email = email;
        this.nome = nome;
        this.numeroQuarto = numeroQuarto;
    }

    public Quartos() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(final int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
}
