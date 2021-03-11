package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o custo de f�brica de um carro, calcular e escrever o custo
 * final ao consumidor.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio21 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double custoFabrica, distribuidor, impostos, custoFinal;

		// recebendo dados do usu�rio e armazenando na vari�vel
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de f�brica"));

		// atribuindo valor as vari�veis
		distribuidor = 0.28;
		impostos = 0.45;

		// calculando o custo final
		custoFinal = (custoFabrica * distribuidor) + (custoFabrica * impostos) + custoFabrica;

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Custo final do carro �: R$" + custoFinal);
	}

}