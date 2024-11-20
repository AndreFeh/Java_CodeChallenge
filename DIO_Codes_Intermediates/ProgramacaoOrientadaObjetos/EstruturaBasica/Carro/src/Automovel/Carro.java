package Automovel;

public class Carro {
/*
DEFINA METODO PARA CALCULAR VALOR TOTAL PARA NENCHER O TANQUE
DEVE RECEBER VALOR DA GASOLINA
FAZER 2 SOBRECARGAS DO CONSTRUTOR
*/


    String cor;
    String marca;
    String modelo;
    float capacidadeTanque;

//    Por padrão é public
    Carro(){}

    //    Sobrecarga
    Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

//    Sobrecarga
    Carro(String marca, String modelo, String cor, float capacidadeTanque) {
        this.cor = cor; /*essa cor, recebe cor, como parametro*/
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

//    o metodo que ira executar operação >v
//    Quanto é necessario para encher o tanque

//    METODO DE NEGOCIO (APOS GETS E SETS)
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    } /*Esse metodo calcula total para encher o tanque*/
/*-------------------------------------Criando Objetos e Manipulação------------------------------------------------------*/
    

}
