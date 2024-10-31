package gerenciamento;
//Descrição
//Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários
// de uma empresa. Cada funcionário tem um ID, nome e cargo. Crie um programa que adicione funcionários a uma "tabela" (lista) e liste todos os funcionários ordenados pelo ID.
//
//Entrada
//1. Um número inteiro n representando a quantidade de funcionários.
//
//2. Para cada funcionário, serão fornecidos dois dados:
//
//nome (uma string representando o nome do funcionário)
//
//cargo (uma string representando o cargo do funcionário)
//
//Saída
//String contendo todos os funcionários listados em ordem crescente de ID, cada um em
// uma linha no formato:
// "ID: Nome - Cargo"
//

import java.util.*;

public class main {
    static class Funcionario {
        int id;
        String nome;
        String cargo;

        public Funcionario(int id, String nome, String cargo) {
            this.id = id;
            this.nome = nome;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return id + ":" + nome + " - " + cargo;
        }
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int qtdFunc = scan.nextInt();
        scan.nextLine(); // Consome a nova linha após o número de funcionários
        int id = 0;

        for (int i=0; i < qtdFunc; i++){
            String nome = scan.nextLine();
            String cargo = scan.nextLine();
            id ++;
            funcionarios.add(new Funcionario(id,nome,cargo));
        }

        /*SOMENTE ESSE METODO QUE NAO SABIA COMO IMPLEMENTAR*/
        Collections.sort(funcionarios, Comparator.comparingInt(f -> f.id));
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }



    }
}
