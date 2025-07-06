package Logica.Iteração_Recursão;

public class FibonnacciRecursao {
    public static void main(String[] args) {
        int n = 20;

        fibonnacci(5);

        for (int i = 2; i <= n; i++) {
            System.out.println(fibonnacci(i));
        }
    }

    public static int fibonnacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonnacci(n - 1) + fibonnacci(n - 2);
    }
}
