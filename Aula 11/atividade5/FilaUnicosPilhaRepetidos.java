package atividade5;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class FilaUnicosPilhaRepetidos {
    public static void main(String[] args) {
        Queue<Integer> filaUnica = new LinkedList<>();
        Deque<Integer> pilhaRepetidos = new ArrayDeque<>(); // Usando Deque como Pilha
        Set<Integer> numerosNaFilhaSet = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(1500);

            if (!numerosNaFilhaSet.contains(numeroSorteado)) {
                filaUnica.add(numeroSorteado);
                numerosNaFilhaSet.add(numeroSorteado);
            } else {
                pilhaRepetidos.push(numeroSorteado);
            }
        }

        System.out.println("--- Fila F (Números Únicos) ---");
        System.out.println("Total de elementos: " + filaUnica.size());
        System.out.println("Fila F: " + filaUnica);

        System.out.println("\n--- Pilha P (Números Repetidos) ---");
        System.out.println("Total de elementos: " + pilhaRepetidos.size());
        System.out.println("Pilha P: " + pilhaRepetidos);
    }
}