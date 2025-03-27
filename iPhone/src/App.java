public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Tempo Ruim - Matanza");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("00123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.linkedin.com/in/bruno-alves-78b7b432b");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
