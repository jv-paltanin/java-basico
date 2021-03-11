package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que l� tr�s notas de um aluno, calcula e escreve a m�dia final deste
 * aluno. Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio24 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double n1, n2, n3, media_final;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));

		// calculando m�dia final do aluno
		media_final = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "M�dia final �: " + media_final);
	}

}
