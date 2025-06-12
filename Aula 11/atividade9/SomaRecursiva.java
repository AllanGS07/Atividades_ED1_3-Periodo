package atividade9;

import java.util.Arrays;
import java.util.List;

public class SomaRecursiva {

    public static int somar(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        
        int primeiro = lista.get(0);
        List<Integer> resto = lista.subList(1, lista.size());
        
        return primeiro + somar(resto);
    }

    public static void main(String[] args) {
        List<Integer> minhaLista = Arrays.asList(1, 2, 3, 4, 10);
        int soma = somar(minhaLista);

        System.out.println("A lista é: " + minhaLista);
        System.out.println("A soma recursiva é: " + soma);
    }
}