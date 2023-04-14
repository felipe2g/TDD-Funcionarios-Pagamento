package Funcionario;

import org.example.entities.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {
    Funcionario funcionario;

    @Test
    public void testaConstrutorFuncionarioCorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 36;
        Double valorHora = 5.0;

        this.funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);

        Assertions.assertEquals(funcionario.getNome(), nome);
        Assertions.assertEquals(funcionario.getHorasTrabalhadas(), horasTrabalhadas);
        Assertions.assertEquals(funcionario.getValorHora(), valorHora);
    }

    @Test
    public void testaConstrutorIncorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 41;
        Double valorHora = 11.0;

        assertThrows(Exception.class,
                () -> new Funcionario(nome, horasTrabalhadas, valorHora));
    }

    @Test
    public void testaConstrutorFuncionarioHorasTrabalhadasIncorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 41;
        Double valorHora = 8.0;

        assertThrows(Exception.class,
                () -> new Funcionario(nome, horasTrabalhadas, valorHora));
    }

    @Test
    public void testaConstrutorFuncionarioValorHoraIncorreto() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 30;
        Double valorHora = 11.0;

        assertThrows(Exception.class,
                () -> new Funcionario(nome, horasTrabalhadas, valorHora));
    }

    @Test
    public void testaConstrutorFuncionarioValorHoraNegativo() {
        String nome = "Peter Parker";
        Integer horasTrabalhadas = 41;
        Double valorHora = -11.0;

        assertThrows(Exception.class,
                () -> new Funcionario(nome, horasTrabalhadas, valorHora));
    }

    @Test
    public void testaSetNome() {
        String nome = "Thor Odinson";

        Funcionario funcionarioSetName = new Funcionario();

        funcionarioSetName.setNome(nome);

        assertEquals(nome, funcionarioSetName.getNome());
    }

    @Test
    public void testaSetHorasTrabalhadasCorreto() {
        Integer horasTrabalhadas = 33;

        Funcionario funcionarioSetHorasTrabalhadas = new Funcionario();

        funcionarioSetHorasTrabalhadas.setHorasTrabalhadas(horasTrabalhadas);

        assertEquals(horasTrabalhadas, funcionarioSetHorasTrabalhadas.getHorasTrabalhadas());
    }

    @Test
    public void testaSetHorasTrabalhadasIncorreto() {
        Integer horasTrabalhadas = 55;

        Funcionario funcionarioSetHorasTrabalhadas = new Funcionario();

        assertThrows(Exception.class,
                () -> funcionarioSetHorasTrabalhadas.setHorasTrabalhadas(horasTrabalhadas));
    }

    @Test
    public void testaSetValorHoraCorreto() {
        Double valorHora = 7.0;

        Funcionario funcionarioSetValorHora = new Funcionario();

        funcionarioSetValorHora.setValorHora(valorHora);

        assertEquals(valorHora, funcionarioSetValorHora.getValorHora());
    }

    @Test
    public void testaSetValorHoraIncorreto() {
        Double valorHora = 11.0;

        Funcionario funcionarioSetValorHora = new Funcionario();

        assertThrows(Exception.class,
                () -> funcionarioSetValorHora.setValorHora(valorHora));
    }
}
