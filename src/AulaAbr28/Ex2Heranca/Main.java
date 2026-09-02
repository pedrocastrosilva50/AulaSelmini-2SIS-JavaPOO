package AulaAbr28.Ex2Heranca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("Audi", "XXXX", 4));
        lista.add(new Moto("BMW", "YYYY", 1200));
        lista.add(new Carro("Mercedes", "ZZZZ", 4));
        lista.add(new Moto("Homda", "AAAA", 160));

        for (Veiculo veiculo : lista){
            System.out.println(veiculo);
        }
    }
}
