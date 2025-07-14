package Logica.EstruturaDados.Array.Revisao;

public class Main2 {
    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor.toString());
        vetor.removerElemento(1);

        System.out.println(vetor.toString());
    }
}
