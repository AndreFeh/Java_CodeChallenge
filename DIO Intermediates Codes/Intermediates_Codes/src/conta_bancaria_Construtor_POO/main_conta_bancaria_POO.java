package conta_bancaria_Construtor_POO;

import java.util.Scanner;

public class main_conta_bancaria_POO {
    public static void main(String[] args) {
        OperacoesConta conta = new OperacoesConta();

        System.out.println(conta.exibirSaldo());
        conta.fazerSaque(249);
        conta.fazerDeposito(550);
        conta.fazerSaque(549);
        System.out.println(conta.exibirSaldo());
    }
}
