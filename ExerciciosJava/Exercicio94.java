package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor N qualquer (que ser� o tamanho dos vetores). Ap�s,
 * ler dois vetores A e B, armazenar em um terceiro vetor SOMA a soma dos
 * elementos do vetor A com os do vetor B e escrever o vetor Soma.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio94 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando e inicializando a vari�vel N - indica o tamanho do vetor
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho dos vetores"));

		// declarando, inicializando e definindo tamanho do vetor
		int A[] = new int[n];
		int B[] = new int[n];

		// vetor que receber� a soma dos elementos de A + B
		int SOMA[] = new int[n];

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor de A"));
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor de B"));
		}

		// Loop FOR: inicializando a vari�vel; condicionando; incrementando
		for (int i = 0; i < SOMA.length; i++) {
			// somando os elementos de A e B
			SOMA[i] = A[i] + B[i];
			// atribuindo valores e concatenando � vari�vel msg
			msg += "SOMA[" + i + "] = " + SOMA[i] + "\n";
		}

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, msg);
	}

}
