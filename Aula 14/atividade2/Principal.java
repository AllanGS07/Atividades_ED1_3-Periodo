package atividade2;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Teste Atividade 2: Lista com Nó Cabeça ---");
        ListaDuplamenteEncadeadaComCabeca lista = new ListaDuplamenteEncadeadaComCabeca();

        System.out.print("Lista recém-criada: ");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());

        System.out.println("\nInserindo Homer, Marge e Bart...");
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());
        
        System.out.println("\nBuscando por Marge: " + (lista.buscar("Marge") != null ? "Encontrado" : "Não encontrado"));
        System.out.println("Buscando por Lisa: " + (lista.buscar("Lisa") != null ? "Encontrado" : "Não encontrado"));
        
        System.out.println("\nEliminando Marge...");
        lista.eliminar("Marge");
        lista.exibir();
        
        System.out.println("Eliminando Lisa (não existe)...");
        boolean removido = lista.eliminar("Lisa");
        System.out.println("Removido? " + removido);
        lista.exibir();
        
        System.out.println("\nEliminando Homer e Bart...");
        lista.eliminar("Homer");
        lista.eliminar("Bart");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());
    }
}