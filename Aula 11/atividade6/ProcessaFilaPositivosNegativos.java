package atividade6;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Random;

public class ProcessaFilaPositivosNegativos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            numeros.add(random.nextInt(2000) + 1);
            numeros.add((random.nextInt(2000) + 1) * -1);
        }

        Collections.shuffle(numeros);
        Queue<Integer> fila = new LinkedList<>(numeros);
        Deque<Integer> pilha = new ArrayDeque<>();

        System.out.println("Iniciando processo com " + fila.size() + " números.");

        while (!fila.isEmpty()) {
            int primeiroDaFila = fila.poll();

            if (primeiroDaFila > 0) {
                System.out.println("-> Positivo " + primeiroDaFila + " entrou na pilha.");
                pilha.push(primeiroDaFila);
            } else {
                System.out.println("<- Negativo " + primeiroDaFila + " encontrado.");
                if (!pilha.isEmpty()) {
                    int retiradoDaPilha = pilha.pop();
                    System.out.println("   <- O número " + retiradoDaPilha + " foi retirado da pilha.");
                } else {
                    System.out.println("   <- Pilha está vazia, nada a retirar.");
                }
            }
        }

        System.out.println("\nProcesso finalizado. Fila vazia.");
        System.out.println("Restaram " + pilha.size() + " elementos na pilha: " + pilha);
    }
}