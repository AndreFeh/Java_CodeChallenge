package one.innovation.digital.arrays;

import java.util.Random;

public class NumerosAleatoriosRANDOM {
    public static void main(String[] args) {
        System.out.println("Numeros Sorteados de 1 a 100 e Seus Sucessores (Ele+1)\n");
        Random random = new Random();

        int[] numerosSortidos = new int [20];

        for (int i = 0; i < numerosSortidos.length; i++){
            int numero = random.nextInt(100); /*RANDOM faz aleatoriedade, 100 é o maximo que pode ir*/
            numerosSortidos[i] = numero;
        }
        System.out.print("Numeros Aleatorios de 0 a 100: \t\t\t");
        for (int numero: numerosSortidos) {
            System.out.print(numero + " ");
        }

        System.out.print("\nNumeros Antecessores de Aleatorios: \t");
        for (int numero: numerosSortidos) {
            System.out.print(numero-1 + " ");
        }

        System.out.print("\nNumeros Sucessores de Aleatorios: \t\t");
        for (int numero: numerosSortidos) {
            System.out.print(numero+1 + " ");
        }
    }
}
