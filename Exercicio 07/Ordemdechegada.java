// Simulador simples de atendimento em uma loja com fila
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ordemdechegada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Queue<String> filaLoja = new LinkedList<>();

        int escolha;

        do {
            // Menu principal
            System.out.println("\n--- Menu da Loja ---");
            System.out.println("1 - Cliente chegou");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Mostrar fila atual");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            escolha = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            switch (escolha) {
                case 1:
                    // Adicionar cliente na fila
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = entrada.nextLine();
                    filaLoja.add(nomeCliente);
                    System.out.println("Cliente " + nomeCliente + " entrou na fila.");
                    break;
                
                case 2:
                    // Atender o próximo cliente
                    String proximo = filaLoja.poll();
                    if (proximo != null) {
                        System.out.println("Atendendo: " + proximo);
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;

                case 3:
                    // Exibir todos os clientes na fila
                    System.out.println("\nFila atual:");
                    if (filaLoja.isEmpty()) {
                        System.out.println("Nenhum cliente aguardando.");
                    } else {
                        for (String cliente : filaLoja) {
                            System.out.println("- " + cliente);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando sistema de atendimento.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 4);

        entrada.close();
    }
}
