public class Operadores {
    public static void main(String[] args) throws Exception {

        /* --------------------
        
        // OPERADORES ARITIMETICOS
        
        double soma = 10.5 + 13.2;
        int subtracao = 113 - 24;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);


        // obs sobre o operador de ADIÇÃO
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1"; // = 31
            System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1; // = 1111
            System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1"; // = 1111
            System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1; // = 1111
            System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1); // = 13
            System.out.println(concatenacao);
        
        -------------- */


        /* ----------
        
        // OPERADORES UNÁRIOS
        int numero = 5;
        
        numero = - numero; // transforma o numero em negativo
            System.out.println(numero);
        
        numero = numero * -1; // converte o numero novamente para positivo
            System.out.println(numero);
        
        ------------- */


        /*
        
        // INCREMENTAÇÃO e DECREMENTAÇÃO
        
        int numero = 5;
        
        // x repetião
        
        //numero = numero +1;
        numero++;
        
        System.out.println( numero );
        

        // NEGAÇÃO

        boolean variavel = false;

        variavel = !variavel;

        System.out.println( variavel );

        */

        /*
        
        // OPERADOR TERNÁRIO

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" :"falso";

            System.out.println(resultado);

        */

        /*

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 == numero2){
            System.out.println("a condição é verdadeira.");
        } else {
            System.out.println("a condição é falsa.");
        }

        String nomeUm = "Bruno";
        String nomeDois = new String("Bruno");

        System.out.println(nomeUm.equals(nomeDois)); //metodo para comparar conteudos ou objetos.

        */

        // OPERADORES LOGICOS
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condicoes sao verdadeiras.");
        }
        
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes e verdadeira.");
        }
        
    }
}
