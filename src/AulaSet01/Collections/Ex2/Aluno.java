package AulaSet01.Collections.Ex2;

public class Aluno {
    private int rm;
    private String nome;

    public Aluno(int rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "rm= " + rm +
                ", nome= " + nome +
                '}';
    }
}
