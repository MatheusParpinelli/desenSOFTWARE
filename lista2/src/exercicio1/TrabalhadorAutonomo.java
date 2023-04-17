package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabalhadorAutonomo {

    private ArrayList<Double> vendas;
    private double excesso;
    private double multa;

    public TrabalhadorAutonomo() {
        vendas = new ArrayList<Double>();
        excesso = 0;
        multa = 0;
    }

    public void cadastrarVenda(double valor) {
        vendas.add(valor);
    }

    public void calcularExcessoEMulta() {
        double total = 0;

        for (double venda : vendas) {
            total += venda;
            if (venda > 500) {
                excesso += venda - 500;
            }
        }

        if (excesso > 0) {
            multa = excesso * 0.1;
        }
    }

    public void mostrarExcessoEMulta() {
        if (excesso > 0) {
            System.out.printf("Excesso: R$ %.2f\n", excesso);
            System.out.printf("Multa: R$ %.2f\n", multa);
        } else {
            System.out.println("Excesso: ZERO");
            System.out.println("Multa: ZERO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrabalhadorAutonomo trab = new TrabalhadorAutonomo();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastro de vendas");
            System.out.println("2 - Consulta de imposto a pagar no mes");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da venda: R$ ");
                    double valor = sc.nextDouble();
                    trab.cadastrarVenda(valor);
                    break;
                case 2:
                    trab.calcularExcessoEMulta();
                    trab.mostrarExcessoEMulta();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao inválida!");
            }
        }

        sc.close();
    }
}
