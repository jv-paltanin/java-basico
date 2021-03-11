package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e escrever quantos desses valores lidos est�o no
 * intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles
 * est�o fora deste intervalo.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio73 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int valor = 0, intervalo = 0, foraIntervalo = 0;

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "� valor"));
			if ((valor >= 10) && (valor <= 20)) {
				intervalo++;
			} else {
				foraIntervalo++;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Dos 10 valores informados\n\nEst�o no intevalo [10, 20]: " + intervalo
				+ "\nN�o est�o no intervalo: " + foraIntervalo);
	}

}