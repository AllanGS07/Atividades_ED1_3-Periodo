package atividade10;

import java.util.Scanner;

public class PotenciaRecursiva {

    public static long calcular(int a, int b) {
        if (a <= 0 || b < 0) {
            throw new IllegalArgumentException("A base 'a' deve ser positiva e o expoente 'b' não-negativo.");
        }

        if (b == 0) {
            return 1;
        }

        return a * calcular(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int expoente = scanner.nextInt();
        long resultado = calcular(base, expoente);
        System.out.printf("O resultado de %d elevado a %d é: %d\n", base, expoente, resultado);

        scanner.close();
    }
}
