public class Evento {
    private String nome;
    private String atracao;
    
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("nome=").append(nome);
        sb.append(", atracao=").append(atracao);
        sb.append('}');
        return sb.toString();
    }
}
