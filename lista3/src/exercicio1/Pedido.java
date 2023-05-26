package exercicio1;
import java.util.*;

public class Pedido {
private List<ItemPedido> itens;
private double valorTotal;
private double valorImpostos;

public Pedido() {
   itens = new ArrayList<>();
   valorTotal = 0.0;
   valorImpostos = 0.0;
}

public void adicionarItem(Produto produto, int quantidade) {
   if (produto.getQuantidadeEmEstoque() >= quantidade) {
       ItemPedido item = new ItemPedido(produto, quantidade);
       itens.add(item);
       produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
       double precoItem = produto.getPreco() * quantidade;
       double impostoItem = precoItem * produto.getAliquotaImposto();
       valorTotal += precoItem;
       valorImpostos += impostoItem;
   } else {
       System.out.println("Não há quantidade suficiente em estoque para o produto " + produto.getNome());
   }
}

public double getValorTotal() {
   return valorTotal;
}

public double getValorImpostos() {
   return valorImpostos;
}
}
