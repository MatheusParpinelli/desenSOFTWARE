package aula10;


public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private String nascimento;
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return this.cpf;
	}
	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNascimento() {
		return this.nascimento;
	}
	
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
}
