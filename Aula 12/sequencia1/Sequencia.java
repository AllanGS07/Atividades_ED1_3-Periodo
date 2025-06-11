package sequencia1;
import java.util.Scanner;
import java.util.Stack;

public class Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequencia = scanner.nextLine();

        //Inverte a sequência
        Stack<Character> sequenciaInvertida = new Stack<>();
        for (char caractere : sequencia.toCharArray()) {
            sequenciaInvertida.push(caractere);
        }
        System.out.print("A sequência invertida é: ");
        while (!sequenciaInvertida.isEmpty()) {
            System.out.print(sequenciaInvertida.pop());
        }

        //Verifica se a sequência é palíndroma
        String sequenciaMinuscula = sequencia.toLowerCase();
        boolean palindromo = true;
        for (int i = 0; i < sequenciaMinuscula.length() / 2; i++) {
            if (sequenciaMinuscula.charAt(i) != sequenciaMinuscula.charAt(sequenciaMinuscula.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("\n\nA sequência é palíndroma!!!");
        } else {
            System.out.println("\n\nA sequência não é palíndroma!!!");
        }

        scanner.close();
    }
}