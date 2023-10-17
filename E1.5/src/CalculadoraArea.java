public class CalculadoraArea {
    public static double calcularSoma(FormaGeometrica[] formas) {
        double soma = 0;
        for (FormaGeometrica forma : formas) {
            soma += forma.calcularArea();
        }
        return soma;
    }
}
