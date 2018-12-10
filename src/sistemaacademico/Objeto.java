package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Objeto {
	
	public static void main(String[] args) {
		int i= 0;
		int j =0;
		do {
		try {
			if()
			i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o que quer fazer:\n 1 - Cadastrar\n 2 - Alterar\n 3 - Consultar\n 4 - Excluir"));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Digite um número de 1 até 4: ");
		}
		JOptionPane.showMessageDialog(null, i);
		
		if(i==1) {
			
		}
		JOptionPane.showMessageDialog(null, "Digite 1 para terminar o programa e 0 para continuar");
		}while(j==0);
		
	}
}
