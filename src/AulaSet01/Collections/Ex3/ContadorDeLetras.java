package AulaSet01.Collections.Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine().toLowerCase();
        char letra;

        Map<Character, Integer> contador = new HashMap<>();

        for (int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            if (Character.isLetter(letra)){
                if (contador.containsKey(letra)){
                    contador.put(letra, contador.get(letra)+ 1);
                }
                else {
                    contador.put(letra, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> itens : contador.entrySet()) {
            System.out.println("Chave: "+ itens.getKey()+"   |   Valor: "+ itens.getValue()); ;

        }

    }
}
