package Aula3ExNeoBank;

public class Conta {

        // atributos ou propriedade ou variaveis de instancia
        String correntista;
        int numConta;
        double saldo;

        //metodo para depositar
        public void depositar(double valor) {
            saldo += valor;
        }

        //metodo para saque
        public void sacar(double valor) {
            saldo -= valor;
        }

}
