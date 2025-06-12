package atividade7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class InverterFilaLocal {

    public static void inverter(Queue<Integer> fila) {
        Deque<Integer> pilhaAuxiliar = new ArrayDeque<>();

        while(!fila.isEmpty()) {
            pilhaAuxiliar.push(fila.poll());
        }

        while(!pilhaAuxiliar.isEmpty()) {
            fila.add(pilhaAuxiliar.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> filaDeInteiros = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            filaDeInteiros.add(random.nextInt(100) + 1);
        }

        System.out.println("Fila antes da inversão:");
        System.out.println(filaDeInteiros);

        inverter(filaDeInteiros);

        System.out.println("\nFila após a inversão:");
        System.out.println(filaDeInteiros);
    }
}