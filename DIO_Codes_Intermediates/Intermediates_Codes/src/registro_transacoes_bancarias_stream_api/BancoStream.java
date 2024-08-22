package registro_transacoes_bancarias_stream_api;

import java.util.ArrayList;
import java.util.List;

public class BancoStream {
    private static class BancoEntity {
        double saldo;

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        @Override
        public String toString() {
            return "| saldoInicial= " + saldo + " |";
        }

        public BancoEntity(double saldoInicial) {
            this.saldo = saldoInicial;
        }
    }

    /*----------------------------/*----------------------------/*----------------------------*/
    private static class BancoService {
        double saldo = 0d;
        BancoEntity banco = new BancoEntity(saldo);
        List<BancoEntity> transacoes;

        public BancoService() {
            this.transacoes = new ArrayList<>();
        }

        public void saldoInicial(double saldoInic) {
            banco.setSaldo(saldo = saldoInic);
        }

        public void realizarSaque(double saque) {
            transacoes.add(new BancoEntity(saque));
            if (banco.getSaldo() >= saque) {
                banco.setSaldo(saldo -= saque);
            }
            System.out.println(banco.getSaldo());
        }

        public void realizarDeposito(double deposito) {
            transacoes.add(new BancoEntity(deposito));
            banco.setSaldo(saldo += deposito);
            System.out.println(banco.getSaldo());
        }
    }

    public static void main(String[] args) {
        List<BancoEntity> operacoes = new ArrayList<>();
        BancoService service = new BancoService();

        operacoes.add(new BancoEntity(service.saldo));
//        operacoes.add(service.saldoInicial(5000d));
    }
}
/*----------------------------/*----------------------------/*----------------------------*/