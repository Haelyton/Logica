package Logica.EstruturaDados.Pilhas;

public class main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(3);

        for (int i = 1; i < 3; i++) {
            pilha.empilhar(i);
        }

        System.out.println(pilha.toString());
        System.out.println(pilha.isEmpty());

        System.out.println(pilha.espiarUltimoElemento());
    }
}
