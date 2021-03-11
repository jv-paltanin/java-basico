package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double n1, n2, media;
		String msg = "";

		// recebendo informa��o do usu�rio
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota"));

		// calculando a m�dia
		media = (n1 + n2) / 2;

		msg = "M�dia: " + media + "\n";
		// verificando se a m�dia
		if (media >= 6) {
			msg += "\nAPROVADO";
			JOptionPane.showMessageDialog(null, msg);
		} else {
			msg += "\nREPROVADO";
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
