package org.example.entities;

public class Funcionario {
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorHora;

    public Funcionario() {

    }

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
        this.valorHora = validaValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = validaValorHora(valorHora);
    }

    private int validaHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 40) {
            throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
        }
        return horasTrabalhadas;
    }

    private Double validaValorHora(Double valorHora) {
        if (valorHora < 4 || valorHora > 10) {
            throw new IllegalArgumentException("O valor da hora por funcionários próprios deve ser entre 4% e 10%.");
        }
        return valorHora;
    }
}
