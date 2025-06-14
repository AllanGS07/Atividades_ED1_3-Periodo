package atividade3;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Teste Atividade 3: Lista Circular Simples ---");
        ListaCircular lista = new ListaCircular();
        lista.inserir("B");
        lista.inserir("C");
        
        System.out.print("Lista inicial: ");
        lista.exibir();
        
        System.out.println("\na. Contar elementos: " + lista.contarElementos());
        
        System.out.println("\nb. Inserir 'A' à esquerda da cabeça:");
        lista.inserirAEsquerdaDaCabeca("A");
        lista.exibir();
        
        System.out.println("\nc. Concatenar com outra lista:");
        ListaCircular outra = new ListaCircular();
        outra.inserir("D");
        outra.inserir("E");
        System.out.print("Outra lista: ");
        outra.exibir();
        lista.concatenar(outra);
        System.out.print("Lista após concatenação: ");
        lista.exibir();

        System.out.println("\ne. Fazer uma cópia da lista:");
        ListaCircular copia = lista.copiar();
        System.out.print("Cópia da lista: ");
        copia.exibir();
    }
}