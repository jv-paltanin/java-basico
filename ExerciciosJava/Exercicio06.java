package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para mostrar nome, celular e cidade
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		String nome, celular, cidade;

		// atribuindo valor informado pelo usu�rio a vari�vel
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		celular = JOptionPane.showInputDialog("Informe seu celular: ");
		cidade = JOptionPane.showInputDialog("Informe sua cidade: ");

		// exibindo vari�veis na tela
		System.out.println("Nome: " + nome + "\n" + "Celular: " + celular + "\n" + "Cidade: " + cidade);

	}

}