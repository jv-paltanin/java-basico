package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 10 n�meros. Ler mais um n�mero qualquer,
 * calcular e escrever quantas vezes esse n�mero aparece no vetor.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio99 {

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

		// vari�vel que recebe um n�mero qualquer
		int other = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero"));

		// vari�vel contador
		int contador = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			if (num[i] == other) {
				contador++;
			}
		}

		// atribuindo valores e concatenando � vari�vel msg
		msg += contador;

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, "O n�mero " + other + " aparece " + msg + " vezes no vetor");
	}

}