package exercicio4;

import java.util.ArrayList;



public class Cidade {
    private ArrayList<Habitante> habitantes;

    public Cidade() {
        habitantes = new ArrayList<>();
    }

    // método para registrar um novo habitante
    public void registrarHabitante(Habitante h) {
        habitantes.add(h);
    }

    // método para calcular a média salarial do grupo
    public double mediaSalario() {
        double total = 0;
        for (Habitante h : habitantes) {
            total += h.getRenda();
        }
        return total / habitantes.size();
    }

    // método para encontrar a maior idade do grupo
    public int maiorIdade() {
        int maxIdade = Integer.MIN_VALUE;
        for (Habitante h : habitantes) {
            if (h.getIdade() > maxIdade) {
                maxIdade = h.getIdade();
            }
        }
        return maxIdade;
    }

    // método para encontrar a menor idade do grupo
    public int menorIdade() {
        int minIdade = Integer.MAX_VALUE;
        for (Habitante h : habitantes) {
            if (h.getIdade() < minIdade) {
                minIdade = h.getIdade();
            }
        }
        return minIdade;
    }

    // método para contar o número de habitantes do gênero masculino com salário até R$ 1000,00
    public int qtdMasculinoAteMil() {
        int count = 0;
        for (Habitante h : habitantes) {
            if (h.getGenero() == 'M' && h.getRenda() <= 1000) {
                count++;
            }
        }
        return count;
    }

    // método para contar o número de habitantes do gênero feminino
    public int qtdFeminino() {
        int count = 0;
        for (Habitante h : habitantes) {
            if (h.getGenero() == 'F') {
                count++;
            }
        }
        return count;
    }
}