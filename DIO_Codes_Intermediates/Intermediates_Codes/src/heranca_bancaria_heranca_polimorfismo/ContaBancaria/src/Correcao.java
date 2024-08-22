import java.text.DecimalFormat;
import java.util.Scanner;

public class Correcao {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }

    public static class ContaBancaria {
        private int numero;
        private String titular;
        private double saldo;

        public ContaBancaria(int numero, String titular, double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }

        public void exibirInformacoes() {
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            System.out.println(titular);
            System.out.println(numero);
            System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        }
    }

    public static class ContaPoupanca extends ContaBancaria {
        private double taxaJuros;
        DecimalFormat decimalJuros = new DecimalFormat("#.0");

        public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
            super(numero, titular, saldo);
            this.taxaJuros = taxaJuros;
        }

        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Taxa de juros: " + decimalJuros.format(taxaJuros) + "% ");
        }
    }
}
