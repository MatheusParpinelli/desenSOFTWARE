package aula7;

public class Sistema {
	public static void main(String [] args) {
		System.out.println("Ola");
		Produto objeto1 = new Produto();
		objeto1.nome = "Cerveja";
		objeto1.preco = 3.99;
		objeto1.quantidade = 6;
		
		Produto objeto2 = new Produto();
		objeto2.nome = "Espetinho";
		objeto2.preco = 8.00;
		objeto2.quantidade = 3;
		
		System.out.println("Os produto " + objeto2.nome
				+ " Recebeu desconto de R$" + objeto2.calculaDesconto());
		
		
		
	}

}
