package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter uma quantidade de d�lar para real;
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio20 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double dolar, real;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em D�lar US$"));

		// calculando e convertendo para real
		real = dolar * 6.61;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, dolar + " dolar equivale a " + real + " reais");
	}

}