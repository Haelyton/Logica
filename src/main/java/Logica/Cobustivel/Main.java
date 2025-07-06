package Logica.Cobustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double gastoCarro = 12;

        double horas = scanner.nextDouble();
        double velocidadeMedia = scanner.nextDouble();

        calculo(horas, velocidadeMedia, gastoCarro);

        System.out.printf("%.3f", calculo(horas, velocidadeMedia, gastoCarro));
    }

    public static Double calculo(double horas, double velocidadeMedia, double gastoCarro) {
        double chaoPercorrido = horas * velocidadeMedia;
        return chaoPercorrido / gastoCarro;
    }

}
