package Polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Quantos produtos serao?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + i + 1 + " data");
            System.out.println("Common, used or imported? (c/u/i)");
            char p = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Price: ");
            Double price = scanner.nextDouble();

            if (p == 'i') {
                System.out.print("Custom Fee: ");
                Double customsFee = scanner.nextDouble();
                Product productsImported = new ImportedProduct(name, price, customsFee);
            }

            if (p == 'u') {
                System.out.print("Manufacture Date (dd/MM/yyyy): ");
                String date1 = scanner.nextLine();
                Date date = sdf.parse(date1);

                Product productsUseds = new UsedProduct(name, price, date);
            }
        }

        System.out.println("Lista dos produtos");


    }
}
