package exercicio3;

import java.util.Scanner;

public class ControlePoluicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o indice de poluicao medido: ");
        double indicePoluicao = scanner.nextDouble();

        if (indicePoluicao >= 0.06 && indicePoluicao <= 0.16) {
            System.out.println("Indice de poluicao aceitável.");
        } else if (indicePoluicao > 0.16 && indicePoluicao <= 0.24) {
            System.out.println("Atencao! Indice de poluicao acima do aceitavel.");
        } else if (indicePoluicao > 0.24 && indicePoluicao <= 0.39) {
            System.out.println("Indústrias do 1º grupo intimadas a reduzir em 50% suas atividades.");
        } else if (indicePoluicao > 0.39 && indicePoluicao <= 0.49) {
            System.out.println("Indústrias do 1º e 2º grupo intimadas a suspenderem suas atividades.");
        } else if (indicePoluicao >= 0.5) {
            System.out.println("Todos os grupos devem paralisar suas atividades imediatamente.");
        } else {
            System.out.println("Índice de poluição inválido.");
        }

        scanner.close();
    }
}
