package Vetores.SubstituicaoVetor;

import java.util.Scanner;

public class SubstituicaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[10];

        for (int i = 0; i < X.length; i++) {
            System.out.println("Indice #" + i + 1);
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < X.length; i++) {
            if (X[i] == 0 || X[i] < 0) {
                X[i] = 1;
            }
        }

        for (int x : X) {
            System.out.println(x);
        }
    }
}
