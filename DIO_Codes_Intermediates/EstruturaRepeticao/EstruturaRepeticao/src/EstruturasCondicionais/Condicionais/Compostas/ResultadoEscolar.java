package EstruturasCondicionais.Condicionais.Compostas;

public class ResultadoEscolar {
    public static void main(String[] args){

        int nota = 3;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota>=5 && nota<7){
            System.out.println("Recuperação");
            System.out.println("Sua Nota Foi: " + nota);
        } else{
            System.out.println("Nota = " + nota + " Reprovado!");
        }
    }
}
