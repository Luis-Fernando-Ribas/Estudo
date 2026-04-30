package Pct_Estudo;
//Pacote

//importação
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;
import java.util.Hashtable;

public class Classe_Estudo { //classe principal
	
	public static void main (String[] args) throws Exception{ //main ou menu
		
		//referencias (endereço de mémoria)
		
		Scanner scanner = new Scanner(System.in); //iniciando o Scanner
		
		String gun = "Shotgun"; //palavras são Strings
		System.out.println(gun); //imprimindo uma String
		
		String []category = new String [6]; //listas fixas são Arrays
		
		
		//preenchendo array
		
		category[0] = "Monotiro";
		category[1] = "Canos Duplos";
		category[2] = "Bombardeio";
		category[3] = "Semiautomatica";
		category[4] = "Alavanca";
		category[5] = "Precisão";
		
		//Arrays.fill(category, "Desconhecido"); <---forma de padronizar um espaço na mémoria que vai ser preenchido
		
		//imprimindo array
		
		System.out.println(Arrays.toString(category));
		
		//primitivos (valor direto)
		
		int shells = 8; //numeros inteiros são int
		float size = 1.05f; //numeros fracionados curtos são float
		double value = 7999.99; //numeros fracionados compridos ou para calculos são double
		boolean short_distance = true; //valores verdadeiros ou falsos são booleanos
		
		//Operadores
		
			//1.Aritmeticos
		
			int soma = 4 + 2;
			int subtração = 6-3;
			int multiplicação = 5*4;
			int divisão = 10 / 5;
			int resto = 30 % 4;
			
			//2.Relacional
			
			//Comparação
			
			if (20 == shells) {
				System.out.println(subtração);
			}
			//Diferença
			
			if (soma != shells) {
				System.out.println(multiplicação);
			}
			//Maior/Menor
			
			if (20 > shells && 20 < soma) {
				System.out.println(divisão + value);
			}
			//Maior/Menor ou igual
			
			if (20 >= shells && 20 <= soma) {
				System.out.println(resto + size);
			}
			//3.Lógico
			// E, OU, Porta Lógica NOT
			
			if (soma <10 && soma>5 || !category.equals(category)) {
				System.out.println(short_distance);
			}
		
		//Estrutura de Controle
			
			//1.Condicional
			
			if (shells >= 8) {
			    System.out.println("Not Shotgun");
			} else {
			    System.out.println("It's Shotgun");
			}
			
			//2.Switch
			
			switch (category.length) { //condição para o switch
		    case 0 -> System.out.println("Shoot"); //casos do switch se for a escolha
		    case 1 -> System.out.println("Shoot");
			}
			
			//Loop
			
			for (int i1 = 0; i1 <= shells; i1++) { //condições para o loop
			    System.out.println("shoot"); //ação feita enquanto o loop permanecer
			}
						
		//utilizando o Scanner 
			
			System.out.println("Qual seu nome?"); //Pergunta para o usuario
			String nome1 = scanner.nextLine(); //Lendo ou scaneando a resposta
			System.out.println(nome1); //imprimindo a resposta
			
		//Classes e Objetos
			
		class Gun {
			String name;
			int shells;
			}
		Gun rifle = new Gun();
		rifle.name = "rifle";
		rifle.shells = 8;
		
		//Encapsulamento
		
		class Knife {
			private String name;
			
			public String getName() {
				return name;
			}
			void nomear(String name) {
			name = "Nome novo";
			}
		}
		//Herança
		
		class Adaga extends Knife {
			void nomear(String name) {
				name = "Adaga";
			}
		}
		//Polimorfismo
		
		Knife karambit = new Knife();
		karambit.nomear("Karambit"); //comportamento diferente
		
		//Abstração
		
		abstract class Sword {
		    abstract double cortar();
		}
		
		/*Método
		private static void retorno(int soma, int divisão) {
			//return soma + divisão;
		*/
		
		//ArrayList (array dinamico)
		
		List<String> weapons = new ArrayList<>();
		
		weapons.add("guns");
		weapons.add("swords");
		weapons.add("knifes");
		weapons.add("hammers");
		
		//imprimir lista
		
		for (int i = 0; i < weapons.size(); i++) {
			System.out.println(weapons.get(i));
		}
		//conferir array
		
		System.out.println(weapons.contains("guns"));
		System.out.println(weapons.size());
		//HashMap (no thread safe)
		
		//Ações do Hash (Adicionar, Remover, Remover tudo, Iteração e Acessar)

			System.out.println("Básico ao Avançado");
			
			//chave-valor
			HashMap<String, String> mapa = new HashMap<String, String>(); //classes também podem ser valores de hashmap
			//adicionar
			String put = mapa.put("Pistol", "1"); //poderiam ser inversos também
			String put1 = mapa.put("Magnum", "2");
			String put2 = mapa.put("Eagle", "3");
			
			//remover
			System.out.println("O usuario de nome: " +  mapa.remove("Pistol")+ " foi removido!");
			System.out.println("O usuario de nome: " +  mapa.remove("Eagle")+ " foi removido!");
			
			//acessar
			System.out.println("O usuario de nome: " + mapa.get(2));
			System.out.println("O usuario de nome: " + mapa.get("Magnum"));
				
			//Iterações
			for (Entry<String, String> entry: mapa.entrySet()) {
				String chave = entry.getKey();
				String valor = entry.getValue();
				System.out.println("Chave: "+ chave + " e o valor: " + valor);
			}
			
			//Conferindo quantos elementos tem
			System.out.println("Quantidade de elementos: " + mapa.size());
			
			//limpar o espaço da coleção
			mapa.clear();		
			System.out.println("Coleção com dados apagados");

			//HashTable (thread safe)
			//Ou seja, é seguro em ambiente concorrente e seguro para múltiplas threads
			
			Hashtable<String, Integer> tabela = new Hashtable<>(); //Mais lento que HashMap e menos utilizado hoje em dia
			
			//Hashtable NÃO aceita null
			//tabela.put(null, 1); dá erro
			tabela.put("Valor", 1); 
			tabela.put("valor",2);
			
			//Substituido por ConcurrentHashMap
			
			//Permite acesso concorrente, mantém boa performance, evita os gargalos do Hashtable e Ele NÃO trava o mapa inteiro(ele divide a estrutura em partes)
			
			ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
			
			map.put("A", 1); 
			map.put("B", 2);
			//Também não permite null em nenhum espaço
			map.get("chave");
			System.out.println(map.get("A"));
			
			//metodos uteis em situações reais
			map.computeIfAbsent("A", key -> key.length()); //Cria valor automaticamente se não existir
			map.putIfAbsent("A", 10); //adiciona valor se NÃO existir
			map.compute("A", (key, val) -> val + 1); //Atualiza com base no valor atual
			map.merge("A", 1, Integer::sum); //soma valores de forma segura
			
			//Hashing de Verdade
			//Hashing é o processo de transformar uma chave em um número (hash) para decidir onde armazenar o valor.
			
			String chave = "Amigo";
			int hash = chave.hashCode();
			
			//bucket ou balde ocorre dentro do hashmap
			//index = hash % tamanhoDoArray;
			
			//Colisão é quando duas chaves diferentes geram o mesmo índice (inevitavel)
			
			
	}
	}