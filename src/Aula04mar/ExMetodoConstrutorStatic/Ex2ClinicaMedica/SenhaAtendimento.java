package Aula04mar.ExMetodoConstrutorStatic.Ex2ClinicaMedica;

public class SenhaAtendimento {

    String nome;
    int senha;
    static int controle = 100;

    public SenhaAtendimento (String nome) {
        this.nome = nome;
        this.senha = controle++;
    }

    public String getDados (){
        return "Paciente: "+ nome +" | Senha # "+senha;
    }

}
