package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o valor total da conta e imprimir quanto cada um deve
 * pagar, mas Carlos e Andr� n�o pagam centavos.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio28 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double carlos, andre, felipe, valor_total, divide;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		valor_total = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da conta"));

		// divide o valor em tr�s
		divide = (int) valor_total / 3;

		// atribuindo o quanto cada um deve pagar
		carlos = divide;
		andre = divide;
		felipe = valor_total - (carlos + andre);

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Carlos pagar�: R$ " + carlos + "\n" + "Andr� pagar�: R$ " + andre + "\n"
				+ "Felipe pagar�: R$ " + felipe);
	}

}
