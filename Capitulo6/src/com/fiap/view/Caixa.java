// Importa a classe "Caixa" para o pacote "com.fiap.view"
package com.fiap.view;

// Declaração da classe "Caixa"
public class Caixa {
	
	// Método principal (ponto de entrada) do programa
	public static void main(String[] args) {
		
		// Declara e inicializa uma variável "qtdProdutos" com o valor 5
		int qtdProdutos = 5;
		
		// Declara e inicializa uma variável "registro" com o valor 0
		int registro = 0;
		
		// Início de um loop "while" que executa enquanto a condição (registro < qtdProdutos) for verdadeira
		while (registro < qtdProdutos) {
			
			// Incrementa o valor da variável "registro" em 1 a cada iteração
			registro++;
			
			// Imprime uma mensagem informando que o produto número "registro" foi registrado
			System.out.println("O produto número " + registro + " foi registrado");
		}
		
		// Fim do método principal
	}

// Fim da classe "Caixa"
}
