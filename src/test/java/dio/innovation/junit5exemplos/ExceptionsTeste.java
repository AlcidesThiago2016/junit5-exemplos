package dio.innovation.junit5exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExececaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas =  new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transferenciaEntreContas.transfere(contaOrigem, contaDestino,-1));
    }

}
