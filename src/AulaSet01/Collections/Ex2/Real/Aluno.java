package AulaSet01.Collections.Ex2.Real;

import java.util.Objects;

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
        return rm + "  |  " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rm == aluno.rm && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rm, nome);
    }
}
