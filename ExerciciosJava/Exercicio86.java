package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exiba as seguintes sequ�ncias de n�meros: (1, 1 2 3 4 5 6 7 8 9
 * 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9
 * 10) e assim sucessivamente, at� que o primeiro n�mero (antes da v�rgula),
 * tamb�m chegue a 10.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio86 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String msg = "";

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= 10; i++) {
			msg += "\n\n" + i + ",";
			for (int j = 1; j <= 10; j++) {
				msg += " " + j + " ";
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, msg);
	}

}
