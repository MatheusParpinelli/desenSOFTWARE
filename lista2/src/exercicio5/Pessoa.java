package exercicio5;

public class Pessoa {
    private String cpf;
    private int idade;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Teste da classe Pessoa
        Pessoa pessoa1 = new Pessoa("123.456.789-00");
        System.out.println("CPF da pessoa1: " + pessoa1.getCpf());

        Pessoa pessoa2 = new Pessoa(30);
        System.out.println("Idade da pessoa2: " + pessoa2.getIdade());
        pessoa2.setIdade(31);
        System.out.println("Nova idade da pessoa2: " + pessoa2.getIdade());
    }
}
