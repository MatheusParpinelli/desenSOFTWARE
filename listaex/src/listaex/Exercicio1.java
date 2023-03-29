package listaex;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");

        int num = leitor.nextInt();

        leitor.close();

        int valor1 = 1, valor2 = 1, fibonacci = 0;
        boolean valide = false;

        while(fibonacci <= num){
            if(fibonacci == num){
                valide = true;
                break;
            }
            fibonacci = valor1 + valor2;
            valor1 = valor2;
            valor2 = fibonacci;
        }
        if(valide){
            System.out.print(num + " E uma sequencia de Finobacci");
        }else {
            System.out.print(num + " Nao e uma sequencia de Finobacci");
        }
    }
	
}

	

