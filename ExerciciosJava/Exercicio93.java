package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 n�meros e armazenar em um vetor.O programa deve escrever
 * esses 20 n�meros lidos na ordem inversa.
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class Exercicio93 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[20];

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da posi��o " + (i + 1)));
		}

		// inicializando a vari�vel, condicionando e decrementando
		for (int j = num.length - 1; j >= 0; j--) {
			msg += num[j] + "\n";
		}

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem inversa\n" + msg);
	}

}
