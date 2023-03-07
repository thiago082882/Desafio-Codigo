import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String str = sc.nextLine();

        // Convertendo a string para um array de caracteres

        char[] chars = str.toCharArray();

        // Invertendo o array de caracteres

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        // Convertendo o array de caracteres de volta para a string

        String reversedStr = new String(chars);
        System.out.println("String invertida: " + reversedStr);
    }
}
