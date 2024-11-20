package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class LerAtributosAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Nome do Aluno é: ");
//        String nomeAluno = scan.next();
//        System.out.println("Idade do Aluno é: ");
//        int idadeAluno = scan.nextInt();

/*TODO:- Para ficar repetindo, pedindo nome e idade
    O mais simples é atraves de While*/

        while (true){ //QUERO QUE PARE QUANDO "NOME = 0"
            System.out.println("Nome do Aluno é: ");
            String nomeAluno = scan.next();
            if (nomeAluno.equals("0"))break;
            System.out.println("Idade do Aluno é: ");
            int idadeAluno = scan.nextInt();
        }
        System.out.println("Fim");



    }
}
