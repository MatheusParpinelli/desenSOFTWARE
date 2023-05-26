package exercicio4;

public class Familia {
    public static void main(String[] args) {
        Pessoa avoMaterno1 = new Pessoa("Joao", 89);
        Pessoa avoMaterno2 = new Pessoa("Catarina", 80);
        Pessoa avoPaterno1 = new Pessoa("Antonio", 89);
        Pessoa avoPaterno2 = new Pessoa("Luzia", 78);
        Pessoa pai = new Pessoa("Valdir", 55, avoPaterno1, avoPaterno2);
        Pessoa mae = new Pessoa("Edna", 50, avoMaterno1, avoMaterno2);
        Pessoa filho = new Pessoa("Matheus", 25, pai, mae);
        
        System.out.println("Árvore Genealógica:\n");
        System.out.println(filho);
        System.out.println(filho.getPai());
        System.out.println(filho.getMae());
        System.out.println(filho.getPai().getPai());
        System.out.println(filho.getPai().getMae());
        System.out.println(filho.getMae().getPai());
        System.out.println(filho.getMae().getMae());
    }
}