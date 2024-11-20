package one.innovation.digital.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        System.out.println("Programa Lendo 6 Caracteres");
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 1;
        do {
            System.out.println("Digite uma Vogal: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") //equalsIgnoreCase ignora se a palavra é maiuscula ou minuscula
                    |letra.equalsIgnoreCase("e")
                    |letra.equalsIgnoreCase("i")
                    |letra.equalsIgnoreCase("o")
                    |letra.equalsIgnoreCase("u"))){

                consoantes[count] = letra;

                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String consoante : consoantes) /*(TIPO:ARRAY QUE QUERO)*/{
//            Para que nao apareça Consoante: null null null t g b
            if (consoante != null) {
                System.out.print(" " + consoante);
            } /* Retornará f r d */
        }
    }
}
