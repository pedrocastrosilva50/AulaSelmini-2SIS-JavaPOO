package AulaAbr28.Ex2Heranca;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto( String marca, String placa, int cilindradas){
        super(placa, marca);
        this.cilindradas = cilindradas;
    }

    public String toString() {
        return super.toString() + " " + cilindradas;
    }
}
