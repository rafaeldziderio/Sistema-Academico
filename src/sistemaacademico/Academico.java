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
		TiposTelefones Tele = new TiposTelefones();
		ClassesTelefones TelCL = new ClassesTelefones();
		
		boolean a = true;
		
		
		String prenome = "";
		while(a) {
			int z = 0;

			prenome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome: ");
			prenome = prenome.toUpperCase();
			for(int i = 0; i < prenome.length(); i++)
			{
				char x = prenome.charAt(i);
				switch (x)
				{
				case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': case 'J':
				case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T':
				case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z': case ' ': case 'Á': case 'Ã': case 'É':
				case 'Í': case 'Ó': case 'Õ': case 'Ú': case 'Â': case 'Ê': case 'Ô': z++;
				}
			}
			if(z == prenome.length())
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
			sobrenome = sobrenome.toUpperCase();
			for(int i = 0; i < sobrenome.length(); i++)
			{
				char x = sobrenome.charAt(i);
				switch (x)
				{
				case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': case 'J':
				case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T':
				case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z': case ' ': case 'Á': case 'Ã': case 'É':
				case 'Í': case 'Ó': case 'Õ': case 'Ú': case 'Â': case 'Ê': case 'Ô': z++;
				}
			}
			if(z == sobrenome.length())
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
				matricula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: ", "000000000"));
				if(Long.toString(matricula).length() != 9)
				{
					JOptionPane.showMessageDialog(null, "Digite uma matrícula válida com 9 dígitos.");
				}
				else
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
		
		boolean verificar = false;
		do{
			int z = JOptionPane.showConfirmDialog(null, "Deseja inserir um email pessoal?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
			int y = JOptionPane.showConfirmDialog(null, "Deseja inserir um email alternativo?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
			int x = JOptionPane.showConfirmDialog(null, "Deseja inserir um email comercial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
		
		String[] option2 = new String[Tele.getTiposTelefones().size()];
		for(int i = 0; i < 5; i++)
		{
			option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
		}
		
		int tipo = 0;
		tipo = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);
		
		
		String[] option3 = new String[TelCL.getClassesTelefones().size()];
		for(int i = 0; i < 5; i++)
		{
			option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
		}
		
		int classe = 0;
		classe = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);
		
		int ddi = 0;
		while (a)
		{
			try
			{
				ddi = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código internacional do seu telefone (DDI)"));
				if(ddi <= 0 || ddi > 9999)
				{
					JOptionPane.showMessageDialog(null, "O DDI está incorreto, insira novamente.");
				}
				else
				{
					break;
				}
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Por favor, digite apenas números.");
			}
		}
		
		int ddd = 0;
		while(a)
		{
			try
			{
				ddd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código Regional do seu telefone (DDD)"));
				if(ddd < 1 || ddd > 1000)
				{
					JOptionPane.showMessageDialog(null, "O DDD está incorreto, insira novamente.");
				}
				else
				{
					break;
				}
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Por favor, digite apenas números.");
			}
		}
		
		long numero = 0;
		while(a)
		{
			try
			{
				numero = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone"));
				if(Long.toString(numero).length() != 8 && Long.toString(numero).length() != 9 )
				{
					JOptionPane.showMessageDialog(null, "O Número está incorreto, insira novamente.");
				}
				else
				{
					break;
				}
			}catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Por favor, digite apenas números.");
			}
		}
		
		int ramal = 0;
		int k = JOptionPane.showConfirmDialog(null, "Você quer digitar o ramal do telefone ?", 
				"Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if(k == 0) 
		{
			while(a) 
			{
				try
				{
					ramal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
					if(ramal <= 0 || ramal > 9999)
					{
						JOptionPane.showMessageDialog(null, "Esta número não é aceito, digite novamente.");
					}
					else
						break;
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Digite apenas números.");
				}
				
			}
		}
		
		//this.setTelefoneResidencial(tipo, classe, ddi, ddd, numero, ramal);
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
    	
    	JOptionPane.showMessageDialog(null, "Usuário excluído: "+academicos.get(index).getPrenome()+" "+academicos.get(index).getSobrenome()+"\nMatrícula: "+academicos.get(index).getMatricula()); 
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
    
    
  
