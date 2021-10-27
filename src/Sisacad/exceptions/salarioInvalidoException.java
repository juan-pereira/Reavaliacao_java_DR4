package Sisacad.exceptions;

public class salarioInvalidoException extends Exception{

    public salarioInvalidoException(){
        super("O salário não pode ser menor que zero");
    }

}
