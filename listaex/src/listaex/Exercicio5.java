package listaex;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        String[] calendario = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "June", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o mes : ");
        int mes = leitor.nextInt();
        
        leitor.close();

        if (mes < 1 || mes > 12) {
            System.out.print("Invalido!");
        } else {
            System.out.print(calendario[mes - 1]);
        }
    }
}