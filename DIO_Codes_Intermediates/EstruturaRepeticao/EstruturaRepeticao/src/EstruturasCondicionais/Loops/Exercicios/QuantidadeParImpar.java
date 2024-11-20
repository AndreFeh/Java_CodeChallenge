package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class QuantidadeParImpar {

    /*COMPARAR NUMEROS DENTRE OS NUMEROS, PAR / IMPAR*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNum, numero;
        int contador = 0; // informa a quantidade de numeros que ele vai se repetir
        int qtdPar = 0, qtdImpar = 0;

        System.out.println("Quantidade de numeros: ");
        qtdNum = scan.nextInt();

        /*pedir a quantidade de numeros inteiros */
        do{
            System.out.println("Numero ");
            numero = scan.nextInt();

            if (numero %2 == 0) qtdPar++;   // Se o resto da Divisao é 0, É PAR, QTDPAR++ para quando a variavel terminar, ela ficar com 1 a mais, pois iniciou com 0, dizendo que agr tem um numero par
            else qtdImpar++;                // Impar++ o valor que antes era 0 agr tem um numero impar

            contador++; /*contador = contador +1;*/
        }while (contador < qtdNum);

        System.out.println("Quantidade Pares: " + qtdPar);
        System.out.println("Quantidade Impares: " + qtdImpar);
        System.out.println("Quantidade Numeros: " + numero);
    }
}
