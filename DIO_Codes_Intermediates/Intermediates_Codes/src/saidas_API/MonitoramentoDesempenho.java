package saidas_API;

import java.util.Scanner;

//TODO Descricao
//Você está desenvolvendo um programa que simula uma API para monitorar a temperatura de uma CPU. O programa deve receber uma lista de leituras de temperatura e retornar a maior temperatura registrada. Cada leitura de temperatura é um número inteiro representando graus Celsius. Compare cada temperatura convertida com a maior temperatura encontrada até o momento e atualize a maior temperatura se a atual for maior. Após processar todas as leituras, retorne uma string formatada que exiba a maior temperatura encontrada no formato "Maior temperatura: X°C", onde X é o valor da maior temperatura. Certifique-se de que a string de saída esteja corretamente formatada e inclua o valor correto.
//
//Entrada
//Leituras de temperatura: Uma string contendo leituras de temperatura separadas por vírgulas. A string pode conter espaços extras ao redor das leituras.
//
//Saída
//Retorna uma string no formato "Maior temperatura: X°C", onde X é a maior temperatura registrada.


public class MonitoramentoDesempenho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = findHighestTemperature(input);
        System.out.println(output);
    }

    public static String findHighestTemperature(String input) {
        String[] temperaturas = input.split(",");
        int maxTemperature = Integer.MIN_VALUE;

        for (String temperatura : temperaturas) {
            int temperaturaInt = Integer.parseInt(temperatura.trim());
            // TODO: Comparar a temperatura convertida com maxTemperature e atualizar maxTemperature se a leitura atual for maior.
            if (temperaturaInt > maxTemperature) {
                maxTemperature = temperaturaInt;
            }
        }
        return "Maior temperatura: " + maxTemperature + "C";
    }
}
