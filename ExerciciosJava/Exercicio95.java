package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e armazenar no vetor. Ordena os n�meros no vetor
 * em ordem crescente. Escreve o vetor ordenado.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio95 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[10];

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero"));
		}

		// utilidade do java para ordenar em ordem crescente elementos de um array
		Arrays.sort(num);

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			msg += num[i] + "\n";
		}

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem Crescente do Array\n" + msg);
	}

}