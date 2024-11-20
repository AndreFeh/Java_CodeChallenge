package LIstaElementos;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ListaDeContatos {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--"); /*HashMap --> Embaralhar Tudo*/
        Map<Integer, Contato> agenda = new HashMap<Integer, Contato>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda+ "\n");
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Inserção\t--"); /*LinkedHashMap --> Ordem de Inserção*/
        Map<Integer, Contato> agenda1 = new LinkedHashMap<Integer, Contato>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1+ "\n");
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem id\t--"); /*TreeMap Organiza Sequencialmente*/
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2 + "\n");
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>((cont1, cont2) -> cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome()));

        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Novamente Por Numero Contato\t--");
        Set<Map.Entry<Integer, Contato>> novaBusca = new TreeSet<>((o1, o2) -> Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero()));
//        agora pegar o metodo declarado acima ^^^^, e printar
        novaBusca.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato>entry: novaBusca){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero());
        }
    }
}

/*
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}*/
