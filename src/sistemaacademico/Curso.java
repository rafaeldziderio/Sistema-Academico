package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Curso
* Objetivo...: Representar um curso na instituição de ensino
* Observacoes:
*/
public class Curso extends Coisa {
 
    int                             situacao;  
    double                          cargaHorariaTotal;      
    double                          cargaHorariaTeoria;
    double                          cargaHorariaPratica;
      
    //
    // A equipe responsável deverá verificar se há necessidade de outros
    // atributos e métodos para inseri-los.
    // 
    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
