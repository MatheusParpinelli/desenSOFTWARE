package aula16;

public class GeradorDeFormas {
	public static void main(String args []) {
		Triangulo triangulo = new Triangulo("Novo", 15.0, 7.0);
		System.out.println("A area do triangulo e:" + triangulo.area());
		
		Retangulo retangulo = new Retangulo(3.0, 3.0);
		System.out.println("A area do retangulo e:" + retangulo.area());
		
		Desenhista d = new Desenhista();
		d.setAnoNasc(1998);
		d.setNome("Matheus");
		System.out.println("A idade do " + d.getNome() + " e " + d.calcularIdade(2023));
		
		Circulo circulo = new Circulo(10.0);
		System.out.println("A area do circulo e: " + circulo.area());
		
	}

}
