package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero total de eleitores de um munic�pio, o n�mero de
 * votos brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um
 * representa em rela��o ao total de eleitores;
 *
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio18 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int eleitores, brancos, nulos, validos;
		// recebendo dados do usu�rio e armazenando nas vari�ves
		eleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de eleitores"));
		brancos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos BRANCOS"));
		nulos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos NULOS"));
		validos = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos VALIDOS"));

		// calculando
		brancos = (brancos * 100) / eleitores;
		nulos = (nulos * 100) / eleitores;
		validos = (validos * 100) / eleitores;
		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Total de eleitores: " + eleitores + "\n" + "Votos BRANCOS: " + brancos
				+ "% \n" + "Votos NULOS: " + nulos + "% \n" + "Votos VALIDOS: " + validos + "%");
	}

}