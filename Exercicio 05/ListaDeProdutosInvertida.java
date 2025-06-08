import java.util.ArrayDeque;
import java.util.Deque;

public class ListaDeProdutosInvertida {

    public static void main(String[] args) {
        // Criando uma pilha para armazenar os produtos
        Deque<String> produtos = new ArrayDeque<>();

        // Adicionando produtos na pilha
        produtos.push("Notebook");
        produtos.push("Smartphone");
        produtos.push("Fone de Ouvido");
        produtos.push("Carregador");

        // Exibindo a ordem original de inserção (do topo para a base da pilha)
        System.out.println("Ordem de inserção (último inserido no topo):");
        for (String item : produtos) {
            System.out.println(item);
        }

        // Criando uma nova pilha para armazenar a ordem invertida
        Deque<String> produtosInvertidos = new ArrayDeque<>();

        // Transferindo os elementos para inverter a ordem
        while (!produtos.isEmpty()) {
            produtosInvertidos.push(produtos.pop());
        }

        // Exibindo a nova ordem (primeiro inserido no topo)
        System.out.println("\nOrdem invertida (primeiro inserido agora no topo):");
        for (String item : produtosInvertidos) {
            System.out.println(item);
        }
    }
}