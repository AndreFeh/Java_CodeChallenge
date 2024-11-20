package com.one.innovation.digital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class teste {
    @Test
    public void validarArrays(){
        int[] table1 = {78,54,54,12};
        int[] table2 = {78,54,54,12};

        int[] table3 = {32,34,65,87};
        int[] table4 = {32,65,32,32};

        assertArrayEquals(table1, table2); /*Comparando se as 2 tabelas Sao Iguais*/
//        Assertions.assertArrayEquals(table4, table3); /*Erro, para aplicação... As 2 Nao sao iguais*/

        assertNotEquals(table3, table4); /*Comparando se as 2 equações Nao Sao Iguais*/
    }
}
