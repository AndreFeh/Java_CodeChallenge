package EstruturasCondicionais.Condicionais.Ternaria;

import java.util.Scanner;

public class ResultadoEscolarComplemento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repetirOperacao;
        do {
            System.out.println("Qual A Nota Do Aluno: ");

            int nota = scan.nextInt();

            //  If - ElseIf - Else
            String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
            System.out.println(resultado);

            System.out.println("""

                    v-v-v-v-v-v-v-v-v-v
                    Repetir Operação?\s""");
            repetirOperacao = scan.next();
        } while (repetirOperacao.equalsIgnoreCase("sim"));
    }
}
