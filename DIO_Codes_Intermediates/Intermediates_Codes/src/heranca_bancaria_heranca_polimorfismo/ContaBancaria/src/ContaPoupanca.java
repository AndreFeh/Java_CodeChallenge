import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
    DecimalFormat decimalJuros = new DecimalFormat("#.0");

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: "+decimalJuros + "% ");
    }
}
