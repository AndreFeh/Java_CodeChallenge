public class CofreDigital {
    String chave;
    long senha, senha2x;

    public CofreDigital(String chave, long senha, long senha2x) {
        this.chave = chave;
        this.senha = senha;
        this.senha = senha2x;
    }

    public boolean validarSenha(long senha){
        return this.senha2x == senha;
    }
}
