import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner informacao = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = informacao.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = informacao.next();

        System.out.println("Digite sua idade");
        int idade = informacao.nextInt();

        System.out.println("Digite sua altura");
        double altura = informacao.nextDouble();

        // Imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
