package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula o m�dulo entre dois valores e exibir na tela o resultado
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio14 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double n1, n2, res;

		// atribuindo valores as vari�ves
		n1 = 4;
		n2 = 3;
		// calculando o m�dulo
		res = n1 % n2;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "M�DULO> " + n1 + " % " + n2 + " = " + res);
	}

}