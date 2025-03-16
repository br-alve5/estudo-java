import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo numero");
        int parametroDois = terminal.nextInt();

        try {

            // chamando o metodo contendo a logica de contagem
                contar(parametroUm, parametroDois);        

        } catch (ParametroInvalidoException exception) {
            //imprimir a mensagem de erro
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        // validar se parametroUm é maior q parametroDois e lançar a exceçao
        if(parametroDois < parametroUm)
            throw new ParametroInvalidoException();

        // int contagem = parametroDois - parametroUm;
        // realizar o FOR para imprimir os numeros com base na variavel contagem
        for (int contagem = parametroUm; contagem <= parametroDois; contagem++){
            System.out.println("Imprimindo o numero: " + contagem);
        }
    }
}
