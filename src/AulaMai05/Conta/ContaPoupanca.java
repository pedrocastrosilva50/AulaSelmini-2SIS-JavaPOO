package AulaMai05.Conta;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public String toString() {
        String aux = super.toString();
        aux += "Rendimento: " + taxaRendimento + "%%";
        return aux;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento / 100;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}