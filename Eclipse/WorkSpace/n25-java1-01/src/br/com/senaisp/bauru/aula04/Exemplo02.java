package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("sauro"));
		//Obter a posição no texto de um subtexto
		System.out.println(str01.indexOf("o"));
		//Obter o caracter na posição desejada
		System.out.println(str01.charAt(3));
		//Obtendo substring de uma string sem limitar final
		System.out.println(str01.substring(8));
		//Obtendo substring de uma string limitando final
		System.out.println(str01.substring(8,16));
		//Usando o compareTo
		System.out.println(str01.compareTo("Roberta"));

	}

}
