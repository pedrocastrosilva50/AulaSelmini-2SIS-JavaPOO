package AulaAbr28.Ex2Heranca;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro (String marca, String placa, int numPortas) {
        super(placa, marca);
        this.numPortas = numPortas;
    }

    public String toString() {
        return super.toString() + " " + numPortas;
    }
}
