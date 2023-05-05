package aula10;
import java.util.Scanner;
import java.util.ArrayList;

public class Banco {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> listaConta = new ArrayList<>();
		String menu = "--- Banco ---\n"
				+ "1 - Cadastrar Conta \n"
				+ "2 - Cadastrar Cliente\n"
				+ "3 - Listar Contas \n"
				+ "4 - Listar Clientes \n"
				+ "5 - Editar Conta \n"
				+ "6 - Editar Cliente \n"
				+ "0 - Sair";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			
			switch(option) {
				case 1:
					// --- Cria objeto Conta e add na lista
					break;
				case 2:
					// --- Cria objeto Cliente e add na lista
					break;
				case 3:
					// Imprime objetos 
					break;
				case 4: 
					// Imprime objetos
					break;
				case 5: 
					System.out.println("EDITAR - Funcao nao impelemntada");
					break;
				case 6: 
					System.out.println("EDITAR - Funcao nao impelemntada");
					break;
				case 0:
					System.out.println("Encerrando o sistema...");
					break;
				default:
					System.out.println("Opcao invalida");
			}
		}while(option != 0);
		sc.close();
	}
}