package queda_conexao;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite as velocidades de conexão (em Mbps) separadas por vírgula:");
        String scan = scanner.nextLine();

        // Pega todos os valores, e identifica a virgula e automaticamente separa-os
        String[] velocidades = scan.split(",");

        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);

        scanner.close();
    }

    public static String verificarQuedaConexao(String[] velocidades) {
        int soma = 0;
        String[] totalVelocidades = velocidades; /*Buscando a qtd de valores*/

        // Convertendo as strings para inteiros e somando
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
    }
//    TODO> SABE QUANDO VC TA FAZENDO E NAO SABE SE VAI DAR REALMENTE CERTO
//      DEU CERTO E ESTOU SEM ACREDITAR SKSKKSKSKSKS
}

