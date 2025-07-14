package Logica.EstruturaDados.Array.VetorGeneralizado;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(3);

        Contato c1 = new Contato("Contato1", "contato1@gmail.com", "1234-5678");
        Contato c2 = new Contato("Contato2", "contato2@gmail.com", "1234-5678");
        Contato c3 = new Contato("Contato3", "contato3@gmail.com", "1234-5678");

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);

        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
