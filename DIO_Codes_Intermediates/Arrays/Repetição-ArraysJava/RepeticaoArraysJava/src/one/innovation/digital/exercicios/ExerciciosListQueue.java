package one.innovation.digital.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosListQueue {
    public static void main(String[] args) {
        Queue<String> chamada = new LinkedList<>();
        chamada.add("Juliana");
        chamada.add("Pedro");
        chamada.add("Carlos");
        chamada.add("Larissa");
        chamada.add("Joao");
        for (String listaPresentes: chamada) {
            System.out.print(listaPresentes + " ");
        }
        System.out.println("\n\nPróximo Nome na Lista " + chamada.peek() + "\nChamada Atual" + chamada);

        System.out.println("\nRemover o Próximo Nome na Lista " + chamada.poll() + "\nChamada Atual" + chamada);

        chamada.add("Daniel");

        System.out.println("Há Daniel Na Chamada: " + chamada.contains("Daniel"));

        System.out.println("Quem Presente");
        for (String presentes: chamada) {
            System.out.print(presentes + " ");
        }

        System.out.println("\nQuantos Nomes na Chamada: " + chamada.size());

        System.out.println("A Chamada está Vazia: " + chamada.isEmpty());

        System.out.println("Há Carlos na Chamada: " + chamada.contains("Carlos"));
    }
}
