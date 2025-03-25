import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        int opcao = -1;
        CalcularFormaGeometrica calcularFormaGeometrica = null;

        while (opcao >= 1 && opcao <= 3) { 
            System.out.println("Escolha a forma geometrica para calcular a area:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");

            if (opcao == 1){
                criarQuadrado();
            } else if (opcao == 2){
                criarRetangulo();
            } else if (opcao == 3){
                criarCirculo();
            } else if (opcao == 4){
                break;
            } else {
                System.out.println("Opção invalida!");
                continue;
            }
            System.out.println("O resultado do calculo da area foi de: " + calcularFormaGeometrica.Area());
        }
    }

    private static CalcularFormaGeometrica criarQuadrado(){
        System.out.println("Informe os tamanhos dos lados:");
        var lados = scanner.nextDouble();

        return new Quadrado(lados);
    }

    private static CalcularFormaGeometrica criarRetangulo(){
        System.out.println("Informe o tamanho da base:");
        var base = scanner.nextDouble();

        System.out.println("Informe o tamanho da altura:");
        var altura = scanner.nextDouble();

        return new Retangulo(altura, base);
    }

    private static CalcularFormaGeometrica criarCirculo(){
        System.out.println("Informe o raio:");
        var raio = scanner.nextDouble();

        return new Circulo(raio);
    }
}
