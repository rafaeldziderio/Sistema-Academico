package sistemaacademico;

public class Academico extends Pessoa {
    long matricula;
    int situacaoAcademica;

    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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
   