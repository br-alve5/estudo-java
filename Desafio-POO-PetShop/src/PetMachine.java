public class PetMachine {

    private boolean clean = true;
    private int agua = 30;
    private int shampoo = 10;
    private Pet pet;


    public void DarBanho(){
        if (this.pet == null){
            System.out.println("Coleque o pet na maquina para iniciar o banho");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " esta limpo");
    }

    public void addAgua(){
        if(agua == 30){
            System.out.println("A capacidade da agua esta no maximo");
            return;
        }

        agua += 2;
    }

    public void addShampoo(){
        if(shampoo == 30){
            System.out.println("A capacidade de shampoo esta no maximo");
            return;
        }

        shampoo += 2;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja!");
            return;
        }
        if(temPet()){
            System.out.println("O pet " + this.pet.getName() + " ainda esta na maquina");
        }

        this.pet = pet;
    }

    public void tirarPet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da maquina");
        this.pet = null;
    }

    public void limpar(){
        this.agua -= 10;
        this.shampoo -=2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }



}
