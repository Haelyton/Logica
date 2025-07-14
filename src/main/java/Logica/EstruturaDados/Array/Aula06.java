package Logica.EstruturaDados.Array;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("teste");
        vetor.adicionar("teste2");

        System.out.println(vetor.verificar("teste2"));
    }
}
