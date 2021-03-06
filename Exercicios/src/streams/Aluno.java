package streams;

import java.util.Objects;

public class Aluno {
    final String nome;
    final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && nota == aluno.nota && bomComportamento == aluno.bomComportamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }

}
