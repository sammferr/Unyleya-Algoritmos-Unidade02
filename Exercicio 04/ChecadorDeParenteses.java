import java.util.Scanner;
import java.util.Stack;

public class ChecadorDeParenteses {

    // Método para verificar se os parênteses estão balanceados
    public static boolean checarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        // Percorre cada caractere da expressão
        for (int i = 0; i < expressao.length(); i++) {
            char caractereAtual = expressao.charAt(i);

            // Se for parêntese de abertura, adiciona à pilha
            if (caractereAtual == '(') {
                pilha.push(caractereAtual);
                System.out.println("Encontrado '(': adicionado à pilha.");
            } 
            // Se for parêntese de fechamento, verifica se há correspondente na pilha
            else if (caractereAtual == ')') {
                if (pilha.isEmpty()) {
                    System.out.println("Encontrado ')', mas pilha está vazia. Erro de balanceamento!");
                    return false;
                } else {
                    pilha.pop();
                    System.out.println("Encontrado ')': removido '(' correspondente da pilha.");
                }
            }
        }

        // Verifica se a pilha está vazia após a análise
        if (pilha.isEmpty()) {
            return true;
        } else {
            System.out.println("Fim da expressão, mas há '(' sem fechar. Erro!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita a expressão ao usuário
        System.out.println("Digite uma expressão matemática com parênteses:");
        String entradaUsuario = entrada.nextLine();

        // Chama o método para verificar os parênteses
        boolean balanceado = checarBalanceamento(entradaUsuario);

        // Exibe o resultado
        if (balanceado) {
            System.out.println("\nParênteses estão balanceados!");
        } else {
            System.out.println("\nParênteses NÃO estão balanceados!");
        }

        entrada.close();
    }
}