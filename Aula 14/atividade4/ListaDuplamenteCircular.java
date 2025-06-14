package atividade4;

public class ListaDuplamenteCircular {
    private No cabeca;

    public boolean estaVazia() {
        return cabeca == null;
    }

    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
            novoNo.anterior = cabeca;
        } else {
            No ultimo = cabeca.anterior;
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
        }
    }

    // a. Contar o número de elementos
    public int contarElementos() {
        if (estaVazia()) return 0;
        int count = 0;
        No atual = cabeca;
        do {
            count++;
            atual = atual.proximo;
        } while (atual != cabeca);
        return count;
    }

    // b. Inserir um elemento à esquerda da cabeça
    public void inserirAEsquerdaDaCabeca(String valor) {
        inserir(valor);
        if (!estaVazia()) {
            cabeca = cabeca.anterior;
        }
    }

    // c. Concatenar duas listas circulares
    public void concatenar(ListaDuplamenteCircular outraLista) {
        if (outraLista.estaVazia()) return;
        if (this.estaVazia()) {
            this.cabeca = outraLista.cabeca;
            return;
        }

        No ultimoThis = this.cabeca.anterior;
        No ultimoOutra = outraLista.cabeca.anterior;

        ultimoThis.proximo = outraLista.cabeca;
        outraLista.cabeca.anterior = ultimoThis;

        ultimoOutra.proximo = this.cabeca;
        this.cabeca.anterior = ultimoOutra;
    }
    
    // e. Fazer uma cópia da lista
    public ListaDuplamenteCircular copiar() {
        ListaDuplamenteCircular copia = new ListaDuplamenteCircular();
        if (estaVazia()) return copia;

        No atual = this.cabeca;
        do {
            copia.inserir(atual.valor);
            atual = atual.proximo;
        } while (atual != this.cabeca);
        return copia;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista Duplamente Circular: (vazia)");
            return;
        }
        System.out.print("Lista Duplamente Circular: ");
        No atual = cabeca;
        do {
            System.out.print(atual.valor);
            atual = atual.proximo;
            if (atual != cabeca) {
                System.out.print(" <-> ");
            }
        } while (atual != cabeca);
        System.out.println(" <-> (cabeça)");
    }
}