package sistemaacademico;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: RegistroAcademico
* Objetivo...: Representar o registro de uma disciplina cursada por um
*              determinado acadêmico (numa ano/semestre letivo)
* Observacoes:
*/
public class RegistroAcademico extends Coisa {
    
    //
    // Matricula do acadêmico que cursou a disciplina
    //
    long                            matriculaAcademico;
    //
    // Ano/Semestre que o acadêmico cursou a disciplina
    //
    int                             ano;
    int                             semestre;
    Disciplina                      disciplina;
    //
    // Carga horária (em horas) em que o acadêmico esteve presente e ausente
    // às atividades da disciplinas.
    //
    int                             cargaHorariaPresencas;
    int                             cargaHorariaAusencias;
    
    double                          notaFinal;
    //
    // Situação final do acadêmico na disciplina
    //
    int                             situacaoAcademicoDisciplina;
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

