/*

    EXEMPLO DE ESCOPO

*/

public class Conta {

        //variavel da classe conta
        double saldo = 10.0;

        public void sacar(Double valor){
            //variavel local de método
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo(){
            //disponivel em toda classe
            System.out.println(saldo);
            // System.out.println(novoSaldo); somente o método sacar conhece esta variavel
        }

        public double calcularDividaExponencial(){
            //variavel local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variavel de bloco
            for(int x=1; x<=5; x++) {
                // x variavel de escopo
                // essa variavel sera reiniciada a cada execuçao
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            // escopo de fluxo
            // x e o valorCalculado nunca estarão disponiveis fora do bloco
            return valorMontante;
        }

}