package one.innovation.digital.set;

import java.util.Iterator;
import java.util.TreeSet;

public class EstadosTreeSet {
    public static void main(String[] args) {
        TreeSet<String> estados = new TreeSet<>();

        estados.add("Parana");
        estados.add("Brasilia");
        estados.add("Santa Catarina");
        estados.add("Goias");
        estados.add("Amapa");
        estados.add("São Paulo");
        System.out.println(estados);

        /*Retorna o primeiro valor*/            System.out.println(estados.first());
        /*Retorna e Remove o primeiro valor*/   System.out.println(estados.pollFirst());

        /*Retorna o primeiro estado abaixo do parametro*/   System.out.println(estados.lower("Parana"));
        /*Retorna o primeiro estado acima do parametro*/    System.out.println(estados.higher("Parana"));

        /*Retorna o ultimo valor*/              System.out.println(estados.last());
        /*Retorna e Remove o ultimo valor*/     System.out.println(estados.pollLast());

        /*Exibe Todos os Valores*/ System.out.println(estados);

        /*Navega por todos os itens com Iterator*/
        Iterator<String> iterator = estados.iterator();
        while (iterator.hasNext()){ /*Enquanto tiver proximo elemento, imprima*/
            System.out.println("Iterador " + iterator.next());
        }

        for (String estado: estados){ /*Mesma Coisa que Iterator*/
            System.out.println("ForEach " + estado);
        }
    }
}
