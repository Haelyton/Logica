package Logica.SistemaQuartoHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quartos[] quartos = new Quartos[10];

        System.out.println("Quantas reservar serao realizadas?");
        int R = scanner.nextInt();

        for (int i = 0; i < R; i++) {
            System.out.println("Qual o numero do primeiro quarto deseja reservar? porfavor entre (0 e 9)");
            int numeroQuarto = scanner.nextInt();

            while (numeroQuarto > 10 || numeroQuarto < 0 || quartos[numeroQuarto] != null) {
                System.out.print("Esse quarto não existe, escolha outro: ");
                numeroQuarto = scanner.nextInt();
            }

            System.out.print("Nome do Hospede: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Email do Hospede: ");
            String email = scanner.nextLine();

            quartos[numeroQuarto] = new Quartos(email, nome, numeroQuarto);
        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + " - " + quartos[i].getEmail());
            }
        }
    }
}
