import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i=1; i<=10; i++){
            int multiple = i;
            int total = number*multiple;
            System.out.println(number + " x " + multiple + " = " + total);
        }
    }
}