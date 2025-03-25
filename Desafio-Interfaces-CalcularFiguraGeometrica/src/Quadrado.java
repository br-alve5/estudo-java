public record Quadrado(double lados) implements CalcularFormaGeometrica {

    @Override
    public double Area() {
        return lados * lados;
    }
}
