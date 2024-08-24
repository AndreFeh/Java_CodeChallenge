package calculo_velocidade;

import java.util.Scanner;

public class Exemplo {
    // Metodo calculo velocidade media de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        int soma = 0;
        int totalVelocidades = velocidades.length; /*Buscando a qtd de valores*/

        // Convertendo as strings para inteiros e somando
        for (String velocidade : velocidades) {
            soma += Integer.parseInt(velocidade.trim()); /*entendi*/
            /*Soma a velocidade da vez junto as demais velocidades incluidas no array*/
            /*velocidade.trim, velocidade é convertida de String para Integer*/
            /*.trim remove os epacos em branco do comeco e fim da String*/
        }
        int media = soma / totalVelocidades;

        // Retornando o resultado formatado
        return media + " Mbps";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite as velocidades de conexão (em Mbps) separadas por vírgula:");
        String input = scanner.nextLine();

        // Pega todos os valores, e identifica a virgula e automaticamente separa-os
        String[] velocidades = input.split(",");

        String resultado = verificarQuedaConexao(velocidades);
        System.out.println(resultado);

        scanner.close();
    }
}
