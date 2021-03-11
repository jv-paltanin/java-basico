package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a dura��o de um jogo em horas
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int inicio, fim, tempo;

		// recebendo informa��o do usu�rio
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de inicio"));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de t�rmino"));

		// verificando se inicio � menor que fim quer dizer que n�o passou para outro
		// dia
		if (inicio < fim) {
			// calculando a dura��o e mostrando na tela
			tempo = fim - inicio;
			JOptionPane.showInternalMessageDialog(null, "Dura��o: " + tempo + " horas");
		} else {
			// calculando a dura��o se passar de um dia para outro e mostra na tela
			tempo = (fim - inicio) + 24;
			JOptionPane.showInternalMessageDialog(null, "Dura��o: " + tempo + " horas");
		}
	}

}
