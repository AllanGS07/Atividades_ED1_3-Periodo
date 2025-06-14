package exemplo_sala;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void inserirNoFim(String valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirNaPosicao(int posicao, String valor) {
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
            if (atual.anterior != null) {
                atual.anterior.proximo = novoNo;
            }
            atual.anterior = novoNo;
        }
    }

    public void removerDoInicio() {
        if (estaVazia()) return;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerDoFim() {
        if (estaVazia()) return;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void removerDaPosicao(int posicao) {
        if (estaVazia() || posicao < 0) return;
        if (posicao == 0) {
            removerDoInicio();
            return;
        }

        No atual = inicio;
        int i = 0;
        while (atual != null && i < posicao) {
            atual = atual.proximo;
            i++;
        }

        if (atual == null) return;
        if (atual == fim) {
            removerDoFim();
        } else {
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
        }
    }

    public void esvaziar() {
        inicio = null;
        fim = null;
    }

    public int tamanho() {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista: (vazia)");
            return;
        }
        System.out.print("Lista: ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}