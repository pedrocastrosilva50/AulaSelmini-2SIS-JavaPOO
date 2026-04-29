package AulaAbr28.Ex2Heranca;

public abstract class Veiculo extends Object {
    private String placa;
    private String marca;

    public Veiculo (String placa,String marca){
        this.placa = placa;
        this.marca = marca;
    }

    public String toString(){
        return placa + " " +marca;
    }
}
