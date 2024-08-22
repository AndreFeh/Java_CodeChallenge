package entity;

public class ContaBancaria {
    private int conta;
    private String agencia;
    private String nome;
    private double saldoIni;

    public ContaBancaria() {}

    public ContaBancaria(int conta, String agencia, String nome, double saldoIni) {
        this.conta = conta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldoIni = saldoIni;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoIni() {
        return saldoIni;
    }

    public void setSaldoIni(double saldoIni) {
        this.saldoIni = saldoIni;
    }
}
