package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class InsertNomeSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, senha;

        while(true) {
            System.out.println("Insira seu Nome de Usuário: ");
            nome = scan.next();
            System.out.println("Insira sua Senha: ");
            senha = scan.next();

            if(senha.equals(nome)) {
                System.out.println("A Senha Não Pode Ser A Mesma Que O Nome");
            }else return;
        }
    }
}
