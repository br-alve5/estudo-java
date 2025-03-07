public class Composta {
    public static void main(String[] args) {
        // Exemplo de uma estrutura condicional composta de um resultado escolar.

        /*
        int nota = 8;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        */

        // CONDICIONAIS ENCADEADAS
        int nota = 8;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperacao");

        else 
            System.out.println("Reprovado");
        

    }
}
