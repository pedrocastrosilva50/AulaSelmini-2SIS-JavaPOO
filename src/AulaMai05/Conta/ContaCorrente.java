package AulaMai05.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public String toString() {
        String aux = super.toString();
        aux += "Limite: R$ " + String .format("%.2f", limite);
        return aux;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}