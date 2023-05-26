package exercicio1;



//Classe para representar um produto
public class Produto {
	private String nome;
	private double preco;
	private double aliquotaImposto;
	private int quantidadeEmEstoque;

	public Produto(String nome, double preco, double aliquotaImposto, int quantidadeEmEstoque) {
     this.nome = nome;
     this.preco = preco;
     this.aliquotaImposto = aliquotaImposto;
     this.quantidadeEmEstoque = quantidadeEmEstoque;
 }

 public String getNome() {
     return nome;
 }

 public double getPreco() {
     return preco;
 }

 public double getAliquotaImposto() {
     return aliquotaImposto;
 }

 public int getQuantidadeEmEstoque() {
     return quantidadeEmEstoque;
 }

 public void setQuantidadeEmEstoque(int quantidade) {
     this.quantidadeEmEstoque = quantidade;
 }
}


