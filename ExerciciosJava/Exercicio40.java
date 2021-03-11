package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o ano atual e de nascimento, mostra se pode ou n�o votar
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int nasce, atual, idade;

		// recebendo informa��o do usu�rio
		nasce = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));

		// calculando a idade
		idade = atual - nasce;

		// verificando se a idade vai ser negativa ou igual a zero
		if (idade <= 0) { // mostrando na tela mensagem de erro
			JOptionPane.showMessageDialog(null, "Informe valores v�lidos");
		} else if (idade > 16) { // verifica se idade � maior que 16 e informa na tela
			JOptionPane.showMessageDialog(null, "Voc� poder� votar este ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� N�O poder� votar este ano!");
		}

	}

}
