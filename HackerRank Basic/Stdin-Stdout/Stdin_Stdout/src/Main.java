import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        double num2;
        String letter1;

        num1 = scan.nextInt();
        num2 = scan.nextDouble();
        // Consome a nova linha pendente apos a leitura do double
        scan.nextLine();  // Importante: Este passo consome o caractere de nova linha pendente
        letter1 = scan.nextLine(); // Le a linha de texto

        System.out.println("String: " + letter1);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);

        scan.close();
    }
}
