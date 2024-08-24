package calculo_velocidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    private List<RegistrosMbps> registrosMbpsList;

    public MainApplication() {
        this.registrosMbpsList = new ArrayList<>();
    }

    public void adicionarRegistro(int registro) {
        registrosMbpsList.add(new RegistrosMbps(registro));
    }

    public Integer exibirQtdRegistros() {
        return registrosMbpsList.size();
    }

    public void obterInfoRegistros() {
        System.out.println(registrosMbpsList);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int registro; /*Implementar dps o "= scan.nextInt()" */


    }
}

class RegistrosMbps {
    int registros;

    public RegistrosMbps(int registros) {
        this.registros = registros;
    }

    public int getRegistros() {
        return registros;
    }

    @Override
    public String toString() {
        return registros +"";
    }
}