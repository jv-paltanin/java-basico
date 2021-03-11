package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a quantidade (em Kg) de morangos e de ma��s adquiridas e
 * escreve o valor a ser pago pelo cliente.
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double morango, maca, compra = 0;

		// recebendo quantidade em Kg
		morango = Double.parseDouble(JOptionPane.showInputDialog("Informe quantidade (em Kg) de morangos"));
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe quantidade (em Kg) de ma��s"));

		// verificando a quantidade em quilos de morango e ma��
		if ((morango + maca) <= 5) {
			// calcula o valor a ser pago
			compra = (morango * 2.5) + (maca * 1.8);
		} else if (((morango + maca) > 5) && ((morango + maca) <= 8)) {
			// calcula o valor a ser pago
			compra = (morango * 2.2) + (maca * 1.5);
		} else if (((morango + maca) > 8) || (compra > 25)) {
			// calcula o valor a ser pago
			compra = (morango * 2.2) + (maca * 1.5);
			compra -= (compra * 0.1);
		}
		// mostra na tela o valor a ser pago
		JOptionPane.showMessageDialog(null, "Valor a ser pago: R$ " + compra);
	}

}