package exercicio6;


public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);

        //acessando os atributos da Pessoa utilizando os métodos get
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        //modificando os atributos da Pessoa utilizando os métodos set
        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        //imprimindo os atributos atualizados da Pessoa
        System.out.println("Nome atualizado: " + pessoa.getNome());
        System.out.println("Idade atualizada: " + pessoa.getIdade());
    }
}

