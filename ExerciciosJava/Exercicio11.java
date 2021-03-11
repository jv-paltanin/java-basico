package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir sua multiplica��o
 *
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio11 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double n1, n2, res;

		// recebendo dados do usu�rio e armazenando nas vari�ves
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));

		// calculando a multiplica��o
		res = n1 * n2;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "MULTIPLICA��O:  " + n1 + " x " + n2 + " = " + res);
	}

}