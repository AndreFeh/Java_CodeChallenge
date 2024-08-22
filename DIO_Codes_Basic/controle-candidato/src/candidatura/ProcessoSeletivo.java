package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        analisarCandidato(2900d);
//        analisarCandidato(1500d);
//        analisarCandidato(2000d);
        selecaoCandidatos();
        imprimirCandidatos();
        imprimirCandidatos2();
    }

//    Esse import faz a comparação entre 2 valores

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800d,2200d);
    }
    // TODO: Salario Base deve ser 2k

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000d;
        if (salarioBase > salarioPretendido) {
            System.out.printf("SALARIO PRETENDIDO É %.2f, LIGAR PARA O CANDIDATO %n", salarioPretendido);
        } else if (salarioBase == salarioPretendido) {
            System.out.printf("SALARIO PRETENDIDO É %.2f, LIGAR PARA CANDIDATO COM CONTRA-PROPOSTA %n", salarioPretendido);
        } else System.out.printf("SALARIO PRETENDIDO É %.2f, AGUARDANDO DEMAIS CANDIDATOS %n", salarioPretendido);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionado = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000d;

        while (candidatoSelecionado <5 && candidatosAtuais < candidatos.length/*Ele tem que se basear no tamanho do Array*/){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou esse valor de salario %.2f %n", candidato,  salarioPretendido);

            if (salarioBase >= salarioPretendido){
                candidatoSelecionado++;
                System.out.printf("Candidato %s FOI selecionado para vaga%n%n", candidato);
            } else System.out.printf("Candidato %s NAO FOI selecionado para vaga%n%n", candidato);

            candidatosAtuais++;
        }
    }


    static void imprimirCandidatos(){
//        digamos que os selecionados foram esses...
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA"};
        System.out.println("Imprimindo a partir do Indice");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("o candidato de indice " + (indice+1) + " é o candidato " + candidatos[indice]);
        }

    }

    static void imprimirCandidatos2(){
        //        digamos que os selecionados foram esses...
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA"};
        System.out.println("Imprimindo a partir do Indice via ForEach");

        for(String c : candidatos){
            System.out.println("O candidato selecionado foi " + c);
        }

    }

}
