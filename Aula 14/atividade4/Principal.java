package atividade4;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Teste Atividade 4: Lista Duplamente Circular ---");
        ListaDuplamenteCircular lista = new ListaDuplamenteCircular();
        lista.inserir("B");
        lista.inserir("C");

        System.out.print("Lista inicial: ");
        lista.exibir();

        System.out.println("\na. Contar elementos: " + lista.contarElementos());

        System.out.println("\nb. Inserir 'A' à esquerda da cabeça:");
        lista.inserirAEsquerdaDaCabeca("A");
        lista.exibir();

        System.out.println("\nc. Concatenar com outra lista:");
        ListaDuplamenteCircular outra = new ListaDuplamenteCircular();
        outra.inserir("D");
        outra.inserir("E");
        lista.concatenar(outra);
        System.out.print("Lista após concatenação: ");
        lista.exibir();

        System.out.println("\ne. Fazer uma cópia:");
        ListaDuplamenteCircular copia = lista.copiar();
        System.out.print("Cópia: ");
        copia.exibir();
    }
}