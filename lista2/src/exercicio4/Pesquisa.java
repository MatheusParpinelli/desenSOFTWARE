package exercicio4;

import java.util.Scanner;



public class Pesquisa {
    private static Scanner scanner = new Scanner(System.in);
    private static Cidade cidade = new Cidade();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Registrar habitante");
            System.out.println("2 - Media salarial do grupo");
            System.out.println("3 - Maior e menor idade do grupo");
            System.out.println("4 - Quantidade de homens com salário até R$ 1000,00");
            System.out.println("5 - Quantidade de mulheres");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    registrarHabitante();
                    break;
                case 2:
                    mediaSalarial();
                    break;
                case 3:
                    maiorEMenorIdade();
                    break;
                case 4:
                    qtdMasculinoAteMil();
                    break;
                case 5:
                    qtdFeminino();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private static void registrarHabitante() {
        System.out.print("Digite a idade do habitante: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o genero do habitante (M/F): ");
        char genero = scanner.next().charAt(0);
        System.out.print("Digite a renda do habitante: ");
        double renda = scanner.nextDouble();
        cidade.registrarHabitante(new Habitante(idade, genero, renda));
        System.out.println("Habitante registrado com sucesso!");
    }

    private static void mediaSalarial() {
        double media = cidade.mediaSalario();
        System.out.printf("Media salarial do grupo: R$ %.2f%n", media);
    }

    private static void maiorEMenorIdade() {
        int maior = cidade.maiorIdade();
        int menor = cidade.menorIdade();
        System.out.println("Maior idade do grupo: " + maior);
        System.out.println("Menor idade do grupo: " + menor);
    }

    private static void qtdMasculinoAteMil() {
        int qtd = cidade.qtdMasculinoAteMil();
        System.out.println("Quantidade de homens com salario até R$ 1000,00: " + qtd);
    }

    private static void qtdFeminino() {
        int qtd = cidade.qtdFeminino();
        System.out.println("Quantidade de mulheres: " + qtd);
    }
}