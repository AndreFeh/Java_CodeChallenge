package projects.sample;

import java.util.Scanner;

//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of 2 to 5, print Not Weird
//If  is even and in the inclusive range of 6 to 20, print Weird
//If  is even and greater than 20, print Not Weird

public class Weird_NotWeird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0, par = 0, impar = 0;
        number = scan.nextInt();

        if (number % 2 != 0) {
            System.out.println("Weird");
            impar = number;
        } else if (number % 2 == 0) {
            par = number;
        }

        System.out.println(impar);
        System.out.println(par);

        if (par >= 2 && par <= 5) {
            System.out.println("Not Weird");
        } else if (par > 5 && par <= 20) {
            System.out.println("Weird");
        } else if (par > 20) {
            System.out.println("Not Weird");
        } else System.out.println("Null");
        // bufferedReader.close();
        scan.close();
    }
}
