package Logica.Josephus;

import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NC = scanner.nextInt();

        for (int i = 0; i < NC; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int resultado = calculo(n, k);

            System.out.printf("Case %d: %d\n", i + 1, resultado + 1);
        }
    }

    public static int calculo(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (calculo(n - 1, k) + k) % n;
    }
}
