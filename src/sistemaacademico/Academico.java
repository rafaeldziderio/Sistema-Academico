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

		//prenome
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

		//Sobrenome
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
		
		//Data de Nascimento
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
		//Pa�s de Nascimento
		String paisNascimento = "";
		while(a) {
			try {
				paisNascimento = JOptionPane.showInputDialog(null,"Digite o seu pa�s de nascimento:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Digite um pa�s v�lido!");
			}
		}
		this.setPaisNascimento(paisNascimento);

		//Estado de nascimento
		String ufNascimento="";
		while(a) {
			try {
				ufNascimento = JOptionPane.showInputDialog(null, "Digite o seu estado de nascimento:" );
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Digite um estado v�lido!");
			}
		}
		this.setUfNascimento(ufNascimento);

		//Cidade de Nascimento
		String munNascimento="";
		while(a) {
			try {
				munNascimento = JOptionPane.showInputDialog(null,"Digite o seu munic�pio de nascimento:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Insira um munic�pio v�lido!");
			}
		}
		this.setMunicipioNascimento(munNascimento);


		//Matricula
		long matricula=0;
		while(a) {
			try {
				matricula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matr�cula: ", "000000000"));
				if(Long.toString(matricula).length() != 9)
				{
					JOptionPane.showMessageDialog(null, "Digite uma matr�cula v�lida com 9 d�gitos.");
				}
				else {	
					if(academicos.size() == 0)
						break;
					else {
						int r=0;
						for(int i = 0 ; i< academicos.size(); i++) {
							if(matricula == academicos.get(i).getMatricula()) {
								JOptionPane.showMessageDialog(null,"Esta matr�cula j� est� cadastrada em nosso sistema!");
								r++;
							}
						}
						if(r==0) break;
					}
				}


			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matr�cula v�lida!");

			}
		}
		this.matricula = matricula;

		//Unidade Federativa
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

		//Estado Civil
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

		//Documento
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
		String num1 = null;
		if(tipoD == 0){
			while(a) {
				try {
					num = Long.parseLong((JOptionPane.showInputDialog(null, "Digite o documento do tipo desconhecido:")));
					if(academicos.size()!=0) {
						int r =0;
						for(int i = 0 ; i<academicos.size();i++) {
							if(num == academicos.get(i).getDocumento().getNumero()) {
								JOptionPane.showMessageDialog(null, "Documento existente!");
								r++;
							}
						}
						if(r == 0 ) break;
					}else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o n�mero do documento:");
				}
			}
		}


		if(tipoD == 1){
			while(a) {
				try {
					num1 = JOptionPane.showInputDialog(null, "Digite o seu Registro Geral(RG):");
					if(num1.length() == 7) {
						if(academicos.size() != 0) {
							int r = 0;
							for(int i = 0; i<academicos.size();i++) {
								if(Long.parseLong(num1) == academicos.get(i).getDocumento().getNumero()) {
									JOptionPane.showMessageDialog(null,"RG j� existente!");
									r++;
								}
							}
							if(r==0) {
								num = Long.parseLong(num1);
								break;
							}


						}else {
							num = Long.parseLong(num1);
							break;
						}


					}
					else
						JOptionPane.showMessageDialog(null,"RG inv�lido!");

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o n�mero do registro geral: ");
				}
			}
		}


		if(tipoD == 2){
			while(a) {
				num1 =JOptionPane.showInputDialog(null, "Digite o seu CPF:");

				if(ValidaCpf.isCPF(num1) == true) {
					if(academicos.size() != 0) {
						int r = 0;
						for(int i = 0 ; i < academicos.size(); i++) {
							if(Long.parseLong(num1) == academicos.get(i).getDocumento().getNumero()) {
								JOptionPane.showMessageDialog(null,"CPF j� existente!");
								r++;
							}
						}if(r==0) {
							num = Long.parseLong(num1);
							break;
						}
					}else {
						num = Long.parseLong(num1);
						break;
					}

				}
				else
					JOptionPane.showMessageDialog(null,"Digite um CPF v�lido");

			}
		}



		if(tipoD == 3){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite a sua carteira profissional(CP):"));
					if(academicos.size()!=0) {
						int r =0;
						for(int i = 0 ; i<academicos.size();i++) {
							if(num == academicos.get(i).getDocumento().getNumero()) {
								JOptionPane.showMessageDialog(null, "Carteira profissional existente!");
								r++;
							}
						}
						if(r == 0 ) break;
					}else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o n�mero da sua carteira profissional(CP):");
				}
			}
		}

		if(tipoD == 4){
			while(a) {
				try {
					num1 = JOptionPane.showInputDialog(null, "Digite o seu passaporte(PST):");
					if(num1.length() == 9) {
						if(academicos.size() != 0) {
							int r = 0;
							for(int i = 0; i<academicos.size();i++) {
								if(Long.parseLong(num1) == academicos.get(i).getDocumento().getNumero()) {
									JOptionPane.showMessageDialog(null,"Passaporte j� existente!");
									r++;
								}
							}
							if(r==0) {
								num = Long.parseLong(num1);
								break;
							}


						}else {
							num = Long.parseLong(num1);
							break;
						}

					}
					else
						JOptionPane.showMessageDialog(null,"Passaporte inv�lido!");

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o n�mero do seu passaporte: ");
				}
			}
		}



		if(tipoD == 5){
			while(a) {
				try {
					num = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o documento do tipo outro:"));
					if(academicos.size()!=0) {
						int r =0;
						for(int i = 0 ; i<academicos.size();i++) {
							if(num == academicos.get(i).getDocumento().getNumero()) {
								JOptionPane.showMessageDialog(null, "Documento existente!");
								r++;
							}
						}
						if(r == 0 ) break;
					}else
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
				try {
					compl = JOptionPane.showInputDialog(null,"Insira um complemento do documento:");
					break;
				}catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null,"Insira um complemento v�lido!");
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


		DocumentoIdentificacao doc = new DocumentoIdentificacao(tipoD,num,compl,orgao,paisD);
		this.documento = doc;


		//Situa��o Acad�mica
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

		//Email
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


		//Telefone
		int tipo1 = 0;
		long numero1 = 0;
		int ramal = 0;
		int ddd = 0;
		int ddi = 0;
		int classe = 0;

		int b = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone residencial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(b==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


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

		}else this.setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

		//Outro  telefone
		int tipo2 = 0;
		int classe2 = 0;
		int ddi2 = 0;
		int ddd2 = 0;
		long numero2 = 0;
		int ramal2 = 0;

		int c = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(c==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo2 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe2 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


			while (a)
			{
				try
				{
					ddi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
					if(ddi2 <= 0 || ddi2 > 9999)
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


			while(a)
			{
				try
				{
					ddd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
					if(ddd2 < 1 || ddd2 > 1000)
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



			while(a)
			{

				try
				{
					numero2 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone comercial:"));
					if(Long.toString(numero2).length() != 8 && Long.toString(numero2).length() != 9 )
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



			int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
					"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal2 <= 0 || ramal2 > 9999)
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
			this.setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);

		}else this.setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);
		
		//Outro telefone
		int tipo3 = 0;
		int classe3 = 0;
		int ddi3 = 0;
		int ddd3 = 0;
		long numero3 = 0;
		int ramal3 = 0;

		int d = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(d==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo3 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe3 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


			while (a)
			{
				try
				{
					ddi3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
					if(ddi3 <= 0 || ddi3 > 9999)
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


			while(a)
			{
				try
				{
					ddd3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
					if(ddd3 < 1 || ddd3 > 1000)
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



			while(a)
			{

				try
				{
					numero3 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone alternativo:"));
					if(Long.toString(numero3).length() != 8 && Long.toString(numero3).length() != 9 )
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



			int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
					"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal3 <= 0 || ramal3 > 9999)
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
			this.setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

		}else this.setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

		//Endere�o
		int cep = 0;
		String cep1 ="";
		while(a) {
			try {
				cep1 = JOptionPane.showInputDialog(null, "Digite o CEP:");
				if(cep1.length() == 8) {
					cep = Integer.parseInt(cep1);
					break;
				}
				else
					JOptionPane.showMessageDialog(null,"CEP inv�lido!");

			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o CEP:");
			}
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

		String referencia ="";
		while(a) {
			try {
				referencia = JOptionPane.showInputDialog(null, "Informe uma refer�ncia:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Informe uma refer�ncia:");
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
				if(codMunicipio == 0 || codMunicipio == 5201405 || codMunicipio == 5208707)
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

		setEndereco(tipoL, cep, desc, complemento, numero, quadra, lote, bairro, codMunicipio, unidF, pais, referencia);


		 
	}





	public void alterar(DocumentoIdentificacao documento) {
		int index = 0;

		for(int z = 0; z < academicos.size(); z++) {
			if((academicos.get(z).getDocumento().getNumero()) == documento.getNumero() && (academicos.get(z).getDocumento().getTipo()) == documento.getTipo()) {
				index = z;
			}

		}
		boolean a = true;
		int opcao = 0;
		while(a) {	
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o dado pessoal que deseja alterar: \n"
						+ "1 - Nome\n2 - Email\n3- Estado Civil\n4- Situa��o Acad�mica\n5- Telefone\n6-Logradouro" ));
				if(opcao<0 || opcao>7) {
					JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
			}
		}

		if(opcao == 1) {
			String prenome = "";
			while(a) {
				int z = 0;

				prenome = JOptionPane.showInputDialog(null, "Digite seu novo primeiro nome: ");
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
			academicos.get(index).setPrenome(prenome);

			//SOBRENOMEEEEEEEEEEEEEEEEEE
			String sobrenome = "";
			while(a) {
				int z = 0;

				sobrenome = JOptionPane.showInputDialog(null, "Digite seu novo sobrenome: ");
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
			academicos.get(index).setSobrenome(sobrenome);
		}
		if(opcao == 2) {
			boolean verificar = false;
			do{
				int z = JOptionPane.showConfirmDialog(null, "Deseja alterar seu email pessoal?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				String prefixo = "";
				String sufixo ="";
				if(z==0) {


					prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
					sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
					academicos.get(index).setEmailPessoal(prefixo, sufixo);

					verificar = getEmail().validar(getEmail().Email1());

				}
				else {

					break;
				}
			}while(verificar==false);


			boolean verificar2 = false;
			do{
				int y = JOptionPane.showConfirmDialog(null, "Deseja alterar email alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				String prefixo = "";
				String sufixo ="";
				if(y==0) {


					prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
					sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
					academicos.get(index).setEmailAlternativo(prefixo, sufixo);

					verificar2 = getEmail().validar(getEmail().Email1());

				}
				else {
					break;
				}
			}while(verificar2==false);

			boolean verificar3 = false;
			do{
				int x = JOptionPane.showConfirmDialog(null, "Deseja alterar seu email comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				String prefixo = "";
				String sufixo = "";
				if(x==0) {


					prefixo =JOptionPane.showInputDialog(null, "Digite o prefixo de seu email: ");
					sufixo =JOptionPane.showInputDialog(null, "Digite o sufixo de seu email: ","Exemplo: gmail.com.br");
					academicos.get(index).setEmailComercial(prefixo, sufixo);

					verificar3 = getEmail().validar(getEmail().Email1());

				}
				else {

					break;
				}
			}while(verificar3==false);
		}

		EstadosCivis EC = new EstadosCivis();
		if(opcao == 3) { 
			int estadoC = 0;
			while(a) {	
				try {
					estadoC = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o seu novo estado civil a partir do CODIGO: \n" + EC.imprimirEC()));
					if(estadoC<0 || estadoC>7) {
						JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
					}
					else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
				}
			}
			academicos.get(index).setEstadoCivil(estadoC);
		}
		if(opcao == 4) {
			int situacaoA=0;
			SituacaoAcademica SA = new SituacaoAcademica();
			while(a) {	
				try {
					situacaoA = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha sua nova situa��o acad�mica a partir do c�digo: \n" + SA.imprimirSA()));
					if(situacaoA<0 || situacaoA>10) {
						JOptionPane.showMessageDialog(null, "Digite um n�mero coerente com os c�digos:");
					}
					else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
				}
			}
			academicos.get(index).situacaoAcademica = situacaoA;
		}
		if(opcao == 5) {
			TiposTelefones Tele = new TiposTelefones();
			ClassesTelefones TelCL = new ClassesTelefones();
			int tipo1 = 0;
			long numero1 = 0;
			int ramal = 0;
			int ddd = 0;
			int ddi = 0;
			int classe = 0;

			int b = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone residencial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(b==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


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
				academicos.get(index).setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

			}

			////////////////
			int tipo2 = 0;
			int classe2 = 0;
			int ddi2 = 0;
			int ddd2 = 0;
			long numero2 = 0;
			int ramal2 = 0;

			int c = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone comercial?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(c==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo2 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe2 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


				while (a)
				{
					try
					{
						ddi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
						if(ddi2 <= 0 || ddi2 > 9999)
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


				while(a)
				{
					try
					{
						ddd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
						if(ddd2 < 1 || ddd2 > 1000)
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



				while(a)
				{

					try
					{
						numero2 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone residencial"));
						if(Long.toString(numero2).length() != 8 && Long.toString(numero2).length() != 9 )
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



				int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
						"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if(k == 0) 
				{
					while(a) 
					{
						try
						{
							ramal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
							if(ramal2 <= 0 || ramal2 > 9999)
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
				academicos.get(index).setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);

			}
			/////////////////
			int tipo3 = 0;
			int classe3 = 0;
			int ddi3 = 0;
			int ddd3 = 0;
			long numero3 = 0;
			int ramal3 = 0;

			int d = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone alternativo?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(d==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo3 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe3 = JOptionPane.showOptionDialog(null, "Escolha uma op��o a seguir: ", "Sistema Acad�mico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


				while (a)
				{
					try
					{
						ddi3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo internacional do seu telefone (DDI)"));
						if(ddi3 <= 0 || ddi3 > 9999)
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


				while(a)
				{
					try
					{
						ddd3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o c�digo Regional do seu telefone (DDD)"));
						if(ddd3 < 1 || ddd3 > 1000)
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



				while(a)
				{

					try
					{
						numero3 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu n�mero de telefone residencial"));
						if(Long.toString(numero3).length() != 8 && Long.toString(numero3).length() != 9 )
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



				int k = JOptionPane.showConfirmDialog(null, "Voc� quer digitar o ramal do telefone ?", 
						"Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if(k == 0) 
				{
					while(a) 
					{
						try
						{
							ramal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
							if(ramal3 <= 0 || ramal3 > 9999)
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
				academicos.get(index).setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

			}
		}
		if(opcao == 6) {
			UnidadesFederativas UF = new UnidadesFederativas();
			TiposLogradouros tipo = new TiposLogradouros();
			Municipios municipio = new Municipios();
			int esc = JOptionPane.showConfirmDialog(null, "Deseja alterar o tipo do endere�o?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc==0) {
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
				academicos.get(index).setTipoL(tipoL);

			}
			int esc2 = JOptionPane.showConfirmDialog(null, "Deseja alterar o CEP?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc2==0) {
				int cep = 0;
				while(a) {
					try {
						cep = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CEP:"));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o CEP:");
					}
				}
				academicos.get(index).setCodigoLogradouro(cep);
			}
			int esc3 = JOptionPane.showConfirmDialog(null, "Deseja alterar a descri��o do endere�o?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc3==0) {
				String desc ="";
				while(a) {
					try {
						desc = JOptionPane.showInputDialog(null, "Digite a descri��o do endere�o:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite a descri��o do endere�o:");
					}
				}
				academicos.get(index).setDescricaoLogradouro(desc);
			}
			int esc4 = JOptionPane.showConfirmDialog(null, "Deseja alterar o complemento?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc4==0) {
				String complemento="";
				while(a) {
					try {
						complemento = JOptionPane.showInputDialog(null, "Digite o complemento do endere�o:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o complemento do endere�o:");
					}
				}
				academicos.get(index).setComplementoLogradouro(complemento);
			}
			int esc5 = JOptionPane.showConfirmDialog(null, "Deseja alterar o n�mero?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc5==0) {
				int numero = 0;
				while(a) {
					try {
						numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero da residencia:"));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o n�mero da residencia:");
					}
				}
				academicos.get(index).setNumero(numero);
			}

			int esc6 = JOptionPane.showConfirmDialog(null, "Deseja alterar a quadra?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc6==0) {
				String quadra="";
				while(a) {
					try {
						quadra = JOptionPane.showInputDialog(null, "Digite a quadra do endere�o:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite a quadro do endere�o:");
					}
				}
				academicos.get(index).setQuadra(quadra);
			}
			int esc7 = JOptionPane.showConfirmDialog(null, "Deseja alterar o lote?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc7==0) {
				String lote="";
				while(a) {
					try {
						lote = JOptionPane.showInputDialog(null, "Digite o lote do endere�o:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o lote do endere�o:");
					}
				}
				academicos.get(index).setLote(lote);
			}
			int esc8 = JOptionPane.showConfirmDialog(null, "Deseja alterar o bairro?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc8==0) {
				String bairro="";
				while(a) {
					try {
						bairro = JOptionPane.showInputDialog(null, "Digite o bairro do endere�o:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o bairro do endere�o:");
					}
				}
				academicos.get(index).setBairro(bairro);
			}
			int esc9 = JOptionPane.showConfirmDialog(null, "Deseja alterar seu munic�pio?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc9==0) {
				long codMunicipio=0;
				while(a) {	
					try {
						codMunicipio = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o c�digo de seu munic�pio: \n" + municipio.imprimirM()));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o c�digo corretamente: ");
					}
				}
				academicos.get(index).setMunicipio(codMunicipio);
			}
			int esc10 = JOptionPane.showConfirmDialog(null, "Deseja alterar a UF?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc10==0) {
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
				academicos.get(index).setUf(unidF);
			}
			int esc11 = JOptionPane.showConfirmDialog(null, "Deseja alterar seu pa�s?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc11==0) {
				String pais="";
				while(a) {
					try {
						pais = JOptionPane.showInputDialog(null, "Digite seu pa�s atual:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite seu pa�s atual:");
					}
				}
				academicos.get(index).setPais(pais);
			}
			int esc12 = JOptionPane.showConfirmDialog(null, "Deseja alterar sua refer�ncia?", "Sistema Acad�mico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc12==0) {
				String referencia ="";
				while(a) {
					try {
						referencia = JOptionPane.showInputDialog(null, "Informe uma refer�ncia:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Informe uma refer�ncia:");
					}
				}
				academicos.get(index).setReferencia(referencia);
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
				+"\n\nNome Completo: "+academicos.get(index).getPrenome()+" "+academicos.get(index).getSobrenome()
				+"          N�mero da Matr�cula: "+academicos.get(index).getMatricula()
				+"\nPa�s de nascimento: "+academicos.get(index).getPaisNascimento()+"     Estado de nascimento: "+academicos.get(index).getUfNascimento()+"     Munic�pio de nascimento: "+academicos.get(index).getMunicipioNascimento()
				+"\nData de nascimento: "+academicos.get(index).getDataNascimento()
				+"\n"+academicos.get(index).getEmailPessoal()
				+"          "+academicos.get(index).getEmailComercial()
				+"          "+academicos.get(index).getEmailAlternativo()
				+"\n\nTelefone Residencial: "+academicos.get(index).getTelefoneResidencial()
				+"\n\nTelefone Comercial: "+academicos.get(index).getTelefoneComercial()
				+"\n\nTelefone Alternativo: "+academicos.get(index).getTelefoneAlternativo()
				+"\n\n DOCUMENTO DE IDENTIFICA��O: "
				+"\n Tipo: "+academicos.get(index).getDocumento().getTipo()
				+"          N�mero: "+academicos.get(index).getDocumento( ).getNumero()
				+"          Org�o Expedidor: "+academicos.get(index).getDocumento().getOrgaoExpedidor()
				+"\n Pa�s: "+academicos.get(index).getDocumento().getPais()
				+"          Complemento: "+academicos.get(index).getDocumento().getComplemento()
				+"\n\n Endere�o: "
				+"\n "+academicos.get(index).getEndereco()

				); 

	}    	
}