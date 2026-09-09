package AulaSet01.Collections.Exemplo;

public class Main {
    static void main() {
        Professor p1 = new Professor("333", "Pedro");
        Professor p2 = new Professor("333", "Pedro");
        System.out.println(p1.equals(p2));
        System.out.println(p1);
    }
}
