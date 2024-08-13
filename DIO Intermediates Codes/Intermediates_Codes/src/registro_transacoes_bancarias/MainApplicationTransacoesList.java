package registro_transacoes_bancarias;

import registro_transacoes_bancarias.services.Transacoes;

import java.util.Scanner;

public class MainApplicationTransacoesList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Transacoes transacoes = new Transacoes(0d);

        System.out.println("Quantidade Operacoes");
        int opcoes = scan.nextInt();

        for (int i = 0; i <= opcoes; i++){
            System.out.println("Caractere S ou D ");
            char operacao = scan.next().toUpperCase().charAt(0);
                    if(operacao == 'D'){
                        System.out.println("Valor Deposito");
                        double depositoOP = scan.nextDouble();
                        transacoes.realizarDeposito(depositoOP);
                    } else if (operacao == 'S'){
                        System.out.println("Valor Saque");
                        double saqueOP = scan.nextDouble();
                        transacoes.realizarSaque(saqueOP);
                    } else System.out.println("Caractere Invalido");
        }
    }
}
