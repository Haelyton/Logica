package Logica.EstruturaDados.Array;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("teste");
        vetor.adicionar("teste2");

        System.out.println(vetor.adicionar(3, "teste"));
    }
}
