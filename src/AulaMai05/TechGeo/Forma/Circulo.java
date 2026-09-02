package AulaMai05.TechGeo.Forma;

import AulaMai05.TechGeo.Ponto.Ponto;

public class Circulo extends Forma {

    private Ponto ponto;
    private double raio;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public double calcularArea(){
        double area;
        area = Math.PI * Math.pow(raio , 2);
        return area;
    }

    public String toString() {
        String aux = "";
        aux += "Raio: ("+raio+")";
        aux += ponto.toString();
        return aux;
    }

    public Ponto getPontoC() {
        return ponto;
    }

    public void setPontoC(Ponto pontoC) {
        this.ponto = pontoC;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
