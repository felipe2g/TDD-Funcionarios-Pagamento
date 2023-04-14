package Funcionario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {
    Funcionario funcionario;

    @Test
    public void testaConstrutorFuncionarioCorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 36;
        Double valorHora = 22.0;

        this.funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        Assertions.assertEquals(funcionario.getNome(), name);
        Assertions.assertEquals(funcionario.getHorasTrabalhadas(), horasTrabalhadas);
        Assertions.assertEquals(funcionario.getValorHora(), valorHora);
    }

    @Test
    public void testaConstrutorFuncionarioIncorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 41;
        Double valorHora = 22.0;

        assertThrows(Exception.class,
                () -> new Funcionario(nome, horasTrabalhadas, valorHora));
    }
}
