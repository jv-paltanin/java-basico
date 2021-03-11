package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores V1 e V2 de 15 n�meros cada. Calcular e
 * escrever a quantidade de vezes que V1 e V2 possuem os mesmos n�meros e nas
 * mesmas posi��es.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio98 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor v1 e v2
		int v1[] = new int[15];
		int v2[] = new int[15];

		// Loop FOR: inicializando a vari�vel; condicionando; incrementando
		for (int i = 0; i < v1.length; i++) {
			v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "� n�mero do vetor 1"));
		}
		for (int i = 0; i < v2.length; i++) {
			v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "� n�mero do vetor 2"));
		}

		// vari�vel auxiliar para quantidade de vezes que V1 e V2 possuem os mesmos
		// n�meros
		int contador = 0;
		for (int i = 0; i < v2.length; i++) {
			if (v1[i] == v2[i]) {
				contador++;
			}
		}
		// atribuindo valores e concatenando � vari�vel msg
		msg += contador;

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null,
				"Quantidade de vezes que V1 e V2 possuem os mesmos n�meros e nas mesmas posi��es\n" + msg);
	}

}
