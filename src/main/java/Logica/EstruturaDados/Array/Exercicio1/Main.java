package Logica.EstruturaDados.Array.Exercicio1;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Exercicio1 exercicio1 = new Exercicio1(3);

        exercicio1.adiciona("A");
        exercicio1.adiciona("B");
        exercicio1.adiciona("C");

        System.out.println(exercicio1.toString());

        System.out.println(exercicio1.contem("teste1"));
        System.out.println(exercicio1.contem("teste34"));

        System.out.println(exercicio1.lastOfIndex("A", 0, 1));

        exercicio1.removeElemento("B");

        System.out.println(exercicio1.toString());

        System.out.println(exercicio1.obtem(2));

    }
}
