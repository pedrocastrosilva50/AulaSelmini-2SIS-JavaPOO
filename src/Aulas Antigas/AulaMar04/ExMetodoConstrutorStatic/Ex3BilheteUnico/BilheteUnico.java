package AulaMar04.ExMetodoConstrutorStatic.Ex3BilheteUnico;

import java.util.Random;

public class BilheteUnico {
    int numero;
    String usuario;
    double saldo;
    String tpTarifa;
    static double tarifa = 5.50;


    public BilheteUnico(String usuario, String tpTarifa){
        Random rd = new Random();
        this.numero = rd.nextInt(1000, 9999);
        this.usuario = usuario;
        this.tpTarifa = tpTarifa;
        this.saldo = 0;
    }

    public void carregar(double valor){
        this.saldo += valor;
    }

    public boolean catracar(){
        double valor = tarifa;
        if (tpTarifa.equalsIgnoreCase("professor") ||
                tpTarifa.equalsIgnoreCase("estudante")){
            valor = tarifa / 2;
        }
        if (saldo < valor){
            return false;
            /*System.out.println("Saldo Insuficiente ! Saldo atual: "+saldo);

            ESSE JEITO NAO SERIA A MELHOR MANEIRA DEVIDO SE FOR EVOLUIR PRA UM PROGRAMA MAIOR,
            TERIA QUE FAZER ALTERAÇÕES MANUAIS
             */
        }

        saldo -= valor;
        return true;
    }

}
