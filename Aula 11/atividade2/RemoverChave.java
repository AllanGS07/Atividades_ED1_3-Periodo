package atividade2;

import java.util.Scanner;
import java.util.Stack;

public class RemoverChave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entradaUsuario = scanner.nextLine();

        Stack<Character> pilha = new Stack<>();
        for (char caractere : entradaUsuario.toCharArray()) {
            pilha.push(caractere);
        }

        System.out.print("Qual caractere remover? ");
        char c = scanner.nextLine().charAt(0);

        Stack<Character> aux = new Stack<>();
        while (!pilha.isEmpty()) {
            char topo = pilha.pop();
            if (topo == c) {
                break;
            }
            aux.push(topo);
        }
        while (!aux.isEmpty()) {
            pilha.push(aux.pop());
        }

        System.out.println("Pilha após remoção: " + pilha);
    }
}
