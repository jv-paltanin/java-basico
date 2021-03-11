package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que recebe a entrada das seguintes informa��es: a) o n�mero total de
 * mercadorias no estoque; b) o valor de cada mercadoria. Ao final exibe o valor
 * total em estoque e a m�dia de valor das mercadorias.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio80 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int qtdMerca;
		double valorMerca = 0, media = 0;

		// recebendo informa��o do usu�rio
		qtdMerca = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero total de mercadorias no estoque"));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= qtdMerca; i++) {
			valorMerca += Double.parseDouble(JOptionPane.showInputDialog("Insira o pre�o do produto " + i));
		}
		// calculando a m�dia
		media = valorMerca / qtdMerca;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"Total de mercadorias em estoque: " + qtdMerca + "\nM�dia do valor das mercadorias: " + media);
	}

}
