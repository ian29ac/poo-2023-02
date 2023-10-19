public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] figuras = {
                new Circulo(3),
                new Retangulo(3,4),
                new Triangulo(4,10),
        };

        double soma = CalculadoraArea.calcularSoma(figuras);
        System.out.println("Soma das áreas: " + soma);
    }
}
