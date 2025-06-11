package aeroporto3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PistaDecolagem {
    private final Queue<Aviao> fila = new LinkedList<>();

    public PistaDecolagem() {
    }

    public int numeroAguardando() {
        return fila.size();
    }

    public Aviao autorizarDecolagem() {
        return fila.isEmpty() ? null : fila.poll();
    }

    public void adicionarAviao(String nome, int id) {
        fila.offer(new Aviao(nome, id));
    }

    public void listarTodos() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum avião na fila.");
        } else {
            System.out.println("Aviões na fila:");
            for (Aviao a : fila) {
                System.out.println(a);
            }
        }
    }

    public Aviao primeiroAviao() {
        return fila.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PistaDecolagem pista = new PistaDecolagem();
        int op;
        do {
            System.out.println("\nControle de Pista de Decolagem");
            System.out.println("1. Listar número de aviões aguardando");
            System.out.println("2. Autorizar decolagem do primeiro avião");
            System.out.println("3. Adicionar avião à fila");
            System.out.println("4. Listar todos os aviões na fila");
            System.out.println("5. Mostrar primeiro avião da fila");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Quantidade de aviões na fila: " + pista.numeroAguardando());
                    break;
                case 2:
                    Aviao autorizado = pista.autorizarDecolagem();
                    if (autorizado != null) {
                        System.out.println("Decolagem autorizada para: " + autorizado);
                    } else {
                        System.out.println("Nenhum avião para decolar.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("ID do avião: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    pista.adicionarAviao(nome, id);
                    System.out.println("Avião adicionado à fila.");
                    break;
                case 4:
                    pista.listarTodos();
                    break;
                case 5:
                    Aviao primeiro = pista.primeiroAviao();
                    if (primeiro != null) {
                        System.out.println("Primeiro avião: " + primeiro);
                    } else {
                        System.out.println("Nenhum avião na fila.");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 6);
        scanner.close();
    }
}
