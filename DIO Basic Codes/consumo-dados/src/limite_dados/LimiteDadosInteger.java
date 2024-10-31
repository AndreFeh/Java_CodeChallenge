package limite_dados;

import java.util.Scanner;

public class LimiteDadosInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dadosGB = scan.nextInt();
        int dadosMB = scan.nextInt();

        System.out.println(consumoDados(dadosGB, dadosMB));
    }

    public static String consumoDados(Integer dadosGB, Integer dadosMB){
        int gigabite = converterParaMb(dadosGB);
        int megabite = dadosMB;
        int totalUsado = gigabite - megabite;

        if (totalUsado > 0) {
            return "Voce ainda possui " + totalUsado + " MB disponiveis.";
        } else return "Limite de dados excedido. Compre ou renove seu pacote.";
    }
    public static Integer converterParaMb(Integer dadosGB){
        int conversao = 1024;
        int conversaoMb = conversao * dadosGB;

        return conversaoMb;
    }

}