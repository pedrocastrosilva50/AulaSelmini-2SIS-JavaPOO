package AulaMar04.ExMetodoConstrutorStatic.Ex3BilheteUnico;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome do usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Tipo de tarifa (estudante ou professor ou normal): ");
        String tpTarifa = sc.next();
        bilhete = new BilheteUnico(usuario, tpTarifa);
    }

    public static void  main (String[] args) {
        int opcao;
        do{
            System.out.println("\n*************************************");
            System.out.println("1. Carregar bilhete");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Passar na catraca");
            System.out.print("4. Finalizar");
            System.out.println("\n*************************************");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> carregar();
                case 2 -> consultar();
                case 3 -> catracar();
                case 4 -> System.out.println("Obrigado por usar o nosso App !");
                default -> System.out.println("Opção inválida !");
            }

        } while (opcao != 4);
    }

    private static void catracar() {
        if (!bilhete.catracar()) {
            System.out.println("Saldo Insuficiente !");
        }
        consultar();
    }

    private static void consultar() {
        System.out.println("Saldo atual --> R$ "+bilhete.saldo);
    }

    private static void carregar() {
        double valor;
        System.out.print("Valor da recarga --> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }

}
