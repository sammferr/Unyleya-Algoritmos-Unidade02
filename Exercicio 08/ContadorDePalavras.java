import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDePalavras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criar o mapa que vai guardar cada palavra e sua contagem
        HashMap<String, Integer> contador = new HashMap<>();

        System.out.println("Digite uma frase:");
        String texto = entrada.nextLine();

        // Remove pontuações e símbolos
        texto = texto.replaceAll("[^a-zA-ZÀ-ú\\s]", "");

        // Divide a frase nas palavras (usando espaços)
        String[] listaPalavras = texto.split("\\s+");

        // Para cada palavra, contar a frequência
        for (String palavra : listaPalavras) {
            palavra = palavra.toLowerCase(); // padroniza para minúsculas

            if (contador.containsKey(palavra)) {
                // Já existe: adiciona +1
                int atual = contador.get(palavra);
                contador.put(palavra, atual + 1);
            } else {
                // Primeira vez: começa com 1
                contador.put(palavra, 1);
            }
        }

        // Exibe as palavras e quantas vezes apareceram
        System.out.println("\nPalavras encontradas:");
        for (Map.Entry<String, Integer> item : contador.entrySet()) {
            System.out.println(item.getKey() + " apareceu " + item.getValue() + " vez(es).");
        }

        entrada.close();
    }
}