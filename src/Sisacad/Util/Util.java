package Sisacad.Util;

import Sisacad.entity.Administrativo;
import Sisacad.entity.Aluno;
import Sisacad.Banco.Banco;
import Sisacad.entity.Professor;
import Sisacad.exceptions.matriculaInvalidaException;
import java.util.Optional;
import java.util.Scanner;

public class Util {

    public static String leString(String msg){
        Scanner entrada = new Scanner(System.in);
        String string;
        System.out.print(msg);
        string = entrada.nextLine();

        return string;
    }

    public static Object pesquisaMatricula(String matriculaInserida) throws matriculaInvalidaException{

        Banco banco = new Banco();

        Object obj = new Object();

        Optional<Aluno> aluno = banco.listaAluno.stream().filter(a -> a.getMatricula().equals(matriculaInserida)).findFirst();
        Optional<Administrativo> administrativo = banco.listaAdminstrativo.stream().filter(a -> a.getMatricula().equals(matriculaInserida)).findFirst();
        Optional<Professor> professor = banco.listaProfessor.stream().filter(a -> a.getMatricula().equals(matriculaInserida)).findFirst();

        if(aluno.isPresent()){
            obj = aluno.get();
        } else if(administrativo.isPresent()) {
            obj = administrativo.get();
        } else if(professor.isPresent()) {
            obj = professor.get();
        } else if(aluno.isEmpty() || administrativo.isEmpty() || professor.isEmpty()){
            throw new matriculaInvalidaException();
        }

        return obj;

    }

}
