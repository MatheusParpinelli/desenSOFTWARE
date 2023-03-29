package listaex;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        
        int tempoSegundos = leitor.nextInt();
        leitor.close();

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.print(horas + " Horas " + minutos + " minutos " + segundos + " segundos. ");
    }
}