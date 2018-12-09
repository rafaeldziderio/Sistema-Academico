package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		UnidadesFederativas UF = new UnidadesFederativas();
		int Escolha = 0;
		Escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
		
		JOptionPane.showMessageDialog(null, Escolha);
	}
}
