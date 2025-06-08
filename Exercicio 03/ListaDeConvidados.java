import java.util.ArrayList;

public class ListaDeConvidados {

    public static void main(String[] args) {
        // Criando duas listas de nomes
        ArrayList<String> convidadosA = new ArrayList<>();
        ArrayList<String> convidadosB = new ArrayList<>();

        // Adicionando convidados na primeira lista
        convidadosA.add("Lucas Lima");
        convidadosA.add("Fernanda Dias");
        convidadosA.add("Tiago Souza");
        convidadosA.add("Bruna Castro");

        // Adicionando convidados na segunda lista
        convidadosB.add("Juliana Paes");
        convidadosB.add("Marcelo Melo");
        convidadosB.add("Giovana Alves");
        convidadosB.add("Rodrigo Faro");

        // Exibindo as duas listas separadamente
        System.out.println("Lista de Convidados A:");
        for (String nome : convidadosA) {
            System.out.println(nome);
        }

        System.out.println("\nLista de Convidados B:");
        for (String nome : convidadosB) {
            System.out.println(nome);
        }

        // Criando nova lista intercalando nomes
        ArrayList<String> listaFinal = new ArrayList<>();

        int maiorTamanho = Math.max(convidadosA.size(), convidadosB.size());

        for (int i = 0; i < maiorTamanho; i++) {
            if (i < convidadosA.size()) {
                listaFinal.add(convidadosA.get(i));
            }
            if (i < convidadosB.size()) {
                listaFinal.add(convidadosB.get(i));
            }
        }

        // Exibindo a lista intercalada
        System.out.println("\nLista de Convidados Intercalada:");
        for (String nome : listaFinal) {
            System.out.println(nome);
        }
    }
}
