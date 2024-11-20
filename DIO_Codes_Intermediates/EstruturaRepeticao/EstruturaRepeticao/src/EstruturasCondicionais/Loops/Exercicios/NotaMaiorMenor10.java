package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class NotaMaiorMenor10 {
    //    peça uma nota, entre zero e dez.
//    Mostre uma mensagem caso o valor seja inválido
//    e continue pedindo até que o usuário informe um valor válido.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Insira uma nota entre 0 a 10");
        nota = scan.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Numero Invalido");
            nota = scan.nextInt();
        }
        System.out.println(nota);
    }
}
