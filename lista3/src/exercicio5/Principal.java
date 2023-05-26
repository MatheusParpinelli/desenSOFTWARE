package exercicio5;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        FiguraGeometrica retangulo = new Retangulo(3, 7);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        FiguraGeometrica triangulo = new Triangulo(4, 6);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

        FiguraGeometrica circulo = new Circulo(2);
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}

