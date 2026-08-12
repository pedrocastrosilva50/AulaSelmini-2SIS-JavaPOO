package AulaMai05.TechGeo.Main;

import AulaMai05.TechGeo.Forma.Cilindro;
import AulaMai05.TechGeo.Forma.Circulo;
import AulaMai05.TechGeo.Forma.Forma;
import AulaMai05.TechGeo.Forma.Volume;
import AulaMai05.TechGeo.Ponto.Ponto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ponto ponto;

        //cilindro
        ponto=new Ponto(2,3);
        Cilindro cilindro=new Cilindro(2,8,ponto);
        //circulo
        ponto=new Ponto(-4,7);
        Circulo circulo = new Circulo(10,ponto);

        ponto=new Ponto(2,4);
        Circulo circulo2=new Circulo(6,ponto);

        ponto=new Ponto(6,5);
        Cilindro cilindro2=new Cilindro(8,8,ponto);

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(circulo2);
        lista.add(cilindro);
        lista.add(cilindro2);
        for (Forma forma: lista){
            System.out.println(forma+"\n");
        }
        for (Forma forma:lista){
            System.out.println(forma.calcularArea());
            System.out.println();
        }
        for (Forma forma: lista){
            if(forma instanceof Volume){
                System.out.println(((Volume) forma).calcularVolume());
                System.out.println();
            }
        }
    }
}
