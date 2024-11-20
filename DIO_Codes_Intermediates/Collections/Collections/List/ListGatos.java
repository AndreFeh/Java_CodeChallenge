package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListGatos {
    public static void main(String[] args) {
        System.out.println("Criar e exibir uma lista de gatos");
        List<Gato> gatos = new ArrayList<Gato>() {{
            add(new Gato("rex", 2, "tigrado"));
            add(new Gato("alberto", 6, "cinza"));
            add(new Gato("garfield", 1, "siames"));
            add(new Gato("felix", 5, "preto"));
            add(new Gato("floop", 3, "branco"));
        }};
        System.out.println("---\t Ordem de Inserção\t---" + gatos); //senao colocar ToString, vai imprimir Endereço de memoria
//        toString default: [com.dio.collections.exerciciosList.Gato@1b28cdfa, com.dio.collections.exerciciosList.Gato@eed1f14, com.dio.collections.exerciciosList.Gato@7229724f]
//        Com TOSTRING: [nome='rex', idade=2, cor='tigrado',nome='felix', idade=5, cor='preto',nome='floop', idade=3, cor='branco']

        System.out.println("---\t Ordem Aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("---\t Ordem Natural\t---");
        Collections.sort(gatos);
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    //        Construtor para chamar esses dados, seguindo esse padrao
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }


//        toString chama um endereço de memoria
//        Redefinir toString, para mudar o jeito que ele é

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", cor='" + cor + '\'' +
                        "\n";
    }

//        Como é private, deve criar os Getters

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}