package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o n� de habitantes, filhos e sal�rio de cada um e
 * depois exibir: a) M�dia de sal�rio da popula��o b) M�dia do n�mero de filhos
 * c) Maior sal�rio dos habitantes d) Percentual de pessoas com sal�rio menor
 * que R$ 150,00
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio84 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int habitantes, filhos, mediaFilhos = 0;
		double salario, maior = 0, mediaSalario = 0, percentual = 0;

		// recebendo informa��es do usu�rio
		habitantes = Integer.parseInt(JOptionPane.showInputDialog("Informe o n� de habitantes"));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= habitantes; i++) {
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n� de filhos do habitante " + i));
			do {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio do habitante " + i));

			} while (salario < 0);

			mediaFilhos += filhos;
			mediaSalario += salario;

			if (salario > maior) {
				maior = salario;
			}

			if (salario < 150) {
				percentual++;
			}
		}
		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null,
				"M�dia de sal�rio da popula��o: R$ " + (mediaSalario / habitantes) + "\nM�dia do n�mero de filhos: "
						+ (mediaFilhos / habitantes) + "\nMaior sal�rio: " + maior
						+ "\nPercentual de pessoas com sal�rio menor que R$ 150,00: "
						+ ((percentual * 100) / habitantes) + "%");
	}

}