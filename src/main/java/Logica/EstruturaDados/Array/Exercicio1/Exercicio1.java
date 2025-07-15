package Logica.EstruturaDados.Array.Exercicio1;


/* Melhore a classe Lista implementando o
método contem, semelhante ao método contains da
classe ArrayList
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio1 {

    private Object[] elementos;
    private int tamanho;

    public Exercicio1(final int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) {
        for (int i = 0; i <= tamanho; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                tamanho++;
                break;
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(elementos[i]);
            s.append(",");
        }

        s.append("]");

        return s.toString();
    }

    public int busca(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(Object elemento) {
        return busca(elemento) > -1;
    }

    public int lastOfIndex(Object caracter, int start, int end) {
        for (int i = end; i >= start; i--) {
             if (elementos[i].equals(caracter)) {
                 return i;
             }
        }

        return -1;
    }

    // A G C D E
    // 0 1 2 3 4 - > TAMANHO ORIGINAL 5
    public void remove(int posicao) {
        for (int i = posicao; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        // pq remover o ultimo indice?
        // Pq se não o array ficaria dessa forma [B, D, E, F, F], recebendo o utlimo F ainda
        tamanho--;
    }

    public void removeElemento(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                remove(i);
            }
        }
    }

    private void verificarPosicaoExists(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalAccessException("Posição inválida");
        }
    }

    public Object obtem(int posicao) throws Exception {
        verificarPosicaoExists(posicao);

        return elementos[posicao];
    }

    public void removeAllElements() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }

        tamanho = 0;
    }
}












