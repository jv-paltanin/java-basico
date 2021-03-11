package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores, calcular e imprimir a m�dia. somente valores
 * entre 0 e 10 para leitura
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int n1, n2;
		double media;

		// S� devem ser aceitos valores v�lidos durante a leitura (0 a 10)
		do {
			// recebendo informa��o do usu�rio
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da 1� avalia��o"));

		} while (((n1 < 0) || (n1 > 10)));

		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da 2� avalia��o"));

		} while (((n2 < 0) || (n2 > 10)));

		// calculando a m�dia do aluno
		media = (n1 + n2) / 2;

		// mostrando a m�dia das notas na tela
		JOptionPane.showMessageDialog(null, "M�dia: " + media);
	}

}