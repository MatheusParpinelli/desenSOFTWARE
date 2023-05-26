package exercicio1;

public class SupermercadoMain {
	 public static void main(String[] args) {
	     Produto produto1 = new Produto("Arroz", 10.0, 0.05, 20);
	     Produto produto2 = new Produto("Feijão", 8.0, 0.05, 30);
	     Produto produto3 = new Produto("Óleo de Soja", 5.0, 0.1, 15);

	     Pedido pedido = new Pedido();
	     pedido.adicionarItem(produto1, 2);
	     pedido.adicionarItem(produto2, 3);
	     pedido.adicionarItem(produto3, 1);

	     Supermercado supermercado = new Supermercado();

	     supermercado.adicionarProduto(produto1);
	     supermercado.adicionarProduto(produto2);
	     supermercado.adicionarProduto(produto3);

	     supermercado.realizarPedido(pedido);

	     supermercado.exibirValorTotal(pedido);
	     supermercado.exibirValorImpostos(pedido);
	 }
	}
