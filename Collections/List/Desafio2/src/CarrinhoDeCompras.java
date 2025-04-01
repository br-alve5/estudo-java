
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new
        ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            System.out.println(nome + " foi removido.");
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0d;
        for(Item item : itemList){
            double valorItem = item.getPreco() * item.getQuantidade();
            total += valorItem;
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(this.itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Teclado", 119.90, 1);
        compras.adicionarItem("Mouse", 109, 2);
        compras.adicionarItem("Monitor", 1300, 1);

        compras.exibirItens();

        System.out.println("Valor total: " + compras.calcularValorTotal());

        compras.removerItem("Mouse");

        System.out.println("Valor total: " + compras.calcularValorTotal());
    }
}
