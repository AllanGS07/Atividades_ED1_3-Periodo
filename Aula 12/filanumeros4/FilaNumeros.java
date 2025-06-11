package filanumeros4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FilaNumeros {

    // função que inverte uma fila f1, criando uma nova fila f2
    public static Queue<Integer> inverterFila(Queue<Integer> f1) {
        Stack<Integer> pilha = new Stack<>();
        for (Integer n : f1) {
            pilha.push(n);
        }
        Queue<Integer> f2 = new LinkedList<>();
        while (!pilha.isEmpty()) {
            f2.add(pilha.pop());
        }
        return f2;
    }
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            f1.add(rnd.nextInt(1000)); 
        }
        System.out.println("F1 original: " + f1);
        Queue<Integer> f2 = inverterFila(f1);
        System.out.println("F2 invertida: " + f2);
    }
}
