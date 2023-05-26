package exercicio2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    
    public Agenda() {
        contatos = new ArrayList<Contato>();
    }
    
    public void adicionarContato(Contato c) {
        contatos.add(c);
    }
    
    public void removerContato(Contato c) {
        contatos.remove(c);
    }
    
    public ArrayList<Contato> buscarContatos(String termo) {
        ArrayList<Contato> resultados = new ArrayList<Contato>();
        for (Contato c : contatos) {
            if (c.getNome().contains(termo) || c.getEmail().contains(termo) || c.temTelefone(termo)) {
                resultados.add(c);
            }
        }
        return resultados;
    }
}



