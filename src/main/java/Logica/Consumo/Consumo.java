package Logica.Consumo;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();

        consumo(X, Y);

        double resultadoFinal = consumo(X, Y);

        System.out.printf("%.3f km/l\n", resultadoFinal);
    }

    public static Double consumo(double X, double Y) {
        return X / Y;
    }
}