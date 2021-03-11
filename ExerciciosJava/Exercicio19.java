package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o sal�rio mensal atual de um funcion�rio e o percentual de
 * reajuste. Calcular e escrever o valor do novo sal�rio;
 *
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio19 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double salario, reajuste, novo;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio do funcion�rio"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual do reajuste"));

		// calculando o novo sal�rio com reajuste
		novo = (salario * (reajuste / 100)) + salario;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Sal�rio reajustado: R$ " + novo);
	}

}