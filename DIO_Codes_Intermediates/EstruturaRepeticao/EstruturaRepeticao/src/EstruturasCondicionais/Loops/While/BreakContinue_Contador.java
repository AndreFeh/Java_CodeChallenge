package EstruturasCondicionais.Loops.While;

public class BreakContinue_Contador {
    public static void main(String[] args) {
        for (int numero = 1; numero <=10; numero++) {
//            Adicionando uma condição
            if (numero == 6) {
                break;
            }
            System.out.println("O Numero é Igual a: " + numero);
        }
    }
}
