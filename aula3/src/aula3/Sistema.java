package aula3;

import java.util.Scanner;

public class Sistema {
	public static void main(String args []) {
		// menu com 4 opcoes se receber 0 sai.
		String menu = "Escolha uma opcao \n"
				+ " ---- MENU ----\n"
				+ "1 - Tabuada do numero escolhido \n"
				+ "2 - Testando continue \n"
				+ "3 - Utilizando Arrays \n"
				+ "0 - SAIR";
		
		Scanner leitor = new Scanner(System.in);
		int option = 0;
		
		do{
			System.out.println(menu);
			option = leitor.nextInt();
			switch(option) {
				case 1: System.out.println("Digite um numero e visualize a tabuada");
					int tabuada = leitor.nextInt();
					for(int i = 1; i <= 10; i++) {
						System.out.println(tabuada + "x" + i+ " = " + (tabuada * i));
					}
					break;
				
				case 2: 
					for(int i=0; i<=100; i++) {
						if(i%3 == 0) {
							System.out.print(i);
						}
						System.out.println(" Proximo valor");
					}
					break;
				
				case 3: System.out.println("Digite 10 nomes para colocar no array");
					// String nomes[]; // declarou array
					// nomes = new String[10]; // instancia array
					String nomes[] = new String[10]; // idem a 39 e 40
					for(int i = 0; i < nomes.length; i++) {
						System.out.println("Digite o nome da posicao " + i);
						nomes[i] = leitor.next();
					}
					
					break;
				
				case 0: System.out.println("SAIR");
					break;
				
				default: System.out.println("Valor digitado e invalido!");
			}
		}while(option!=0);
		
		leitor.close();
	}
}