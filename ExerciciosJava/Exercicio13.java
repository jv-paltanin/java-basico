package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula a exponencia��o de dois valores e exibir na tela o
 * resultado
 *
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double n1, n2, res;

		// atribuindo valores nas vari�ves
		n1 = 2;
		n2 = 3;

		// calculando a EXPONENCIA��O atr�ves da fun��o MATH.POW
		res = Math.pow(n1, n2);

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "EXPONENCIA��O:  " + res);
	}

}