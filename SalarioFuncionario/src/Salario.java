import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        float valorSalario = entrada.nextFloat();
        float valorBeneficios = entrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
        // Atribui a aliquota de 5% mediante o salario
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            // Atribui a aliquota de 10% mediante o salario
            valorImposto = 0.10f * valorSalario;
        } else {
            // Atribui a aliquota de 15% mediante o salario
            valorImposto = 0.15f * valorSalario;
        } 

        // calcula e imprime a saida (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
