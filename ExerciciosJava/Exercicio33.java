package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as dimens�es de um ret�ngulo (base e altura), calcular e
 * escrever a �rea do ret�ngulo;
 *
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio33 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double um, cinco, dez, vinteCinco, cinquenta, umReal, economia;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		JOptionPane.showMessageDialog(null, "Informe a quantidade de cada tipo de moeda");
		um = Double.parseDouble(JOptionPane.showInputDialog("1 centavo"));
		cinco = Double.parseDouble(JOptionPane.showInputDialog("10 centavos"));
		dez = Double.parseDouble(JOptionPane.showInputDialog("5 centavos"));
		vinteCinco = Double.parseDouble(JOptionPane.showInputDialog("25 centavos"));
		cinquenta = Double.parseDouble(JOptionPane.showInputDialog("50 centavos"));
		umReal = Double.parseDouble(JOptionPane.showInputDialog("1 Real"));

		// calcula a quantidade de cada tipo de moeda e soma pra saber a quantia total
		// economizada
		economia = (um * 0.01) + (cinco * 0.05) + (dez * 0.1) + (vinteCinco * 0.25) + (cinquenta * 0.5) + (umReal * 1);

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Pedrinho conseguiu poupar: R$ " + economia);
	}

}
