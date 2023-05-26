package exercicio3;
import java.util.*;

public class ControleEmprestimoFerramentasMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");

        Ferramenta ferramenta1 = new Ferramenta("Martelo");
        Ferramenta ferramenta2 = new Ferramenta("Chave de Fenda");
        Ferramenta ferramenta3 = new Ferramenta("Serra Elétrica");

        ControleEmprestimoFerramentas controle = new ControleEmprestimoFerramentas();

        controle.adicionarPessoa(pessoa1);
        controle.adicionarPessoa(pessoa2);
        controle.adicionarFerramenta(ferramenta1);
        controle.adicionarFerramenta(ferramenta2);
        controle.adicionarFerramenta(ferramenta3);

        controle.realizarEmprestimo(pessoa1, ferramenta1);
        controle.realizarEmprestimo(pessoa2, ferramenta2);

        System.out.println("Pessoas:");
        for (Pessoa pessoa : controle.getPessoas()) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("\nFerramentas:");
        for (Ferramenta ferramenta : controle.getFerramentas()) {
            System.out.println(ferramenta.getNome());
        }

        System.out.println("\nEmpréstimos:");
        for (Emprestimo emprestimo : controle.getEmprestimos()) {
            System.out.println("Pessoa: " + emprestimo.getPessoa().getNome() + ", Ferramenta: " + emprestimo.getFerramenta().getNome()
                    + ", Data do Empréstimo: " + emprestimo.getDataEmprestimo());
        }

        System.out.println("\nRelatório de Ferramentas Emprestadas:");
        List<Ferramenta> ferramentasEmprestadas = controle.getFerramentasEmprestadas();
        if (ferramentasEmprestadas.isEmpty()) {
            System.out.println("Nenhuma ferramenta emprestada no momento.");
        } else {
            for (Ferramenta ferramenta : ferramentasEmprestadas) {
                System.out.println(ferramenta.getNome());
            }
        }
    }
}
