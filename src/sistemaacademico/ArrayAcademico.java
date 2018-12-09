package sistemaacademico;

import java.util.ArrayList;

public class ArrayAcademico {
	private ArrayList <Academico> academicos = new ArrayList<Academico>();
	
	public void cadastrarAcademico(Academico academico) {
		academicos.add(academico);
	}
	
}
