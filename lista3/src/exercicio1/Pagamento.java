package exercicio1;

//Classe para representar um pagamento
public class Pagamento {
private double valor;
private String tipo;

public Pagamento(double valor, String tipo) {
   this.valor = valor;
   this.tipo = tipo;
}

public double getValor() {
   return valor;
}

public String getTipo() {
   return tipo;
}
}