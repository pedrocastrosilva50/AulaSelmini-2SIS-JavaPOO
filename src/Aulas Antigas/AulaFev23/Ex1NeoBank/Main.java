package AulaFev23.Ex1NeoBank;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do correntista: ");
        conta.correntista = sc.next();
        conta.numConta = rd.nextInt(1000, 9999);
        System.out.println("Número da sua conta: " + conta.numConta);

        System.out.print("Quanto você quer depositar : ");
        conta.depositar(5000);
        System.out.println(conta.saldo);

        System.out.print("Quanto você quer sacar : ");
        conta.sacar(250);
        System.out.println(conta.saldo);

    }
}
