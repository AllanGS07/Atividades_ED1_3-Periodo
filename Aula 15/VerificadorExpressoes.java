import java.util.Scanner;

public class VerificadorExpressoes {

    private static boolean parCorrespondente(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') || (abertura == '[' && fechamento == ']') || (abertura == '{' && fechamento == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão matemática:");
        String expressao = scanner.nextLine();

        PilhaDinamica pilha = new PilhaDinamica();
        boolean expressaoCorreta = true;

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    expressaoCorreta = false;
                    break;
                }
                char topo = pilha.pop();
                if (!parCorrespondente(topo, caractere)) {
                    expressaoCorreta = false;
                    break;
                }
            }
        }

        if (expressaoCorreta && !pilha.isEmpty()) {
            expressaoCorreta = false;
        }

        if (expressaoCorreta) {
            System.out.println("A expressão está com a parametrização CORRETA.");
        } else {
            System.out.println("A expressão está com a parametrização INCORRETA.");
        }

        scanner.close();
    }
}