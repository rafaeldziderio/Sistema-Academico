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
   