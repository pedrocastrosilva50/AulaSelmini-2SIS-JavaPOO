public class Aluno {
    // atributos ou propriedades ou variáveis de instância (objeto)
    String nome;
    String curso;
    double nota1;
    double nota2;
    int rm;

    public double calcularMedia(){
        double media = (nota1 + nota2)/2;
        return media;
    }

    public String aprovacao(){
        if (calcularMedia() >= 6) {
            return "APROVADO";
        }
        return "REPROVADO";
    }

    public void imprimir (){
        System.out.println("RM: "+rm);
        System.out.println("Nome: "+nome);
        System.out.println("Curso: "+curso);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);

    }
}