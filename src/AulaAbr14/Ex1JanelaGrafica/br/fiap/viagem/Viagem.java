package AulaAbr14.Ex1JanelaGrafica.br.fiap.viagem;

import AulaAbr14.Ex1JanelaGrafica.br.fiap.carga.Carga;

public class Viagem {
    private double capacidade;
    private int index;
    private Carga[] carga;

    public Viagem() { // SOMENTE INFORMA O PARAMENTO SE PRECISAR RECEBER VALOR !! COMO TODOS OS PARAMETROS JA ESTAO INFORMADOS, NAO PRECISA COLOCAR PARAMETRO NENHUM !!
        this.capacidade = 10000;
        this.index = 0;
        this.carga = new Carga[20];
    }

    public double capacidadeReservada (){
        double total = 0; // NAO ESQUECER DE CRIAR O TOTAL QUANDO PRECISAR RETORNAR
        for (int i = 0; i < index; i++){
            total += carga[i].getPeso();
        }
        return total;
    }

    public boolean permitidoReservar (double peso){
        double aux = capacidadeReservada();
        if (index < carga.length && aux + peso <= capacidade){
            return true;
        }
        return false;
    }

    public boolean reservar(Carga carga){
        if (permitidoReservar(carga.getPeso())){
            this.carga[index] = carga;
            index++;
            return true;
        }
        return false;
    }

    public String getDados(){
        String aux = "";
        for (int i = 0; i < index; i++){
            aux += carga[i].getDados(); // NAO ESQUECER QUE DA PRA PUXAR DIRETO DO QUE JA TEM CRIADO, DO GET DADOS DE CARGA
        }
        return aux;
    }
}
