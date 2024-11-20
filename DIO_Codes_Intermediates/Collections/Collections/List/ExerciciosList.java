package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione setes notas: ");

        List<Double> notas = new ArrayList<>(); // a patir do JDK7 nao é necessario repetir Double em todos os <>
        notas.add(7d);
        notas.add(8.5);
        notas.add(8.9);
        notas.add(2.3);
        notas.add(9.5);
        notas.add(5d);
        notas.add(1d);
        notas.add(0.2);
//        sout toString apresenta todos os numeros do array
        System.out.println(notas.toString());

//        metodo.indexOf() indica a posição do ValorX
        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua nota 5d pela nota 7d: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confirme se a nota 5 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(5));

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // A List nao tem essa função, entao para isso, usar uma solução distinta... o Iterator
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        System.out.println("Exiba a soma dos valores: ");
        Double soma = 0d;
//        CTRL ALT V
        Iterator<Double> iteratorSoma = notas.iterator();   // iterator do tipo double
        while (iteratorSoma.hasNext()){                     //.hasNext, como tem o while, enquanto houver proximo elemento na lista, ele continua
            Double next = iteratorSoma.next();              //<<<CTRL ALT V
            soma += next;                               // antes de definir soma, criar variavel soma
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a media dos valores: " + soma/notas.size());

        System.out.println("Remova Nota 1: ");
        notas.remove(1d);
        System.out.println(notas);

        System.out.println("Remova Todas as Notas menores que 6: ");
        Iterator<Double> iteratorRemove = notas.iterator(); // nesse iterator, enquanto for menor que 6, ele vai remover
        while (iteratorRemove.hasNext()){
            Double next = iteratorRemove.next();
            if (next<6) iteratorRemove.remove(); // definir ate quando ira remover
        }
        System.out.println(notas.toString());


        System.out.println("Remova Todas as Notas maiores que 6: ");
        while (iteratorRemove.hasNext()){
            Double next = iteratorRemove.next();
            if (next>6) iteratorRemove.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Apagar toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se esta vazia... Está? " + notas.isEmpty());
    }
}
