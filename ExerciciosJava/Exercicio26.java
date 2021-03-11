package exercicios;

import javax.swing.JOptionPane;

/**
 * Entrar com o dia e o m�s de uma data e informar quantos dias se passaram
 * desde o in�cio do ano. Esque�a a quest�o dos anos bissextos e considere
 * sempre que um m�s possui 30 dias.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio26 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int dia, mes, dias_passados;
		// recebendo dados do usu�rio e armazenando nas vari�veis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s atual"));

		// calculando dias que se passaram
		dias_passados = dia + (mes * 30) - 30;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "J� se passaram: " + dias_passados + " desde o in�cio do ano");
	}

}
