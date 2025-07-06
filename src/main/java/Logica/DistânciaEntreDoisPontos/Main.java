package Logica.DistânciaEntreDoisPontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        calculo(x1, x2, y1, y2);

        double distancia = calculo(x1, x2, y1, y2);

        System.out.printf("%.4f\n", distancia);
    }

    public static Double calculo(double x1, double x2, double y1, double y2) {
        double p1 = x2 - x1;
        double p2 = y2 - y1;
        return Math.sqrt(Math.pow(p1, 2) + Math.pow(p2, 2));
    }
}
