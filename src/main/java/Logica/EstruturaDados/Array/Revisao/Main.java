package Logica.EstruturaDados.Array.Revisao;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("teste1");
        vetor.adicionar("teste2");
        vetor.adicionar("teste3");

        vetor.adicionar(1, "show");

        System.out.println(vetor.toString());
        System.out.println(vetor.buscarElemento(2));

    }
}
