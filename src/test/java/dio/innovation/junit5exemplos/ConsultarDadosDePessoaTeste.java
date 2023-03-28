package dio.innovation.junit5exemplos;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Thiago",LocalDateTime.of(1987,01,27,17,00)));
    }

    @AfterEach
    void removeDados(){
        BancoDeDados.RemoveDados(new Pessoa("Thiago",LocalDateTime.of(1987,01,27,17,00)));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
