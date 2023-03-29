package aula4;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class Sistema {
	public static void main(String [] args) {
		// Criar um programa que receba a quantidade de alunos
		// que o professor deseja registrar.
		// Guarde o nome e a nota de cada aluno em um vetor
		// Calcule a média, maior e menor nota da turma.
		
		// Declaração de Array
		String alunos[] = new String[10];
		double notas[] = new double[10];
		Scanner leitor = new Scanner(System.in);
		// Leia os nomes
		int i = 0;
		while(i < alunos.length) {
			alunos[i] = JOptionPane.showInputDialog( null,
					"Digite o nome do aluno " + i);
			String notaTemp = JOptionPane.showInputDialog( null, 
					"Digite a nota de " + alunos[i]);
			//double nota = Double.parseDouble(notaTemp);
			//notas[i] = nota;
			notas[i] = Double.parseDouble(notaTemp);
		i++;
			}
		
		
	leitor.close();
	}
}
