package aula16;

public class Circulo extends Forma2D{
	final double pi = 3.14;
	
    public Circulo() {
		
	}
	
	public Circulo(double w) {
		super(w, "Circulo");
		
	}
	
	public double area() {
		double raio = super.getLargura() / 2;
		return Math.pow(raio , 2) * pi;
	}
	

}
