import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = { "BRUNO", "JORGE", "MATHEUS", "JULIA", "SABRINA"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

      //  selecaoCandidatos();
      //  imprimirSelecionados();
    }
    static void selecaoCandidatos() {
        String [] candidatos = { "FELIPE", "BRUNO", "JORGE", "MATHEUS", "JULIA", "SABRINA", "LUIZ", "ANA", "MIKAEL", "ANDRE"};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                    candidatosSelecionados++;
                }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2100);
    }

    static void imprimirSelecionados(){
        String [] candidatos = { "FELIPE", "BRUNO", "JORGE", "MATHEUS", "JULIA", "SABRINA", "LUIZ", "ANA", "MIKAEL", "ANDRE"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato numero " + (indice+1) + " e o " + candidatos[indice]);
        }
        
        //forma abreviada da interação FOR EACH
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu =  false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println(candidato + " NAO ATENDEU.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

/*    static void analisarCandidato(double salarioPretendido) {         // METODO SEM UTILIDADE
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){   
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }   */
}
