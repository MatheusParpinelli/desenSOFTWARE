package aula1;

import java.util.Scanner;
public class Principal {
	// função == método
	public static void main(String args[]) {
		// Receba 2 notas e imprima  média
		// Se a média for maior que 6 imprima aprovado
		// Se a média for menor que 6 e maior ou igual a 1 imprima EXAME
		// Se a média for menor que 1, imprima reprovado
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int nota1 = leitor.nextInt();
		
		System.out.println("Digite outro valor: ");
		int nota2 = leitor.nextInt();		
		
		int media;
		
		media = (nota1 + nota2)/2;
		
		
		System.out.println(media >=60 ? "Aprovado" : "Reprovado");
		leitor.close();
		
		}
}