package conta_bancaria_Construtor_POO;

public class ContaBancaria {
    double saldo = 0d;
    double saque = 0d;
    double deposito = 0d;

    public ContaBancaria() {}

    public double getSaldo() {
        return saldo;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}
