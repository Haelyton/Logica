package Logica.EstruturaDados;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica() {
    }

    public EstruturaEstatica(final int capacidade) {
        elementos = (T[]) new Integer[capacidade];
    }

    protected void remove(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalAccessException("Posicao invalida");
        }

        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;
    }

    @SuppressWarnings("unchecked")
    protected void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = (T) elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    protected void adicionar(T elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            System.out.println("Não é possível adicionar mais elementos");
        }

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        s.append("]");
        return s.toString();
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

}
