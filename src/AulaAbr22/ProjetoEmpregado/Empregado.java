package AulaAbr22.ProjetoEmpregado;

public abstract class Empregado extends Object {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();
    @Override
    public String toString() {
        return "Empregado{" + "matricula=" + matricula + ", nome='" + nome + '\'' + '}';
    }
}
