package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		UnidadesFederativas UF = new UnidadesFederativas();
		int escolha = 0;
		//String nome = "";
		long matricula=0;
		boolean a = true;
		
		Academico academico = new Academico();
		
		
		while(a) {
			try {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matr�cula: "));
				break;
				
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matr�cula v�lida!");
				
			}
		}
		JOptionPane.showMessageDialog(null,matricula);
		academico.setMatricula(matricula);
		
		
		//while(a) {
		//	try {
		//		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		//		break;
		//	}catch(InputMismatchException e) {
		//		JOptionPane.showMessageDialog(null, "Digite um nome v�lido!");
		//	}
//
		//}
		//JOptionPane.showMessageDialog(null,nome);
			
		while(a) {	
			try {
				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
				if(escolha<0 || escolha>27) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo: ");
			}
		}
		JOptionPane.showMessageDialog(null,(UF.getUfs(escolha).getDescricaoCompleta()));
		//academico.setUfNascimento(escolha);
	}
}
