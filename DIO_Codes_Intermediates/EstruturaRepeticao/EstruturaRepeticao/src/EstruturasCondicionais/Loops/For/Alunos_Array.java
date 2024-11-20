package EstruturasCondicionais.Loops.For;

public class Alunos_Array {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "ANA", "LUIZ", "MARCOS", "JONAS", "ANDRE"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O Aluno no Indice X " + x + " é: "+ alunos[x]);
        }
    }
}
