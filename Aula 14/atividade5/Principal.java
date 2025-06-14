package atividade5;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Teste Atividade 5: Lista Circular com Nó Cabeça ---");
        ListaCircularComCabeca lista = new ListaCircularComCabeca();

        System.out.print("Lista recém-criada: ");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());

        System.out.println("\nInserindo Homer e Marge...");
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());

        System.out.println("\nRemovendo Homer...");
        lista.remover("Homer");
        lista.exibir();
        
        System.out.println("\nRemovendo Bart (não existe)...");
        System.out.println("Removido? " + lista.remover("Bart"));
        lista.exibir();

        System.out.println("\nRemovendo Marge...");
        lista.remover("Marge");
        lista.exibir();
        System.out.println("Está vazia? " + lista.estaVazia());
    }
}