package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e escrev�-los en ordem crescente
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int v1, v2;

		// recebendo informa��o do usu�rio
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando qual � menor
		if (v1 < v2) { // mostra na tela a ordem crescente
			JOptionPane.showMessageDialog(null, v1 + " " + v2);
		} else if (v2 < v1) {
			JOptionPane.showMessageDialog(null, v2 + " " + v1);
		}
	}

}
