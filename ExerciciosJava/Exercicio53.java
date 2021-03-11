package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escrev�-los em ordem descrescente
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio53 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int v1, v2, v3;
		String msg = "";

		// recebendo informa��o do usu�rio
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 � maior que v2 e v3
		if (((v1 > v2) && (v2 > v3)) || ((v1 > v3) && (v3 > v2))) {
			if (v2 > v3) { // caso v2 seja maior que v3
				msg = v1 + "  " + v2 + "  " + v3;
			} else if (v3 > v2) { // caso v3 seja maior que v2
				msg = v1 + "  " + v3 + "  " + v2;
			}
			// verificando se v2 � maior que v1 e v3
		} else if (((v2 > v1) && (v1 > v3)) || ((v2 > v3) && (v3 > v1))) {
			if (v1 > v3) {
				msg = v2 + "  " + v1 + "  " + v3;
			} else if (v3 > v1) {
				msg = v2 + "  " + v3 + "  " + v1;
			}
			// verificando se v3 � maior que v2 e v1
		} else if (((v3 > v1) && (v1 > v2)) || ((v3 > v2) && (v2 > v1))) {
			if (v1 > v2) {
				msg = v3 + "  " + v1 + "  " + v2;
			} else if (v2 > v1) {
				msg = v3 + "  " + v2 + "  " + v1;
			}
		}
		// exibe na tela a ordem decrescente
		JOptionPane.showMessageDialog(null, "Ordem decrescente dos valores\n\n" + msg);

	}

}