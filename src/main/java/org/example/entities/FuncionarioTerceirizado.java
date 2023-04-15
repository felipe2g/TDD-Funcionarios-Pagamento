package org.example.entities;

public class FuncionarioTerceirizado extends Funcionario {
    private Double despesasAdicionais;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorHora, Double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
    }

    public Double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(Double despesasAdicionais) {
        this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
    }

    private Double validaDespesasAdicionais(Double despesasAdicionais) {
        if (despesasAdicionais > 1000) {
            throw new IllegalArgumentException("O valor de despesas adicionais por funcionários terceirizados deve ser menor que 1000.");
        }
        return despesasAdicionais;
    }
}
