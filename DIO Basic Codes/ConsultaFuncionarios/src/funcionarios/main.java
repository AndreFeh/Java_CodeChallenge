package funcionarios;

import java.util.*;

/*
* Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa consultar os funcionários de um determinado departamento. Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados dos funcionários e retorne a lista de funcionários de um departamento específico.

Entrada
Um número inteiro n representando a quantidade de funcionários.

Para cada funcionário, serão fornecidos:

nome (uma string representando o nome do funcionário)

departamento (uma string representando o departamento do funcionário)

salario (um número decimal representando o salário do funcionário)

Uma string departamento_consulta representando o departamento a ser consultado.

Saída
`String` contendo todos os funcionários do departamento consultado, cada um em uma
* linha no formato: "Nome: - Salario"

*/
public class main {
    static class Funcionario {
        String nome;
        double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + " - " + "Salario: " + salario;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Funcionario>> departamentoFuncionario = new HashMap<>();

        int qtdFuncionarios = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < qtdFuncionarios; i++) {
            String nome = scan.nextLine();
            String departamento = scan.nextLine();
            double salario = scan.nextDouble();
            scan.nextLine(); // Consume a proxima linha

            // PELO GPT Adiciona o funcionário ao mapa de departamentos
            departamentoFuncionario
                    .computeIfAbsent(departamento, k -> new LinkedList<>())
                    .add(new Funcionario(nome, salario));
        }

        String departamentoConsulta = scan.nextLine();
        // Exibe os funcionários do departamento consultado
        List<Funcionario> funcionariosConsulta = departamentoFuncionario.get(departamentoConsulta);

        for (Funcionario f : funcionariosConsulta) {
            System.out.printf("Nome: %s - Salario: %.2f\n", f.nome, f.salario);
        }

        scan.close();
    }


}

