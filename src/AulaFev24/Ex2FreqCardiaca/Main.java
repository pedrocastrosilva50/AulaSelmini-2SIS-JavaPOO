package AulaFev24.Ex2FreqCardiaca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        int freq = paciente.frequenciaMaxima();
        double[]freqA = paciente.frequenciaAlvo();

        System.out.print("Digite seu nome: ");
        paciente.nome = sc.next();
        System.out.print("Digite sua idade: ");
        paciente.idade = sc.nextInt();

        System.out.println("");

        System.out.println("Sua frequência cardiaca máxima é "+freq);
        System.out.print("Sua frequência cardiaca alvo está entre " +freqA[0]+ " e "+freqA[1]);

    }
}
