package aula9;

public class Funcionario {
	private static int ultimoCod = 0;
	private String nome;
	private String cpf;
	private double salarioBase;
	
	// Construtor da classe com 1 parametro
	public Funcionario(String cpf) {
		this.cpf = cpf;
	}
	
	
	// Sobrecarga de Construtor com 2 parametros
	public Funcionario(String cpf, double salarioBase) {
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	
	public Funcionario() {} // Construtor vazio
	
	
	public void setUltimoCod() {
		ultimoCod++;
	}
	
	public int getUltimoCod() {
		return ultimoCod;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setSalarioBase(double salario) {
		this.salarioBase = salario;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	/* Sobrescrita de metodos
	1500 a 2500 - 10%
	2500 a 3500 - 15%
	> 3500 - 20% */
	
	public double calculaPl() {
		double pl = 0.0;
		if(this.salarioBase > 0.0 && this.salarioBase <= 2500.00) {
			pl = this.salarioBase * 0.1;
		}else if(this.salarioBase <= 3500.00) {
			pl = this.salarioBase * 0.15;
		}else {
			pl = this.salarioBase * 0.2;
		}
		return pl;
	}
	
	// sobrescrita de metodos
	public double calculaPl(double valorSoma) {
		return (this.salarioBase * 0.15) + valorSoma;
	}
	
	public String toString() {
		return "Nome " + this.nome 
				+ "\t Salario " +this.salarioBase
				+ "\t CPF " +this.cpf;
				
	}
}
