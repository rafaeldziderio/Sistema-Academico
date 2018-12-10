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
		int escolha = 0, escolha1 = 0, escolha2 = 0, pp=0, escolha3=0;
		long num = 0, matricula=0;
		Date data1;
		String com = "", org = "",prenome = "",sobrenome = "",paisNascimento = "", ufNascimento="", munNascimento="",data,prefixo="",sufixo="",prefixo1="",prefixo2="",sufixo1="",sufixo2="";
		
		boolean a = true;

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
		this.setPrenome(prenome);
		
		
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
		this.setSobrenome(sobrenome);
		
		
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
		this.setUf(escolha);

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
		this.setEstadoCivil(escolha1);


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
					num = Long.parseLong((JOptionPane.showInputDialog(null, "Digite o documento do tipo desconhecido:")));
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
		
		DocumentoIdentificacao doc = new DocumentoIdentificacao(escolha2,num,org,com,pp);
		this.documento = doc;
		
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
		JOptionPane.showMessageDialog(null,paisNascimento);
		this.setPaisNascimento(paisNascimento);
		
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
		JOptionPane.showMessageDialog(null,ufNascimento);
		this.setPaisNascimento(ufNascimento);

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
		JOptionPane.showMessageDialog(null,munNascimento);
		this.setMunicipioNascimento(munNascimento);
		
		while(a) {	
			try {
				escolha3 = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha a situação acadêmica a partir do código: \n" + SA.imprimirSA()));
				if(escolha3<0 || escolha3>10) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		JOptionPane.showMessageDialog(null,(SA.getSituacaoAcademica(escolha3).getDescricaoCompleta()));
		this.situacaoAcademica = escolha3;
		
		while(a) {
			data = JOptionPane.showInputDialog(null, "Digite a sua data de nascimento(dd/MM/yyyy): ");
			try {
				data1 = new SimpleDateFormat("dd/MM/yyyy").parse(data);
				JOptionPane.showMessageDialog(null,data1);
				this.setDataNascimento(data1);
				break;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null,"Digite a data de maneira correta (dd/MM/yyyy) ");
			}
		}
		
		int ab = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja digitar o email pessoal:"));
		
	}
	
	

	public void alterar(DocumentoIdentificacao documento) {
    	JOptionPane.showMessageDialog(null, getPrenome());
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