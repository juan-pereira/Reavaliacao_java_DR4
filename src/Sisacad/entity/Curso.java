package Sisacad.entity;

public class Curso {

    private String nome;
    private Integer duracaoHoras;

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoHoras() {
        return duracaoHoras;
    }

    @Override
    public String toString() {
        return nome;
    }

    public Curso(String nome, Integer duracaoHoras) {
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }
}
