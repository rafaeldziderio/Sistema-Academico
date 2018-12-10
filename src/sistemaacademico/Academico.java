package sistemaacademico;

public class Academico extends Pessoa {
    private long matricula;
    private int situacaoAcademica;
    Pessoa pessoa;
    
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

	public void cadastrar(long matricula, int situacaoAcademicoo, Pessoa pessoa) {
		//UnidadesFederativas UF = new UnidadesFederativas();
				//int escolha = 0;
				//String nome = "";
				//long matricula=0;
				//boolean a = true;
				
				//Academico academico = new Academico();
				
				
				//while(a) {
				//	try {
				//		matricula =Long.parseLong(JOptionPane.showInputDialog(null, "Digite sua matrícula: "));
				//		break;
				//		
			//		}catch(NumberFormatException e) {
				//		JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");
					//	
					//}
				//}
				//JOptionPane.showMessageDialog(null,matricula);
				//academico.setMatricula(matricula);
				
				
				//while(a) {
				//	try {
				//		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
				//		break;
				//	}catch(InputMismatchException e) {
				//		JOptionPane.showMessageDialog(null, "Digite um nome válido!");
				//	}
		//
				//}
				//JOptionPane.showMessageDialog(null,nome);
					
				//while(a) {	
				//	try {
				//		escolha = Integer.parseInt(JOptionPane.showInputDialog(null,  "Escolha entre as unidades a seguir a partir do CODIGO: \n" + UF.imprimirUF()));
				//		if(escolha<0 || escolha>27) {
				//			JOptionPane.showMessageDialog(null, "Digite um número coerente com os códigos:");
				//		}
				//		else
				//			break;
				//	}catch(NumberFormatException e) {
				//		JOptionPane.showMessageDialog(null, "Digite o código: ");
				//	}
				//}
				//JOptionPane.showMessageDialog(null,(UF.getUfs(escolha).getDescricaoCompleta()));
				//academico.setUfNascimento(escolha);
    }

    public void alterar(DocumentoIdentificacao documento) {
        
    }

    public void excluir(DocumentoIdentificacao documento) {
    
    }

    public Pessoa consultar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public void matricularCurso(int curso) {}
    public void abandonarCurso(int curso) {}
    public void trancarCurso(int curso) {}
    public void cancelarCurso(int curso) {}
    public void jubilarCurso(int curso) {}
    public void formarCurso(int curso) {}

}
   