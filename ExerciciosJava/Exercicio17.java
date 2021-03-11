package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a idade de uma pessoa expressa em anos, meses e dias e
 * escreva a idade dessa pessoa expressa apenas em dia. Considerar ano com 365
 * dias e m�s com 30 dias
 *
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio17 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int anos, meses, dias, idade;

		// recebendo dados do usu�rio e armazenando nas vari�ves
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s de nascimento"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento"));

		// calculando idade em dias
		idade = ((2021 - anos) * 365) + (meses * 30) + dias;
		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Idade em dias �: " + idade);
	}

}