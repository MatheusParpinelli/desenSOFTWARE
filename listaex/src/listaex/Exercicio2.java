package listaex;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de empregados: ");
        int empregados = leitor.nextInt();

        double[] salario = new double[empregados];
        double $sumPaychecks = 0;

        for (int i = 0; i < empregados; i++) {
            System.out.print("Tipo de pagamento " + (i + 1) + ": ");
            salario[i] = leitor.nextDouble();
            $sumPaychecks += salario[i];
        }
        double mediaPagamento = $sumPaychecks / empregados;

        int $averageEmployers = 0;
        for (int i = 0; i < empregados; i++) {
            if (salario[i] > mediaPagamento) {
                $averageEmployers++;
            }
        }

        System.out.print("Media do pagamento: " + mediaPagamento);
        System.out.print("\nQuantidade de empregados com mais salario: " + $averageEmployers);
    }
}
