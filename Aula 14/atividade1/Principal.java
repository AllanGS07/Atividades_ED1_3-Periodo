package atividade1;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Teste Atividade 1 ---");

        // Teste de Concatenação
        System.out.println("\n--- a. Teste Concatenar ---");
        ListaDuplamenteEncadeada listaA = new ListaDuplamenteEncadeada();
        listaA.inserirNoFim("Homer");
        listaA.inserirNoFim("Marge");
        
        ListaDuplamenteEncadeada listaB = new ListaDuplamenteEncadeada();
        listaB.inserirNoFim("Bart");
        listaB.inserirNoFim("Lisa");

        System.out.print("Lista A original: ");
        listaA.exibir();
        System.out.print("Lista B original: ");
        listaB.exibir();

        listaA.concatenar(listaB);
        System.out.print("Lista A após concatenar com B: ");
        listaA.exibir();
        System.out.print("Lista B após ser concatenada: ");
        listaB.exibir();

        // Teste de Separação
        System.out.println("\n--- b. Teste Separar ---");
        ListaDuplamenteEncadeada listaParaSeparar = new ListaDuplamenteEncadeada();
        listaParaSeparar.inserirNoFim("A");
        listaParaSeparar.inserirNoFim("B");
        listaParaSeparar.inserirNoFim("C");
        listaParaSeparar.inserirNoFim("D");
        listaParaSeparar.inserirNoFim("E");
        
        System.out.print("Lista original para separar: ");
        listaParaSeparar.exibir();

        ListaDuplamenteEncadeada[] listasSeparadas = listaParaSeparar.separar(2);
        System.out.print("Parte 1 (separada na posição 2): ");
        listasSeparadas[0].exibir();
        System.out.print("Parte 2 (separada na posição 2): ");
        listasSeparadas[1].exibir();
        
        // Teste de Intercalação
        System.out.println("\n--- c. Teste Intercalar ---");
        ListaDuplamenteEncadeada ordenada1 = new ListaDuplamenteEncadeada();
        ordenada1.inserirNoFim("A");
        ordenada1.inserirNoFim("C");
        ordenada1.inserirNoFim("E");
        
        ListaDuplamenteEncadeada ordenada2 = new ListaDuplamenteEncadeada();
        ordenada2.inserirNoFim("B");
        ordenada2.inserirNoFim("D");
        ordenada2.inserirNoFim("F");

        System.out.print("Lista ordenada 1: ");
        ordenada1.exibir();
        System.out.print("Lista ordenada 2: ");
        ordenada2.exibir();

        ListaDuplamenteEncadeada intercalada = ListaDuplamenteEncadeada.intercalar(ordenada1, ordenada2);
        System.out.print("Lista intercalada: ");
        intercalada.exibir();
    }
}