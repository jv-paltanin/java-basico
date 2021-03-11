package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para programa que l� as idades de 2 homens e de 2 mulheres
 * (considere que as idades dos homens ser�o sempre diferentes entre si, bem
 * como as das mulheres). Calcula e escreve a soma das idades do homem mais
 * velho com a mulher mais nova, e o produto das idades do ho-mem mais novo com
 * a mulher mais velha.
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int h1, h2, m1, m2;
		String soma = "", produto = "";

		// recebendo informa��o do usu�rio
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do homem"));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do outro homem"));
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da mulher"));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da outra mulher"));

		// verifica quem � mais velho e quem � mais novo
		// entao soma o mais velho com a mais nova, multiplica a mais velha com o mais
		// novo
		if ((h1 > h2) && (m1 > m2)) {
			soma = "" + (h1 + m2);
			produto = "" + (h2 * m1);
		} else if ((h1 > h2) && (m2 > m1)) {
			soma = "" + (h1 + m1);
			produto = "" + (h2 * m2);
		} else if ((h2 > h1) && (m1 > m2)) {
			soma = "" + (h2 + m2);
			produto = "" + (h1 * m1);
		} else if ((h2 > h1) && (m2 > m1)) {
			soma = "" + (h2 + m1);
			produto = "" + (h1 * m2);
		}
		// mostra mensagem na tela
		JOptionPane.showMessageDialog(null, "soma das idades do homem mais velho com a mulher mais nova �: " + soma
				+ "\n\nO produto das idades do homem mais novo com a mulher mais velha: " + produto);
	}

}