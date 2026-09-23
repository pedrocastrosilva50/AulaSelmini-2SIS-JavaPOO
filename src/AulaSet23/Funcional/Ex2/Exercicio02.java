package AulaSet23.Funcional.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio02 {
    static void main() {
        List<Empregado> lista = Arrays.asList(
                new Empregado("Selmini", 1500, 26),
                new Empregado("Maria", 5000, 10),
                new Empregado("Ana", 3000, 2),
                new Empregado("Karina", 15000, 10)
        );

        List<Empregado> reajustados = lista.stream()
                .map(e -> {
                    double novoSalario;
                    if(e.anosExperiencia() >= 5) {
                        novoSalario = e.salarioAtual() * 1.20;
                    }
                    else {
                        novoSalario = e.salarioAtual() * 1.10;
                    }
                    return new Empregado(e.nome(), novoSalario, e.anosExperiencia());
                })
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();

        reajustados.forEach(System.out::println);

    }
}
