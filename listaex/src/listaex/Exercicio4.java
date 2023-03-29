package listaex;

import java.util.*;


public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 20, 30, 40, 50, 60};

        ArrayList <Integer> numeros2 = new ArrayList<>();

        for (int i : numeros) {
            if (!numeros2.contains(i)) {
                numeros2.add(i);
            }
        }
        System.out.print(Arrays.toString(numeros2.toArray()));
    }
}
