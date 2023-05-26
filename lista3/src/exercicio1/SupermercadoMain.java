package exercicio1;

public class SupermercadoMain {
	 public static void main(String[] args) {
	     // Criação de alguns produtos
	     Produto produto1 = new Produto("Arroz", 10.0, 0.05, 20);
	     Produto produto2 = new Produto("Feijão", 8.0, 0.05, 30);
	     Produto produto3 = new Produto("Óleo de Soja", 5.0, 0.1, 15);

	     // Criação de um pedido
	     Pedido pedido = new Pedido();

	     // Adiciona itens ao pedido
	     pedido.adicionarItem(produto1, 2);
	     pedido.adicionarItem(produto2, 3);
	     pedido.adicionarItem(produto3, 1);

	     // Criação do supermercado
	     Supermercado supermercado = new Supermercado();

	     // Adiciona produtos ao supermercado
	     supermercado.adicionarProduto(produto1);
	     supermercado.adicionarProduto(produto2);
	     supermercado.adicionarProduto(produto3);

	     // Realiza o pedido no supermercado
	     supermercado.realizarPedido(pedido);

	     // Exibe o valor total e o valor de impostos do pedido
	     supermercado.exibirValorTotal(pedido);
	     supermercado.exibirValorImpostos(pedido);
	 }
	}
