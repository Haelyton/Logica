package Logica.EstruturaDados.Array.VetorGeneralizado;

public class Contato {

    private String contato;
    private String telefone;
    private String email;

    public Contato() {
    }

    public Contato(final String contato, final String email, final String telefone) {
        this.contato = contato;
        this.email = email;
        this.telefone = telefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(final String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(final String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "contato='" + contato + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
