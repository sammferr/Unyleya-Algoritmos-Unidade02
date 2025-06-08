import java.util.Scanner;

public class LojaOnlineSort {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita a quantidade de itens que serão cadastrados
        System.out.print("Informe a quantidade de itens: ");
        int total = teclado.nextInt();
        teclado.nextLine(); // limpa quebra de linha

        // Vetores para armazenar nomes e vendas dos itens
        String[] itens = new String[total];
        int[] quantidades = new int[total];

        // Cadastro dos produtos
        for (int i = 0; i < total; i++) {
            System.out.print("Nome do item " + (i + 1) + ": ");
            itens[i] = teclado.nextLine();

            System.out.print("Número de vendas: ");
            quantidades[i] = teclado.nextInt();
            teclado.nextLine(); // limpa quebra de linha
        }

        // Ordenação Bubble Sort (do maior para o menor número de vendas)
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (quantidades[j] < quantidades[j + 1]) {
                    // Troca as posições no vetor de quantidades
                    int aux = quantidades[j];
                    quantidades[j] = quantidades[j + 1];
                    quantidades[j + 1] = aux;

                    // Troca os nomes também para manter o vínculo com as vendas
                    String temp = itens[j];
                    itens[j] = itens[j + 1];
                    itens[j + 1] = temp;
                }
            }
        }

        // Exibição do resultado
        System.out.println("\nItens mais vendidos (ordem decrescente):");
        for (int i = 0; i < total; i++) {
            System.out.println(itens[i] + " vendeu " + quantidades[i] + " unidade(s)");
        }

        teclado.close();
    }
}