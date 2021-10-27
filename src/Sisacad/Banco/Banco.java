package Sisacad.Banco;

import Sisacad.entity.Administrativo;
import Sisacad.entity.Aluno;
import Sisacad.entity.Curso;
import Sisacad.entity.Professor;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public static List<Aluno> listaAluno = new ArrayList<Aluno>();
    public static List<Administrativo> listaAdminstrativo = new ArrayList<Administrativo>();
    public static List<Professor> listaProfessor = new ArrayList<Professor>();

    static{
        Aluno aluno1 = new Aluno("Juan Pablo", "92259749739", "2021001");
        Aluno aluno2 = new Aluno("Gustavo Martins", "99818143779", "2021002");
        Aluno aluno3 = new Aluno("João das Couves", "41965962742", "2021003");

        Professor prof1 = new Professor("José Carlos", "17022556709", "2021100");
        Professor prof2 = new Professor("Maria das Dores", "65775304756", "2021101");

        Administrativo adm1 = new Administrativo("Washington", "91242859780", "2021200", 1500);

        Curso curso1 = new Curso("HTML", 50);
        Curso curso2 = new Curso("Java", 90);

        aluno1.addCurso(curso1);
        aluno2.addCurso(curso1);
        aluno3.addCurso(curso1);
        aluno2.addCurso(curso2);

        prof1.addCurso(curso1);
        prof2.addCurso(curso1);
        prof2.addCurso(curso2);

        listaAluno.add(aluno1);
        listaAluno.add(aluno2);
        listaAluno.add(aluno3);

        listaAdminstrativo.add(adm1);

        listaProfessor.add(prof1);
        listaProfessor.add(prof2);

    }


}
