import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Boolean continueLoop = true;
        do {

        String a = JOptionPane.showInputDialog("Numerador");
        String b = JOptionPane.showInputDialog("Denominador");

        /*Vai estourar erro, entao preencher com Try{}Catch{}*/
        try{
            int resultado = dividir(Integer.parseInt(a)/*Transforma String em Integer*/, Integer.parseInt(b));
            System.out.println(a + " / " + b + " = " + resultado);
            continueLoop = false;
        } catch (NumberFormatException e) { /*Com CTRL+SHIFT+ENTER, identificou o erro e gerou o Catch*/
            e.printStackTrace(); //EM VEZ DE APRESENTAR A EXCESSAO, ALERTAR O CLIENTE
            JOptionPane.showMessageDialog(null, "Entrada Invalida! Informe um numero inteiro!: ");
        } /*Se perceber que vai dar um novo tipo de erro, nessa mesma etapa, pará-lo tambem*/ catch (ArithmeticException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossível divisão por Zero!");
        }
        }while (continueLoop);


//        Se tudo ok
        System.out.println();
        System.out.println("Codigo Se Encerrou");

    }

    private static int dividir(int a, int b) {
        return a/b;
    }


}