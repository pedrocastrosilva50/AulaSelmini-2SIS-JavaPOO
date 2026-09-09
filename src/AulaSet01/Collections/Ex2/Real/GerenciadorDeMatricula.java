package AulaSet01.Collections.Ex2.Real;

import java.util.*;

public class GerenciadorDeMatricula {
    static void main() {
        Set<Aluno> estrutura = new HashSet<>();
        Set<Aluno> banco = new HashSet<>();

        //alunos da disciplina estrutura de dados
        estrutura.add(new Aluno(10, "Selmini"));
        estrutura.add(new Aluno(20,"Ismael"));
        estrutura.add(new Aluno(30,"Israel"));
        estrutura.add(new Aluno(40, "Patricia"));

        //alunos da disciplina banco de dados
        banco.add(new Aluno(50, "Renan"));
        banco.add(new Aluno(60,"Pedro"));
        banco.add(new Aluno(10, "Selmini"));
        banco.add(new Aluno(20, "Ismael"));

        // alunos matriculados em estrutura OU banco (UNIAO)
        System.out.println("\nAlunos matriculados em estrutura OU banco: ");
        Set<Aluno> uniao = new HashSet<>(estrutura);
        uniao.addAll(banco);
        uniao.forEach( aluno -> {
            System.out.println(aluno);
        });

        // alunos matriculados em estrutura E banco (INTERSECÇÃO)
        System.out.println("\nAlunos matriculados em estrutura E banco: ");
        Set<Aluno> interseccao = new HashSet<>(estrutura);
        interseccao.retainAll(banco);
        interseccao.forEach(aluno -> {
            System.out.println(aluno);
        });

        // Somente os alunos matriculados em estrutura
        System.out.println("\nSomente os alunos matriculados em ESTRUTURA: ");
        Set<Aluno> onlyEstrutura = new HashSet<>(estrutura);
        onlyEstrutura.removeAll(banco);
        List<Aluno> lista = new ArrayList<>(onlyEstrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));
        onlyEstrutura.forEach(aluno -> {
            System.out.println(aluno);
        });

        // Somente os alunos matriculados em banco
        System.out.println("\nSomente os alunos matriculados em BANCO: ");
        Set<Aluno> onlyBanco = new HashSet<>(banco);
        onlyBanco.removeAll(estrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));
        onlyBanco.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
