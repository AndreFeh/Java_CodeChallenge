package EstruturasCondicionais.Loops.SwitchCase;

public class PlanosOperadora {
    public static void main(String[] args) {
        String plano = "Turbo" /*basico medio turbo*/;

        switch (plano){
            case "Turbo":{
                System.out.println("5gb Youtube");
            }
            case "Medio":{
                System.out.println("2gb internet, Whatsapp e Instagram Ilimitado");
            }
            case "Basico":{
                System.out.println("100 minutos de Ligação");
            }
        }
    }

}
