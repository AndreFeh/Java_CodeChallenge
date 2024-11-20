package Collections.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaElementos {
    //TODO    Vou deixar em Comentarios como vou reduzindo o codigo!!!
//    Codigo Limpo no LISTAELEMENTOS_CODLIMPO
    public static void main(String[] args) {

        List<String> numerosAleatorios;
        numerosAleatorios = Arrays.asList("3","0","1","3","2","4","7","9","8","6","5");
        System.out.println("Imprima todos os elementos: ");
 /*       numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) { *//*Pega Cada elemento da Stream e imprime*//*
                System.out.println(s);
            }
        });*/
//        numerosAleatorios.stream().forEach(s -> System.out.println(s));   // feito com Lambda
        numerosAleatorios.forEach(System.out::println);                     //-> com Reference Methods

        System.out.println("Pegue todos os 5 primeiros numeros e coloque dentro de um Set 'add.list'");
        numerosAleatorios.stream().limit(5)/*Limit para definir quantos Numeros ele ira pegar*/
//                .collect(Collectors.toSet()).forEach(s -> System.out.println(s)); para
                .collect(Collectors.toSet()) /*A propria classe ja permite um SET, Set nao permite numeros repetidos*/
                .forEach(System.out::println); /*pegue de um lugar e coloque em outro*/

        System.out.println("Transforme essa Lista String em uma lista de Numeros Inteiros"); // com Operação Map
//        Vai continuar sendo uma list, mas sndo numInteiros
        numerosAleatorios.stream() //Com map, recebe Interface Functions

/*          .map(new Function<String, Integer>() {
                @Override
                public Integer apply(String s) { // Transformar de String
                    return Integer.parseInt(s); // Para Integer
                }
            });*/
                .map(s -> Integer.parseInt(s)) // se deixar so assim, vai dar erro, entt...
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Posso tambem fazer de outra forma: ");

        List<Integer> collectLista = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegar numeros pares e maiores que 2, colocar em uma nova lista");
//        Stream<Integer> transformaInt = numerosAleatorios.stream().map(s -> Integer.parseInt(s));// map pega os valores e transforma em um tipo
        List<Integer> transformaInt = numerosAleatorios.stream()
                .map(Integer::parseInt)// Feito REFERENCE METHODS
                /*               .filter(new Predicate<Integer>() { *//*Esse metodo retorna um boolean de Int's*//*
                    @Override
                    public boolean test(Integer myNumero) { *//*Colocar a verificação antes de RETURN FALSE*//*
                        if (myNumero % 2 == 0 && myNumero > 2) return true;
                        return false;
                    }*/
                .filter(myNumero -> (myNumero %2 == 0 && myNumero >2))// feito com LAMBIDA
                .collect(Collectors.toList());
        System.out.println("Pares Maiores Que 2: " + transformaInt);

        System.out.println("Apresentar a Média dos numeros: " + numerosAleatorios);
//        PEGAR CADA ELEMENTO DO INT E FAZERMANIPULAÇÃO

        /*numerosAleatorios.stream()
            .mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        });*/
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println); // ESTUDAR "OPTIONAL"
//       ^^^^^-> Ele vai retornar a minha media, se ela existir, vai retornar, senao, nao retorna nada

//        TODO STREAM NAO REMOVE VALORES

        System.out.println("Remova Impares");
//        Stream<Integer> convertNum = numerosAleatorios.stream().map(s -> Integer.parseInt(s)); // LAMBDA
/*        List<Integer> convertNum = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()); // TRANSFORMAR DE STRING EM INT - REFERENCE METHOD
        convertNum.removeIf(new Predicate<Integer>() { //Metodo List, para alterar Lista
            @Override
            public boolean test(Integer integer) {
                if (integer %2 != 0) return true;
                return false;
            }
        });*/
        List<Integer> convertNum = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        convertNum.removeIf(integer->(integer %2 != 0));//LAMBDA
        System.out.println(convertNum);

        System.out.println("Ignorar os 3 primeiros elementos. e imprimir o restante");
    }

}