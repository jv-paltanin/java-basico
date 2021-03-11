package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura Celsius e imprimi-la em Fahrenheit
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio30 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int fahren, celsius;

		// recebendo dados do usu�rio e armazenando na vari�vel
		celsius = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em Celsius"));

		// calculando a �rea do ret�ngulo
		fahren = celsius * 9 / 5 + 32;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahren + " �F");
	}

}
