package one.innovation.digital.arrays;

import java.util.Random;

public class MatrizNumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Gerar Numeros Aleatórios");
        System.out.println("M 4x4 com valores entre 0-9");

        Random random = new Random();

//        1° "[]" para linha, 2°"[]" para Coluna
        int[][] M = new int[4][4];
        /*
        *   x x x x Posição 0 CADA LINHA REPRESENTA UM ARRAY MULTIDIMENSIONAL
        *   x x x x Posição 1 CADA LINHA REPRESENTA UM ARRAY MULTIDIMENSIONAL
        *   x x x x Posição 2 CADA LINHA REPRESENTA UM ARRAY MULTIDIMENSIONAL
        *   x x x x Posição 3 CADA LINHA REPRESENTA UM ARRAY MULTIDIMENSIONAL
        */

//        Para navegar dentro da matriz geral

        for (int i =0; i<M.length; i++){
            /*quando entrar dentro dessa linha,
            devo percorrer todos os elementos,
            coluna por coluna*/

            for (int j = 0; j < M[i].length; j++) { /*J representa coluna dentro da linha*/
                M[i][j] = random.nextInt(9);
            }/*Para Mostrar os Elementos dentro da Matriz == ForEach*/
        }

        System.out.println("Matriz: ");
//        Pegar Matriz Geral >>> Definir Linha >>> Depois Percorrer por Cada Coluna de Cada Linha
        for (int[] linha : M) {
            for (int coluna: linha) { /*Declarado desse modo pois, A Coluna dentro da Linha*/
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println(M.length);
    }
}
