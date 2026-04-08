package AulaAbr07.Ex1TechCorp.Main;



import AulaAbr07.Ex1TechCorp.Departamento.Departamento;
import AulaAbr07.Ex1TechCorp.Funcionario.Funcionario;

public class main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI01", "TI");
        departamento.adicionarFuncionario(new Funcionario("01", "XX", "Diretor", 85000));
        departamento.adicionarFuncionario(new Funcionario("02", "YY", "Gerente", 30000));
        departamento.adicionarFuncionario(new Funcionario("03", "ZZ", "Estagiário", 1200));

        // exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());

        // desligar um funcionário
        departamento.removerFuncionario("02");

        // exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());

    }
}
