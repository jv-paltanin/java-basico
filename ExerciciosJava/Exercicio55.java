package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler nome de 2 times e n� de gols de cada e mostrar o vencedor
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String time1, time2;
		int gol1, gol2;
		String msg = "";
		// recebendo informa��o do usu�rio
		time1 = JOptionPane.showInputDialog("Informe o nome do time da casa");
		gol1 = Integer.parseInt(JOptionPane.showInputDialog("Gols da casa"));
		time2 = JOptionPane.showInputDialog("Informe o nome do time vistante");
		gol2 = Integer.parseInt(JOptionPane.showInputDialog("Gols do visitante"));

		// verificando se houvve empate
		if (gol1 == gol2) {
			msg = "EMPATE";
		} else if (gol1 > gol2) { // verificando se gol1 > gol2
			msg = time1 + " � o Vencedor";

		} else {
			msg = time2 + " � o Vencedor";
		}
		// mostra na tela se houve empate ou mostra o vencedor
		JOptionPane.showMessageDialog(null, msg);
	}

}