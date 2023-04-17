package exercicio7;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30, "12345678901"); //CPF válido
        Pessoa pessoa2 = new Pessoa("Maria", 25, "12345"); //CPF inválido

        //imprime os atributos da Pessoa1
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());

        //tenta criar a Pessoa2, mas lança uma exceção por causa do CPF inválido
        try {
            Pessoa pessoa3 = new Pessoa("José", 40, "123"); //CPF inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); //imprime a mensagem de erro
        }
    }
}
