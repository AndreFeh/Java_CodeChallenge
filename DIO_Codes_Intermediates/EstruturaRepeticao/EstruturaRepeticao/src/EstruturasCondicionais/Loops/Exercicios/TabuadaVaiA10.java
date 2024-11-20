package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class TabuadaVaiA10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int total;
        int multiplicador = 0;
        int contador = 0;

        System.out.println("Insira a tabuada desejada: ");
        numero = scan.nextInt();

//________________________________________________________________________________________________//
        System.out.println("___\t Tabuada com While\t___");
        do {
            total = numero * multiplicador;
            System.out.println("\t" + numero + " X " + multiplicador + " = \t" + total);

            multiplicador++;
            contador++;
        } while (contador <= 10);
//________________________________________________________________________________________________//
//                            Outra Maneira de Fazer
        System.out.println("___\t Tabuada com For\t___");

        for (int i = 0; i <= 10; i++) {
            System.out.println("\t" + numero + " X " + i + " = \t" + (numero * i));
        }
    }
}
