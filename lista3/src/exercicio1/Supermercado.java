package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
private List<Produto> produtos;
private List<Pedido> pedidos;

public Supermercado() {
   produtos = new ArrayList<>();
   pedidos = new ArrayList<>();
}

public void adicionarProduto(Produto produto) {
   produtos.add(produto);
}

public void realizarPedido(Pedido pedido) {
   pedidos.add(pedido);
}

public void exibirValorTotal(Pedido pedido) {
   System.out.println("Valor total do pedido: R$" + pedido.getValorTotal());
}

public void exibirValorImpostos(Pedido pedido) {
   System.out.println("Valor de impostos pagos: R$" + pedido.getValorImpostos());
}
}
