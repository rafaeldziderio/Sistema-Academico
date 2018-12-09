package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Email
* Objetivo...: Representar e-mail qualquer.
* Observacoes:
*/
public class Email{
    String prefixo;
    String sufixo;
    
	public Email(String prefixo, String sufixo) {
		this.prefixo = prefixo;
		this.sufixo = sufixo;
	}
	
	public String toString() {
		return ("Email: " + prefixo + "@" + sufixo + ";");
	}
}
