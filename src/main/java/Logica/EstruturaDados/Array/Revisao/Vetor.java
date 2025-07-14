package Logica.EstruturaDados.Array.Revisao;

import java.util.Arrays;

public class Vetor {

    private String[] professor;
    private int tamanho;

    public Vetor(final int capacidade) {
        this.professor = new String[capacidade];
        this.tamanho = 0;
    }

//    public void adicionar(String elemento) {
//        for (int i = 0; i < professor.length; i++) {
//            if (professor[i] == null) {
//                professor[i] = elemento;
//                break;
//            }
//        }
//    }

    public void adicionar(String elemento) throws IllegalAccessException {
        aumentaCapacidade();
        if (tamanho < professor.length) {
            professor[tamanho] = elemento;
            tamanho++;
        } else {
            throw new IllegalAccessException("Não cabe mais fi");
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(this.professor[i]);
            s.append(",");
        }

        s.append("]");
        return s.toString();
    }

    public int verificar(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.professor[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean adicionar(int posicao, String elemento) {
        aumentaCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.professor[i+1] = this.professor[i];
        }

        professor[posicao] = elemento;

        return false;
    }

    public String buscarElemento(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Indice nao existe");
        }

        return this.professor[posicao];
    }

    private void aumentaCapacidade() {
        if (tamanho == professor.length) {
            String[] novoArray = new String[this.professor.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = professor[i];
            }

            professor = novoArray;
        }
    }

    // B G D E F -> Elemento a ser removido indice 1 (G)
    // 0 1 2 3 4 -> Tamanho real do Array = 5
    // [1] = [2] -> Elemento no indice 1 recebe o elemento no indice 2
    // [2] = [3] -> Elemento no indice 2 recebe o elemento no indice 3
    // [3] = [4] -> Elemento no indice 2 recebe o elemento no indice 3
    public void removerElemento(int posicao) {
        for (int i = posicao; i < tamanho - 1; i++) {
            this.professor[i] = this.professor[i+1];
        }

        // pq remover o ultimo indice?
        // Pq se não o array ficaria dessa forma [B, D, E, F, F], recebendo o utlimo F ainda
        tamanho--; // Remove o ultimo indice
    }
}
