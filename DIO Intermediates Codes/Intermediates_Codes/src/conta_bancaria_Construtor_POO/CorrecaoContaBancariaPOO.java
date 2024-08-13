package conta_bancaria_Construtor_POO;

import java.util.Scanner;


public class CorrecaoContaBancariaPOO {
    private double saldo;

    // Construtor para inicializar a conta com um saldo inicial
    public CorrecaoContaBancariaPOO(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar um depósito na conta
    public void realizarDeposito(double valor) {
        saldo += valor;
        System.out.println("Deposito feito.");
        System.out.println("Saldo atual: " + saldo);
    }

    // Método para realizar um saque na conta
    public void realizarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque feito.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado.");
        }
    }

    // Método para exibir o saldo atual da conta
    public double exibirSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitar o saldo inicial da conta
        // System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scan.nextDouble();

        // Criar uma nova conta bancária com o saldo inicial
        CorrecaoContaBancariaPOO conta = new CorrecaoContaBancariaPOO(saldoInicial);

        // Solicitar as transações
        // System.out.println("Digite o valor para deposito:");
        double valorDeposito = scan.nextDouble();
        conta.realizarDeposito(valorDeposito);

        // System.out.println("Digite o valor para saque:");
        double valorSaque = scan.nextDouble();
        conta.realizarSaque(valorSaque);

        scan.close();
    }
}