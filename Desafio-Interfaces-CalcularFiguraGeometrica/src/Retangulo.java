public record Retangulo(double altura, double base) implements CalcularFormaGeometrica {

    @Override
    public double Area() {
        return altura * base;
    }
}
