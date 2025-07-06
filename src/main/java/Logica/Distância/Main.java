package Logica.Distância;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();

        calculo(distancia);

        int resultado = calculo(distancia);

        System.out.println(resultado + " minutos");
    }

    public static int calculo(int distancia) {
        return distancia * 2;
    }
}
