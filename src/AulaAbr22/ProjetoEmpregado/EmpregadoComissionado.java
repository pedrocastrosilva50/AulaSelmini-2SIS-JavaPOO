package AulaAbr22.ProjetoEmpregado;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "comissao=" + comissao +
                ", totalDeVendas=" + totalDeVendas +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;

    }

}
