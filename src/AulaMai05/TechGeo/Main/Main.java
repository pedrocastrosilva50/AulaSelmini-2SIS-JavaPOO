package AulaMai05.TechGeo.Main;

import AulaMai05.TechGeo.Forma.Cilindro;
import AulaMai05.TechGeo.Forma.Circulo;
import AulaMai05.TechGeo.Ponto.Ponto;

public class Main {
    public static void main(String[] args) {

        Ponto ponto;

        // Cilindro
        ponto = new Ponto(2, -3);
        Cilindro cilindro = new Cilindro(8, 2, ponto);
        System.out.println("área = " +cilindro.calcularArea());
        System.out.println("volume = " +cilindro.calcularVolume());

        //Circulo
        ponto = new Ponto(-4, 7);
        Circulo circulo = new Circulo(10, ponto);
        System.out.println("área = " +circulo.calcularArea());

    }
}
