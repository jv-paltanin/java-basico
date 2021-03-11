package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as dimens�es de um ret�ngulo (base e altura), calcular e
 * escrever a �rea do ret�ngulo;
 *
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double b, a, area;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando a �rea do ret�ngulo
		area = b * a;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "�REA DO RET�NGULO " + area);
	}

}