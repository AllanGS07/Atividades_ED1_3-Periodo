package atividade1;

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

    public No getInicio() {
        return inicio;
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

    // a. Concatena outra lista ao final da lista atual.
    public void concatenar(ListaDuplamenteEncadeada outraLista) {
        if (outraLista.estaVazia()) {
            return;
        }
        if (this.estaVazia()) {
            this.inicio = outraLista.inicio;
            this.fim = outraLista.fim;
        } else {
            this.fim.proximo = outraLista.inicio;
            outraLista.inicio.anterior = this.fim;
            this.fim = outraLista.fim;
        }
        outraLista.inicio = null;
        outraLista.fim = null;
    }

    // b. Separa a lista em duas novas listas a partir de uma posição.
    public ListaDuplamenteEncadeada[] separar(int posicao) {
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        No atual = this.inicio;
        int i = 0;

        if (posicao < 0 || posicao >= tamanho()) {
            System.out.println("Posição inválida. A lista não será separada.");
            lista1 = this;
            return new ListaDuplamenteEncadeada[]{lista1, lista2};
        }

        while (atual != null) {
            if (i < posicao) {
                lista1.inserirNoFim(atual.valor);
            } else {
                lista2.inserirNoFim(atual.valor);
            }
            atual = atual.proximo;
            i++;
        }
        return new ListaDuplamenteEncadeada[]{lista1, lista2};
    }

    // c. Intercala duas listas ordenadas em uma nova lista ordenada.
    public static ListaDuplamenteEncadeada intercalar(ListaDuplamenteEncadeada l1, ListaDuplamenteEncadeada l2) {
        ListaDuplamenteEncadeada listaIntercalada = new ListaDuplamenteEncadeada();
        No atual1 = l1.getInicio();
        No atual2 = l2.getInicio();

        while (atual1 != null && atual2 != null) {
            if (atual1.valor.compareTo(atual2.valor) < 0) {
                listaIntercalada.inserirNoFim(atual1.valor);
                atual1 = atual1.proximo;
            } else {
                listaIntercalada.inserirNoFim(atual2.valor);
                atual2 = atual2.proximo;
            }
        }

        while (atual1 != null) {
            listaIntercalada.inserirNoFim(atual1.valor);
            atual1 = atual1.proximo;
        }

        while (atual2 != null) {
            listaIntercalada.inserirNoFim(atual2.valor);
            atual2 = atual2.proximo;
        }

        return listaIntercalada;
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
                System.out.print(" <-> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}