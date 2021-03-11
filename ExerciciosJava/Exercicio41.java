package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e escrever o maior deles
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double v1, v2;

		// recebendo informa��o do usu�rio
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando qual � maior
		if (v1 > v2) {
			JOptionPane.showMessageDialog(null, v1 + " � maior");
		} else if (v2 > v1) {
			JOptionPane.showMessageDialog(null, v2 + " � maior");
		}

	}

}
