package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o pre�o do litro da gasolina e o valor do pagamento, e
 * exibir quantos litros ele conseguiu colocar no tanque.
 * 
 * @author Jo�o Victor
 * @since 05/02/2021
 *
 */
public class Exercicio25 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		double preco, pagamento;

		// recebendo dados do usu�rio e armazenando nas vari�veis
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do litro"));
		pagamento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pagamento"));

		// mostrando na tela pro usu�rio
		JOptionPane.showMessageDialog(null, "Quantidade de litros colocados no tanque: " + (pagamento / preco));
	}

}
