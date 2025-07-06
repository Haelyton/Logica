package Logica.EstruturaDados.Array;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adicionar(String elemento) {
//        for (int i = 0; i <= this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//
//                break;
//            }
//        }
//    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i <= this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        s.append("]");

        return s.toString();
    }



/* criar um metodo no qual vai verificar se o indice e nullo se for nulo adiciona o elemento
caso contrario informa uma mensagem infomando nao e possivel adicionar
detalhe importante para que o sistema seja mais rapido devemos sempre armazenar o tamanho
da ultima vez que o array foi percorrido pois dessa forma evitamos que sempre que formos adicionar um
novo elemento ele nao percorra o array desde do inicio ele ja deve pegar o ultimo tamanho nulo
*/

    public void adicionar(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            System.out.println("Não é possível adicionar mais elementos");
        }

    }
}
