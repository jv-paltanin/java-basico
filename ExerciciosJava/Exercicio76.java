package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e ao final da leitura escrever a soma total dos
 * 10 n�meros lidos.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio76 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int num = 0, soma = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "� valor"));
			soma += num;
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Soma total dos 10 n� = " + soma);
	}

}