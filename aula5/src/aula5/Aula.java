package aula5;
import java.util.Scanner;
import java.util.ArrayList;


public class Aula {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		// Arraylist (array dinamico)
		ArrayList <String> cidades = new ArrayList<>();
		int op = 0;
		do {
			System.out.println("-----MENU----- \n"
					+ "1 - Cadastrar cidade \n"
					+ "2 - Listar cidades \n"
					+ "3 - Remover cidades \n"
					+ "0 - Sair");
			op = leitor.nextInt();
			switch(op) {
				case 1:
					System.out.println("Digite o nome da cidade");
					cidades.add(leitor.next());
					leitor.reset();
					System.out.println(cidades.size() + " cidade cadastradas");
				break;
				
				case 2:
					for(String c : cidades) {
						System.out.println(c);
					}
					break;
				case 3:
					System.out.println("Digite o nome da cidade que deseja remover:");
					String nomeDig = leitor.next();
					leitor.reset();
					for(int i = 0; i < cidades.size(); i++) {
						if(cidades.get(i).equals(nomeDig)) {
						cidades.remove(i);  //// REMOVENDO ELEMENTO
						System.out.println("Cidade deletada com sucesso");
						}
					}
						break;
						
					
					
					default: System.out.println("Valor invalido");
			}
					
		}while(op != 0);
		
		leitor.close();
	}
}
