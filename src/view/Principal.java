package view;

import javax.swing.JOptionPane;

import controller.NumeroContidoController;

public class Principal {

	public static void main(String[] args) {
		NumeroContidoController numCont = new NumeroContidoController();
		int num = 0, digito = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número inteiro inteiro de 10 a 999999: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				num = Integer.parseInt(input);
				if (num < 10 || num > 999999) {
					JOptionPane.showMessageDialog(null, "Numéro inválido");
					continue;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Número inválido");
				continue;
			}
			break;
		} while(true);
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um digito inteiro inteiro de 0 a 9: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				digito = Integer.parseInt(input);
				if (digito < 0 || digito > 9) {
					JOptionPane.showMessageDialog(null, "Digito inválido.");
					continue;
				} else {
					JOptionPane.showMessageDialog(null, "Vezes que " + digito + " aparece em " + num + " = " + numCont.numContido(num, digito));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digito inválido");
				continue;
			}
			break;
		} while(true);
		
	}

}
