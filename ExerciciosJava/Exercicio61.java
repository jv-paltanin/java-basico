package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler: a descri��o do produto (nome), a quantidade adquirida e o
 * pre�o unit�rio. Calcular e escrever o total (total = quantidade adquirida *
 * pre�o uni-t�rio), o desconto e o total a pagar (total a pagar = total -
 * desconto)
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String nome, msg = "";
		double preco, total, totalPagar = 0, desconto;
		int qtd;

		// recebendo a descri��o do produto(nome), a quantidade adquirida e o pre�o
		// unit�rio
		nome = JOptionPane.showInputDialog("Informe a descri��o do produto(nome)");
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a a quantidade adquirida"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o unit�rio"));

		// calcula o total (total = quantidade adquirida * pre�o unit�rio)
		total = qtd * preco;

		// Se quantidade <= 5 o desconto ser� de 2% calcula o total a pagar (total a
		// pagar = total - desconto) mostra na tela o desconto e o total a ser pago
		if (qtd <= 5) {
			desconto = 0.02;
			totalPagar = total - (total * desconto);
			msg = "\nDesconto: 2%\n";
		} else if ((qtd > 5) && (qtd <= 10)) {
			desconto = 0.03;
			totalPagar = total - (total * desconto);
			msg = "\nDesconto: 3%\n";
		} else if (qtd > 10) {
			desconto = 0.05;
			totalPagar = total - (total * desconto);
			msg = "\nDesconto: 5%\n";
		}
		// mostra mensagem na tela para o usu�rio
		JOptionPane.showMessageDialog(null,
				nome + "\nQuantidade: " + qtd + "\nTotal: R$ " + total + msg + "Total a pagar: R$" + totalPagar);

	}

}