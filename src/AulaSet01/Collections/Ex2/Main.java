package AulaSet01.Collections.Ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(564200, "Pedro Castro"));
        lista.add(new Aluno(561977, "Renan Rodrigues"));
        lista.add(new Aluno(564200, "Pedro Castro"));
        lista.add(new Aluno(562568, "Joao Alves"));
        lista.add(new Aluno(561205, "Rodrigo Sun"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
