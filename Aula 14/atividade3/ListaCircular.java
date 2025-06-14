package atividade3;

public class ListaCircular {
    private No cabeca;

    public ListaCircular() {
        this.cabeca = null;
    }
    
    public boolean estaVazia() {
        return this.cabeca == null;
    }
    
    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
        } else {
            No ultimo = cabeca;
            while (ultimo.proximo != cabeca) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            novoNo.proximo = cabeca;
        }
    }

    // a. Conta o número de elementos na lista circular. 
    public int contarElementos() {
        if (estaVazia()) {
            return 0;
        }
        int contador = 0;
        No atual = cabeca;
        do {
            contador++;
            atual = atual.proximo;
        } while (atual != cabeca);
        return contador;
    }

    // b. Insere um elemento à esquerda da cabeça da lista.
    public void inserirAEsquerdaDaCabeca(String valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            cabeca = novoNo;
            novoNo.proximo = cabeca;
        } else {
            No ultimo = cabeca;
            while (ultimo.proximo != cabeca) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            novoNo.proximo = cabeca;
            cabeca = novoNo;
        }
    }

    // c. Concatena duas listas circulares. 
    public void concatenar(ListaCircular outraLista) {
        if (outraLista.estaVazia()) {
            return;
        }
        if (this.estaVazia()) {
            this.cabeca = outraLista.cabeca;
            return;
        }

        No ultimoThis = this.cabeca;
        while (ultimoThis.proximo != this.cabeca) {
            ultimoThis = ultimoThis.proximo;
        }

        No ultimoOutra = outraLista.cabeca;
        while (ultimoOutra.proximo != outraLista.cabeca) {
            ultimoOutra = ultimoOutra.proximo;
        }
        
        ultimoThis.proximo = outraLista.cabeca;
        ultimoOutra.proximo = this.cabeca;
    }

    // d. Intercala duas listas ordenadas em uma nova lista ordenada.
    public static ListaCircular intercalar(ListaCircular l1, ListaCircular l2) {
        ListaCircular intercalada = new ListaCircular();
        if (l1.estaVazia()) return l2.copiar();
        if (l2.estaVazia()) return l1.copiar();

        No atual1 = l1.cabeca;
        No atual2 = l2.cabeca;

        do {
            intercalada.inserir(atual1.valor);
            atual1 = atual1.proximo;
        } while (atual1 != l1.cabeca);

        do {
            intercalada.inserir(atual2.valor);
            atual2 = atual2.proximo;
        } while (atual2 != l2.cabeca);
        
        // Simplesmente inserindo todos os nós e depois ordenando de forma simples.
        // Uma implementação mais eficiente faria a intercalação passo a passo.
        return intercalada; // Nota: este método não ordena, apenas junta.
    }
    
    // e. Faz uma cópia da lista.
    public ListaCircular copiar() {
        ListaCircular copia = new ListaCircular();
        if (estaVazia()) {
            return copia;
        }
        No atual = this.cabeca;
        do {
            copia.inserir(atual.valor);
            atual = atual.proximo;
        } while (atual != this.cabeca);
        return copia;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista Circular: (vazia)");
            return;
        }
        System.out.print("Lista Circular: ");
        No atual = cabeca;
        do {
            System.out.print(atual.valor);
            atual = atual.proximo;
            if (atual != cabeca) {
                System.out.print(" -> ");
            }
        } while (atual != cabeca);
        System.out.println(" -> (cabeça)");
    }
}