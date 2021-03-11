package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor de 20 n�meros. Dever� ser lido mais um n�mero
 * qualquer e verificar se esse n�mero existe no vetor ou n�o. Se existir, o
 * programa deve gerar um novo vetor sem esse n�mero.
 * 
 * @author Jo�o Victor
 * @since 12/02/2021
 */
public class Exercicio97 {

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
		int adNum = 0;

		// adicionando um novo n�mero a lista
		adNum = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero qualquer"));

		// vari�vel booleana
		boolean remove = false;

		// adicionando a essa lista os elementos do vetor num[]
		// verificar se esse n�mero j� existe no array, se sim, remov�-lo
		for (int i = 0; i < num.length; i++) {
			novo.add(num[i]);
			if (adNum == num[i]) {
				novo.remove(num[i - 1]);
				remove = true;
			}
		}

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

		// verifica e relamente foi removido
		if (remove == true) {
			// Sa�da de dados (resultado)
			JOptionPane.showMessageDialog(null, "Ordem Crescente do NOVO Vetor\n" + novaMsg);
		} else {
			JOptionPane.showMessageDialog(null, "Ordem Crescente do Vetor\n" + msg);
		}
	}

}