package torre_de_hanoi;

import java.util.Scanner;

public class TorreDeHanoi {
    public static long resolverHanoi(int numeroDiscos, char torreOrigem, char torreDestino, char torreAuxiliar) {
        long movimentos = 0;
        if (numeroDiscos == 1) {
            movimentos = 1;
        } else {
            movimentos += resolverHanoi(numeroDiscos - 1, torreOrigem, torreAuxiliar, torreDestino);
            movimentos++;
            movimentos += resolverHanoi(numeroDiscos - 1, torreAuxiliar, torreDestino, torreOrigem);
        }
        return movimentos;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int numeroDeDiscos = scanner.nextInt();
        scanner.close();

        long inicio = System.currentTimeMillis();
        long totalMovimentos = resolverHanoi(numeroDeDiscos, 'A', 'C', 'B');

        long fim = System.currentTimeMillis();
        long total = fim - inicio;
        long horas = total / 3600000;
        long resto = total % 3600000;
        long minutos = resto / 60000;
        resto %= 60000;
        long segundos = resto / 1000;
        long milissegundos = resto % 1000;

        System.out.println("Quantidade de movimentos: " + totalMovimentos);
        System.out.printf("Tempo de execução: %02d:%02d:%02d:%03d%n", horas, minutos, segundos, milissegundos);
        scanner.close();
    }
}