package consumo_dados;

import java.util.Scanner;

public class ConsumoDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String valores = scan.nextLine();

        String[] valoresArr = valores.split(",");

        System.out.println(consumoDados(valoresArr));
        System.out.println(maiorConsumo(valoresArr));
    }

    public static String consumoDados(String[] dadosSemana) {
        int total = 0;
        int media = 0;
        for (String dados : dadosSemana) {
            total += Integer.parseInt(dados.trim());
            media = (total / dadosSemana.length);
        }
        return "Total mensal: " + total + " MB\nMedia semanal: " + media + " MB";
    }

    public static String maiorConsumo(String[] dadosSemana) {
        int maiorConsumo = 0;
        int semanaMaiorConsumo = 0;

        for (int i = 0; i < dadosSemana.length; i++) { /*ITERA SOBRE TODOS OS DADOS DENTRO DA ARRAY*/
            /** Usa split para separar os consumos de uma semana em um array de strings*/
            int consumoAtual = Integer.parseInt(dadosSemana[i].trim());

            // Verifica se o consumo total da semana atual é maior que o maior consumo registrado
            if (consumoAtual > maiorConsumo) {
                maiorConsumo = consumoAtual;
                semanaMaiorConsumo = i+1;/*Nao entendi muito bem essa parte, so que ele vai adicionar 1 sempre que
                a semana com maior consumo bater o ponto maior*/
//                Adiciona 1 para refletir a numeração das semanas começando em 1
            }
        }
        return "Maior consumo: Semana " + semanaMaiorConsumo;
    }
}
