import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int n = scanner.nextInt();

        int a = 0, b = 1, c = 0;

        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == n) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}