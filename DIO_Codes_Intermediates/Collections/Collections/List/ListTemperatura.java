package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTemperatura {
    public static void main(String[] args) {
        List<Temperaturas>tempMeses = new ArrayList<Temperaturas>(){{
            add(new Temperaturas("3-Março", 8d));
            add(new Temperaturas("6-Junho", 16d));
            add(new Temperaturas("1-Janeiro", 33d));
            add(new Temperaturas("4-Abril", 15d));
            add(new Temperaturas("5-Maio", 22d));
            add(new Temperaturas("2-Fevereiro", 25d));
        }};
//    Double temperaturaSemestral = tempMeses/6;

        System.out.println(tempMeses);
        //Exibindo a media dos valores
        //Primeiro fazer o While dentro de Iterator
        //Apos soma, dividir por 6
        Double soma = 0d;
        Iterator<Temperaturas> iteratorSoma = tempMeses.iterator();
        while (iteratorSoma.hasNext()){
            Double next = iteratorSoma.next().getTemperatura();
            soma += next;
        }
//        Double media = soma/6;
//        System.out.println("A Média das temperaturas é: " + media);

        System.out.println("A Média das temperaturas é: " + soma/tempMeses.size());
        System.out.println("Os Meses acima dessa Média são: " + soma);
        System.out.println(tempMeses.toString());

////    remover todas as temperaturas menores que a media
        Iterator<Temperaturas> iteratorRemove = tempMeses.iterator();
        while (iteratorRemove.hasNext()){
            Double next = iteratorRemove.next().getTemperatura();
            if (next<tempMeses.size()) iteratorRemove.remove();
        }
        System.out.println(tempMeses.toString());

        System.out.println("---\t Ordem Natural\t---");
        Collections.sort(tempMeses); //mostrar a ordem natural
        System.out.println(tempMeses);

    }
}

class Temperaturas implements Comparable<Temperaturas> {
    private String mes;
    private Double temperatura;


    public Temperaturas(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return  mes + '\''
                + temperatura
                + " Graus";
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public int compareTo(Temperaturas temperaturas) {
//        alterar retorno para
        return this.getMes().compareToIgnoreCase(temperaturas.getMes());
    }
}
