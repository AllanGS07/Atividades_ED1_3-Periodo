package torre_de_hanoi;

import java.util.Scanner;

public class TorreDeHanoi {
    public static void resolverHanoi(int numeroDiscos, char torreOrigem, char torreDestino, char torreAuxiliar) {
        if (numeroDiscos == 1) {
            System.out.println("Mover disco 1 da torre " + torreOrigem + " para a torre " + torreDestino);
            return;
        }
        resolverHanoi(numeroDiscos - 1, torreOrigem, torreAuxiliar, torreDestino);
        System.out.println("Mover disco " + numeroDiscos + " da torre " + torreOrigem + " para a torre " + torreDestino);
        resolverHanoi(numeroDiscos - 1, torreAuxiliar, torreDestino, torreOrigem);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int numeroDeDiscos = scanner.nextInt();
        scanner.close();

        long inicio = System.currentTimeMillis();
        System.out.println("\nResolvendo Torres de Hanói para " + numeroDeDiscos + " discos:");
        resolverHanoi(numeroDeDiscos, 'A', 'C', 'B');

        // Cálculo do tempo de execução
        long fim = System.currentTimeMillis();
        long total = fim - inicio;
        long horas = total / 3600000;
        long resto = total % 3600000;
        long minutos = resto / 60000;
        resto %= 60000;
        long segundos = resto / 1000;
        long milissegundos = resto % 1000;
        System.out.printf("Tempo de execução: %02d:%02d:%02d:%03d%n", horas, minutos, segundos, milissegundos);

    }
}