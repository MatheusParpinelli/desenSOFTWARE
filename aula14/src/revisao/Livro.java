package revisao;

public class Livro {
    private String titulo;
    private String autor;
    private int numExemplar;
    private boolean disponivel;

    // Construtores
    public Livro(String titulo, String autor, int numExemplar) {
        this.titulo = titulo;
        this.autor = autor;
        this.numExemplar = numExemplar;
        this.disponivel = true;
    }

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.numExemplar = 0;
        this.disponivel = true;
    }

    // Métodos de acesso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumExemplar() {
        return numExemplar;
    }

    public void setNumExemplar(int numExemplar) {
        this.numExemplar = numExemplar;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método que imprime os dados do livro
    public void imprimeDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número do exemplar: " + numExemplar);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
