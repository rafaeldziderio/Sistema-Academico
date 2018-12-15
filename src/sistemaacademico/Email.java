package sistemaacademico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Email{
    String prefixo;
    String sufixo;
    
	public Email(String prefixo, String sufixo) {
		this.prefixo = prefixo;
		this.sufixo = sufixo;
	}
	
	
	public String getPrefixo() {
		return prefixo;
	}


	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}


	public String getSufixo() {
		return sufixo;
	}


	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}


	public String toString() {
		if(sufixo == "" && prefixo == "") {
			return "Email desconhecido!";
		}
		else
			return ("Email: " + prefixo + "@" + sufixo + "");
	}
	
	public String Email1() {
		
		return ( getPrefixo() + "@" + getSufixo());
	}
	public  boolean validar(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = ((Pattern) pattern).matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
            else {
            	isEmailIdValid = false;
            }
        }
        return isEmailIdValid;
    }
}
