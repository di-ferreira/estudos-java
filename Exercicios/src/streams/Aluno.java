package streams;

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
}
