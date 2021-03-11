package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma quantidade e a seguir ler a quantidade em n�meros
 * informados. Depois de ler todos os n�meros o programa apresenta na tela o
 * maior dos n�meros lidos e a m�dia dos n�meros lidos.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio82 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int quantidade, num = 0, maior = 0, soma = 0;
		double media = 0;

		// recebendo informa��o do usu�rio
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de n�meros que deseja informar?"));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= quantidade; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "� n�mero"));
			soma += num;

			if (num > maior) {
				maior = num;
			}
		}
		// calculando a m�dia
		media = soma / quantidade;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Maior dos n�meros: " + maior + "\n" + "M�dia dos n�meros: " + media);
	}

}