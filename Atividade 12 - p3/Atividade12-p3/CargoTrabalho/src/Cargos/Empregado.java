package Cargos;
public class Empregado {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public double vencimento(double salario) {
        return salario;
    }
    
}
