package Logica.CriseEnergia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double valores = scanner.nextDouble();

            if (valores > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + " valores positivos");
    }
}
