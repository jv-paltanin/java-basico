package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que leia o n�mero de carros por ele vendidos, o valor total de suas
 * vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e
 * escreva o sal�rio final do vendedor.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio22 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int carros_vendidos;
		double total_vendas, salario_fixo, valor_por_carro, salario_final, comissao_fixa;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		carros_vendidos = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros vendidos do vendedor"));
		total_vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas"));
		salario_fixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo do vendedor"));
		valor_por_carro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por carro vendido"));

		comissao_fixa = 0.1;
		// calculando a �rea do ret�ngulo
		salario_final = salario_fixo + ((carros_vendidos * valor_por_carro) * comissao_fixa) + (total_vendas * 0.05);

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "O sal�rio final do vendedor �: R$ " + salario_final);
	}

}
