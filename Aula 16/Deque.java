public class Deque {
    private No inicio;
    private No fim;

    public Deque() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazio() {
        return inicio == null;
    }

    public void inserirInicio(Documento documento) {
        No novoNo = new No(documento);
        if (estaVazio()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirFim(Documento documento) {
        No novoNo = new No(documento);
        if (estaVazio()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.anterior = fim;
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public Documento removerInicio() {
        if (estaVazio()) {
            System.out.println("Deque vazio!");
            return null;
        }
        No noRemovido = inicio;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        return noRemovido.documento;
    }

    public Documento removerFim() {
        if (estaVazio()) {
            System.out.println("Deque vazio!");
            return null;
        }
        No noRemovido = fim;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        return noRemovido.documento;
    }

    public void exibir() {
        if (estaVazio()) {
            System.out.println("A fila de impressão está vazia.");
            return;
        }
        No atual = inicio;
        System.out.println("---- Fila de Impressão Atual ----");
        while (atual != null) {
            System.out.println("-> " + atual.documento.toString());
            atual = atual.proximo;
        }
        System.out.println("---------------------------------");
    }

    public int calcularTotalDocumentos() {
        int contador = 0;
        No atual = inicio;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }

    public int calcularTotalPaginas() {
        int totalPaginas = 0;
        No atual = inicio;
        while (atual != null) {
            totalPaginas += atual.documento.getPaginas();
            atual = atual.proximo;
        }
        return totalPaginas;
    }
}