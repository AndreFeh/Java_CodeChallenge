package code3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Descrição
 * Você está desenvolvendo um sistema básico de gerenciamento de inventário para uma loja.
 * No sistema, os produtos e suas quantidades são armazenados em um HashMap.
 * Você precisa criar uma função que, dado o nome de um produto digitado pelo usuário,
 * verifique a quantidade disponível em estoque e retorne uma mensagem apropriada.
 * <p>
 * A função deve:
 * <p>
 * Receber o nome de um produto do usuário.
 * <p>
 * Consultar um HashMap de produtos com suas quantidades.
 * <p>
 * Se o produto estiver no estoque e a quantidade for maior que zero, retornar "Produto disponivel: X em estoque.",
 * onde, X é a quantidade em estoque.
 * <p>
 * Se o produto estiver no estoque, mas a quantidade for zero, retornar "Produto indisponivel.".
 * <p>
 * Se o produto não estiver no estoque, retornar "Produto nao encontrado.".
 * <p>
 * Entrada
 * String: Nome do produto.
 * <p>
 * Saída
 * String: "Produto disponivel: X em estoque.", "Produto indisponivel." ou "Produto nao encontrado".
 * <p>
 * Exemplos
 * A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de
 * testar seu programa com esses exemplos e com outros casos possíveis.
 */
public class ConsultaProdutos {
    static class Produto{
        String nome;

        public Produto(String nome) {
            this.nome = nome;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade = scan.nextInt();
        for(int i = 0; i<quantidade; i++){

        }



    }
    // Map de produtos com suas quantidades
    private static final Map<String, Integer> produtosEstoque = new HashMap<>();

    static {
        // Inicializando o estoque com alguns produtos
        produtosEstoque.put("Switch", 10);
        produtosEstoque.put("Roteador", 0);
        produtosEstoque.put("Teclado", 25);
        produtosEstoque.put("Mouse", 10);
        produtosEstoque.put("Servidor", 5);
    }

    public static String consultarProduto(String nomeProduto){
        produtosEstoque.get(nomeProduto);
        return nomeProduto;
    }

}
