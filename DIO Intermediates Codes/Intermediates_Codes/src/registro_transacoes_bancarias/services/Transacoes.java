package registro_transacoes_bancarias.services;

import registro_transacoes_bancarias.entity.ContaBancaria;

public class Transacoes {
    private ContaBancaria conta;

    // Construtor para inicializar com um saldo específico
    public Transacoes(double saldoInicial) {
        this.conta = new ContaBancaria(saldoInicial);
    }

    public double exibirSaldo(){
        return conta.getSaldo();
    }

    public double realizarDeposito(double deposito){
        double novoSaldo = conta.getSaldo() + deposito;
        conta.setSaldo(novoSaldo);
        return conta.getSaldo();
    }

    public double realizarSaque(double saque){
        if(conta.getSaldo() >= saque){
        double novoSaldo = conta.getSaldo() - saque;
        conta.setSaldo(novoSaldo);
        } else System.out.println("Saldo Insuficiente!");
        return conta.getSaldo();
    }
}