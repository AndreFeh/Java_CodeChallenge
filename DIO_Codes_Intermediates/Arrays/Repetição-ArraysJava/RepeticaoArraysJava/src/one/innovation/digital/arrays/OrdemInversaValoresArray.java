package one.innovation.digital.arrays;

public class OrdemInversaValoresArray {
    public static void main(String[] args) {
        System.out.println("Imprimir a ordem inversa dos valores Vetor");

        int[] vetor = {-5, 14, 0, 21, 55, -36};
        System.out.println(vetor); //Mostrará o espaço na memoria
        System.out.println(vetor.length);//retorna a quantidade de elementos do Vetor

        int count = 0;
        System.out.print("Vetor [ ");
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("]");

        System.out.println("Ordem Inversa [ ");
        for(int i = (vetor.length-1); i >= 0; i-- ) { //Se colocar só Length, ele iria começar na posição 6, quero que comece na pocição existente
            System.out.print(vetor[i] + " ");
        }
        System.out.println("]");

    }
}