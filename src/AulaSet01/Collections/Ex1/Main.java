package AulaSet01.Collections.Ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato(9.9, 20,"Sebastião"));
        lista.add(new Candidato(8, 26,"Selmini"));
        lista.add(new Candidato(9.9, 20,"Beatriz"));
        lista.add(new Candidato(10, 10,"Maria"));

        lista.sort(Comparator.comparing(Candidato::getNome)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome));

        // impressão da lista usando lambda
        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
