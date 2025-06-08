import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Classe representando um cliente na fila da clínica
class Cliente {
    private String nomeCliente;
    private int idadeCliente;

    public Cliente(String nome, int idade) {
        this.nomeCliente = nome;
        this.idadeCliente = idade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }
}

public class FilaClinica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Queue<Cliente> fila = new LinkedList<>();
        int escolha;

        do {
            // Menu de opções
            System.out.println("\n===== Sistema de Fila da Clínica =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Exibir Fila");
            System.out.println("3 - Chamar Próximo Cliente");
            System.out.println("4 - Encerrar Sistema");
            System.out.print("Escolha uma opção: ");
            escolha = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            switch (escolha) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = entrada.nextLine();
                    System.out.print("Idade do cliente: ");
                    int idade = entrada.nextInt();
                    Cliente novo = new Cliente(nome, idade);
                    fila.add(novo);
                    System.out.println("Cliente adicionado à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("\n--- Clientes na Fila ---");
                        for (Cliente c : fila) {
                            System.out.println("Nome: " + c.getNomeCliente() + ", Idade: " + c.getIdadeCliente());
                        }
                    }
                    break;

                case 3:
                    Cliente atendido = fila.poll();
                    if (atendido != null) {
                        System.out.println("Cliente atendido: " + atendido.getNomeCliente());
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);

        entrada.close();
    }
}
