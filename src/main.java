import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("RM: ");
        aluno.rm = sc.nextInt();
        System.out.print("Curso: ");
        aluno.curso = sc.next();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();

        double media = aluno.calcularMedia();

        System.out.println();

        System.out.print(" A média do/a aluno/a "+aluno.nome+", RM: "+aluno.rm+", do curso "+aluno.curso+" é igual a "+media+". Seu status é "+ aluno.aprovacao());;
        System.out.println();
        aluno.imprimir();



    }
}