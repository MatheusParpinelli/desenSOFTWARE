package exercicio2;

public class Boleto {
    
    private double valorOriginal;
    private int diasAtraso;
    
    public Boleto(double valorOriginal, int diasAtraso) {
        this.valorOriginal = valorOriginal;
        this.diasAtraso = diasAtraso;
    }
    
    public double getValorTotal() {
        double valorTotal = valorOriginal;
        
        // calcula a multa de 5% sobre o valor original
        if (diasAtraso > 0) {
            double multa = valorOriginal * 0.05;
            valorTotal += multa;
        }
        
        // calcula os juros de 1% por dia de atraso (juros sobre juros)
        for (int i = 1; i <= diasAtraso; i++) {
            double juros = valorTotal * 0.01;
            valorTotal += juros;
        }
        
        return valorTotal;
    }
    
    public static void main(String[] args) {
        Boleto boleto = new Boleto(300.00, 2);
        System.out.printf("Valor total a ser pago: R$ %.2f", boleto.getValorTotal());
    }
}
