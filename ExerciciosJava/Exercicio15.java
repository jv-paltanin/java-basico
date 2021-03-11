package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que l� um valor e exibir na tela o seu antecessor
 *
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio15 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int n1, res;

		// recebendo dados do usu�rio e armazenando na vari�vel
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));

		// calculando o antecessor
		res = n1 - 1;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "ANTECESSOR de " + n1 + " � " + res);
	}

}