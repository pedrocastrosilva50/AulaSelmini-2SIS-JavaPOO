package AulaMar04.ExMetodoConstrutorStatic.Ex2ClinicaMedica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*SenhaAtendimento s1 = new SenhaAtendimento("Renan");
        SenhaAtendimento s2 = new SenhaAtendimento("João");
        SenhaAtendimento s3 = new SenhaAtendimento("Rodrigo");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        ou pode ser feito assim a seguir, com a opção de nomes ilimitados*/


        ArrayList<SenhaAtendimento> lista = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do paciente (ou 'sair'): ");
            String nome = sc.next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            lista.add(new SenhaAtendimento(nome));
        }
        for (SenhaAtendimento s : lista) {
            System.out.println(s.getDados());
        }

        System.out.print("\nPróxima senha -> "+ SenhaAtendimento.controle);

    }

}
