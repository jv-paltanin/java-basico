package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa em que o dono forne�a a quantidade de sandu�ches a fazer, e a
 * m�quina informe as quantidades (em quilos) de queijo, presunto e carne
 * necess�rios para compra.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio29 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int sandubaFazer, queijo, presunto, carne;

		// recebendo dados do usu�rio e armazenando na vari�vel
		sandubaFazer = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de sandu�ches a ser feito"));

		// quantidade em gramas para se fazer um sandu�che
		// qntdQueijo <- 100 g
		// qntdPresunto <- 50 g
		// qntdCarne <- 100 g

		// calcula a quantidade de produto em quilos
		queijo = (100 * sandubaFazer) / 1000;
		carne = (100 * sandubaFazer) / 1000;
		presunto = (50 * sandubaFazer) / 1000;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "=== Quantidade a ser comprada em KG de cada produto ===\nQUEIJO: " + queijo
				+ "\n" + "CARNE: " + carne + "\n" + "PRESUNTO: " + presunto);
	}

}
