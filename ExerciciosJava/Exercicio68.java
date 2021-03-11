package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir os 10 primeiros n�meros inteiros maiores que 100.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio68 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vari�vel msg para msotrar na tela
		String msg = "";

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 101; i < 111; i++) {
			msg += "\n" + i;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}