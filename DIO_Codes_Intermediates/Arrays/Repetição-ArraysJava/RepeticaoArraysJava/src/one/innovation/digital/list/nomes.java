package one.innovation.digital.list;

import java.util.*;

public class nomes {
    public static void main(String[] args) {
        List<String>nomes = new ArrayList<>();
        nomes.add("Marcos");
        nomes.add("Vinicius");
        nomes.add("André");
        nomes.add("Yasmin");
        nomes.add("Isabelle");
        System.out.println(nomes);

        /*Metodo Set - Recebe Inteiro Indice, Elemento*/
        nomes.set(0, "Pablo"/*Trocar Marcos por Pablo*/);
        System.out.println("Elemento SET " + nomes);


        Collections.sort(nomes); /*Mudar Para Ordem Alfabética*/
        System.out.println("Elemento SORT" + nomes);
        nomes.set(0, "Pablo"/*Trocar Marcos por Pablo*/);
        System.out.println("Elemento SET dps do SORT" + nomes);

        nomes.remove(0);
        System.out.println("Elemento REMOVE POR INDICE" + nomes);

        nomes.remove("Yasmin");
        System.out.println("Elemento REMOVE POR NOME" + nomes);

        System.out.println("Elemento GET" + nomes.get(1));
//        System.out.println(nomes.get(Integer.parseInt("Vinicius"))); Não é possível buscar dessa forma

        System.out.println("INDEXOF " + nomes.indexOf("Isabelle")); /*Diz em qual indice Isabelle se encontra na lista*/
        System.out.println("INDEXOF " + nomes.indexOf("Flash")); /*Senao encontrar, retorna um -1 dizendo que nao existe*/

//        COMO SABER QUANTOS ELEMENTOS TEM NA LISTA
        System.out.println("Elementos no array: " + nomes.size());

        System.out.println("Elemento CONTAINS " + nomes.contains("Vinicius")); // Pergunta de tem tal elemento na lista, se sim, true

        System.out.println("Elemento ISEMPTY - se a lista esta vazia " + nomes.isEmpty()); // pergunta se a lista esta vazia

        nomes.clear(); // limpar a lista
        boolean vazia = nomes.isEmpty(); // pergunta se a lista esta vazia, NOTA: SO FUNIONA SE ESTIVER DEPOIS DO CLEAR
        System.out.println("Elemento ISEMPTY dps do CLEAR " + vazia); /*OOOUUU System.out.println(nomes.isEmpty());*/

        nomes.add("Venon");
        nomes.add("SpiderMan");
        nomes.add("Flash");
        nomes.add("Cyborg");
        nomes.add("IronMan");

        System.out.println("Uma das formas de Apresentar os dados é ForEach");
        for (String nomeItem: nomes) {
            System.out.println("Nome Item --> " + nomeItem);
        }
        System.out.println("Outra forma é por Iterator");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){ // iterator, tem item proximo? True...
            System.out.println("Nome Item --> " + iterator.next()); //retorna se tem mais algum numero depois dele

        }/*quando nao ha mais, para o loop*/


    }
}
