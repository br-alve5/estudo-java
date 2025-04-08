
import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(Long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno{");
        sb.append("nome=").append(nome);
        sb.append(", matricula=").append(matricula);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }
    

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
}

class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getNota(), a2.getNota());
    }
}