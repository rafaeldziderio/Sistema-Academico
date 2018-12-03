package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Coisa
* Objetivo...: Representa um objeto inanimado ("coisa") 
* Observacoes: 
*              
*/
public abstract class Coisa {
    int                             codigo;
    String                          nomeAbreviado;
    String                          nomeCompleto;
    
    public abstract void cadastrar();
    public abstract void alterar (int codigo);
    public abstract void consultar (int codigo);
    public abstract void excluir (int codigo);
}
