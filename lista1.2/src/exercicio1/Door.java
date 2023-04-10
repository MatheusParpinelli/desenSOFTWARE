package exercicio1;

public class Door {
    private boolean open;
    private String color;
    private int width;
    private int height;
    private int depth;
    
    public Door(String color, int width, int height, int depth) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public void open() {
        this.open = true;
        System.out.println("A porta foi aberta.");
    }
    
    public void close() {
        this.open = false;
        System.out.println("A porta foi fechada.");
    }
    
    public void paint(String color) {
        this.color = color;
        System.out.println("A porta foi pintada de " + color + ".");
    }
    
    public boolean isOpen() {
        return this.open;
    }
    
    public void setDimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("As dimensões da porta foram alteradas para " + width + "x" + height + "x" + depth + ".");
    }
}


