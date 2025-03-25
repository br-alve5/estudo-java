public record Circulo(double raio) implements CalcularFormaGeometrica {

    private static final double pi = 3.14;

    @Override
    public double Area() {
        return pi * (raio * raio);
    }
}
