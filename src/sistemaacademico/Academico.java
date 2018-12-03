package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Acadêmico
* Objetivo...: Representar uma pessoa que exerce o papel de acadêmico(a) na 
*              instituição de ensino.
* Observacoes:
*/
public class Academico extends Pessoa {
    long                            matricula;
    int                             situacaoAcademica;
    //
    // A equipe responsável deverá verificar se há necessidade de outros
    // atributos e métodos para inseri-los....
    // 
    // Observação: Lembre-se que devo poder cadastrar, alterar, consultar e 
    // excluir pelo número de matricula...

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
   