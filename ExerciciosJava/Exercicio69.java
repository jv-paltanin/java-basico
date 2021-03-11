package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para Ler um valor N e imprimir todos os valores inteiros entre 1
 * (inclusive) e N (inclusive).
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio69 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int n = 0;
		String msg = "";

		do {
			// recebendo informa��o do usu�rio
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		} while (n < 1);

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < n + 1; i++) {
			msg += i + "\n";
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}