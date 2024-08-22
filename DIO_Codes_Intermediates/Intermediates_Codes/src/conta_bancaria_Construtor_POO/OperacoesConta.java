package conta_bancaria_Construtor_POO;

public class OperacoesConta {
    ContaBancaria conta = new ContaBancaria();

    public Double exibirSaldo() {
        conta.getSaldo();
        return exibirSaldo();
    }

    public Double fazerSaque(double saque) {
        if(conta.getSaldo() < saque) {
            conta.setSaque(-saque);
        } else System.out.println("Conta sem saldo");
        return exibirSaldo();
    }

    public Double fazerDeposito(double deposito) {
        conta.setDeposito(deposito);
        return exibirSaldo();
    }


}
