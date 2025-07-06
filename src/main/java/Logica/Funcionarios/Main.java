package Logica.Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos funcionarios deseja Cadastrar?");
        int N = scanner.nextInt();

        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o id do funcionario: ");
            int id = scanner.nextInt();

            while (funcionarios[id] != null) {
                System.out.println("Já existe um funcionario cadastrado com este ID, tente novamente");
                funcionarios[id].getIdEmployee(funcionarios, id);
            }

            scanner.nextLine();
            System.out.print("Digite o nome do funcionario: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salario do funcionario: ");
            double salary = scanner.nextDouble();

            funcionarios[id] = new Funcionario(id, nome, salary);
        }

        System.out.println("Funcionarios cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("[" + funcionario.getId() + "]" + " " + funcionario.getNome() + " - R$" + funcionario.getSalario());
        }

        System.out.print("Id para aumento: ");
        int id = scanner.nextInt();

        for (Funcionario funcionario : funcionarios) {
            if (id == funcionario.getId()) {
                System.out.print("Percentual para aumento: ");
                double percentual = scanner.nextDouble();

                funcionario.percentual(percentual);
            }
        }

        Funcionario funcionario = new Funcionario();
        System.out.println("Salario atualizado do funcionario" + funcionario.getNome() + " Salario novo: " + funcionario.getSalario());
    }
}
