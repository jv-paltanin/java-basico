package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double litros, pago = 0;
		String tipo = "", msg = "";

		// intro
		JOptionPane.showMessageDialog(null,
				"Posto de Combust�vel\nInforme a quantidade e o tipo que deseja abastecer\n\nA - �lcool\nG - Gasolina");

		// recebendo informa��o do usu�rio
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros"));
		tipo = JOptionPane.showInputDialog("Informe o tipo");

		// verificando se o tipo � "A"
		if (tipo.equals("A")) {
			msg = "==== �LCOOL ====";
			pago = litros * 2.9;
			if (litros <= 20) {
				pago -= (pago * 0.03);
			} else {
				pago -= (pago * 0.05);
			}
		} else if (tipo.equals("G")) { // verificando se o tipo � "G"
			msg = "==== GASOLINA ====";
			pago = litros * 3.3;
			if (litros <= 20) {
				pago -= (pago * 0.04);
			} else {
				pago -= (pago * 0.06);
			}
		}
		// mostra para o usu�rio o valor pago
		JOptionPane.showMessageDialog(null, msg + "\n\nValor pago: R$ " + pago);
	}

}