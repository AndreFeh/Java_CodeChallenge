package registro_transacoes_bancarias_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Correcao {
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

        public String getTipo() {
            return tipo;
        }

        public double getValor() {
            return valor;
        }

        @Override
        public String toString() {
            return tipo + " de " + valor;
        }
    }

    private ContaBancaria conta;
    private List<Transacao> transacoes;

    public Correcao(double saldoInicial) {
        this.conta = new ContaBancaria(saldoInicial);
        this.transacoes = new ArrayList<>();
    }

    public double exibirSaldo() {
        return conta.getSaldo();
    }

    public void realizarDeposito(double deposito) {
        conta.setSaldo(conta.getSaldo() + deposito);
        transacoes.add(new Transacao("d", deposito));
    }

    public void realizarSaque(double saque) {
        if (conta.getSaldo() >= saque) {
            conta.setSaldo(conta.getSaldo() - saque);
            transacoes.add(new Transacao("s", saque));
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void exibirTransacoes() {
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scan.nextDouble();
        Correcao correcao = new Correcao(saldoInicial);

//        System.out.println("Digite a quantidade de transacoes:");
        int quantidadeTransacoes = scan.nextInt();

        for (int i = 0; i < quantidadeTransacoes; i++) {
//            System.out.println("Digite o tipo de transacao (D para deposito, S para saque):");
            char tipoTransacao = scan.next().toUpperCase().charAt(0);

//            System.out.println("Digite o valor da transacao:");
            double valorTransacao = scan.nextDouble();

            if (tipoTransacao == 'D') {
                correcao.realizarDeposito(valorTransacao);
            } else if (tipoTransacao == 'S') {
                correcao.realizarSaque(valorTransacao);
            } else {
//                System.out.println("Tipo de transacao invalido.");
            }
        }

        System.out.println("Saldo: " + correcao.exibirSaldo());
        System.out.println("Transacoes:");
        correcao.exibirTransacoes();

        scan.close();
    }
}
