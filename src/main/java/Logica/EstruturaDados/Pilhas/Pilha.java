package Logica.EstruturaDados.Pilhas;

import Logica.EstruturaDados.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {



    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adicionar(elemento);
    }

    public T espiarUltimoElemento() {
        if (isEmpty()) {
            return null;
        }

        return this.elementos[tamanho-1];
    }
}
