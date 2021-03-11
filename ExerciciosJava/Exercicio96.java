package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e armazenar no vetor. Ordena os n�meros no vetor
 * em ordem crescente. Exibe o vetor ordenado. L� mais um n�mero qualquer e
 * insere esse novo n�mero na posi��o correta mantendo a ordem crescente do
 * vetor.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio96 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a vari�vel msg para receber a sa�da de dados
		String msg = "";

		// declarando, inicializando e definindo tamanho do vetor
		int num[] = new int[10];

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero"));
		}

		// utilidade do java para ordenar em ordem crescente elementos de um array
		Arrays.sort(num);

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < num.length; i++) {
			msg += num[i] + "\n";
		}

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem Crescente do Array\n" + msg);

		// lista de objetos inteiros
		List<Integer> novo = new ArrayList<Integer>(10);

		// adicionando a essa lista os elementos do vetor num[]
		for (int i = 0; i < num.length; i++) {
			novo.add(num[i]);
		}
		// adicionando um novo n�mero a lista
		novo.add(Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero adicional")));

		// vetor integer recebendo a convers�o da lista de objetos para um vetor/array
		Integer[] vetor = (Integer[]) novo.toArray(new Integer[0]);

		// utilidade do java para ordenar em ordem crescente elementos de um array
		Arrays.sort(vetor);

		// string declarada para receber os elementos do vetor[]
		String novaMsg = "";

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 0; i < novo.size(); i++) {
			novaMsg += vetor[i] + "\n";
		}

		// Sa�da de dados (resultado)
		JOptionPane.showMessageDialog(null, "Ordem Crescente do NOVO Array\n" + novaMsg);
	}

}