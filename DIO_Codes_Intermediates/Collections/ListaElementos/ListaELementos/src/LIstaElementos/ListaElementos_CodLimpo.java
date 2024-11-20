package LIstaElementos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaElementos_CodLimpo {
    public static void main(String[] args) {
        System.out.println("Criando Lista String");
        List<String>numerosAleatoriosSTG = Arrays.asList("3","0","1","3","2","4","7","9","8","6","5");
        System.out.println(numerosAleatoriosSTG);

        System.out.println("Quest1: Imprimir todos elementos");
        numerosAleatoriosSTG.forEach(System.out::println);

        System.out.println("Quest4: Pegar os 5 primeiros elementos e colocar dentro de um Set");
        numerosAleatoriosSTG.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Quest3: Transformar Lista String em Inteiro");
        numerosAleatoriosSTG.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Quest3.1: Outra Forma");
        List<Integer> numerosAleatoriosINT = numerosAleatoriosSTG.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Quest4: Nova Lista com Numeros Pares Maiores que 2");
        List<Integer> numerosAleatoriosINT2 = numerosAleatoriosSTG.stream()
                .map(Integer::parseInt)
                .filter(par->(par%2==0 && par>2))
                .collect(Collectors.toList());
        System.out.println("Pares Maiores que 2 = " + numerosAleatoriosINT2);

        System.out.println("Quest5: Apresentar Média Numeros: " + numerosAleatoriosINT2);
        numerosAleatoriosSTG.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println); // estudar OPTIONAL

        //        TODO STREAM NAO ALTERA VALORES, SÓ EXPÕE
        System.out.println("Quest6: Remova Impares");
        List<Integer> numerosAleatorios3 = numerosAleatoriosSTG.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatorios3.removeIf(integer -> (integer %2 != 0));
        System.out.println(numerosAleatorios3);
    }
}