package exercicios;

import javax.swing.JOptionPane;

/**
 * Progrma para exibir idade, altura e peso
 *
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio07 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int idade;
		double altura, peso;

		// recebendo dados do usu�rio e armazenando nas vari�ves
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

		// mostrando na tela pro usu�rio
		System.out.println("Idade: " + idade + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso);
	}

}
