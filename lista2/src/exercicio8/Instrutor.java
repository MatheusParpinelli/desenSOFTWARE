package exercicio8;

public class Instrutor extends Pessoa {
    private String areaAtuacao;
    private double salario;

    public Instrutor(String nome, int idade, String cpf, String areaAtuacao, double salario) {
        super(nome, idade, cpf);
        this.areaAtuacao = areaAtuacao;
        this.salario = salario;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

