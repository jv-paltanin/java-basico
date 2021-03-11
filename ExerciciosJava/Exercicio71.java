package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um valor inteiro e escrever a tabuada de 1 a 10 do valor
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int valor;
		String msg = "";

		// repete at� a informa��o ser 1 a 10
		do {
			// recebendo informa��o do usu�rio
			valor = Integer
					.parseInt(JOptionPane.showInputDialog("Iremos calcular a tabuada de um valor\nInforme o valor"));
		} while ((valor <= 0) || (valor > 10));

		// inicializando a vari�vel 'i', condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			// incrementando a vari�vel msg a ela mesma
			msg += valor + " x " + i + " = " + (valor * i) + "\n";
		}

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Tabuada do " + valor + "\n" + msg);
	}

}