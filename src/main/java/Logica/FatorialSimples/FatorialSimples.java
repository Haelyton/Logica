package Logica.FatorialSimples;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        fat(N);

        System.out.println(fat(N));
    }

    public static int fat(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }

        return N * fat(N - 1);
    }
}
