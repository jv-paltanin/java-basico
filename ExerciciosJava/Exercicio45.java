package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler sal�rio fixo e valor de vendas, calcular e escrever o
 * sal�rio total
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double salarioFixo, valorVendas, salarioTotal;

		// recebendo informa��o do usu�rio
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo"));
		valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de vendas efetuadas"));

		// verificando se o valor total das vendas do vendedor � at� 1500 reais
		if (valorVendas <= 1500) {
			salarioTotal = salarioFixo + (valorVendas * 0.03);
		} else {
			valorVendas = valorVendas - 1500;
			salarioTotal = salarioFixo + (1500 * 0.03 + (valorVendas * 0.05));
		}

		JOptionPane.showMessageDialog(null, "O sal�rio total do vendedor foi de: R$ " + salarioTotal);
	}

}
