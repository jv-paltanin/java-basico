package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler n� conta cliente, saldo, d�bito e cr�dito. Calcula e
 * escreve o saldo atual
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int conta;
		double saldo, deb, cred;
		String msg = "";

		// recebendo informa��es do usu�rio
		conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o n� da conta"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo"));
		deb = Double.parseDouble(JOptionPane.showInputDialog("Informe o d�bito"));
		cred = Double.parseDouble(JOptionPane.showInputDialog("Informe o cr�dito"));

		// calculando saldo atual
		saldo = saldo - deb + cred;

		// verificando se o saldo � maior igual a 0
		if (saldo >= 0) { // atribuindo valor a vari�vel msg
			msg = "\n\nSaldo Positivo";
		} else {
			msg = "\n\nSaldo Negativo";
		}
		// mostrando na tela o saldo atual e se � positivo ou negativo
		JOptionPane.showMessageDialog(null, "CONTA " + conta + "\n\nSaldo Atual: R$ " + saldo + msg);
	}

}