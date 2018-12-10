package sistemaacademico;

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
