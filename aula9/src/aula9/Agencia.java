package aula9;

public class Agencia {
	String cidade;
	String numeroAgencia;
	Funcionario FuncAg;
	
	public String toString() {
		return "\t Cidade " + this.cidade +
				"\t Numero " + this.numeroAgencia +
				"\n Funcionario " + this.FuncAg.toString();
	}
}
