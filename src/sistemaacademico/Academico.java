package sistemaacademico;

import java.util.Date;

import javax.swing.JOptionPane;



public class Academico extends Pessoa {
	
	public Academico() {
		
	}
   

	private long matricula;
    private int situacaoAcademica;
    
    
    
    public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getSituacaoAcademica() {
		return situacaoAcademica;
	}

	public void setSituacaoAcademica(int situacaoAcademica) {
		this.situacaoAcademica = situacaoAcademica;
	}

	public void cadastrar() {
		UnidadesFederativas UF = new UnidadesFederativas();
		EstadosCivis EC = new EstadosCivis();
		TiposDocumentos TD = new TiposDocumentos();
		int escolha = 0;
		int escolha1 = 0;
		int escolha2 = 0;
		long num = 0;
		String com = "";
		String org = "";
		int pp = 0;
		String prenome = "";
		String sobrenome = "";
		long matricula=0;
		boolean a = true;

		while(a) {
			try {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
				break;

			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");

			}
		}
		JOptionPane.showMessageDialog(null,matricula);
		this.matricula = matricula;

		while(a) {
			int z = 0;

			prenome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome: ");
			for(int i = 0; i < prenome.length(); i++)
			{
				char x = prenome.charAt(i);
				for(int j = 0; j < 10; j++)
				{
					String string1 = Character.toString(x);
					String string2 = Integer.toString(j);
					if( string1.equals(string2) )
					{
						z++;
					}
				}

			}
			if(z == 0)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Digite um nome válido!");
			}


		}
		JOptionPane.showMessageDialog(null,prenome);

		while(a) {
			int z = 0;

			sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ");
			for(int i = 0; i < sobrenome.length(); i++)
			{
				char x = sobrenome.charAt(i);
				for(int j = 0; j < 10; j++)
				{
					String string1 = Character.toString(x);
					String string2 = Integer.toString(j);
					if( string1.equals(string2) )
					{
						z++;
					}
				}

			}
			if(z == 0)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Digite um nome válido!");
			}


		}
		JOptionPane.showMessageDialog(null,sobrenome);

		while(a) {	
			try {
				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
				if(escolha<0 || escolha>27) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		JOptionPane.showMessageDialog(null,(UF.getUfs(escolha).getDescricaoCompleta()));


		while(a) {	
			try {
				escolha1 = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre os estados civis a seguir a partir do CODIGO: \n" + EC.imprimirEC()));
				if(escolha1<0 || escolha1>7) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		JOptionPane.showMessageDialog(null,(EC.getEstadosCivis(escolha1).getDescricaoCompleta()));


		while(a) {	
			try {
				escolha2 = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre os tipos de documentos a seguir a partir do CODIGO: \n" + TD.imprimirTD()));
				if(escolha2<0 || escolha2>5) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		JOptionPane.showMessageDialog(null,(TD.getTipoDocumento(escolha2).getDescricaoCompleta()));

		
		if(escolha2 == 0){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o documento do tipo desconhecido:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número do documento:");
				}
			}
		}
		

		
		if(escolha2 == 1){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu Registro Geral(RG):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número do registro geral: ");
				}
			}
		}

		
		if(escolha2 == 2){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu CPF:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número do CPF:");
				}
			}
		}

		
		if(escolha2 == 3){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite a sua carteira profissional(CP):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número da sua carteira profissional(CP):");
				}
			}
		}

		
		if(escolha2 == 4){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu passaporte(PST):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número do seu passaporte: ");
				}
			}
		}

			if(escolha2 == 5){
				while(a) {
					try {
						num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o documento do tipo outro:"));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Digite o número deste documento:");
					}
				}
			}
		
		com = JOptionPane.showInputDialog(null, "Digite um complemento se existir, caso contrário digite 1: ");
		if( Integer.parseInt(com) == 1) {
			com = "";
		}
	
		while(a) {
			int z = 0;

			org = JOptionPane.showInputDialog(null, "Digite seu órgão expedidor: ");
			for(int i = 0; i < org.length(); i++)
			{
				char x = org.charAt(i);
				for(int j = 0; j < 10; j++)
				{
					String string1 = Character.toString(x);
					String string2 = Integer.toString(j);
					if( string1.equals(string2) )
					{
						z++;
					}
				}

			}
			if(z == 0)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Digite um órgão expedidor válido!");
			}
		}
		JOptionPane.showMessageDialog(null,org);
		
		while(a) {
			try {
				pp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do país: "));
				if(pp<=0 || pp>=1000){
					JOptionPane.showMessageDialog(null, "Digite o código correto do país: ");
				}
				else 
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Digite o número (código) do país: ");
			}
		}
		
		
	}

	

	
	
	public void alterar(DocumentoIdentificacao documento) {
    	JOptionPane.showMessageDialog(null, getPrenome());
    }
        
    

    public void excluir(DocumentoIdentificacao documento) {
    	
    }

    public Pessoa consultar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}