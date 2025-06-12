package atividade_casa;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public No getInicio() {
        return inicio;
    }

    public void inserirNaPosicao(int posicao, int valor) {
        if (posicao < 0) return;
        
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No atual = inicio;
        int i = 0;
        while (atual != null && i < posicao) {
            atual = atual.proximo;
            i++;
        }

        if (atual == null && i == posicao) {
            inserirNoFim(valor);
        } else if (atual != null) {
            No novoNo = new No(valor);
            novoNo.proximo = atual;
            novoNo.anterior = atual.anterior;
            atual.anterior.proximo = novoNo;
            atual.anterior = novoNo;
        }
    }

    public void removerPorValor(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual == inicio) {
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                    else fim = null;
                }
                else if (atual == fim) {
                    fim = atual.anterior;
                    fim.proximo = null;
                }
                else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void imprimirCrescente() {
        if (inicio == null) {
            System.out.println("Lista: (vazia)");
            return;
        }
        System.out.print("Lista: ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        if (fim == null) {
            System.out.println("Lista: (vazia)");
            return;
        }
        System.out.print("Lista: ");
        No atual = fim;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}