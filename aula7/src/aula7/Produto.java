package aula7;
//nome da classe igual ao do arquivo

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	//metodos da classe
	public double calculaDesconto() {
		double desconto = 0.0;
		
		if(this.quantidade <= 10) {
			desconto = 0.0;
		}else if(this.quantidade > 10 && this.quantidade <= 20) {
			desconto = (this.quantidade * this.preco) * 0.9;
		}
	}
	
	
		
}
