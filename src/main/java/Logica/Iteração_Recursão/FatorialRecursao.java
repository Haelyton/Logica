package Logica.Iteração_Recursão;

import java.util.Scanner;

public class FatorialRecursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        fatorial(n);

        for (int i = 2; i <= n; i++) {
            System.out.println(fatorial(i));
        }
    }

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
