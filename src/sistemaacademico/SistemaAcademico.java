package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class SistemaAcademico {

	private static ArrayList <Academico> academicos = new ArrayList<Academico>();



	public static void main(String[] args) {  
		int i= 0;
		int j =0;
		String[] option = {"Cadastrar", "Alterar", "Consultar", "Excluir"};
		boolean a = true;

		do {



			i = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir. ", "Sistema Acadêmico", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);


			if(i==0) {
				Academico academico = new Academico(academicos);
				academico.cadastrar();
				academicos.add(academico);

			}


			if(i == 1 || i == 2 || i == 3) {
				int k =0;
				TiposDocumentos TD = new TiposDocumentos(); 
				DocumentoIdentificacao DI = new DocumentoIdentificacao();

				String[] OP = new String[TD.getTiposDocumentos().size()];

				for(int t = 0; t <= 5; t++) {
					OP[t] = TD.getTipoDocumento(t).getDescricaoCompleta(); 
				}


				k = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir. ", "Sistema Acadêmico", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, OP, OP[0]);

				long N=0;
				int index=-1;
				
				if(k==0) {
					while(a) {
						try {
							N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo desconhecido: "));
							break;
						}catch(NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Digite apenas números para documento:");
						}
					}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				
				if(k==1) {
					while(a) {
						try {
					N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Registro Geral: "));
						break;
						}catch(NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Digite apenas números para o documento:");
						}
						}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				
				if(k==2) {
					while(a) {
						try {
							N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo CPF/MF: "));
							break;
						}catch(NumberFormatException e) {
								JOptionPane.showMessageDialog(null,"Digite apenas números para o documento:");
							}
					}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				
				if(k==3) {
					while(a) {
						try {	
							N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Carteira Profissional: "));
							break;
						}catch(NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Digite apenas números para o documento:");
						}
					}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				
				if(k==4) {
					while(a) {
						try {	
							N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Passaporte: "));
							break;
						}catch(NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Digite apenas números para o documento:");
						}
					}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				
				if(k==5) {
					while(a) {
						try {	
							N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo outro: "));
							break;
						}catch(NumberFormatException e) {
							JOptionPane.showMessageDialog(null,"Digite apenas números para o documento:");
						}
					}
					for(int z = 0; z < academicos.size(); z++) {
						if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
							DI = academicos.get(z).getDocumento();
							index = z;
						}
					}
				}
				

				
				if(i == 1) {
					if(index!=-1) 
						academicos.get(index).alterar(DI);
					else
						JOptionPane.showMessageDialog(null,"Este documento não existe em nosso banco de dados.");
				}
				if(i == 2) {
					if(index != -1)
						academicos.get(index).consultar(DI);
					else
						JOptionPane.showMessageDialog(null,"Usuário não cadastrado ou excluído!");
					
				}
				if(i == 3) {
					if(index != -1)
						academicos.get(index).excluir(DI);
					else
						JOptionPane.showMessageDialog(null,"Usuário não encontrado.");
				}

			}

			j = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		while(j == 0);
	}

}
