package funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Descrição
Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa atualizar os salários dos funcionários aplicando um aumento percentual. Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados dos funcionários e aplique um aumento percentual a todos os salários, listando os novos salários.

Cálculo do Novo Salário:

O novo salário de cada funcionário é calculado usando a fórmula: novoSalario = salario * (1 + aumento / 100)

Onde:

salario é o salário atual do funcionário.

salario é o salário atual do funcionário.

aumento é o percentual de aumento fornecido.

aumento / 100 converte o percentual em uma fração decimal.

1 + aumento / 100 calcula o fator de multiplicação para o aumento.

Multiplicar o salario pelo fator de multiplicação ajusta o valor para incluir o aumento.

Entrada
Um número inteiro n representando a quantidade de funcionários.

Para cada funcionário, serão fornecidos:

nome (uma string representando o nome do funcionário)

departamento (uma string representando o departamento do funcionário)

salario (um número decimal representando o salário do funcionário)

Um número decimal aumento representando o percentual de aumento.

Saída
`String` contendo todos os funcionários com seus novos salários, cada um em uma linha no formato: "Nome: X -  Novo Salario: Y". Onde, X representa o nome e Y o salário atualizado com duas casas decimais.
*/
public class Salarios {
    static class Funcionario {
        String nome;
        String departamento;
        double salario;

        Funcionario(String nome, String departamento, double salario) {
            this.nome = nome;
            this.departamento = departamento;
            this.salario = salario;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Funcionario> funcionarios = new ArrayList<>();

        // Leitura dos dados dos funcionários
        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        // Percentual de aumento
        double aumento = scanner.nextDouble();

        // Atualização e exibição dos salários
        for (Funcionario funcionario : funcionarios) {
            double novoSalario = funcionario.salario * (1 + aumento / 100);
            System.out.printf("Nome: %s - Novo Salario: %.2f%n", funcionario.nome, novoSalario);
        }

        scanner.close();
    }
}

