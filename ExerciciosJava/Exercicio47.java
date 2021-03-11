package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e calcular quantidade atual, m�xima e m�nima em estoque do
 * produto
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int atual, max, min, qtdMedia;
		String msg = "";

		// recebendo informa��o do usu�rio
		atual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual em estoque"));
		max = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade m�xima para estoque"));
		min = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade m�nima para estoque"));

		// calculando e mostrando a quantidade m�dia
		qtdMedia = (max + min) / 2;

		// verifica se a quantidade em estoque � maior ou igual a quantidade m�dia
		if (atual >= qtdMedia) {
			msg = "\n\nN�o efetuar compra";
		} else {
			msg = "\n\nEfetuar compra";
		}
		// mostra na tela a quantidade m�dia e se deve ou n�o efetuar a compra
		JOptionPane.showMessageDialog(null, "Quantidade m�dia: " + qtdMedia + msg);
	}

}