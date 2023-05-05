package aula8;
import java.util.Scanner;
import java.util.ArrayList;

public class Banco {
	public static void main(String args []) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Conta> listaConta = new ArrayList<>();
		String menu = "---------Banco---------\n"
				+ "1 - Cadastrar Conta \n"
				+ "2 - Listar Contas \n"
				+ "3 - Editar Conta \n"
				+ "0 - Sair";
		int option = 0;
		do {
			System.out.println(menu);
			option = leitor.nextInt();
			leitor.reset();
			
			switch(option) {
				case 1: 
				Conta c = new Conta(); 
				// cria e alimenta objeto Conta
				System.out.println("Digite o nome do cliente: ");
				c.setTitular(leitor.next()); // lê e passa parametro
				leitor.reset();
				
				
				System.out.println("Digite o CPF do titular: ");
				c.setCpfTitular(leitor.next());
				leitor.reset();
				
				System.out.println("Digite a agencia da conta: ");
				c.setAgencia(leitor.next());
				leitor.reset();
				
				System.out.println("Digite o numero da conta:  ");
				c.setNumeroConta(leitor.next());
				leitor.reset();
				
				c.setSaldo(0.0);
				c.setLimite(100.00);;
				// Adiciona no Array
				listaConta.add(c);
				break;
				
				case 2:
					
					for(Conta item : listaConta) {
						System.out.println(item.toString()); //---------------- Exibe dados do objeto
					}
				break;
				
				case 3: 
					System.out.println("Função nao implementada");
				break;
				
				
				default:
					System.out.println("Opcao invalida!");
					
					
			}
		}while(option != 0);
		leitor.close();
		
		
	}
}
