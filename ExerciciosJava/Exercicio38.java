package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n� de ma��s e calcular o custo total da compra
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int macas;
		double custo;

		// recebendo informa��o do usu�rio
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de ma��s compradas"));

		// verificando se n� de ma��s � 0 ou negativo
		if ((macas < 0) || (Math.floor(macas) != macas)) { // mostra mensagem na tela
			JOptionPane.showMessageDialog(null, "Informe uma quantidade v�lida");
		} else if (macas < 12) { // verificando se � menor que 12
			// calculando o custo das ma��s e mostrando na tela
			custo = macas * 1.3;
			JOptionPane.showMessageDialog(null, "Custo total: R$" + custo);
		} else {
			// calculando o custo das ma��s e mostrando na tela
			custo = macas * 1;
			JOptionPane.showMessageDialog(null, "Custo total: R$" + custo);
		}

	}

}
