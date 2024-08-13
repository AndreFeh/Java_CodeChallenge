//import java.util.Objects;
//import java.util.Scanner;
//
//public class MainCofres {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        CofreDigital digital = new CofreDigital("chave", 0, 0);
//
//        String opcao = scan.next();
//        if (opcao.equals("digital")) {
//            System.out.println("Tipo: Cofre Digital");
//            System.out.println("Metodo de abertura: Senha");
////            System.out.println("Digite sua senha: ");
//            digital.senha = scan.nextLong();
////            System.out.println("Confirme sua senha: ");
//            digital.senha2x = scan.nextLong();
//            if (!digital.validarSenha(digital.senha)) {
//                System.out.println("Senha incorreta!");
//            } else System.out.println("Cofre aberto!");
//        } else if (opcao.equals("fisico")){
//            System.out.println("Tipo: Cofre Fisico");
//            System.out.println("Metodo de abertura: Chave");
//        }
//    }
//}
