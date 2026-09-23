package AulaSet23.Funcional.Ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicio04 {
    static void main() {
        List<Produto> lista = Arrays.asList(
                new Produto("teclado", 2900, "eletrônicos",
                        5, true),
                new Produto("notebook", 17500, "eletrônicos",
                        5, true),
                new Produto("agenda", 175, "papelaria",
                        4, true),
                new Produto("caneta", 5, "papelaria",
                        3, true)
        );

        // itens 01 e 02
        Predicate<Produto> filtro = p -> p.emEstoque() && p.avaliacao() >= 4;
        List<ProdutoFinal> listaFinal = lista.stream()
                .filter(filtro)
                .map(p -> {
                    double precoFinal;
                    if(p.categoria().equalsIgnoreCase("eletrônicos")) {
                        precoFinal = p.preco() * 0.85;
                    }
                    else {
                        precoFinal = p.preco() * 0.90;
                    }
                    return new ProdutoFinal(p.nome().toUpperCase(),
                            precoFinal, p.categoria());
                })
                .toList();

        listaFinal.forEach(System.out::println);

        // item 03 --> agrupamento por categoria
        System.out.println("\nProdutos agrupados por categoria");
        Map<String, List<ProdutoFinal>> grupo = listaFinal.stream()
                .collect(Collectors.groupingBy(ProdutoFinal::categoria));

        grupo.forEach((categoria, listaPF) -> {
            System.out.println(categoria);
            listaPF.stream()
                    .sorted(Comparator.comparing(ProdutoFinal::nome))
                    .forEach(System.out::println);
        });

        // item 04 e 05
        System.out.println("\nProdutos mais caros");
        listaFinal.stream()
                .sorted(Comparator.comparingDouble(ProdutoFinal::preco).reversed())
                .limit(2)
                .forEach(System.out::println);

    }
}