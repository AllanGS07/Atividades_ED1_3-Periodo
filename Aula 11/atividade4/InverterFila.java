package atividade4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class InverterFila {

    public static Queue<Integer> inverter(Queue<Integer> f1) {
        Deque<Integer> pilhaAuxiliar = new ArrayDeque<>();
        Queue<Integer> f2 = new LinkedList<>();

        while (!f1.isEmpty()) {
            pilhaAuxiliar.push(f1.poll());
        }

        while (!pilhaAuxiliar.isEmpty()) {
            f2.add(pilhaAuxiliar.pop());
        }

        return f2;
    }

    public static void main(String[] args) {
        Queue<Integer> filaF1 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            filaF1.add(random.nextInt(1000));
        }
        System.out.println("Fila Original (F1): " + filaF1);

        Queue<Integer> filaF2 = inverter(filaF1);
        System.out.println("\nFila Invertida (F2): " + filaF2);
    }
}