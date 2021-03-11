package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular horas trabalhadasno m�s e informa o sal�rio total com
 * c�lculo das horas extras
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double trab, salarioHora, salarioTotal, extra;

		// recebendo informa��o do usu�rio
		trab = Double.parseDouble(JOptionPane.showInputDialog("Informe suas horas trabalhadas no m�s"));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio por hora"));

		// verificando se horas trabalhadas foram maior que 40 horas e calcula os
		// acr�scimos das horas extras
		if (trab > 160) {
			extra = trab - 160;
			salarioTotal = (salarioHora * trab) + ((extra * salarioHora) * 0.5);
			JOptionPane.showMessageDialog(null,
					"O sal�rio total com os acr�scimos das horas extras �: R$ " + salarioTotal);
		} else { // calcula o sal�rio no m�s sem acr�scimos
			salarioTotal = salarioHora * trab;
			JOptionPane.showMessageDialog(null, "O sal�rio total �: R$ " + salarioTotal);
		}
	}

}
