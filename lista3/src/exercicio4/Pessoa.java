package exercicio4;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pai = null;
        this.mae = null;
    }
    
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public Pessoa getPai() {
        return pai;
    }
    
    public Pessoa getMae() {
        return mae;
    }
    
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
    public String toString() {
        String str = "Nome: " + nome + "\n" +
                     "Idade: " + idade + "\n";
        if (pai != null) {
            str += "Pai: " + pai.getNome() + "\n";
        }
        if (mae != null) {
            str += "Mãe: " + mae.getNome() + "\n";
        }
        return str;
    }
}


