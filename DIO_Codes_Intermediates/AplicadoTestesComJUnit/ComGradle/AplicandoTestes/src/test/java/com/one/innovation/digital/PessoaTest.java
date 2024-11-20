package com.one.innovation.digital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest { //Validar
    @Test
    void validarCalcIdade(){
        Pessoa pessoa = new Pessoa("André", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(2, pessoa.getIdade());  //Espero que seja 2 o resultado de pessoa, e pega o resultado Idade
    }
}
