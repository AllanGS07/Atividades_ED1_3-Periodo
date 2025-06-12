package atividade_casa;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        // 1. Gerar 1000 números aleatórios e armazenar no vetor
        int[] vetor = new int[1000];
        Random random = new Random();
        int min = -9999;
        int max = 9999;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max - min + 1) + min;
        }

        // 2. Imprimir os números na ordem de geração
        System.out.println("✅ Vetor com 1000 números na ordem de geração:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println("\n\n" + "-".repeat(80));

        // 3. Criar a lista e inserir os números usando o gerenciador
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        for (int numero : vetor) {
            GerenciadorLista.inserirEmOrdem(lista, numero);
        }

        // 4. Imprimir a lista em ordem crescente
        System.out.println("📈 Lista em ORDEM CRESCENTE:");
        lista.imprimirCrescente();
        System.out.println("\n" + "-".repeat(80));

        // 5. Imprimir a lista em ordem decrescente
        System.out.println("📉 Lista em ORDEM DECRESCENTE:");
        lista.imprimirDecrescente();
        System.out.println("\n" + "-".repeat(80));

        // 6. Remover todos os números primos da lista usando o gerenciador
        System.out.println("🔥 Removendo todos os números primos da lista...");
        GerenciadorLista.removerPrimos(lista);
        System.out.println("\n" + "-".repeat(80));

        // 7. Imprimir a lista final
        System.out.println("✅ Lista final (sem números primos) em ORDEM CRESCENTE:");
        lista.imprimirCrescente();
    }
}