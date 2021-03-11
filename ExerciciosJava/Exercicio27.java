package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa em que o usu�rio forne�a a quantidade de camisetas pequenas, m�dias
 * e grandes referentes a uma venda, e a m�quina informe quanto ser� o valor
 * arrecadado.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio27 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int p, m, g, valor;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de camisetas pequenas"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de camisetas m�dias"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Informe a a quantidade de camisetas grandes"));

		// calculando o valor arrecadado
		valor = (p * 10) + (m * 12) + (g * 15);

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Valor arrecadado: R$ " + valor);
	}

}
