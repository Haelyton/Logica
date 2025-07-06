package Logica.NumeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 10;

        for (int i = 0; i <= N; i++) {
            int X = scanner.nextInt();
            if (isPrimo(X)) {
                System.out.println(X + " eh primo");
            } else {
                System.out.println(X + " nao eh primo");
            }
        }
    }

    public static boolean isPrimo(int X) {
        for (int i = 2; i * i <= X; i++) {
            if (X % i == 0) {
                return false;
            }
        }
        return true;
    }
}
