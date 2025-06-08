import java.util.HashMap;
import java.util.Map;

public class UnirEstoque {

    public static void main(String[] args) {
        // Criando o primeiro registro de inventário
        Map<String, Integer> inventarioA = new HashMap<>();
        inventarioA.put("Leite", 15);
        inventarioA.put("Pão", 10);
        inventarioA.put("Manteiga", 5);

        // Criando o segundo registro de inventário
        Map<String, Integer> inventarioB = new HashMap<>();
        inventarioB.put("Pão", 7);        // Produto repetido, soma deve acontecer
        inventarioB.put("Café", 12);
        inventarioB.put("Açúcar", 9);

        System.out.println("Inventário A: " + inventarioA);
        System.out.println("Inventário B: " + inventarioB);

        // Mesclar os dois inventários
        Map<String, Integer> inventarioFinal = juntarInventarios(inventarioA, inventarioB);

        // Exibir o inventário mesclado
        System.out.println("\nInventário mesclado:");
        for (Map.Entry<String, Integer> item : inventarioFinal.entrySet()) {
            System.out.println("Produto: " + item.getKey() + ", Quantidade: " + item.getValue());
        }
    }

    // Método que recebe dois mapas e retorna o mapa mesclado
    public static Map<String, Integer> juntarInventarios(Map<String, Integer> primeiro, Map<String, Integer> segundo) {
        // Criar um novo mapa para não modificar os originais diretamente
        Map<String, Integer> resultado = new HashMap<>(primeiro);

        for (Map.Entry<String, Integer> entrada : segundo.entrySet()) {
            String produto = entrada.getKey();
            int quantidade = entrada.getValue();

            if (resultado.containsKey(produto)) {
                // Se produto já existe, soma as quantidades
                int quantidadeAtual = resultado.get(produto);
                resultado.put(produto, quantidadeAtual + quantidade);
            } else {
                // Se não existe, adiciona o produto diretamente
                resultado.put(produto, quantidade);
            }
        }

        return resultado;
    }
}