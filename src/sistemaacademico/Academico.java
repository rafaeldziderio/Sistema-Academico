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
		TiposLogradouros tipo = new TiposLogradouros();
		Municipios municipio = new Municipios();
		
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
				case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z': case ' ': case '�': case '�': case '�':
				case '�': case '�': case '�': case '�': case '�': case '�': case '�': z++;
				}
			}
			if(z == prenome.length())
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
			sobrenome = sobrenome.toUpperCase();
			for(int i = 0; i < sobrenome.length(); i++)
			{
				char x = sobrenome.charAt(i);
				switch (x)
				{
				case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G': case 'H': case 'I': case 'J':
				case 'K': case 'L': case 'M': case 'N': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T':
				case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z': case ' ': case '�': case '�': case '�':
				case '�': case '�': case '�': case '�': case '�': case '�': case '�': z++;
				}
			}
			if(z == sobrenome.length())
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
				matricula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matr�cula: ", "000000000"));
				if(Long.toString(matricula).length() != 9)
				{
					JOptionPane.showMessageDialog(null, "Digite uma matr�cula v�lida com 9 d�gitos.");
				}
				else
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
			try {
			orgao = JOptionPane.showInputDialog(null, "Digite seu �rg�o expedidor: ");
			break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Digite um �rg�o v�lido:");
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
		
		/*
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
			String prefixo = "";
			String sufixo ="";
			if(z==0) {
				
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailPessoal(prefixo, sufixo);
				
				verificar = getEmail().validar(getEmail().Email1());
				
			}
			else {
				setEmailPessoal(prefixo, sufixo); 
				break;
				}
		}while(verificar==false);
		
			
		boolean verificar2 = false;
		do{
			int y = JOptionPane.showConfirmDialog(null, "Deseja inserir um email alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			String prefixo = "";
			String sufixo ="";
			if(y==0) {
				
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailAlternativo(prefixo, sufixo);
				
				verificar2 = getEmail().validar(getEmail().Email1());
				
			}
			else {
				setEmailAlternativo(prefixo, sufixo); 
				break;
				}
		}while(verificar2==false);
		
		boolean verificar3 = false;
		do{
			int x = JOptionPane.showConfirmDialog(null, "Deseja inserir um email comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			String prefixo = "";
			String sufixo = "";
			if(x==0) {
				
				
				prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
				sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
				setEmailComercial(prefixo, sufixo);
				
				verificar3 = getEmail().validar(getEmail().Email1());
				
			}
			else {
				setEmailComercial(prefixo, sufixo); 
				break;
			}
		}while(verificar3==false);
		
		int b = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone residencial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(b==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}

			int tipo1 = 0;
			tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}

			int classe = 0;
			classe = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);

			int ddi = 0;
			while (a)
			{
				try
				{
					ddi = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
					if(ddi <= 0 || ddi > 9999)
					{
						JOptionPane.showMessageDialog(null, "O DDI est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			int ddd = 0;
			while(a)
			{
				try
				{
					ddd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
					if(ddd < 1 || ddd > 1000)
					{
						JOptionPane.showMessageDialog(null, "O DDD est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			long numero1 = 0;

			while(a)
			{

				try
				{
					numero1 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone residencial"));
					if(Long.toString(numero1).length() != 8 && Long.toString(numero1).length() != 9 )
					{
						JOptionPane.showMessageDialog(null, "O N�mero est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}


			int ramal = 0;
			int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
					"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal <= 0 || ramal > 9999)
						{
							JOptionPane.showMessageDialog(null, "Esta n�mero n�o � aceito, digite novamente.");
						}
						else
							break;
					}catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null, "Digite apenas n�meros.");
					}

				}
			}
			this.setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

		}
		
		int c = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(c==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}

			int tipo1 = 0;
			tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}

			int classe = 0;
			classe = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);

			int ddi = 0;
			while (a)
			{
				try
				{
					ddi = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
					if(ddi <= 0 || ddi > 9999)
					{
						JOptionPane.showMessageDialog(null, "O DDI est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			int ddd = 0;
			while(a)
			{
				try
				{
					ddd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
					if(ddd < 1 || ddd > 1000)
					{
						JOptionPane.showMessageDialog(null, "O DDD est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			long numero1 = 0;

			while(a)
			{

				try
				{
					numero1 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone residencial"));
					if(Long.toString(numero1).length() != 8 && Long.toString(numero1).length() != 9 )
					{
						JOptionPane.showMessageDialog(null, "O N�mero est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}


			int ramal = 0;
			int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
					"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal <= 0 || ramal > 9999)
						{
							JOptionPane.showMessageDialog(null, "Esta n�mero n�o � aceito, digite novamente.");
						}
						else
							break;
					}catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null, "Digite apenas n�meros.");
					}

				}
			}
			this.setTelefoneComercial(tipo1, classe, ddi, ddd, numero1, ramal);

		}
		
		int d = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(d==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}

			int tipo1 = 0;
			tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}

			int classe = 0;
			classe = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);

			int ddi = 0;
			while (a)
			{
				try
				{
					ddi = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
					if(ddi <= 0 || ddi > 9999)
					{
						JOptionPane.showMessageDialog(null, "O DDI est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			int ddd = 0;
			while(a)
			{
				try
				{
					ddd = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
					if(ddd < 1 || ddd > 1000)
					{
						JOptionPane.showMessageDialog(null, "O DDD est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}

			long numero1 = 0;

			while(a)
			{

				try
				{
					numero1 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone residencial"));
					if(Long.toString(numero1).length() != 8 && Long.toString(numero1).length() != 9 )
					{
						JOptionPane.showMessageDialog(null, "O N�mero est� incorreto, insira novamente.");
					}
					else
					{
						break;
					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Por favor, digite apenas n�meros.");
				}
			}


			int ramal = 0;
			int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
					"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal <= 0 || ramal > 9999)
						{
							JOptionPane.showMessageDialog(null, "Esta n�mero n�o � aceito, digite novamente.");
						}
						else
							break;
					}catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null, "Digite apenas n�meros.");
					}

				}
			}
			this.setTelefoneAlternativo(tipo1, classe, ddi, ddd, numero1, ramal);

		}

		int tipoL=0;
		while(a) {	
			try {
				tipoL = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o tipo de logradouro: \n" + tipo.imprimirLogradouro()));
				if(tipoL<0 || tipoL>30) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		int cep = 0;
		while(a) {
			try {
				cep = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CEP:"));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o CEP:");
			}
		}
		String desc ="";
		while(a) {
			try {
				desc = JOptionPane.showInputDialog(null, "Digite a descri��o do endere�o:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite a descri��o do endere�o:");
			}
		}
		String complemento="";
		while(a) {
			try {
				complemento = JOptionPane.showInputDialog(null, "Digite o complemento do endere�o:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o complemento do endere�o:");
			}
		}
		int numero = 0;
		while(a) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero da residencia:"));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o n�mero da residencia:");
			}
		}
		String quadra="";
		while(a) {
			try {
				quadra = JOptionPane.showInputDialog(null, "Digite a quadra do endere�o:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite a quadro do endere�o:");
			}
		}
		String lote="";
		while(a) {
			try {
				lote = JOptionPane.showInputDialog(null, "Digite o lote do endere�o:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o lote do endere�o:");
			}
		}
		String bairro="";
		while(a) {
			try {
				bairro = JOptionPane.showInputDialog(null, "Digite o bairro do endere�o:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o bairro do endere�o:");
			}
		}
		long codMunicipio=0;
		while(a) {	
			try {
				codMunicipio = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o c�digo de seu munic�pio: \n" + municipio.imprimirM()));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
		String pais="";
		while(a) {
			try {
				pais = JOptionPane.showInputDialog(null, "Digite seu pa�s atual:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite seu pa�s atual:");
			}
		}
		String referencia ="";
		while(a) {
			try {
				referencia = JOptionPane.showInputDialog(null, "Informe uma refer�ncia:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Informe uma refer�ncia:");
			}
		}
		setEndereco(tipoL, cep, desc, complemento, numero, quadra, lote, bairro, codMunicipio, unidF, pais, referencia);
		
		
		*/
	}
	
	

	public void alterar(DocumentoIdentificacao documento) {
    	JOptionPane.showMessageDialog(null, "TESTE");
    	boolean a = true;
    	int opcao = 0;
		while(a) {	
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o dado pessoal que deseja alterar: \n"
						+ "1 - Email/n2- Estado Civil\n3- Situa��o Acad�mica\n4- Telefone\n5-Logradouro" ));
				if(opcao<0 || opcao>27) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}
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
        	
        	JOptionPane.showMessageDialog(null, a.show1(cod)
        			+"\n\n Nome Completo: "+academicos.get(index).getPrenome()+" "+academicos.get(index).getSobrenome()
        			+";\t N�mero da Matr�cula: "+academicos.get(index).getMatricula()
        			+";\n\n"+academicos.get(index).getEmailPessoal()
        			+"\t"+academicos.get(index).getEmailComercial()
        			+"\t"+academicos.get(index).getEmailAlternativo()
        			+"\n\n Telefone Residencial: "+academicos.get(index).getTelefoneResidencial()
        			+"\t Telefone Comercial: "+academicos.get(index).getTelefoneComercial()
        			+"\t Telefone Alternativo: "+academicos.get(index).getTelefoneAlternativo()
        			+"\n\n DOCUMENTO DE IDENTIFICA��O: "
        			+"\n Tipo: "+academicos.get(index).getDocumento().getTipo()
        			+"\t N�mero: "+academicos.get(index).getDocumento( ).getNumero()
        			+"\t Org�o Expeditor: "+academicos.get(index).getDocumento().getOrgaoExpedidor()
        			+"\n Pa�s: "+academicos.get(index).getDocumento().getPais()
        			+"\t Complemento: "+academicos.get(index).getDocumento().getComplemento()
        			+"\n\n Endere�o: "
        		//	+"\n "+academicos.get(index).getEndereco()
        			
        			); 
    	
    }
    
    
    	
}
    
    
  

    
    
  
