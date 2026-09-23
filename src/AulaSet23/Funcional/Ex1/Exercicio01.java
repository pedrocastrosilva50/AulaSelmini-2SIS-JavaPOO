package AulaSet23.Funcional.Ex1;

import java.util.Arrays;
import java.util.List;

public class Exercicio01 {
    static void main() {
        List<String> lista = Arrays.asList("Maria", "Ana", "Pedro", "antonio", "bianca");

        List<String> resultado = lista.stream()
                .filter(nome -> nome.startsWith("A") || nome.startsWith("a"))
                .map(nome -> nome.toUpperCase())
                .toList();


        resultado.forEach(System.out::println);
    }
}
