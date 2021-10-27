package Sisacad;


import Sisacad.Util.Util;
import Sisacad.exceptions.matriculaInvalidaException;


public class Principal {

    public static void main(String[] args){
        Util util = new Util();
        boolean ligado = true;

        while(ligado){
            System.out.println("------------ Bem vindo ao SISACAD -------------");
            String matricula = util.leString("Insira a matrícula que deseja buscar: ");
            try {
                Object obj = util.pesquisaMatricula(matricula);
                System.out.println(obj.toString());
            } catch (matriculaInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
