package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para validar se os valores informados formam um tri�ngulo
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int a, b, c;
		String msg = "";

		// recebendo informa��es do usu�rio
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor"));

		// verificando se o valor de cada lado � menor que a soma dos outros 2 lados
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			msg = "Os valores informados formam um tri�ngulo";
		} else {
			msg = "Os valores informados N�O formam um tri�ngulo";
		}
		// mostra na tela a mensagem
		JOptionPane.showMessageDialog(null, msg);

	}

}