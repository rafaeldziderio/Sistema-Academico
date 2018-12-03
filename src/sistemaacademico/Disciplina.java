package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Disciplina
* Objetivo...: Representar uma disciplina na instituição de ensino
* Observacoes:
*/
public class Disciplina extends Coisa {
    int                             situacao;
    
    int                             curso;                  // 0 (zero) para disciplina sem curso vinculado
    Docente                         docenteResponsavel;     // Informação obrigatória
    Docente                         docenteAuxiliar;        // Null = docente inexistente
    TecnicoAdministrativo           tecnicoAdministrativoResponsavel; // Null = TA inexistente
    TecnicoAdministrativo           tecnicoAminAdministrativoAuxiliar; // Null = TA inexistente
    
    double                          numeroCreditos;        // 0 - Não informada (é opcional informar)
    double                          cargaHorariaTotal;      
    double                          cargaHorariaTeorica;
    double                          cargaHorariaPratica;
    double                          cargaHorariaSemanal;    // Opcional informar
    double                          cargaHorariaMensal;     // Opcional informar
    
    double                          custoFixo;              // Todos são opcionais...
    double                          custoBasicoTeorica;     // Valores em Reais (R$)
    double                          custoBasicoPratica;     //

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


