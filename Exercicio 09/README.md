# Faculdade Unyleya

## Unidade 2 - Algoritmos em Java

### Projeto: Mesclagem de Mapas (Inventário)

**Questão:** Mesclar Mapas
Este projeto simula a junção de dois registros de inventário de produtos, onde cada registro é representado por um **HashMap**. O programa combina as quantidades dos produtos, somando os valores quando o produto aparece nos dois mapas, garantindo uma visão consolidada do estoque.

---

### Funcionalidades

* Criação de dois inventários separados com produtos e quantidades
* Mesclagem dos inventários somando quantidades de produtos iguais
* Exibição dos inventários antes e depois da mesclagem
* Método separado para realizar a mesclagem, facilitando a reutilização

---

### Exemplo de Execução

```
Inventário A: {Leite=15, Pão=10, Manteiga=5}
Inventário B: {Pão=7, Café=12, Açúcar=9}

Inventário mesclado:
Produto: Leite, Quantidade: 15
Produto: Pão, Quantidade: 17
Produto: Manteiga, Quantidade: 5
Produto: Café, Quantidade: 12
Produto: Açúcar, Quantidade: 9
```

---

### Como Executar

1. Compile o arquivo `UnirEstoque.java` com um compilador Java:

   ```bash
   javac UnirEstoque.java
   ```

2. Execute o programa:

   ```bash
   java UnirEstoque
   ```

3. Observe os inventários exibidos e o resultado da mesclagem no console.

---

### Autor

José Samuel Ferreira da Silva
Curso: Análise e Desenvolvimento de Sistemas

---

Faculdade Unyleya - 2025.