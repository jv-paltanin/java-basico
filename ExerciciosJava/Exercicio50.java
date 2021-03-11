package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escreve a soma dos maiores deles
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio50 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int v1, v2, v3, soma = 0;

		// recebendo informa��o do usu�rio
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 � mairo que v2 e v3
		if (((v1 > v2) && (v2 > v3)) || ((v1 > v3) && (v3 > v2))) {
			if (v2 > v3) { // se v2 � maior que v3
				soma = v1 + v2;
			} else if (v3 > v2) { // se v3 � maior que v2
				soma = v1 + v3;
			}
		} else if (((v2 > v1) && (v1 > v3)) || ((v2 > v3) && (v3 > v1))) {
			if (v1 > v3) {
				soma = v2 + v1;
			} else if (v3 > v1) {
				soma = v2 + v3;
			}
		} else if (((v3 > v1) && (v1 > v2)) || ((v3 > v2) && (v2 > v1))) {
			if (v1 > v2) {
				soma = v3 + v1;
			} else if (v2 > v1) {
				soma = v3 + v2;
			}
		}
		// mostra na tela a soma pro usu�rio
		JOptionPane.showMessageDialog(null, "Soma dos dois valores maiores: " + soma);

	}

}