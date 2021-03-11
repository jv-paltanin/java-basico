package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e mostrar uma das tr�s mensagens
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int v1, v2;
		String msg = "";

		// recebendo informa��o do usu�rio
		v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se v1 e v2 s�o iguais
		if (v1 == v2) {
			msg = "N�meros iguais";
		} else if (v1 > v2) { // verificando se v1 � maior que v2
			msg = "Primeiro � maior";
		} else {
			msg = "Segundo � maior";
		}
		// mostra na tela a mensagem
		JOptionPane.showMessageDialog(null, msg);
	}

}