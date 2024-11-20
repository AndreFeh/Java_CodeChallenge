package Upcast_Downcast;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

//        UPCAST --v-v-v-v-v-v--
//TODO    Como gerente é filha de Funcionario, nao precisa detalhar
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

//        DOWNCAST --v-v-v-v-v-v--
//TODO    Como sao filhas de Vendedor, precisa detalhar como fazer Downcast
        /*Quero transformar um Funcionario(mae) em Vendedor(filha)*/
//        Gerente gerente = new Funcionario();              /*Erro pois declarado de forma Implicita*/
//        Vendedor vendedor1 = (Vendedor) new Funcionario();  /*Certo pois declarado de forma Explicita "(Vendedor)"*/

    }
}
