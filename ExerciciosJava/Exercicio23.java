package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o
 * valor correspondente em graus Celsius (baseado na f�rmula);
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio23 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int fahren, celsius;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		fahren = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit"));

		// calculando a �rea do ret�ngulo
		celsius = ((fahren - 32) / 9) * 5;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + celsius + " �C");
	}

}
