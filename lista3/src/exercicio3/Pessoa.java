package exercicio3;

import java.util.*;

//Classe para representar uma pessoa
class Pessoa {
 private String nome;

 public Pessoa(String nome) {
     this.nome = nome;
 }

 public String getNome() {
     return nome;
 }
}

//Classe para representar uma ferramenta
class Ferramenta {
 private String nome;
 private boolean emprestada;

 public Ferramenta(String nome) {
     this.nome = nome;
     this.emprestada = false;
 }

 public String getNome() {
     return nome;
 }

 public boolean isEmprestada() {
     return emprestada;
 }

 public void setEmprestada(boolean emprestada) {
     this.emprestada = emprestada;
 }
}

//Classe para representar um empréstimo
class Emprestimo {
 private Pessoa pessoa;
 private Ferramenta ferramenta;
 private Date dataEmprestimo;

 public Emprestimo(Pessoa pessoa, Ferramenta ferramenta) {
     this.pessoa = pessoa;
     this.ferramenta = ferramenta;
     this.dataEmprestimo = new Date();
     ferramenta.setEmprestada(true);
 }

 public Pessoa getPessoa() {
     return pessoa;
 }

 public Ferramenta getFerramenta() {
     return ferramenta;
 }

 public Date getDataEmprestimo() {
     return dataEmprestimo;
 }
}

//Classe para o controle do empréstimo de ferramentas
class ControleEmprestimoFerramentas {
 private List<Pessoa> pessoas;
 private List<Ferramenta> ferramentas;
 private List<Emprestimo> emprestimos;

 public ControleEmprestimoFerramentas() {
     pessoas = new ArrayList<>();
     ferramentas = new ArrayList<>();
     emprestimos = new ArrayList<>();
 }

 public void adicionarPessoa(Pessoa pessoa) {
     pessoas.add(pessoa);
 }

 public void adicionarFerramenta(Ferramenta ferramenta) {
     ferramentas.add(ferramenta);
 }

 public void realizarEmprestimo(Pessoa pessoa, Ferramenta ferramenta) {
     Emprestimo emprestimo = new Emprestimo(pessoa, ferramenta);
     emprestimos.add(emprestimo);
 }

 public List<Ferramenta> getFerramentasEmprestadas() {
     List<Ferramenta> ferramentasEmprestadas = new ArrayList<>();
     for (Emprestimo emprestimo : emprestimos) {
         ferramentasEmprestadas.add(emprestimo.getFerramenta());
     }
     return ferramentasEmprestadas;
 }

 public List<Pessoa> getPessoas() {
     return pessoas;
 }

 public List<Ferramenta> getFerramentas() {
     return ferramentas;
 }

 public List<Emprestimo> getEmprestimos() {
     return emprestimos;
 }
}

