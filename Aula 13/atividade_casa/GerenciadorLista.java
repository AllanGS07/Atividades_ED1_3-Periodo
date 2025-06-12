package atividade_casa;

public class GerenciadorLista {

    public static void inserirEmOrdem(ListaDuplamenteEncadeada lista, int valor) {
        No atual = lista.getInicio();
        int posicao = 0;

        while (atual != null && atual.valor < valor) {
            atual = atual.proximo;
            posicao++;
        }
        
        lista.inserirNaPosicao(posicao, valor);
    }

    public static void removerPrimos(ListaDuplamenteEncadeada lista) {
        No atual = lista.getInicio();
        while (atual != null) {
            No proximo = atual.proximo;
            if (ehPrimo(atual.valor)) {
                lista.removerPorValor(atual.valor);
            }
            atual = proximo;
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        int n = Math.abs(numero);
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}