package exercicio1;

public class House {
    private String color;
    private Door door1;
    private Door door2;
    private Door door3;
    
    public House(String color, Door door1, Door door2, Door door3) {
        this.color = color;
        this.door1 = door1;
        this.door2 = door2;
        this.door3 = door3;
    }
    
    public void paint(String color) {
        this.color = color;
    }
    
    public int howManyDoorsAreOpen() {
        int count = 0;
        
        if (door1.isOpen()) {
            count++;
        }
        
        if (door2.isOpen()) {
            count++;
        }
        
        if (door3.isOpen()) {
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Door door1 = new Door("blue", 80, 200, 10);
        Door door2 = new Door("red", 90, 220, 10);
        Door door3 = new Door("green", 70, 190, 10);
        
        House house = new House("white", door1, door2, door3);
        
        door1.open();
        door2.open();
        door3.close();
        
        System.out.println("Number of open doors: " + house.howManyDoorsAreOpen());
    }
}
