import java.util.Scanner;

public class function_print {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String phrase = scan.next();
        int number = scan.nextInt();

        String phrase1 = scan.next();
        int number1 = scan.nextInt();

        String phrase2 = scan.next();
        int number2 = scan.nextInt();

        System.out.printf("================================\n");
        System.out.printf("%-14s %03d%n", phrase, number);/*"0" define que vai inserir Zeros se nao completar os "3" "d"(decimais)*/
        System.out.printf("%-14s %03d%n", phrase1, number1);/*"0" define que vai inserir Zeros se nao completar os "3" "d"(decimais)*/
        System.out.printf("%-14s %03d%n", phrase2, number2);/*"0" define que vai inserir Zeros se nao completar os "3" "d"(decimais)*/
        System.out.printf("================================\n");
    }
}