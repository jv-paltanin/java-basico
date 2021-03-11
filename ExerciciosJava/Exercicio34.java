package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que calcula quantos litros �gua e de suco s�o necess�rios para se
 * fazer a quantidade de litros que o usu�rio informou
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio34 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double agua, suco, xLitros;

		// recebendo dados do usu�rio e armazenando na vari�vel
		xLitros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em Litros deseja"));

		// calcula a quantidade necess�ria de �gua e de suco de acordo com os Litros que
		// o usu�rio deseja
		agua = (0.8) * xLitros;
		suco = (0.2) * xLitros;

		// mostra quantidade de �gua e suco de maracuj� s�o necess�rios para x Litros
		JOptionPane.showMessageDialog(null,
				"Precisa de " + agua + " litros de �gua e " + suco + " litros de suco de maracuj�");
	}

}
