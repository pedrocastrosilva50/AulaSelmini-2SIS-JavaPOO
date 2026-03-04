package Aula03mar.ExMetodoConstrutor.Ex1LojaVirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor;
        int quantidadeDisp;

        System.out.print("Digite o nome do produto: ");
        nome = sc.next();
        System.out.print("Digite o valor do produto: R$ ");
        valor = sc.nextDouble();
        System.out.print("Digite a quantidade disponivel em estoque: ");
        quantidadeDisp = sc.nextInt();

        Produto produto = new Produto(nome, valor, quantidadeDisp) ;

        System.out.println("\nProduto: "+produto.nome);
        System.out.println("Valor: R$ " +produto.valor);
        System.out.println("Quantidade em estoque: "+produto.quantidadeDisp);

    }
}
