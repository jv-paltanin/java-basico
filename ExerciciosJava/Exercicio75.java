package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de alunos existentes em uma turma e, ap�s isto,
 * ler as notas destes alunos, calcular e escrever a m�dia aritm�tica dessas
 * notas lidas.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int alunos = 0;
		double notas, media = 0, soma = 0;

		// recebendo informa��o do usu�rio
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos da turma"));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= alunos; i++) {
			notas = Double.parseDouble(JOptionPane.showInputDialog("Informe " + alunos + " notas\n" + i + "� aluno"));
			soma += notas;
			// calculando a m�dia das notas dos alunos
			media = soma / alunos;
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica das notas lidas �: \n" + media);
	}

}