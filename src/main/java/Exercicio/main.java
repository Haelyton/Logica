package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de funcionarios?");
        int N = scanner.nextInt();

        List<Pessoa> pessoaList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Tax payer #" +  1 + i + " data");

            System.out.print("Individual or Company (c/i): ");
            char tp = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Anual Income: ");
            Double anualIncome = scanner.nextDouble();

            if (tp == 'c') {
                System.out.print("Number of Employees: ");
                int numberEmployees = scanner.nextInt();

                Pessoa pessoaJuridica = new Juridica(name, anualIncome, numberEmployees);
                pessoaList.add(pessoaJuridica);
            }

            if (tp == 'i') {
                System.out.print("Health expenditures: ");
                Double gastosSaude = scanner.nextDouble();

                Pessoa pessoaFisica = new Fisica(name, anualIncome, gastosSaude);
                pessoaList.add(pessoaFisica);
            }
        }

        for (Pessoa pessoa : pessoaList) {
            System.out.println(pessoa.getNome() + " " + pessoa.tax() + "\n");
        }
    }
}
