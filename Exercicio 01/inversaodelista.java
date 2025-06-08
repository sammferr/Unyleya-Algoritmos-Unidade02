import java.util.ArrayList;

public class inversaodelista {
    public static void main(String[] args) {
        // Criando a lista original de compromissos
        ArrayList<String> compromissos = new ArrayList<>();

        // Adicionando tarefas na lista
        compromissos.add("1. Levantar e escovar os dentes");
        compromissos.add("2. Tomar café da manhã");
        compromissos.add("3. Estudar programação");
        compromissos.add("4. Almoçar e descansar");
        compromissos.add("5. Ler um livro");

        // Exibindo as tarefas na ordem normal
        System.out.println("=== TAREFAS DO DIA ===");
        for (int i = 0; i < compromissos.size(); i++) {
            System.out.println(compromissos.get(i));
        }

        // Criando nova lista para guardar as tarefas na ordem inversa
        ArrayList<String> tarefasReversas = new ArrayList<>();

        // Preenchendo a nova lista de trás pra frente
        for (int i = compromissos.size() - 1; i >= 0; i--) {
            tarefasReversas.add(compromissos.get(i));
        }

        // Exibindo a lista invertida
        System.out.println("\n=== TAREFAS DO DIA (ORDEM REVERSA) ===");
        for (int i = 0; i < tarefasReversas.size(); i++) {
            System.out.println(tarefasReversas.get(i));
        }
    }
}
