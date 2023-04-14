package Funcionario;

import org.example.entities.Funcionario;
import org.example.entities.FuncionarioTerceirizado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTerceirizadoTest {
    @Test
    public void testaConstrutorCorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 36;
        Double valorHora = 5.0;
        Double despesasAdicionais = 500.0;

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(
                nome,
                horasTrabalhadas,
                valorHora,
                despesasAdicionais
        );

        Assertions.assertEquals(nome, funcionarioTerceirizado.getNome());
        Assertions.assertEquals(horasTrabalhadas, funcionarioTerceirizado.getHorasTrabalhadas());
        Assertions.assertEquals(valorHora, funcionarioTerceirizado.getValorHora());
        Assertions.assertEquals(despesasAdicionais, funcionarioTerceirizado.getDespesasAdicionais());
    }

    @Test
    public void testaConstrutorCorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 36;
        Double valorHora = 5.0;
        Double despesasAdicionais = 1500.0;

        assertThrows(Exception.class,
                () -> new FuncionarioTerceirizado(
                        nome,
                        horasTrabalhadas,
                        valorHora,
                        despesasAdicionais
                ));
    }

    @Test
    public void testaModificadorDespesaAdicionalValido() {
        Double despesaAdicional = 500.0;

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado();

        funcionarioTerceirizado.setDespesasAdicionais(despesaAdicional);

        Assertions.assertEquals(despesaAdicional, funcionarioTerceirizado.getDespesasAdicionais());
    }

    @Test
    public void testaModificadorDespesaAdicionalValido() {
        Double despesaAdicional = 1001.00;

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado();

        assertThrows(Exception.class,
                () -> funcionarioTerceirizado.setDespesasAdicionais(despesaAdicional));
    }
}
