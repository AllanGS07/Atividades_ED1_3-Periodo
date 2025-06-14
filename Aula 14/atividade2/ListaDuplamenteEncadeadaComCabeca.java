package atividade2;

public class ListaDuplamenteEncadeadaComCabeca {
    private final No cabeca;

    public ListaDuplamenteEncadeadaComCabeca() {
        cabeca = new No("CABECA");
        cabeca.proximo = cabeca;
        cabeca.anterior = cabeca;
    }

    public boolean estaVazia() {
        return cabeca.proximo == cabeca;
    }
    
    // Insere um novo elemento no final da lista.
    public void inserir(String valor) {
        No novoNo = new No(valor);
        No ultimo = cabeca.anterior;

        novoNo.proximo = cabeca;
        novoNo.anterior = ultimo;

        ultimo.proximo = novoNo;
        cabeca.anterior = novoNo;
    }

    // Busca por um valor na lista.
    public No buscar(String valor) {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.valor.equals(valor)) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    // Elimina um elemento da lista.
    public boolean eliminar(String valor) {
        No noParaRemover = buscar(valor);
        if (noParaRemover == null) {
            return false;
        }

        No noAnterior = noParaRemover.anterior;
        No noProximo = noParaRemover.proximo;

        noAnterior.proximo = noProximo;
        noProximo.anterior = noAnterior;
        
        noParaRemover.proximo = null;
        noParaRemover.anterior = null;

        return true;
    }
    
    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista com Cabeça: (vazia)");
            return;
        }
        System.out.print("Lista com Cabeça: ");
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.valor);
            if (atual.proximo != cabeca) {
                System.out.print(" <-> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}