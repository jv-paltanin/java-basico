package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir sal�rio e vale-refei��o
 *
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double salario, vale;

		// recebendo dados do usu�rio e armazenando nas vari�ves
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refei��o"));

		// mostrando na tela pro usu�rio
		System.out.println("Sal�rio: R$ " + salario + "\n" + "Vale-refe��o: R$" + vale);
	}

}