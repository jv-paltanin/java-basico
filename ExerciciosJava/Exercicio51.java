package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e escreve a multiplica��o dos menores deles
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int v1, v2, v3, multi = 0;

		// recebendo informa��o do usu�rio
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 � menor que v2 e v3
		if (((v1 < v2) && (v2 < v3)) || ((v1 < v3) && (v3 < v2))) {
			if (v2 < v3) { // se v2 � menor que v3
				multi = v1 * v2;
			} else if (v3 < v2) { // se v3 � menor que v2
				multi = v1 * v3;
			}
		} else if (((v2 < v1) && (v1 < v3)) || ((v2 < v3) && (v3 < v1))) {
			if (v1 < v3) {
				multi = v2 * v1;
			} else if (v3 < v1) {
				multi = v2 * v3;
			}
		} else if (((v3 < v1) && (v1 < v2)) || ((v3 < v2) && (v2 < v1))) {
			if (v1 < v2) {
				multi = v3 * v1;
			} else if (v2 < v1) {
				multi = v3 * v2;
			}
		}
		// mostra na tela a multiplica��o pro usu�rio
		JOptionPane.showMessageDialog(null, "Multiplica��o dos dois valores menores: " + multi);

	}

}