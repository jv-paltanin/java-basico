package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e escrever uma mensagem se � ou n�o maior que 10
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double valor;

		// pedindo para o usu�rio informar um valor
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

		// verificando se � maior que 10
		if (valor > 10) { // exibindo mensagem na tela
			JOptionPane.showInternalMessageDialog(null, "� MAIOR QUE 10");
		} else {
			JOptionPane.showInternalMessageDialog(null, "N�O � MAIOR QUE 10");
		}

	}

}
