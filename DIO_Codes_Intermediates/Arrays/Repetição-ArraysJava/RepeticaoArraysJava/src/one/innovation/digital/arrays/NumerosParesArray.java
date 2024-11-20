package one.innovation.digital.arrays;

public class NumerosParesArray {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 7, 11, 13, 18, 34};
        int count = 0;
//        int par = 0, impar = 0;

        System.out.println("Quantidade de Numeros: " + numeros.length);

/*        do {
            if (numeros.length %2 ==0){par++;
            } else impar++;

            count++;

        }while (count<numeros[])*/
        System.out.print("Numeros Pares: ");
        for (int par:numeros) {
            if (par %2 == 0){
                System.out.print(par + " ");
            }
        }
        System.out.println("EXERCICIOS A PARTE");
        int[][] numero = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.print(numero[2][2]);

        System.out.println("______________________");
        int num = 5, count1 = 1;
        while(count1 <= 3) {
            ++count1;
            num += count1;
        }
        System.out.println(num);

        System.out.println("Imprimindo Numeros");
        int i, num1 = 5;
        for (i = 0; i < 3; i++) {
            num1 += i;
            System.out.print(i + " ");
            System.out.println(num1 + " ");
        }



    }
}
