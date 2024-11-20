package EstruturasCondicionais.Loops.Exercicios;

import java.util.Scanner;

public class CadastroPessoa {
    /*
    Faça um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150;
    Salário: maior que zero;
    Sexo: 'f' ou 'm';
    Estado Civil: 's', 'c', 'v', 'd';
    */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scan.next();

        System.out.println("Idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Salario: ");
        Double salario = scan.nextDouble();

        System.out.println("Estado: ");
        String estado = scan.next();

        System.out.println("Sexo: ");
        String sexo = scan.next();

        System.out.println("Gênero: ");
        String genero = scan.next();

        if (sexo.equals("Homem")){
            System.out.println("Homem");
        } else if (sexo.equals("Mulher")) {
            System.out.println("Mulher");
        }else System.out.println("Gênero Inexistente");

//        switch (sexo.equals(genero)){
//        }
    }
}
