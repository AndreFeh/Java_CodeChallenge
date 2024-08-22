import controller.ContaController;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaController contaCtrl = new ContaController();


        System.out.println("Digite o Numero da Conta");
        System.out.println("Digite a Agencia da Conta");
        System.out.println("Digite o Nome da Conta");
        System.out.println("Digite o Saldo inicial");

        int conta;
        String agencia;
        String nome;
        double saldoIni;

        contaCtrl.abrirConta(conta = scan.nextInt(), agencia = scan.next(), nome = scan.next(), saldoIni= scan.nextDouble());
        contaCtrl.abrirConta(conta = scan.nextInt(), agencia = scan.next(), nome = scan.next(), saldoIni= scan.nextDouble());
    }
}