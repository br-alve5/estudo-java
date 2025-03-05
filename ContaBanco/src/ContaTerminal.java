import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /*
         * int numero
         * String nomeCliente
         * String agencia
         * double saldo
        */

        // fornecer o nome
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();
        
        // fornecer o numero da conta
        System.out.println("Digite o numero da conta:");
        int numero = scanner.nextInt();

        // fornecer o numero da agencia
        System.out.println("Digite a agencia:");
        String agencia = scanner.next();
        
        // fornecer o valor do saldo
        System.out.println("Digite o valor de deposito:");
        double saldo = scanner.nextDouble();

        // imprimir informaçoes
        System.out.println("Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é "
        + agencia + " conta " + numero + " e seu saldo de R$" + saldo + " ja está disponivel para saque.");

    }
}
