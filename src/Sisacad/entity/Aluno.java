package Sisacad.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    private List<Curso> cursos = new ArrayList<Curso>();

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso c){
        cursos.add(c) ;
    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + System.lineSeparator() +
               "Matrícula: " + this.matricula + System.lineSeparator() +
               "CPF: " + this.cpf + System.lineSeparator() +
               "Cursos: " + cursos;
    }
}