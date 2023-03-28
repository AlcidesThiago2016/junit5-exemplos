package dio.innovation.junit5exemplos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarNull(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Thiago", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
