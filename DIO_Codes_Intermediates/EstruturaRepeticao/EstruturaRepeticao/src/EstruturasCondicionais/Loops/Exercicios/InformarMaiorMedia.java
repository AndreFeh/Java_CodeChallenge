package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class InformarMaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int contador = 0;
        int maior = 0;
        int soma= 0;

        do{ // --- Independente de True ou False, ele entra nesse codigo
            System.out.println("Numero ");
            num = scan.nextInt();

            soma = soma + num;


            if (num > maior) maior = num;

            contador = contador+1;
        }while (contador < 5); //Enquanto menor que 5, permanece nesse Loop

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma/contador);
        System.out.println("Maior numero foi: " + maior);

    }
}
