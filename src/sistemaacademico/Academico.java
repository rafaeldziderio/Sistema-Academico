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
		//País de Nascimento
		String paisNascimento = "";
		while(a) {
			try {
				paisNascimento = JOptionPane.showInputDialog(null,"Digite o seu país de nascimento:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Digite um país válido!");
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
				JOptionPane.showMessageDialog(null,"Digite um estado válido!");
			}
		}
		this.setUfNascimento(ufNascimento);

		//Cidade de Nascimento
		String munNascimento="";
		while(a) {
			try {
				munNascimento = JOptionPane.showInputDialog(null,"Digite o seu município de nascimento:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Insira um município válido!");
			}
		}
		this.setMunicipioNascimento(munNascimento);


		//Matricula
		long matricula=0;
		while(a) {
			try {
				matricula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: ", "000000000"));
				if(Long.toString(matricula).length() != 9)
				{
					JOptionPane.showMessageDialog(null, "Digite uma matrícula válida com 9 dígitos.");
				}
				else {	
					if(academicos.size() == 0)
						break;
					else {
						int r=0;
						for(int i = 0 ; i< academicos.size(); i++) {
							if(matricula == academicos.get(i).getMatricula()) {
								JOptionPane.showMessageDialog(null,"Esta matrícula já está cadastrada em nosso sistema!");
								r++;
							}
						}
						if(r==0) break;
					}
				}


			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");

			}
		}
		this.matricula = matricula;

		//Unidade Federativa
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

		//Estado Civil
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

		//Documento
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
					JOptionPane.showMessageDialog(null,"Digite o número do documento:");
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
									JOptionPane.showMessageDialog(null,"RG já existente!");
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
						JOptionPane.showMessageDialog(null,"RG inválido!");

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o número do registro geral: ");
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
								JOptionPane.showMessageDialog(null,"CPF já existente!");
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
					JOptionPane.showMessageDialog(null,"Digite um CPF válido");

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
					JOptionPane.showMessageDialog(null, "Digite o número da sua carteira profissional(CP):");
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
									JOptionPane.showMessageDialog(null,"Passaporte já existente!");
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
						JOptionPane.showMessageDialog(null,"Passaporte inválido!");

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite o número do seu passaporte: ");
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
					JOptionPane.showMessageDialog(null,"Digite o número deste documento:");
				}
			}
		}


		String compl = "";
		int w = JOptionPane.showConfirmDialog(null, "Você quer digitar um complemento do número?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(w==0) {
			while(a) {
				try {
					compl = JOptionPane.showInputDialog(null,"Insira um complemento do documento:");
					break;
				}catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null,"Insira um complemento válido!");
				}
			}
		}	


		String orgao = "";
		while(a) {
			try {
				orgao = JOptionPane.showInputDialog(null, "Digite seu órgão expedidor: ");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null,"Digite um órgão válido:");
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


		DocumentoIdentificacao doc = new DocumentoIdentificacao(tipoD,num,compl,orgao,paisD);
		this.documento = doc;


		//Situação Acadêmica
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

		//Email
		boolean verificar = false;
		do{
			int z = JOptionPane.showConfirmDialog(null, "Deseja inserir um email pessoal?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
			int y = JOptionPane.showConfirmDialog(null, "Deseja inserir um email alternativo?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
			int x = JOptionPane.showConfirmDialog(null, "Deseja inserir um email comercial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

		int b = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone residencial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(b==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


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



			while(a)
			{

				try
				{
					numero1 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone residencial"));
					if(Long.toString(numero1).length() != 8 && Long.toString(numero1).length() != 9 )
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
			this.setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

		}else this.setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

		//Outro  telefone
		int tipo2 = 0;
		int classe2 = 0;
		int ddi2 = 0;
		int ddd2 = 0;
		long numero2 = 0;
		int ramal2 = 0;

		int c = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone comercial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(c==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo2 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe2 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


			while (a)
			{
				try
				{
					ddi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código internacional do seu telefone (DDI)"));
					if(ddi2 <= 0 || ddi2 > 9999)
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


			while(a)
			{
				try
				{
					ddd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código Regional do seu telefone (DDD)"));
					if(ddd2 < 1 || ddd2 > 1000)
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



			while(a)
			{

				try
				{
					numero2 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone comercial:"));
					if(Long.toString(numero2).length() != 8 && Long.toString(numero2).length() != 9 )
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



			int k = JOptionPane.showConfirmDialog(null, "Você quer digitar o ramal do telefone ?", 
					"Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal2 <= 0 || ramal2 > 9999)
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
			this.setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);

		}else this.setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);
		
		//Outro telefone
		int tipo3 = 0;
		int classe3 = 0;
		int ddi3 = 0;
		int ddd3 = 0;
		long numero3 = 0;
		int ramal3 = 0;

		int d = JOptionPane.showConfirmDialog(null, "Deseja inserir seu telefone alternativo?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(d==0) {
			String[] option2 = new String[Tele.getTiposTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
			}


			tipo3 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


			String[] option3 = new String[TelCL.getClassesTelefones().size()];
			for(int i = 0; i < 5; i++)
			{
				option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
			}


			classe3 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


			while (a)
			{
				try
				{
					ddi3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código internacional do seu telefone (DDI)"));
					if(ddi3 <= 0 || ddi3 > 9999)
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


			while(a)
			{
				try
				{
					ddd3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código Regional do seu telefone (DDD)"));
					if(ddd3 < 1 || ddd3 > 1000)
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



			while(a)
			{

				try
				{
					numero3 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone alternativo:"));
					if(Long.toString(numero3).length() != 8 && Long.toString(numero3).length() != 9 )
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



			int k = JOptionPane.showConfirmDialog(null, "Você quer digitar o ramal do telefone ?", 
					"Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if(k == 0) 
			{
				while(a) 
				{
					try
					{
						ramal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
						if(ramal3 <= 0 || ramal3 > 9999)
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
			this.setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

		}else this.setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

		//Endereço
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
					JOptionPane.showMessageDialog(null,"CEP inválido!");

			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o CEP:");
			}
		}

		int tipoL=0;
		while(a) {	
			try {
				tipoL = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o tipo de logradouro: \n" + tipo.imprimirLogradouro()));
				if(tipoL<0 || tipoL>30) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}

		String desc ="";
		while(a) {
			try {
				desc = JOptionPane.showInputDialog(null, "Digite a descrição do endereço:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite a descrição do endereço:");
			}
		}
		String complemento="";
		while(a) {
			try {
				complemento = JOptionPane.showInputDialog(null, "Digite o complemento do endereço:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o complemento do endereço:");
			}
		}
		int numero = 0;
		while(a) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da residencia:"));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o número da residencia:");
			}
		}
		String quadra="";
		while(a) {
			try {
				quadra = JOptionPane.showInputDialog(null, "Digite a quadra do endereço:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite a quadro do endereço:");
			}
		}
		String lote="";
		while(a) {
			try {
				lote = JOptionPane.showInputDialog(null, "Digite o lote do endereço:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o lote do endereço:");
			}
		}

		String referencia ="";
		while(a) {
			try {
				referencia = JOptionPane.showInputDialog(null, "Informe uma referência:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Informe uma referência:");
			}
		}

		String bairro="";
		while(a) {
			try {
				bairro = JOptionPane.showInputDialog(null, "Digite o bairro do endereço:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite o bairro do endereço:");
			}
		}
		long codMunicipio=0;
		while(a) {	
			try {
				codMunicipio = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o código de seu município: \n" + municipio.imprimirM()));
				if(codMunicipio == 0 || codMunicipio == 5201405 || codMunicipio == 5208707)
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
			}
		}
		
		String pais="";
		while(a) {
			try {
				pais = JOptionPane.showInputDialog(null, "Digite seu país atual:");
				break;
			}catch(IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Digite seu país atual:");
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
						+ "1 - Nome\n2 - Email\n3- Estado Civil\n4- Situação Acadêmica\n5- Telefone\n6-Logradouro" ));
				if(opcao<0 || opcao>7) {
					JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				}
				else
					break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
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
			academicos.get(index).setSobrenome(sobrenome);
		}
		if(opcao == 2) {
			boolean verificar = false;
			do{
				int z = JOptionPane.showConfirmDialog(null, "Deseja alterar seu email pessoal?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
				int y = JOptionPane.showConfirmDialog(null, "Deseja alterar email alternativo?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
				int x = JOptionPane.showConfirmDialog(null, "Deseja alterar seu email comercial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
						JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
					}
					else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
				}
			}
			academicos.get(index).setEstadoCivil(estadoC);
		}
		if(opcao == 4) {
			int situacaoA=0;
			SituacaoAcademica SA = new SituacaoAcademica();
			while(a) {	
				try {
					situacaoA = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha sua nova situação acadêmica a partir do código: \n" + SA.imprimirSA()));
					if(situacaoA<0 || situacaoA>10) {
						JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
					}
					else
						break;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
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

			int b = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone residencial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(b==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo1 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


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



				while(a)
				{

					try
					{
						numero1 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone residencial"));
						if(Long.toString(numero1).length() != 8 && Long.toString(numero1).length() != 9 )
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
				academicos.get(index).setTelefoneResidencial(tipo1, classe, ddi, ddd, numero1, ramal);

			}

			////////////////
			int tipo2 = 0;
			int classe2 = 0;
			int ddi2 = 0;
			int ddd2 = 0;
			long numero2 = 0;
			int ramal2 = 0;

			int c = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone comercial?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(c==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo2 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe2 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


				while (a)
				{
					try
					{
						ddi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código internacional do seu telefone (DDI)"));
						if(ddi2 <= 0 || ddi2 > 9999)
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


				while(a)
				{
					try
					{
						ddd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código Regional do seu telefone (DDD)"));
						if(ddd2 < 1 || ddd2 > 1000)
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



				while(a)
				{

					try
					{
						numero2 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone residencial"));
						if(Long.toString(numero2).length() != 8 && Long.toString(numero2).length() != 9 )
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



				int k = JOptionPane.showConfirmDialog(null, "Você quer digitar o ramal do telefone ?", 
						"Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if(k == 0) 
				{
					while(a) 
					{
						try
						{
							ramal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
							if(ramal2 <= 0 || ramal2 > 9999)
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
				academicos.get(index).setTelefoneComercial(tipo2, classe2, ddi2, ddd2, numero2, ramal2);

			}
			/////////////////
			int tipo3 = 0;
			int classe3 = 0;
			int ddi3 = 0;
			int ddd3 = 0;
			long numero3 = 0;
			int ramal3 = 0;

			int d = JOptionPane.showConfirmDialog(null, "Deseja alterar seu telefone alternativo?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(d==0) {
				String[] option2 = new String[Tele.getTiposTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option2[i] = Tele.getTipoTelefone(i).getDescricaoCompleta();
				}


				tipo3 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);


				String[] option3 = new String[TelCL.getClassesTelefones().size()];
				for(int i = 0; i < 5; i++)
				{
					option3[i] = TelCL.getTipoDocumento(i).getDescricaoCompleta();
				}


				classe3 = JOptionPane.showOptionDialog(null, "Escolha uma opção a seguir: ", "Sistema Acadêmico", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);


				while (a)
				{
					try
					{
						ddi3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código internacional do seu telefone (DDI)"));
						if(ddi3 <= 0 || ddi3 > 9999)
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


				while(a)
				{
					try
					{
						ddd3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código Regional do seu telefone (DDD)"));
						if(ddd3 < 1 || ddd3 > 1000)
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



				while(a)
				{

					try
					{
						numero3 = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o seu número de telefone residencial"));
						if(Long.toString(numero3).length() != 8 && Long.toString(numero3).length() != 9 )
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



				int k = JOptionPane.showConfirmDialog(null, "Você quer digitar o ramal do telefone ?", 
						"Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

				if(k == 0) 
				{
					while(a) 
					{
						try
						{
							ramal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ramal: "));
							if(ramal3 <= 0 || ramal3 > 9999)
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
				academicos.get(index).setTelefoneAlternativo(tipo3, classe3, ddi3, ddd3, numero3, ramal3);

			}
		}
		if(opcao == 6) {
			UnidadesFederativas UF = new UnidadesFederativas();
			TiposLogradouros tipo = new TiposLogradouros();
			Municipios municipio = new Municipios();
			int esc = JOptionPane.showConfirmDialog(null, "Deseja alterar o tipo do endereço?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc==0) {
				int tipoL=0;
				while(a) {	
					try {
						tipoL = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o tipo de logradouro: \n" + tipo.imprimirLogradouro()));
						if(tipoL<0 || tipoL>30) {
							JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
						}
						else
							break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
					}
				}
				academicos.get(index).setTipoL(tipoL);

			}
			int esc2 = JOptionPane.showConfirmDialog(null, "Deseja alterar o CEP?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
			int esc3 = JOptionPane.showConfirmDialog(null, "Deseja alterar a descrição do endereço?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc3==0) {
				String desc ="";
				while(a) {
					try {
						desc = JOptionPane.showInputDialog(null, "Digite a descrição do endereço:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite a descrição do endereço:");
					}
				}
				academicos.get(index).setDescricaoLogradouro(desc);
			}
			int esc4 = JOptionPane.showConfirmDialog(null, "Deseja alterar o complemento?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc4==0) {
				String complemento="";
				while(a) {
					try {
						complemento = JOptionPane.showInputDialog(null, "Digite o complemento do endereço:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o complemento do endereço:");
					}
				}
				academicos.get(index).setComplementoLogradouro(complemento);
			}
			int esc5 = JOptionPane.showConfirmDialog(null, "Deseja alterar o número?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc5==0) {
				int numero = 0;
				while(a) {
					try {
						numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da residencia:"));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o número da residencia:");
					}
				}
				academicos.get(index).setNumero(numero);
			}

			int esc6 = JOptionPane.showConfirmDialog(null, "Deseja alterar a quadra?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc6==0) {
				String quadra="";
				while(a) {
					try {
						quadra = JOptionPane.showInputDialog(null, "Digite a quadra do endereço:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite a quadro do endereço:");
					}
				}
				academicos.get(index).setQuadra(quadra);
			}
			int esc7 = JOptionPane.showConfirmDialog(null, "Deseja alterar o lote?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc7==0) {
				String lote="";
				while(a) {
					try {
						lote = JOptionPane.showInputDialog(null, "Digite o lote do endereço:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o lote do endereço:");
					}
				}
				academicos.get(index).setLote(lote);
			}
			int esc8 = JOptionPane.showConfirmDialog(null, "Deseja alterar o bairro?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc8==0) {
				String bairro="";
				while(a) {
					try {
						bairro = JOptionPane.showInputDialog(null, "Digite o bairro do endereço:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite o bairro do endereço:");
					}
				}
				academicos.get(index).setBairro(bairro);
			}
			int esc9 = JOptionPane.showConfirmDialog(null, "Deseja alterar seu município?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc9==0) {
				long codMunicipio=0;
				while(a) {	
					try {
						codMunicipio = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha o código de seu município: \n" + municipio.imprimirM()));
						break;
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite o código corretamente: ");
					}
				}
				academicos.get(index).setMunicipio(codMunicipio);
			}
			int esc10 = JOptionPane.showConfirmDialog(null, "Deseja alterar a UF?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc10==0) {
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
				academicos.get(index).setUf(unidF);
			}
			int esc11 = JOptionPane.showConfirmDialog(null, "Deseja alterar seu país?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc11==0) {
				String pais="";
				while(a) {
					try {
						pais = JOptionPane.showInputDialog(null, "Digite seu país atual:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Digite seu país atual:");
					}
				}
				academicos.get(index).setPais(pais);
			}
			int esc12 = JOptionPane.showConfirmDialog(null, "Deseja alterar sua referência?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(esc12==0) {
				String referencia ="";
				while(a) {
					try {
						referencia = JOptionPane.showInputDialog(null, "Informe uma referência:");
						break;
					}catch(IllegalArgumentException e) {
						JOptionPane.showMessageDialog(null, "Informe uma referência:");
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

		JOptionPane.showMessageDialog(null, a.show1(cod)
				+"\n\nNome Completo: "+academicos.get(index).getPrenome()+" "+academicos.get(index).getSobrenome()
				+"          Número da Matrícula: "+academicos.get(index).getMatricula()
				+"\nPaís de nascimento: "+academicos.get(index).getPaisNascimento()+"     Estado de nascimento: "+academicos.get(index).getUfNascimento()+"     Município de nascimento: "+academicos.get(index).getMunicipioNascimento()
				+"\nData de nascimento: "+academicos.get(index).getDataNascimento()
				+"\n"+academicos.get(index).getEmailPessoal()
				+"          "+academicos.get(index).getEmailComercial()
				+"          "+academicos.get(index).getEmailAlternativo()
				+"\n\nTelefone Residencial: "+academicos.get(index).getTelefoneResidencial()
				+"\n\nTelefone Comercial: "+academicos.get(index).getTelefoneComercial()
				+"\n\nTelefone Alternativo: "+academicos.get(index).getTelefoneAlternativo()
				+"\n\n DOCUMENTO DE IDENTIFICAÇÃO: "
				+"\n Tipo: "+academicos.get(index).getDocumento().getTipo()
				+"          Número: "+academicos.get(index).getDocumento( ).getNumero()
				+"          Orgão Expedidor: "+academicos.get(index).getDocumento().getOrgaoExpedidor()
				+"\n País: "+academicos.get(index).getDocumento().getPais()
				+"          Complemento: "+academicos.get(index).getDocumento().getComplemento()
				+"\n\n Endereço: "
				+"\n "+academicos.get(index).getEndereco()

				); 

	}    	
}