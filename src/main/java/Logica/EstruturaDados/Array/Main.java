package Logica.EstruturaDados.Array;

public class Main {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);

        vetor.adicionar("a");
        vetor.adicionar("a");
        vetor.adicionar("a");

        System.out.println(vetor.toString());
    }
}
