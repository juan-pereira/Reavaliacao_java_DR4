package Sisacad.entity;

public class Administrativo extends Pessoa{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Administrativo: " + nome + "\n" +
               "Salario: " + salario;
    }

    public Administrativo(String nome, String cpf, String matricula, double salario) {
        super(nome, cpf, matricula);
        this.salario = salario;
    }
}
