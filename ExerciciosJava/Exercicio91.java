package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para solicitar n�meros para o usu�rio e armazenar em um vetor de 20
 * posi��es (aceitar somente n�meros positivos). Escrever a seguir o valor do
 * menor elemento e a respectiva posi��o que ele ocupa no vetor.
 * 
 * @author Jo�o Victor
 * @since 11/02/2021
 */
public class Exercicio91 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[20];

		// vari�vel auxiliar declarada e inicializada para receber o menor n� do vetor
		int menor = Integer.MAX_VALUE;

		// vari�vel auxiliar para receber o �ndice/posi��o do menor valor
		int indiceMenor = 0;

		// loop FOR; inicializando a vari�vel; condicionando e incrementando
		for (int i = 0; i < num.length; i++) {

			// loop que se repete caso o valor digitado seja negativo (s� aceita valores
			// positivos)
			do {
				num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da posi��o " + (i + 1)));
			} while (num[i] < 0);

			// condicional para verificar o maior elemento do array
			if (num[i] < menor) {
				menor = num[i];
				indiceMenor = i;
			}
		}
		// atribuindo valores e concatenando � vari�vel msg
		msg += "Menor elemento: " + menor;
		msg += "\nNa posi��o: " + indiceMenor;

		// Sa�da dos dados (resultado)
		JOptionPane.showMessageDialog(null, msg);
	}

}
