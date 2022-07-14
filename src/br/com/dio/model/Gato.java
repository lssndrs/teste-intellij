package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String COR;
    private Integer idade;

    public Gato() {
    }

    public Gato(String nome, String COR, Integer idade) {
        this.nome = nome;
        this.COR = COR;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCOR() {
        return COR;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(COR, gato.COR) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, COR, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", COR='" + COR + '\'' +
                ", idade=" + idade +
                '}';
    }
}