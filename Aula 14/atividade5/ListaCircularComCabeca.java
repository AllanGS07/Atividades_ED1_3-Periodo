package atividade5;

public class ListaCircularComCabeca {
    private final No cabeca;

    public ListaCircularComCabeca() {
        cabeca = new No("CABECA");
        cabeca.proximo = cabeca;
        cabeca.anterior = cabeca;
    }

    public boolean estaVazia() {
        return cabeca.proximo == cabeca;
    }

    // Inserção no final da lista (antes do nó cabeça)
    public void inserir(String valor) {
        No novoNo = new No(valor);
        No ultimo = cabeca.anterior;

        ultimo.proximo = novoNo;
        novoNo.anterior = ultimo;
        novoNo.proximo = cabeca;
        cabeca.anterior = novoNo;
    }

    // Remoção de um elemento
    public boolean remover(String valor) {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.valor.equals(valor)) {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista Circular com Cabeça: (vazia)");
            return;
        }
        System.out.print("Lista Circular com Cabeça: ");
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.valor);
            if (atual.proximo != cabeca) {
                System.out.print(" <-> ");
            }
            atual = atual.proximo;
        }
        System.out.println(" <-> (CABECA)");
    }
}