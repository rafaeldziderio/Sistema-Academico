package sistemaacademico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;




public class Academico extends Pessoa {
	private static ArrayList <Academico> academicos = new ArrayList<Academico>();
	
	public Academico( ArrayList <Academico> academicos) {
		Academico.academicos = academicos;
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
		SituacaoAcademica SA = new SituacaoAcademica();
		
		boolean a = true;
		
		
		String prenome = "";
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
				JOptionPane.showMessageDialog(null, "Digite um nome v�lido!");
			}
		}
		this.setPrenome(prenome);
		
		
		String sobrenome = "";
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
				JOptionPane.showMessageDialog(null, "Digite um nome v�lido!");
			}
		}
		this.setSobrenome(sobrenome);
		
		
		long matricula=0;
		while(a) {
			try {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matr�cula: "));
				break;

			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matr�cula v�lida!");

			}
		}
		this.matricula = matricula;
		
		
		int unidF = 0;
		while(a) {	
			try {
				unidF = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a que voc� mora a partir do CODIGO: \n" + UF.imprimirUF()));
				if(unidF<0 || unidF>27) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		this.setUf(unidF);
		
		
		int estadoC = 0;
		while(a) {	
			try {
				estadoC = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o seu estado civil a partir do CODIGO: \n" + EC.imprimirEC()));
				if(estadoC<0 || estadoC>7) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		this.setEstadoCivil(estadoC);
		

		int tipoD = 0;
		while(a) {	
			try {
				tipoD = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre os tipos de documentos a seguir a partir do CODIGO: \n" + TD.imprimirTD()));
				if(tipoD<0 || tipoD>5) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		
		
		long num = 0;
		if(tipoD == 0){
			while(a) {
				try {
					num = Long.parseLong((JOptionPane.showInputDialog(null, "Digite o documento do tipo desconhecido:")));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o n�mero do documento:");
				}
			}
		}
		
		if(tipoD == 1){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu Registro Geral(RG):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o n�mero do registro geral: ");
				}
			}
		}

		if(tipoD == 2){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu CPF:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o n�mero do CPF:");
				}
			}
		}

		if(tipoD == 3){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite a sua carteira profissional(CP):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o n�mero da sua carteira profissional(CP):");
				}
			}
		}

		if(tipoD == 4){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu passaporte(PST):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o n�mero do seu passaporte: ");
				}
			}
		}

		if(tipoD == 5){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o documento do tipo outro:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o n�mero deste documento:");
				}
			}
		}
		
		
		String compl = "";
		int w = JOptionPane.showConfirmDialog(null, "Voc� quer digitar um complemento do n�mero?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(w==0) {
			while(a) {

				int z = 0;

				compl = JOptionPane.showInputDialog(null, "Digite o complemento: ");
				for(int i = 0; i < compl.length(); i++)
				{
					char x = compl.charAt(i);
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
					JOptionPane.showMessageDialog(null, "Digite um complemento v�lido!");
				}

			}
		}	
		
		
		String orgao = "";
		while(a) {
			int z = 0;

			orgao = JOptionPane.showInputDialog(null, "Digite seu �rg�o expedidor: ");
			for(int i = 0; i < orgao.length(); i++)
			{
				char x = orgao.charAt(i);
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
				JOptionPane.showMessageDialog(null, "Digite um �rg�o expedidor v�lido!");
			}
		}
		
		
		int paisD=0;
		while(a) {
			try {
				paisD = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o c�digo do pa�s feito o documento: "));
				if(paisD<=0 || paisD>=1000){
					JOptionPane.showMessageDialog(null, "Digite o c�digo correto do pa�s: ");
				}
				else 
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Digite o n�mero (c�digo) do pa�s: ");
			}
		}
		
		
		DocumentoIdentificacao doc = new DocumentoIdentificacao(tipoD,num,orgao,compl,paisD);
		this.documento = doc;
		
		
		String paisNascimento = "";
		while(a) {
			int z = 0;

			paisNascimento = JOptionPane.showInputDialog(null, "Digite o pa�s de nascimento: ");
			for(int i = 0; i < paisNascimento.length(); i++)
			{
				char x = paisNascimento.charAt(i);
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
				JOptionPane.showMessageDialog(null, "Digite o seu pa�s de nascimento v�lido!");
			}
		}
		this.setPaisNascimento(paisNascimento);
		
		
		String ufNascimento="";
		while(a) {
			int z = 0;

			ufNascimento = JOptionPane.showInputDialog(null, "Digite o seu estado de nascimento: ");
			for(int i = 0; i < ufNascimento.length(); i++)
			{
				char x = ufNascimento.charAt(i);
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
				JOptionPane.showMessageDialog(null, "Digite o seu estado de nascimento v�lido!");
			}
		}
		this.setPaisNascimento(ufNascimento);
		
		
		String munNascimento="";
		while(a) {
			int z = 0;

			munNascimento = JOptionPane.showInputDialog(null, "Digite o seu munic�pio de nascimento: ");
			for(int i = 0; i < munNascimento.length(); i++)
			{
				char x = munNascimento.charAt(i);
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
				JOptionPane.showMessageDialog(null, "Digite o seu munic�pio de nascimento v�lido!");
			}
		}
		this.setMunicipioNascimento(munNascimento);
		
		
		int situacaoA=0;
		while(a) {	
			try {
				situacaoA = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha a situa��o acad�mica a partir do c�digo: \n" + SA.imprimirSA()));
				if(situacaoA<0 || situacaoA>10) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		this.situacaoAcademica = situacaoA;
		
		
		String data;
		Date data1;
		while(a) {
			data = JOptionPane.showInputDialog(null, "Digite a sua data de nascimento: ","dd/MM/yyyy");
			try {
				data1 = new SimpleDateFormat("dd/MM/yyyy").parse(data);
				this.setDataNascimento(data1);
				break;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null,"Digite a data de maneira correta!");
			}
		}
		
		boolean verificar = false;
		do{
			int z = JOptionPane.showConfirmDialog(null, "Deseja inserir um email pessoal?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(z==0) {
				String prefixo;
				String sufixo;
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailPessoal(prefixo, sufixo);
				
				verificar = getEmail().validar(getEmail().Email1());
				
			}
			else break;
		}while(verificar==false);
		
			
		boolean verificar2 = false;
		do{
			int y = JOptionPane.showConfirmDialog(null, "Deseja inserir um email alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(y==0) {
				String prefixo;
				String sufixo;
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailPessoal(prefixo, sufixo);
				
				verificar2 = getEmail().validar(getEmail().Email1());
				
			}
			else break;
		}while(verificar2==false);
		
		boolean verificar3 = false;
		do{
			int x = JOptionPane.showConfirmDialog(null, "Deseja inserir um email comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(x==0) {
				String prefixo;
				String sufixo;
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailPessoal(prefixo, sufixo);
				
				verificar3 = getEmail().validar(getEmail().Email1());
				
			}
			else break;
		}while(verificar3==false);
		
		
		
		
		
	}
	
	

	public void alterar(DocumentoIdentificacao documento) {
    	JOptionPane.showMessageDialog(null, "TESTE");
    }
        
    

    public void excluir(DocumentoIdentificacao documento) {
    	int index = 0;
    	
    	for(int z = 0; z < academicos.size(); z++) {
			if((academicos.get(z).getDocumento().getNumero()) == documento.getNumero() && (academicos.get(z).getDocumento().getTipo()) == documento.getTipo()) {
				index = z;
			}
			
		}
    	
    	JOptionPane.showMessageDialog(null, "Usu�rio exclu�do: "+academicos.get(index).getPrenome()+" "+academicos.get(index).getSobrenome()+"\nMatr�cula: "+academicos.get(index).getMatricula()); 
    	academicos.remove(index);
    }

    public void consultar(DocumentoIdentificacao documento) {
    	int index = -1;
    	int cod = 0;
    	for(int z = 0; z < academicos.size(); z++) {
			if((academicos.get(z).getDocumento().getNumero()) == documento.getNumero() && (academicos.get(z).getDocumento().getTipo()) == documento.getTipo()) {
				index = z;
			}
		}
    	
    		cod = academicos.get(index).getSituacaoAcademica();
        	SituacaoAcademica a = new SituacaoAcademica();
        	
        	JOptionPane.showMessageDialog(null, a.show1(cod)); 
    	
    }
    
    
    	
}
    
    
  
