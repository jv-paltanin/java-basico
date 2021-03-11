package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores, calcular e escrever a m�dia aritm�tica desses
 * valores lidos.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio74 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int valor = 0;
		double media = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "� valor"));
			media += valor;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "M�dia aritm�tica dos 10 valores �\n" + (media / 10));
	}

}