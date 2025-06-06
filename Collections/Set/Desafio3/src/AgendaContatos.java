
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Bruno", 123456789);
        agendaContatos.adicionarContato("Bruno", 987654321);
        agendaContatos.adicionarContato("Bruno Alves", 852369741);
        agendaContatos.adicionarContato("Andre", 258741369);
        agendaContatos.adicionarContato("Mikael", 123456789);
        agendaContatos.adicionarContato("Anna", 456789123);
        
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Bruno"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Andre", 222222222));

        agendaContatos.exibirContatos();
    }
}
