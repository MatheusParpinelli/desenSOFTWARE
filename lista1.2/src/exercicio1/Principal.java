package exercicio1;

public class Principal {
    public static void main(String[] args) {
        Door door = new Door("Branca", 80, 200, 5);
        
        door.open(); // A porta foi aberta.
        door.close(); // A porta foi fechada.
        
        door.paint("Azul"); // A porta foi pintada de Azul.
        door.paint("Vermelho"); // A porta foi pintada de Vermelho.
        
        door.setDimensions(90, 210, 6); // As dimensões da porta foram alteradas para 90x210x6.
        
        if (door.isOpen()) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        } // A porta está fechada.
    }
}
