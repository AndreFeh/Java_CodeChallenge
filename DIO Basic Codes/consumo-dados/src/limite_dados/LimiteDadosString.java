package limite_dados;

import java.util.Scanner;

public class LimiteDadosString {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

    }

    public String verificarUso(String[] dadosGB, String[] dadosUsados) {
        converterParaMB(dadosGB); /*STRING GB CONVERTIDO PARA INTEGER EM MB*/
        long converterParaInt = 0;
        for (String dados : dadosUsados) {
            converterParaInt = Integer.parseInt(dados.trim());
        }

        /*Renomear pra ficar bunito, em momento futuro pensar em REFATORACAO*/
        long gigabite = converterParaMB(dadosGB);
        long megabite = converterParaInt;

        long totalUsado = gigabite - megabite;

        if (megabite > gigabite) {
            return "Voce ainda possui " + totalUsado + " MB disponiveis";
        } else return "Limite de dados excedido.";
    }

    public long converterParaMB(String[] dadosGB) {
        long converterStg = 0;
        long paraMb = 1024;
        for (String dados : dadosGB) {
            converterStg = Integer.parseInt(dados.trim());

            converterStg = converterStg * paraMb;
            /*AQUI ELE SE TORNA UM INT MB*/
        }
        return converterStg;
    }
}
