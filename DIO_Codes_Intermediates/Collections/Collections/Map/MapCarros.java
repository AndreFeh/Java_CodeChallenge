package Collections.Map;

import java.util.*;

public class MapCarros {
    public static void main(String[] args) {
        System.out.println("Criar Dicionario relacionando modelos e seus respectivos Consumos: ");
//        declarar no map o tipo da chave e valor
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
//           nao existe add no Map
            put("gol", 14.4);
            put("uno", 16d);
            put("mobi", 15.6);
            put("hb20", 19.5);
            put("kwid", 16.8);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substituir consumo do Gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionario: "/*tucson é o modelo e tb a chave*/
                + carrosPopulares.containsKey("tucson"));

        System.out.println("Confira se o modelo uno está no dicionario: "/*uno é o modelo e tb a chave*/
                + carrosPopulares.containsKey("uno"));

//        chamar detalhes da chave
        System.out.println("Exiba consumo Uno: " + carrosPopulares.get("uno"));

//        Exibir terceiro modelo adicionado - Nao há como achar variavel no sistema, entao nao há como fazer esse get
        System.out.println("Exibir os modelos: "); /*para isso o KeySet >> retornando Set*/
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println("Exibir os consumos: "); /*chamar Values para retornar Collections */
        Collection<Double> consumo = carrosPopulares.values();

        System.out.println("Exibir o Modelo mais economico e Consumo : "); /*para saber isso, precisa saber qual carro que faz mais km por litro*/
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); /*para saber dos valores o maximo*/
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); /*Os elementos dentro do Entry, GetKey e GetValue sao necessarios para continuar*/

//      Iniciando agora uma logica de programação
        String modeloMaisEficiente = ""; /* Variavel de Controle*/
        for (Map.Entry<String, Double> entry: entries){ /*a variavwel Entry vai retornar a informação dentro da Memoria Entries*/
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo Mais Eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exibir o Modelo Menos Economico: ");
        Double consumoMenosficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosficiente)) {/*se o Entry o valor dele for igual o consumoMenosEficiente[...]*/
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo Menos Eficiente: " + modeloMenosEficiente +" - "+ consumoMenosficiente);
            }/*[...]vou dizer que a chave que liga com o valor tb é o ~~~modeloMenosEficiente*/
        }

        System.out.println("Exiba a Soma dos Consumos: ");
        Iterator<Double> somaConsumos = carrosPopulares.values().iterator(); // seguindo a logica do Iterator
        Double soma = 0d;
        while (somaConsumos.hasNext()){
            soma += somaConsumos.next();
        }

        System.out.println("A Soma dos Consumos: " + somaConsumos);
        System.out.println("A Media dos Consumos: " + soma/carrosPopulares.size());

        System.out.println(carrosPopulares);
        System.out.println("Remover os carros com consumo igual a 15,6 km/h: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(15.6)) iterator.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Organizar em Lista de Ordem Natural: "); // para isso é necessario o TreeMap
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2.toString()); // chamar todos os objetos

        System.out.println("Apague o Catálogo: ");
        carrosPopulares.clear();

        System.out.println("Confirmar se o Catalogo está vazio");
        System.out.println("Catalogo1: " + carrosPopulares.isEmpty() + "\n" +"Catalogo2: " + carrosPopulares2.isEmpty());
        System.out.println(carrosPopulares.toString());
        System.out.println(carrosPopulares2.toString());
    }
}
