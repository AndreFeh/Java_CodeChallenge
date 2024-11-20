package com.one.innovation.digital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest { //Validar
    @Test
    void validarCalcIdade(){
        Pessoa pessoa = new Pessoa("André", LocalDate.of(2001, 07, 14));
        Assertions.assertEquals(21, pessoa.getIdade());  //Espero que seja 2 o resultado de pessoa, e pega o resultado Idade
    }

    @Test
    void calcIdadeJessica(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 02, 18));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void maiorIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,02,18));
        Assertions.assertTrue(jessica.maiorIdade());

        Pessoa joao = new Pessoa("João", LocalDate.of(2006,05,25));
        Assertions.assertTrue(joao.maiorIdade());
    }
}
