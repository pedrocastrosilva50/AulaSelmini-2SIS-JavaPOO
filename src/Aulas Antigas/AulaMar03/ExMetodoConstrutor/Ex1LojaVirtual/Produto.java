package AulaMar03.ExMetodoConstrutor.Ex1LojaVirtual;

public class Produto {
    String nome;
    double valor;
    int quantidadeDisp;


    public Produto (String nome, double valor,  int quantidadeDisp) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeDisp = quantidadeDisp;
    }

    public void aumentarValor(double prct){
        valor *= (1 + prct /100);
    }
}

