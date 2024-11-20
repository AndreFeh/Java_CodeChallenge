package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class CalculoFatorial {
//TODO fazer programa que calcule fatorial de um numero inserido
// 5! = 120 (5 x 4 x 3 x 2 x 1);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! {");
        for (int i = fatorial; i >= 1; i--) {
    //           o I é igual o FATORIAL...
    //           O I tem que ser maior ou igual a 1, pois fatorial / potenciação é ate 1
    //          A cada loop tenho que diminuir o Valor

            multiplicacao = multiplicacao * i;
                 System.out.print(" " + i + " ");
        }
        System.out.println("} = " + multiplicacao);
    }
}
