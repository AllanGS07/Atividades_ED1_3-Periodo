package homer;

public class Principal {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("--- Início dos Casos de Teste ---");

        // Teste 1: Adicionar Homer e Marge na lista e imprimir 
        System.out.println("\n--- Teste 1 ---");
        System.out.println("Adicionando Homer e Marge...");
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Marge");
        lista.exibir();

        // Teste 2: Esvaziar a lista e imprimir 
        System.out.println("\n--- Teste 2 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();
        lista.exibir();

        // Teste 3: Adicionar Homer, depois Bart na posição 0 e Moll na posição 1 
        System.out.println("\n--- Teste 3 ---");
        System.out.println("Adicionando Homer, depois Bart (pos 0) e Moll (pos 1)...");
        lista.inserirNoFim("Homer"); // Lista: Homer
        lista.inserirNaPosicao(0, "Bart"); // Lista: Bart -> Homer
        lista.inserirNaPosicao(1, "Moll"); // Lista: Bart -> Moll -> Homer
        lista.exibir();

        // Teste 4: Esvaziar a lista 
        System.out.println("\n--- Teste 4 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();
        
        // Teste 5: Adicionar Homer e Bart, depois Lisa no início 
        System.out.println("\n--- Teste 5 ---");
        System.out.println("Adicionando Homer, Bart, e Lisa no início...");
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Bart");
        lista.inserirNoInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 6: Esvaziar a lista e imprimir 
        System.out.println("\n--- Teste 6 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();
        lista.exibir();

        // Teste 7: Adicionar Homer e Maggie, depois Bart na pos 0 e Marge na pos 1. Verificar se Lisa está na lista 
        System.out.println("\n--- Teste 7 ---");
        System.out.println("Adicionando Homer, Maggie, Bart (pos 0), Marge (pos 1)...");
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Maggie");
        lista.inserirNaPosicao(0, "Bart");
        lista.inserirNaPosicao(1, "Marge");
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

        // Teste 8: Esvaziar a lista 
        System.out.println("\n--- Teste 8 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();
        
        // Teste 9: Adicionar Homer e Bart e imprimir resultado e tamanho 
        System.out.println("\n--- Teste 9 ---");
        System.out.println("Adicionando Homer e Bart...");
        lista.inserirNoFim("Homer");
        lista.inserirNoFim("Bart");
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 10: Verificar se Marge, Homer, Bart e Maggie estão na lista 
        System.out.println("\n--- Teste 10 ---");
        System.out.println("Verificando elementos...");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 11: Esvaziar a lista 
        System.out.println("\n--- Teste 11 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();

        // Teste 12: Adicionar vários personagens em posições diferentes 
        System.out.println("\n--- Teste 12 ---");
        System.out.println("Realizando múltiplas inserções...");
        lista.inserirNoInicio("Homer");
        lista.inserirNoInicio("Bart");
        lista.inserirNoFim("Marge");
        lista.inserirNaPosicao(1, "Maggie");
        lista.inserirNoInicio("Ned Flanders");
        lista.inserirNoFim("Sr. Burns");
        lista.exibir();

        // Teste 13: Remover do fim da lista 
        System.out.println("\n--- Teste 13 ---");
        System.out.println("Removendo do fim...");
        lista.removerDoFim();
        lista.exibir();

        // Teste 14: Remover da posição 1 
        System.out.println("\n--- Teste 14 ---");
        System.out.println("Removendo da posição 1...");
        lista.removerDaPosicao(1);
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 15: Verificar se Marge, Homer, Bart e Maggie estão na lista 
        System.out.println("\n--- Teste 15 ---");
        System.out.println("Verificando elementos...");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 16: Remover do começo da lista 
        System.out.println("\n--- Teste 16 ---");
        System.out.println("Removendo do começo...");
        lista.removerDoInicio();
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 17: Verificar se Marge, Homer, Bart e Maggie estão na lista 
        System.out.println("\n--- Teste 17 ---");
        System.out.println("Verificando elementos...");
        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Teste 18: Esvaziar a lista e imprimir 
        System.out.println("\n--- Teste 18 ---");
        System.out.println("Esvaziando a lista...");
        lista.esvaziar();
        lista.exibir();

        System.out.println("\n--- Fim dos Casos de Teste ---");
    }
}