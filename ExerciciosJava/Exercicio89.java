package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para que l� notas de uma turma de 20 alunos. Calcula a m�dia da
 * turma e conta quantos alunos obtiveram nota acima desta m�dia calculada.
 * Escreve a m�dia da turma e o resultado da contagem.
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�vel que mostrar� a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		double alunos[] = new double[20];

		// vari�vel auxiliar que recebe a soma das notas
		double soma = 0;

		// vari�vel que recebe a m�dia das notas
		double media = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno " + (i + 1)));

			// soma das notas armazenadas nos elementos do vetor
			soma += alunos[i];
		}
		// calculando a m�dia das notas da turma
		media = soma / alunos.length;

		// vari�vel auxiliar, contador de quantas notas est�o acima da m�dia
		int contador = 0;

		// varrendo o array para verificar quais notas est�o acima da m�dia calculada
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] > media) {
				contador++;
			}
		}
		// definindo duas casas decimais para o resultado
		DecimalFormat f = new DecimalFormat("#.##");

		// atribuindo valores e concatenando � vari�vel msg
		msg += "A m�dia da turma �: " + f.format(media);
		msg += "\nQuantidade de alunos que obtiveram nota acima da m�dia: " + f.format(contador);

		// Sa�da dos resultados
		JOptionPane.showMessageDialog(null, msg);
	}

}
