package plano_operadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ItensCombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine().trim();
        /** .TRIM, remove espacos em branco do começo e do final da frase (Antes e depois da String/Frase)*/


        // Convertendo a entrada em uma lista de strings
        List<String> servicosContratados = new ArrayList<>(Arrays.asList(input.split(",")));
        /** .SPLIT, faz a separação de elementos strings dentro de um Array*/


        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        System.out.println(resultado);

        scanner.close();
    }


//TODO:    METODO PARA VALIDAR OS ITENS DO COMBO
    public static String verificarComboCompleto(List<String> servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Caso os valores sejam iguais os serviços contratados == True
        for (String servico : servicosContratados) {
            switch (servico.trim()) {
                case "movel":
                    movelContratado = true;
                    break;
                case "banda larga":
                    bandaLargaContratada = true;
                    break;
                case "tv":
                    tvContratada = true;
                    break;
            }
        }

        // Verifica se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }
}

