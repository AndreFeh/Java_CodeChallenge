package saidas_API;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Saidas_API {
    public static String findMostFrequentMethod(String input) {
        String[] metodos = input.split(",");

        Map<String, Integer> MetodoContagem = new HashMap<>();

        // Contar a ocorrência de cada método HTTP e armazenar no mapa 'MetodoContagem'
        for (String metodo : metodos) { // Para cada metodo da map de metodos, faça...
            metodo = metodo.trim().toUpperCase();  // Remover espaços extras e converter para maiúsculas
            MetodoContagem.put(metodo, MetodoContagem.getOrDefault(metodo, 0) + 1);
        }

        // Encontrar o metodo com a maior contagem
        String mostFrequentMethod = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : MetodoContagem.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Descricao do metodo
        String description = "";
        switch (mostFrequentMethod) {
            case "GET":
                description = "O GET solicita a representacao de um recurso.";
                break;
            case "POST":
                description = "O POST envia dados para processamento.";
                break;
            case "PUT":
                description = "O PUT atualiza todos os dados de um recurso.";
                break;
            case "DELETE":
                description = "O DELETE remove um recurso especifico.";
                break;
            default:
                description = "Metodo nao reconhecido.";
        }

        return mostFrequentMethod + ": " + maxCount + " - " + description;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findMostFrequentMethod(input);
        System.out.println(output);
    }


}
