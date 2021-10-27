package Sisacad.entity;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    private double salario = 0.0;
    private List<Curso> cursos = new ArrayList<Curso>();

    public double getSalario() {
        return salario;
    }

    public void addCurso(Curso c){
        cursos.add(c);
        this.salario += c.getDuracaoHoras() * 50;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    @Override
    public String toString() {

        String cursos = "";

        for(Curso c : this.cursos){
            cursos += "Curso: " + c.getNome() + " Duração: " + c.getDuracaoHoras() + System.lineSeparator();
        }

        return "Professor: " + nome + System.lineSeparator() +
               "Salário: " + salario + System.lineSeparator() +
               cursos;
    }
}