package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros. Todos os n�meros lidos com valor inferior a 40
 * ser�o somados.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio77 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int num = 0, soma = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "� valor"));
			if (num < 40) {
				soma += num;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Soma dos valores menores que 40: " + soma);
	}

}