package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class SistemaAcademico {

        private static ArrayList <Academico> academicos = new ArrayList<Academico>();
      
        //private static UnidadesFederativas UnidadesFederativas;
        
        
 
        public static void main(String[] args) {  
        	int i= 0;
        	int j =0;
        	String[] option = {"Cadastrar", "Alterar", "Consultar", "Excluir"};
        	boolean a = true;
        	do {

        		/*while(a) {
        			try {
        				i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o que quer fazer:\n 1 - Cadastrar\n 2 - Alterar\n 3 - Consultar\n 4 - Excluir"));
        				System.out.println(i);
        				if(i<=0 || i>4) {
        					JOptionPane.showMessageDialog(null, "Digite um número que pertença ao intervalo (1 a 4):");
        				}
        				else
        					break;

        			}catch(NumberFormatException e) {
        				if(e.getMessage() == "null") {
        					break;
        				}
        				JOptionPane.showMessageDialog(null,"Digite um número de 1 até 4: ");
        			}
        		}*/
        		
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

        			/*while(a) {
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
        			}*/
        			k = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir. ", "Sistema Acadêmico", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, OP, OP[0]);
        			
        			long N;
        			int index=0;
        			
        			N = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o número do documento do tipo Registro Geral: "));
        			for(int z = 0; z < academicos.size(); z++) {
        				if((academicos.get(z).getDocumento().getNumero()) == N && (academicos.get(z).getDocumento().getTipo()) == k) {
        					DI = academicos.get(z).getDocumento();
        					index = z;
        				}
        			}
        			
        			
        			if(i == 2) {
        				academicos.get(index).alterar(DI);
        			}
        			if(i == 3) {
        				academicos.get(index).consultar(DI);
        			}
        			if(i == 4) {
        				//academicos.remove(index);
        				academicos.get(index).excluir(DI);
        			}
        		
        		}
        		j = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        	}
        	while(j == 0);
        }
    
}
