public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1500;

        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        short numeroCurto2 = (short) numeroInteiro;

        int numero = 1;

        numero = 2;

        System.out.println(numero);

        double valor_de_pi = 3.14;
        valor_de_pi = 10.41;
        System.out.println(valor_de_pi);

        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 14.24; - não pode ser alterado.
        System.out.println(VALOR_DE_PI);

    }
}
