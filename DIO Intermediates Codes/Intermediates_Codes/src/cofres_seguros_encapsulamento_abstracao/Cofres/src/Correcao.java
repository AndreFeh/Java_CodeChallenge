import java.util.Scanner;

public class Correcao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Correcao.CofreDigital digital = new Correcao.CofreDigital("chave", 0, 0);

        String opcao = scan.next();
        if (opcao.equals("digital")) {
            System.out.println("Tipo: Cofre Digital");
            System.out.println("Metodo de abertura: Senha");
//            System.out.println("Digite sua senha: ");
            digital.senha = scan.nextLong();
//            System.out.println("Confirme sua senha: ");
            digital.senha2x = scan.nextLong();
            if (!digital.validarSenha(digital.senha)) {
                System.out.println("Senha incorreta!");
            } else System.out.println("Cofre aberto!");
        } else if (opcao.equals("fisico")) {
            System.out.println("Tipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");
        }
    }

    public static class CofreDigital {
        String chave;
        long senha, senha2x;

        public CofreDigital(String chave, long senha, long senha2x) {
            this.chave = chave;
            this.senha = senha;
            this.senha = senha2x;
        }

        public boolean validarSenha(long senha) {
            return this.senha2x == senha;
        }
    }
}

