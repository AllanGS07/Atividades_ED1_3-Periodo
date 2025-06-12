package atividade8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class TestaPilha {
    private Deque<Integer> P;
    private Deque<Integer> N;

    public TestaPilha() {
        this.P = new ArrayDeque<>();
        this.N = new ArrayDeque<>();
        System.out.println("TestaPilha criada com pilhas P e N vazias.");
    }

    public void processarNumero(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo. Inserindo na pilha P.");
            this.P.push(numero);
        } else if (numero < 0) {
            System.out.println(numero + " é negativo. Inserindo na pilha N.");
            this.N.push(numero);
        } else {
            System.out.println("Número é zero. Tentando retirar um de cada pilha.");
            if (!this.P.isEmpty() && !this.N.isEmpty()) {
                int numP = this.P.pop();
                int numN = this.N.pop();
                System.out.println("   -> Retirado da Pilha P: " + numP);
                System.out.println("   -> Retirado da Pilha N: " + numN);
            } else {
                System.out.println("   -> Impossível retirar, uma ou ambas as pilhas estão vazias.");
            }
        }
    }

    public void imprimirEstadoFinal() {
        System.out.println("\n--- Estado Final ---");
        System.out.println("Pilha P (" + P.size() + " elementos): " + P);
        System.out.println("Pilha N (" + N.size() + " elementos): " + N);
    }

    public static void main(String[] args) {
        TestaPilha testador = new TestaPilha();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numSorteado = random.nextInt(201) - 100;
            testador.processarNumero(numSorteado);
        }

        testador.imprimirEstadoFinal();
    }
}