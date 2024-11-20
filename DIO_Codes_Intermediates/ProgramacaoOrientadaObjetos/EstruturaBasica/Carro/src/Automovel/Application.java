package Automovel;

public class Application {
    public static void main(String[] args) {
        /*O main é para rodar objeto, é o put de entrada p objeto funcionar*/

//        chamar o construtor vazio = sem nenhum parametro
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setMarca("Audi");
        carro1.setModelo("R8");
        carro1.setCapacidadeTanque(20);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5));

//        Construtor com parametros
        Carro audiR8 = new Carro("Audi","R8","Verde", 20);
        System.out.println(audiR8.getMarca());
        System.out.println(audiR8.getModelo());
        System.out.println(audiR8.getCor());
        System.out.println(audiR8.getCapacidadeTanque());

        System.out.println(audiR8.totalValorTanque(5)); /*Formula para calcular quantos R$ para completar tanque*/
    }
}
