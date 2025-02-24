package viewer;

import javax.swing.JOptionPane;

import controller.DecimalEmBinario;

public class Principal {

	public static void main(String[] args) {
		DecimalEmBinario deb = new DecimalEmBinario();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número menor ou igual a 2000"));
		JOptionPane.showMessageDialog(null, "O número " + numero + " em bínário é igual a: " + 
		deb.DecEmBin(numero) + ".");
	}
}