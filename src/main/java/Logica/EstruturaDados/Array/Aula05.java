package Logica.EstruturaDados.Array;

public class Aula05 {
    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("teste");
        vetor.adicionar("teste2");

        System.out.println(vetor.buscar(1));
    }
}
