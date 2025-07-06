package Logica.Iteração_Recursão;

import java.util.Scanner;

public class ExemploIteracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        fatorial(n);

        System.out.println(fatorial(n));
    }

    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
