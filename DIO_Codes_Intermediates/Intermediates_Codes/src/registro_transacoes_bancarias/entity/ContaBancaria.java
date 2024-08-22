package registro_transacoes_bancarias.entity;

public class ContaBancaria {
    private double saldo = 0d;
    private double saque = 0d;
    private double deposito = 0d;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "| ContaBancaria{" +
                "saldo = " + saldo +
                ", saque = " + saque +
                ", deposito = " + deposito +
                "}|";
    }
}