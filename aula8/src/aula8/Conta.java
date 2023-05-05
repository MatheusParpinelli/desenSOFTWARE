package aula8;

public class Conta {
	private String titular; // nome do cliente
	private String cpfTitular;
	private String agencia; // numero da agencia do banco
	private String numeroConta;
	private double saldo;
	private double limite;
	
	// get= let um atributo do objeto
	// set= editar um atributo do objeto
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getCpfTitular() {
		return this.cpfTitular;
	}
	
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double Saldo) {
		this.saldo = Saldo;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double Limite) {
		this.limite = Limite;
	}
	
	public String toString() {
		String texto = "Agencia: " + this.agencia
				+ "\t Conta: " + this.numeroConta
				+ "\t CPF: " + this.cpfTitular 
				+ "\t Nome: " + this.titular 
				+ "\t Saldo: " + this.saldo
				+ "\t Limite: " + this.limite;
		return texto;
	
	}
	
	
	
	
}
