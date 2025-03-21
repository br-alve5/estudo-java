import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args){
        var opcao = -1;

        do { 
            System.out.println("===Escolha uma opcao===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Varificar agua da maquina");
            System.out.println("5 - Varificar shampoo da maquina");
            System.out.println("6 - Varificar se tem pet na maquina");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar o pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                
                case 1 -> petMachine.DarBanho();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verifyAgua();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.tirarPet();
                case 9 -> petMachine.limpar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }

        } while (true);
    }

    private static void setAgua(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addAgua();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyAgua(){
        var quantidade = petMachine.getAgua();
        System.out.println("A maquina esta com " + quantidade + "litros(s) de agua");
    }

    private static void verifyShampoo(){
        var quantidade = petMachine.getShampoo();
        System.out.println("A maquina esta com " + quantidade + "litros(s) de shampoo");
    }

    public  static void checkIfHasPetInMachine(){
        var temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }

}
