package homer;

public class Principal {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("--- Início dos Casos de Teste ---");

        // Teste 1: Adicionar Homer e Marge na lista e imprimir 
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Marge");
        lista.exibir();
        System.out.print("\n");

        // Teste 2: Esvaziar a lista e imprimir
        lista.esvaziar();
        lista.exibir();
        System.out.print("\n");

        // Teste 3: Adicionar Homer, depois Bart na posição 0 e Moll na posição 1
        lista.inserirNoFim("Homer"); // Lista: Homer
        lista.inserirNaPosicao(0, "Bart"); // Lista: Bart -> Homer
        lista.inserirNaPosicao(1, "Moll"); // Lista: Bart -> Moll -> Homer
        lista.exibir();
        System.out.print("\n");

        // Teste 4: Esvaziar a lista
        lista.esvaziar();
        System.out.print("\n");
        
        // Teste 5: Adicionar Homer e Bart, depois Lisa no início
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Bart");
        lista.inserirNoInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 6: Esvaziar a lista e imprimir
        lista.esvaziar();
        lista.exibir();
        System.out.print("\n");

        // Teste 7: Adicionar Homer e Maggie, depois Bart na pos 0 e Marge na pos 1. Verificar se Lisa está na lista
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Maggie");
        lista.inserirNaPosicao(0, "Bart");
        lista.inserirNaPosicao(1, "Marge");
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));
        System.out.print("\n");

        // Teste 8: Esvaziar a lista
        lista.esvaziar();
        System.out.print("\n");
        
        // Teste 9: Adicionar Homer e Bart e imprimir resultado e tamanho
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Bart");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 10: Verificar se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 11: Esvaziar a lista
        lista.esvaziar();
        System.out.print("\n");

        // Teste 12: Adicionar vários personagens em posições diferentes
        lista.inserirNoInicio("Homer");
        lista.inserirNoInicio("Bart");
        lista.inserirNoFim("Marge");
        lista.inserirNaPosicao(1, "Maggie");
        lista.inserirNoInicio("Ned Flanders");
        lista.inserirNoFim("Sr. Burns");
        lista.exibir();
        System.out.print("\n");

        // Teste 13: Remover do fim da lista
        lista.removerDoFim();
        lista.exibir();
        System.out.print("\n");

        // Teste 14: Remover da posição 1
        lista.removerDaPosicao(1);
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 15: Verificar se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 16: Remover do começo da lista
        lista.removerDoInicio();
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 17: Verificar se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.print("\n");

        // Teste 18: Esvaziar a lista e imprimir
        lista.esvaziar();
        lista.exibir();
        System.out.print("\n");

        System.out.println("\n--- Fim dos Casos de Teste ---");
    }
}