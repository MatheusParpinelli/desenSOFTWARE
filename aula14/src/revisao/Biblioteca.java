package revisao;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> acervo;

    // Construtor sem parâmetros
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    // Construtor com parâmetros
    public Biblioteca(ArrayList<Livro> acervo) {
        this.acervo = acervo;
    }

    // Métodos de acesso
    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(ArrayList<Livro> acervo) {
        this.acervo = acervo;
    }

    // Método que adiciona um novo livro ao acervo da biblioteca
    public void adicionaNovoLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro adicionado ao acervo.");
    }

    // Método que remove um livro do acervo da biblioteca pelo número do exemplar
    public void removeLivro(int numeroExemplar) {
        for (Livro livro : acervo) {
            if (livro.getNumeroExemplar() == numeroExemplar) {
                acervo.remove(livro);
                System.out.println("Livro removido do acervo.");
                return;
            }
        }
        System.out.println("Livro não encontrado no acervo.");
    }

}