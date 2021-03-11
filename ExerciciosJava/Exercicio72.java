package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores s�o NEGATIVOS.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int valor = 0, negativo = 0;
		String msg = "";

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "� valor"));
			if (valor < 0) {
				negativo++;

				if (negativo == 1) {
					msg = negativo + " valor negativo";
				} else {
					msg = negativo + " valores negativos";
				}
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}