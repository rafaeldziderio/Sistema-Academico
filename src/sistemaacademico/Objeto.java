package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		UnidadesFederativas UF = new UnidadesFederativas();
		int escolha = 0;
		String nome;
		long matricula=0;
		boolean a = true;
		
		
		while(a) {
			try {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
				
				
			}catch(NumberFormatException e) {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
				
			}
		}
		JOptionPane.showMessageDialog(null,matricula);
		
		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		JOptionPane.showMessageDialog(null,nome);

		
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
		JOptionPane.showMessageDialog(null, escolha);
	}
}
