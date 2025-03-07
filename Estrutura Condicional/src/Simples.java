public class Simples {
    public static void main(String[] args) throws Exception {
        // Exemplo de estrutura condicional simples de um caixa eletronico.

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
