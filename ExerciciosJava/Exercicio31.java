package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula o gasto total da granja para marcar todos os frangos
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio31 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double anelChip, anelAlimento, qtdFrango;

		// recebendo dados do usu�rio e armazenando na vari�vel
		qtdFrango = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade total de frangos"));

		// atribuindo valores as vari�veis
		anelChip = qtdFrango * 4;
		anelAlimento = qtdFrango * 7;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null,
				"Gasto total para marcar todos os frangos na granja �: " + (anelChip + anelAlimento));
	}

}
