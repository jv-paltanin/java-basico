package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor e escrever se � positivo ou negativo
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double valor;

		// recebendo informa��o do usu�rio
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

		// verificando se o valor � maior ou igual a zero
		if (valor >= 0) { // mostrando mensagem na tela
			JOptionPane.showMessageDialog(null, "� positivo");
		} else {
			JOptionPane.showMessageDialog(null, "� negativo");
		}
	}

}
