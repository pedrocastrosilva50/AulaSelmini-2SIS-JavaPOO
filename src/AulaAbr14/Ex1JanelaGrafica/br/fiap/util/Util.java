package AulaAbr14.Ex1JanelaGrafica.br.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;


public class Util {
    public void menu() {
        int opcao;
        String aux = "Reserva de Cargas Boa Viagem\n";
        aux += "[1] Reservar\n";
        aux += "[2] Pesquisar\n";

        do {
            opcao =parseInt(showInputDialog(aux));
//            switch (opcao) {
//                case 1 -> reservar();
//                case 2 -> pesquisar();
//            }
        } while (opcao != 6);
    }


}
