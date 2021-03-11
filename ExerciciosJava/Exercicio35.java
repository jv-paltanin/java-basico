package exercicios;

import javax.swing.JOptionPane;

/**
 * 
 * Programa que recebe o ano de nascimento de uma pessoa e o ano atual, calcula
 * e mostra a) a idade dessa pessoa em anos; b) a idade dessa pessoa em meses;
 * c) a idade dessa pessoa em dias; d) a idade dessa pessoa em semanas. .
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio35 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double anoNasce, anoAtual, idadeAnos, idadeMeses, idadeDias, idadeSemanas;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		anoNasce = Double.parseDouble(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		anoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o ano atual"));

		// calcula a idade dessa pessoa em anos; idade em meses; idade em dias; idade em
		// semanas.
		idadeAnos = anoAtual - anoNasce;
		idadeMeses = idadeAnos * 12;
		idadeDias = idadeMeses * 365;
		idadeSemanas = idadeDias / 7;

		// mostra pro usu�rio idade em anos; idade em meses; idade em dias; idade em
		// semanas.
		JOptionPane.showMessageDialog(null, "Idade em anos: " + idadeAnos + "\n" + "Idade em meses: " + idadeMeses
				+ "\n" + "Idade em dias: " + idadeDias + "\n" + "Idade em semanas: " + idadeSemanas);
	}

}
