package org.example.entities;

public class Funcionario {
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorHora;

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
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
}
