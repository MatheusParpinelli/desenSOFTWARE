package exercicio2;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private String email;
    private ArrayList<String> telefones;
    private Endereco enderecoComercial;
    private Endereco enderecoResidencial;
    
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
        telefones = new ArrayList<String>();
        enderecoComercial = null;
        enderecoResidencial = null;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }
    
    public void removerTelefone(String telefone) {
        telefones.remove(telefone);
    }
    
    public boolean temTelefone(String termo) {
        for (String telefone : telefones) {
            if (telefone.contains(termo)) {
                return true;
            }
        }
        return false;
    }
    
    public void setEnderecoComercial(Endereco endereco) {
        enderecoComercial = endereco;
    }
    
    public void setEnderecoResidencial(Endereco endereco) {
        enderecoResidencial = endereco;
    }
    
    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }
    
    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }
}
