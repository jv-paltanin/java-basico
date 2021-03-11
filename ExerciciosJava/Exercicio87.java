package exercicios;

/**
 * Programa para desenhar um ret�ngulo de 10 linhas e 60 colunas e exibir.
 * 
 * @author Jo�o Victor
 * @since 10/02/2021
 */
public class Exercicio87 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String msg = "";
		int x = 60, i, j;
		// inicializando a vari�vel, condicionando e incrementando
		for (i = 1; i <= 10; i++) {
			msg += "\n";
			for (j = 1; j < x; j++) {
				if ((i == 1) || (i == 10))
					msg += "+";
				else {
					if ((j == 1) || (j == x - 1))
						msg += "+";
					else
						msg += " ";
				}
			}
		}
		// mostra o resultado na tela
		System.out.print(msg);
	}

}