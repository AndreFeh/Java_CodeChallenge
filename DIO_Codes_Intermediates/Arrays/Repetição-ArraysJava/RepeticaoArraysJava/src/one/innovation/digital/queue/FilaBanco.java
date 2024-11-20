package one.innovation.digital.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
//        O Banco abriu e as pessoas entraraão na fila para atendimento
        filaBanco.add("Matheus");
        filaBanco.add("Erick");
        filaBanco.add("Lucas");
        filaBanco.add("Elias");
        filaBanco.add("Pamela");
        filaBanco.add("Ingrid");
        filaBanco.add("Steffany");
        filaBanco.add("Alisson");
        System.out.println(filaBanco); //Retorna dentro de Colchetes
        for (String pessoas :filaBanco) {
            System.out.print(pessoas + " "); //Retorna os nomes
        }

//        O Matheus chegou primeiro, devera ser atendido Primeiro, LOGO APÓS REMOVIDO!!!
        String clenteParaSerAtendido = filaBanco.poll();
        System.out.println("\n\nClente Para Ser Atendido: " + clenteParaSerAtendido);
        System.out.println("\nFila Atualizada: " + filaBanco);

//        Se eu SÓ QUESO SABER, quem é o primeiro elemento da fila
        String proximoClienteFila = filaBanco.peek(); /*retorna elemento, senao tiver, retorna null*/
        System.out.println("Proximo Cliente da Fila: " + proximoClienteFila);
        System.out.println("Fila: " + filaBanco);

//        Nao posso ter uma fila vazia
        String proximoClienteOuErro = filaBanco.element(); // nao remove elemento da fila
        System.out.println("Proximo Cliente da Fila: " + proximoClienteOuErro);
        System.out.println("Proximo Cliente da Fila: " + proximoClienteOuErro);
        System.out.println("Fila: " + filaBanco);

        filaBanco.clear();
        String proximoClienteFilaClear = filaBanco.peek();
        System.out.println("Proximo Cliente da Fila: " + proximoClienteFilaClear); // como nao Há uma fila, ele retorna null
        String proximoClienteOuErroClear = filaBanco.element(); // nao remove elemento da fila
        System.out.println("Proximo Cliente da Fila: " + proximoClienteOuErroClear); // como nao Há uma fila, ele retorna Excessao: Exception in thread "main" java.util.NoSuchElementException


    }
}
