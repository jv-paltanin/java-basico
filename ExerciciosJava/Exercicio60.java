package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero que � um c�digo de usu�rio Caso este c�digo seja
 * diferente de um c�digo armazenado internamente no programa (igual a 1234)
 * deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo seja
 * correto, deve ser lido outro valor que � a senha. Se esta senha estiver
 * incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�.
 * Caso a senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.
 * 
 * @author Jo�o Victor
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int codigo, senha;
		String msg = "";
		// recebendo informa��o do usu�rio
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo"));

		// verifica se o c�digo digitado � diferente de '1234' caso seja mostra na tela
		// 'Usu�rio inv�lido!'
		// sen�o pede para informar a senha
		if (codigo != 1234) {
			JOptionPane.showMessageDialog(null, "Usu�rio inv�lido");
		} else {

			// recebe informa��o do usu�rio
			senha = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha"));

			// verifica se a senha digitada � diferente de '9999' caso seja mostra na tela
			// 'senha incorreta'
			// sen�o mostra 'Acesso permitido'
			if (senha != 9999) {
				msg = "senha incorreta";
			} else {
				msg = "Acesso permitido";
			}
			// mostra mensagem na tela
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}