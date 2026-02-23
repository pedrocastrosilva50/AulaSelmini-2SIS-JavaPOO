package Aula3ExNeoBank;

import java.text.DecimalFormat;
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

        System.out.println(conta.saldo);
        conta.depositar(8500);
        System.out.println(conta.saldo);

    }
}
