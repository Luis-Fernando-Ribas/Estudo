package Pct_Estudo;

// Imports usados neste arquivo.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Classe_Estudo {

    public static void main(String[] args) {
        // Referências e tipos de dados.
        Scanner scanner = new Scanner(System.in);

        String gun = "Shotgun";
        System.out.println(gun);

        // Arrays: tamanho fixo e acesso por índice.
        String[] category = new String[6];
        category[0] = "Monotiro";
        category[1] = "Canos Duplos";
        category[2] = "Bombardeio";
        category[3] = "Semiautomatica";
        category[4] = "Alavanca";
        category[5] = "Precisão";

        // Arrays.fill(category, "Desconhecido");
        System.out.println(Arrays.toString(category));

        // Tipos primitivos.
        int shells = 8;
        float size = 1.05f;
        double value = 7999.99;
        boolean shortDistance = true;

        // 1. Operadores aritméticos.
        int soma = 4 + 2;
        int subtracao = 6 - 3;
        int multiplicacao = 5 * 4;
        int divisao = 10 / 5;
        int resto = 30 % 4;

        // 2. Operadores relacionais.
        if (20 == shells) {
            System.out.println(subtracao);
        }

        if (soma != shells) {
            System.out.println(multiplicacao);
        }

        if (20 > shells && 20 < soma) {
            System.out.println(divisao + value);
        }

        if (20 >= shells && 20 <= soma) {
            System.out.println(resto + size);
        }

        // 3. Operadores lógicos: AND (&&), OR (||) e NOT (!).
        // Arrays.equals compara o conteúdo de dois arrays.
        String[] outraCategoria = {"Monotiro", "Canos Duplos"};
        if ((soma < 10 && soma > 5) || !Arrays.equals(category, outraCategoria)) {
            System.out.println(shortDistance);
        }

        // Estruturas de controle: if/else.
        if (shells >= 8) {
            System.out.println("Possui pelo menos 8 cartuchos.");
        } else {
            System.out.println("Possui menos de 8 cartuchos.");
        }

        // Switch: category.length é o tamanho do array (6 neste exemplo).
        switch (category.length) {
            case 0 -> System.out.println("Array vazio");
            case 1 -> System.out.println("Array com um elemento");
            default -> System.out.println("Quantidade de elementos: " + category.length);
        }

        // Laço for.
        for (int i = 0; i < shells; i++) {
            System.out.println("Iteração " + i);
        }

        // Scanner: leitura de dados do usuário.
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        // Classes e objetos.
        Gun rifle = new Gun("Rifle", 8);
        System.out.println(rifle.getName() + " possui " + rifle.getShells() + " cartuchos.");

        // Encapsulamento.
        Knife karambit = new Knife();
        karambit.nomear("Karambit");
        System.out.println("Nome da faca: " + karambit.getName());

        // Herança e polimorfismo.
        Knife adaga = new Adaga();
        adaga.nomear("Adaga");
        System.out.println("Nome do objeto: " + adaga.getName());

        // Abstração: uma classe abstrata não pode ser instanciada diretamente.
        // Veja a classe abstrata Sword no final deste arquivo.

        // Exemplo de método que retorna um valor.
        System.out.println("Soma de exemplo: " + somar(soma, divisao));

        // ArrayList: lista dinâmica.
        List<String> weapons = new ArrayList<>();
        weapons.add("guns");
        weapons.add("swords");
        weapons.add("knives");
        weapons.add("hammers");

        // Forma simples de percorrer uma lista.
        for (String weapon : weapons) {
            System.out.println(weapon);
        }

        System.out.println("A lista contém guns? " + weapons.contains("guns"));
        System.out.println("Quantidade de elementos: " + weapons.size());

        // HashMap: coleção de pares chave-valor; não é sincronizado por padrão.
        System.out.println("Básico ao Avançado");
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Pistol", "1");
        mapa.put("Magnum", "2");
        mapa.put("Eagle", "3");

        String removido = mapa.remove("Pistol");
        System.out.println("Valor removido de Pistol: " + removido);

        // A chave deve ser String, pois o mapa foi declarado HashMap<String, String>.
        System.out.println("Valor de Magnum: " + mapa.get("Magnum"));
        System.out.println("Existe a chave Eagle? " + mapa.containsKey("Eagle"));

        for (Entry<String, String> entry : mapa.entrySet()) {
            String chaveMapa = entry.getKey();
            String valorMapa = entry.getValue();
            System.out.println("Chave: " + chaveMapa + " e valor: " + valorMapa);
        }

        System.out.println("Quantidade de elementos: " + mapa.size());
        mapa.clear();
        System.out.println("Coleção limpa. Quantidade: " + mapa.size());

        // Hashtable: sincronizado e não permite chaves ou valores null.
        Hashtable<String, Integer> tabela = new Hashtable<>();
        tabela.put("Valor", 1);
        tabela.put("valor", 2);
        System.out.println("Valor na tabela: " + tabela.get("Valor"));

        // ConcurrentHashMap: permite operações concorrentes; não aceita null.
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        System.out.println("Valor de A: " + map.get("A"));
        System.out.println("Chave inexistente: " + map.get("C")); // Retorna null.

        // Cria o valor somente se a chave ainda não existir.
        map.computeIfAbsent("C", key -> key.length());
        System.out.println("Valor de C: " + map.get("C"));

        // Só insere se a chave ainda não existir.
        map.putIfAbsent("A", 10);

        // Atualiza o valor existente.
        map.compute("A", (key, val) -> val + 1);

        // Soma 1 ao valor associado à chave A.
        map.merge("A", 1, Integer::sum);
        System.out.println("Valor atualizado de A: " + map.get("A"));

        // Hashing: hashCode fornece um código hash, não um índice direto do array.
        String chave = "Amigo";
        int hash = chave.hashCode();
        System.out.println("Hash de Amigo: " + hash);

        // Colisões acontecem quando chaves diferentes produzem o mesmo hash
        // ou acabam no mesmo bucket da estrutura interna do mapa.

        scanner.close();
    }

