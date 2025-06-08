import java.util.ArrayList;

public class ContatosUnicos {

    public static void main(String[] args) {
        // Criando lista de usuários
        ArrayList<String> listaContatos = new ArrayList<>();

        // Adicionando contatos com duplicatas
        listaContatos.add("Carlos - 81999999999");
        listaContatos.add("Maria - 81988888888");
        listaContatos.add("João - 81977777777");
        listaContatos.add("Carlos - 81999999999"); // duplicado
        listaContatos.add("Ana - 81988888888"); // mesmo número de Maria

        // Exibindo contatos originais
        System.out.println("Lista original de contatos:");
        for (String item : listaContatos) {
            System.out.println(item);
        }

        // Criando nova lista sem números repetidos
        ArrayList<String> contatosFiltrados = new ArrayList<>();
        ArrayList<String> numerosSalvos = new ArrayList<>();

        for (String item : listaContatos) {
            String[] dados = item.split(" - ");
            String numero = dados[1];

            if (!numerosSalvos.contains(numero)) {
                contatosFiltrados.add(item);
                numerosSalvos.add(numero);
            }
        }

        // Exibindo lista sem duplicatas
        System.out.println("\nContatos após remoção de duplicatas:");
        for (String item : contatosFiltrados) {
            System.out.println(item);
        }
    }
}
