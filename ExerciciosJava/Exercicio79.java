package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a m�dia aritm�tica dos n�meros inteiros
 * entre 15 (inclusive) e 100 (inclusive).
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio79 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int soma = 0, media;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 15; i < 101; i++) {
			soma += i;
		}
		// calculando a m�dia
		media = soma / 85;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"m�dia aritm�tica dos n�meros inteiros entre 15 (inclusive) e 100 (inclusive)\n" + media);
	}

}