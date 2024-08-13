package registro_transacoes_bancarias.correcao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoApp {
    private static class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }

    private static class Transacao {
        private String tipo;
        private double valor;

        public Transacao(String tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return tipo + " de " + valor;
        }
    }

    private ContaBancaria conta;
    private List<Transacao> transacoes;

    public BancoApp(double saldoInicial) {
        this.conta = new ContaBancaria(saldoInicial);
        this.transacoes = new ArrayList<>();
    }

    public double exibirSaldo() {
        return conta.getSaldo();
    }

    public void realizarDeposito(double deposito) {
        conta.setSaldo(conta.getSaldo() + deposito);
        transacoes.add(new Transacao("Deposito", deposito));
    }

    public void realizarSaque(double saque) {
        if (conta.getSaldo() >= saque) {
            conta.setSaldo(conta.getSaldo() - saque);
            transacoes.add(new Transacao("Saque", saque));
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void exibirTransacoes() {
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitar saldo inicial
//        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scan.nextDouble();
        BancoApp bancoApp = new BancoApp(saldoInicial);

        // Solicitar quantidade de transações
//        System.out.println("Digite a quantidade de transações:");
        int quantidadeTransacoes = scan.nextInt();

        // Processar transações
        for (int i = 0; i < quantidadeTransacoes; i++) {
//            System.out.println("Digite o tipo de transação (D para depósito, S para saque):");
            char tipoTransacao = scan.next().toUpperCase().charAt(0);

//            System.out.println("Digite o valor da transação:");
            double valorTransacao = scan.nextDouble();

            if (tipoTransacao == 'D') {
                bancoApp.realizarDeposito(valorTransacao);
            } else if (tipoTransacao == 'S') {
                bancoApp.realizarSaque(valorTransacao);
            } else {
                System.out.println("Tipo de transação inválido.");
                i--; // Decrementa o contador para permitir a tentativa novamente
            }
        }

        // Exibir saldo final e transações
        System.out.println("Saldo: " + bancoApp.exibirSaldo());
        System.out.println("Transacoes:");
        bancoApp.exibirTransacoes();

        scan.close();
    }
}
