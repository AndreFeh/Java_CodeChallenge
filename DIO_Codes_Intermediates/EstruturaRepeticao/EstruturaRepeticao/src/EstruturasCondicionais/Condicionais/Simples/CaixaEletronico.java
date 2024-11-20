package EstruturasCondicionais.Condicionais.Simples;

public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        } else {
            System.out.println("Saldo Insuficiente");
            System.out.println(saldo);
        }
    }
}
