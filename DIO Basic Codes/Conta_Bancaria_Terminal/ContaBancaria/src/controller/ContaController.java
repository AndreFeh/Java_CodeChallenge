package controller;

import entity.ContaBancaria;

public class ContaController {
    ContaBancaria contaEntt = new ContaBancaria();

    public ContaBancaria abrirConta(int conta, String agencia, String nome, double saldoIni) {
        if (contaEntt.getConta() != conta){
            contaEntt.setConta(conta);
            contaEntt.setAgencia(agencia);
            contaEntt.setNome(nome);
            contaEntt.setSaldoIni(saldoIni);
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.\n", nome, agencia, conta, saldoIni);
        } else System.out.println("Ja possui Conta com esse Numero de Conta");
        return contaEntt;
    }

}
