package EstruturasCondicionais.Loops.SwitchCase;

public class Tamanhos {
    public static void main(String[] args) {
        String tamanho = "M";

        switch (tamanho){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;

            }
            case "G":{
                System.out.println("Grande");
                break;

            }
            case "GG":{
                System.out.println("Gigante");
                break;

            }
            default:{
                System.out.println("Indefinido");
            }
        }
    }
}

