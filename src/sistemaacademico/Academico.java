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
				JOptionPane.showMessageDialog(null, "Digite um nome válido!");
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
				JOptionPane.showMessageDialog(null, "Digite um nome válido!");
			}
		}
		this.setSobrenome(sobrenome);
		
		
		long matricula=0;
		while(a) {
			try {
				matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
				break;

			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");

			}
		}
		this.matricula = matricula;
		
		
		int unidF = 0;
		while(a) {	
			try {
				unidF = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a que você mora a partir do CODIGO: \n" + UF.imprimirUF()));
				if(unidF<0 || unidF>27) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		this.setUf(unidF);
		
		
		int estadoC = 0;
		while(a) {	
			try {
				estadoC = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o seu estado civil a partir do CODIGO: \n" + EC.imprimirEC()));
				if(estadoC<0 || estadoC>7) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		this.setEstadoCivil(estadoC);
		

		int tipoD = 0;
		while(a) {	
			try {
				tipoD = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre os tipos de documentos a seguir a partir do CODIGO: \n" + TD.imprimirTD()));
				if(tipoD<0 || tipoD>5) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		
		
		long num = 0;
		if(tipoD == 0){
			while(a) {
				try {
					num = Long.parseLong((JOptionPane.showInputDialog(null, "Digite o documento do tipo desconhecido:")));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número do documento:");
				}
			}
		}
		
		if(tipoD == 1){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu Registro Geral(RG):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número do registro geral: ");
				}
			}
		}

		if(tipoD == 2){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu CPF:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número do CPF:");
				}
			}
		}

		if(tipoD == 3){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite a sua carteira profissional(CP):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número da sua carteira profissional(CP):");
				}
			}
		}

		if(tipoD == 4){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu passaporte(PST):"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número do seu passaporte: ");
				}
			}
		}

		if(tipoD == 5){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o documento do tipo outro:"));
					break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número deste documento:");
				}
			}
		}
		
		
		String compl = "";
		int w = JOptionPane.showConfirmDialog(null, "Você quer digitar um complemento do número?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
					JOptionPane.showMessageDialog(null, "Digite um complemento válido!");
				}

			}
		}	
		
		
		String orgao = "";
		while(a) {
			int z = 0;

			orgao = JOptionPane.showInputDialog(null, "Digite seu órgão expedidor: ");
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
				JOptionPane.showMessageDialog(null, "Digite um órgão expedidor válido!");
			}
		}
		
		
		int paisD=0;
		while(a) {
			try {
				paisD = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do país feito o documento: "));
				if(paisD<=0 || paisD>=1000){
					JOptionPane.showMessageDialog(null, "Digite o código correto do país: ");
				}
				else 
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Digite o número (código) do país: ");
			}
		}
		
		
		DocumentoIdentificacao doc = new DocumentoIdentificacao(tipoD,num,orgao,compl,paisD);
		this.documento = doc;
		
		
		String paisNascimento = "";
		while(a) {
			int z = 0;

			paisNascimento = JOptionPane.showInputDialog(null, "Digite o país de nascimento: ");
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
				JOptionPane.showMessageDialog(null, "Digite o seu país de nascimento válido!");
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
				JOptionPane.showMessageDialog(null, "Digite o seu estado de nascimento válido!");
			}
		}
		this.setPaisNascimento(ufNascimento);
		
		
		String munNascimento="";
		while(a) {
			int z = 0;

			munNascimento = JOptionPane.showInputDialog(null, "Digite o seu município de nascimento: ");
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
				JOptionPane.showMessageDialog(null, "Digite o seu município de nascimento válido!");
			}
		}
		this.setMunicipioNascimento(munNascimento);
		
		
		int situacaoA=0;
		while(a) {	
			try {
				situacaoA = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha a situação acadêmica a partir do código: \n" + SA.imprimirSA()));
				if(situacaoA<0 || situacaoA>10) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
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
    	
    	JOptionPane.showMessageDialog(null, "Usuário excluído: "+academicos.get(index).getPrenome()); 
    	academicos.remove(index);
    }

    public void consultar(DocumentoIdentificacao documento) {
    	int index = 0;
    	int cod = 0;
    	for(int z = 0; z < academicos.size(); z++) {
			if((academicos.get(z).getDocumento().getNumero()) == documento.getNumero() && (academicos.get(z).getDocumento().getTipo()) == documento.getTipo()) {
				index = z;
			}
			
		}
    	cod = academicos.get(index).getSituacaoAcademica();
    	SituacaoAcademica a = new SituacaoAcademica();
    	
    	JOptionPane.showMessageDialog(null, a.show1(cod)); 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    	
    }
    
    
  
}