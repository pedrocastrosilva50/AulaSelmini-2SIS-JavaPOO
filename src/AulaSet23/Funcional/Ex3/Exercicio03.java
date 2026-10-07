package AulaSet23.Funcional.Ex3;

import java.util.Arrays;
import java.util.List;

public class Exercicio03 {
    static void main() {
        List<Produto> lista = Arrays.asList(
                new Produto("notebook", 15000, "eletrônicos"),
                new Produto("câmera", 700, "eletrônicos"),
                new Produto("agenda", 100, "papelaria"),
                new Produto("caneta", 50, "papelaria")
        );

        List<String> aux = lista.stream()
                .filter(p -> p.preco() >= 1000 && p.categoria().equalsIgnoreCase("eletrônicos"))
                .map(p -> {
                    double precoDesconto = p.preco() * 0.90;
                    return p.nome().toUpperCase() + " - preço com desconto R$ " + String.format("%.2f", precoDesconto);
                })
                .sorted()
                .toList();

        aux.forEach(System.out::println);

    }
}