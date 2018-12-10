package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Objeto {
	
	private static ArrayList<Academico> academicos = new ArrayList<Academico>();

	public static void main(String[] args) {
		int i= 0;
		int j =0;
		boolean a = true;
		do {
			
			while(a) {
				try {
					i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o que quer fazer:\n 1 - Cadastrar\n 2 - Alterar\n 3 - Consultar\n 4 - Excluir"));
					if(i<=0 || i>4) {
						JOptionPane.showMessageDialog(null, "Digite um número que pertença ao intervalo (1 a 4):");
					}
					else
						break;

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite um número de 1 até 4: ");
				}
			}
			

			if(i==1) {
				Academico academico = new Academico();
				academico.cadastrar();
				academicos.add(academico);
			}
			
			
			if(i==2) {
				int k =0;
				TiposDocumentos TD = new TiposDocumentos();
				Academico academico = new Academico();
				
				while(a) {
					try {
						k = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre os documentos a seguir a partir do CODIGO: \n" + TD.imprimirTD()));
						if(k<0 || k>5) {
							JOptionPane.showMessageDialog(null, "Digite um número válido:");
						}
						else
							break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite um número pertencente ao intervalo:");
					}
				}
				long N;
				if(k == 0) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo : "));
					
				}
				
				if(k == 1) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Registro Geral: "));
					
				}
				
				if(k == 2) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo CPF/MF: "));
				}
				
				if(k == 3) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Carterira Proficional: "));
				}
				
				if(k == 4) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Passaporte: "));
				}
				if(k == 5) {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento: "));
				}
				//academico.alterar(DocumentoIndetificacao k);
			}
			
			if(i==3) {
				Academico academico = new Academico();
				//academico.consultar(documento)();
				
			}
			
			if(i==4) {
				Academico academico = new Academico();
				//academico.excluir(documento);
				
			}
			
			j = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para terminar o programa e 0 para continuar"));
			
		}
		while(j == 0);
		
	}
}
