package exercicio6;
import java.util.*;

public class CaminhaoBeta extends Caminhao {
    private boolean pluviometroInserido;

    public CaminhaoBeta() {
        super(Integer.MAX_VALUE); // Capacidade máxima indefinida
        pluviometroInserido = false;
    }

    @Override
    public void inserePluviometro(Pluviometro pluviometro) {
        // Lógica para inserir o pluviômetro no caminhão Beta
        // Implementação fictícia apenas para exemplo
        if (!pluviometroInserido) {
            System.out.println("Pluviômetro do tipo " + pluviometro.getTipo() + " inserido no caminhão Beta.");
            pluviometroInserido = true;
        } else {
            System.out.println("Não é possível inserir outro pluviômetro no caminhão Beta.");
        }
    }
}